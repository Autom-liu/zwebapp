package com.scnu.zwebapp.flow.service.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.scnu.zwebapp.common.enums.AccountSysTypeEnum;
import com.scnu.zwebapp.common.enums.ErrorEnum;
import com.scnu.zwebapp.common.enums.FlowRecordTypeEnum;
import com.scnu.zwebapp.common.exception.BizException;
import com.scnu.zwebapp.common.proxy.CriteriaProxy;
import com.scnu.zwebapp.common.service.BaseService;
import com.scnu.zwebapp.common.util.DataUtils;
import com.scnu.zwebapp.common.util.DateUtils;
import com.scnu.zwebapp.common.util.DateUtils.DatePattern;
import com.scnu.zwebapp.common.vo.PageVO;
import com.scnu.zwebapp.flow.bean.AccountFlow;
import com.scnu.zwebapp.flow.bean.AccountFlowExample;
import com.scnu.zwebapp.flow.dto.AccountDTO;
import com.scnu.zwebapp.flow.dto.AccountFlowDTO;
import com.scnu.zwebapp.flow.enums.FlowFlagEnum;
import com.scnu.zwebapp.flow.mapper.AccountFlowMapper;
import com.scnu.zwebapp.flow.query.AccountFlowQuery;
import com.scnu.zwebapp.flow.service.AccountFlowService;
import com.scnu.zwebapp.flow.service.AccountService;
import com.scnu.zwebapp.flow.vo.AccountFlowVO;
import com.scnu.zwebapp.flow.vo.AccountVO;

@Service
public class AccountFlowServiceImpl extends BaseService<AccountFlow, AccountFlowDTO, AccountFlowVO> implements AccountFlowService {

	@Autowired
	private AccountFlowMapper accountFlowMapper;
	
	@Autowired
	private AccountService accountService;
	

	@Transactional
	@Override
	public AccountFlow insertIncomeFlow(AccountFlowDTO flowDto) {
		Integer destAccId = flowDto.getDestAccId();
		Integer srcAccId = flowDto.getSrcAccId();
		Integer reallyAccId = destAccId != null ? destAccId : srcAccId;
		AccountVO accountVO = accountService.findOne(reallyAccId);
		String accSysType = accountVO.getAccSysType();
		// 只有自由账户才能记为收入流水 
		if(!AccountSysTypeEnum.FREE_ACCOUNT.getCode().equals(accSysType)) {
			throw new BizException(ErrorEnum.ERRCODE_0105);
		}
		// 设置默认值
		AccountFlow bean = DataUtils.copyBean(flowDto, AccountFlow.class);
		if(bean.getCreateTime() == null) {
			bean.setCreateTime(new Date());
		}
		bean.setFlowId(generateFlowId());
		bean.setFlowRecordType(FlowRecordTypeEnum.INCOME.getCode());
		bean.setIsDel(false);
		accountFlowMapper.insert(bean);
		// TODO 如果有其他项目，则需要累计其他项目的使用次数。（目前没有）
		// 如果存在目标账户，以目标账户为准，否则以原账户为准，累加账户表的金额。
		AccountDTO accountDTO = new AccountDTO();
		accountDTO.setAccId(reallyAccId);
		BigDecimal accAmount = accountVO.getAccAmount();
		BigDecimal flowAmount = flowDto.getFlowAmount();
		accountDTO.setAccAmount(accAmount.add(flowAmount).setScale(2, RoundingMode.HALF_UP));
		
		accountService.updateByIdSelective(accountDTO);
		return bean;
	}


	@Override
	@Transactional
	public AccountFlow insertOutcomeFlow(AccountFlowDTO flowDto) {
		// 字段校验
		FlowRecordTypeEnum flowRecordType = flowDto.getFlowRecordType();
		if(flowRecordType == FlowRecordTypeEnum.INCOME) {
			throw new BizException(ErrorEnum.ERRCODE_0103);
		}
		Integer srcAccId = flowDto.getSrcAccId();
		AccountVO accountVO = accountService.findOne(srcAccId);
		if(!accountVO.getAccCanPay()) {
			throw new BizException(ErrorEnum.ERRCODE_0106);
		}
		// 设置默认值
		AccountFlow bean = DataUtils.copyBean(flowDto, AccountFlow.class);
		if(bean.getCreateTime() == null) {
			bean.setCreateTime(new Date());
		}
		bean.setFlowId(generateFlowId());
		bean.setFlowRecordType(FlowRecordTypeEnum.OUTCOME.getCode());
		bean.setIsDel(false);
		accountFlowMapper.insert(bean);
		// TODO 如果有其他项目，则需要累计其他项目的使用次数
		// 以原账户为准，扣除账户表的金额
		AccountDTO accountDTO = new AccountDTO();
		accountDTO.setAccId(srcAccId);
		BigDecimal accAmount = accountVO.getAccAmount();
		BigDecimal flowAmount = flowDto.getFlowAmount();
		accountDTO.setAccAmount(accAmount.subtract(flowAmount).setScale(2, RoundingMode.HALF_UP));
		
		accountService.updateByIdSelective(accountDTO);
		// TODO 将支出流水数据发起调用预支模块，做预支功能处理
		return bean;
	}


	@Override
	@Transactional
	public AccountFlow insertTransferFlow(AccountFlowDTO flowDto) {
		Integer srcAccId = flowDto.getSrcAccId();
		Integer destAccId = flowDto.getDestAccId();
		AccountVO srcAccountVO = accountService.findOne(srcAccId);
		if(!srcAccountVO.getAccCanTransfer()) {
			throw new BizException(ErrorEnum.ERRCODE_0107);
		}
		AccountVO destAccountVo = accountService.findOne(destAccId);
		String srcAccSysType = srcAccountVO.getAccSysType();
		String destAccSysType = destAccountVo.getAccSysType();
		AccountSysTypeEnum srcSysTypeEnum = DataUtils.getEnumByCode(srcAccSysType, AccountSysTypeEnum.class);
		AccountSysTypeEnum destSysTypeEnum = DataUtils.getEnumByCode(destAccSysType, AccountSysTypeEnum.class);
		if(srcSysTypeEnum == null || destSysTypeEnum == null) {
			throw new BizException(ErrorEnum.ERRCODE_0104);
		}
		if(AccountSysTypeEnum.FREE_ACCOUNT != srcSysTypeEnum && AccountSysTypeEnum.FREE_ACCOUNT != destSysTypeEnum) {
			throw new BizException(ErrorEnum.ERRCODE_0108);
		}
		if(srcSysTypeEnum == AccountSysTypeEnum.SINGLE_ACCOUNT) {
			throw new BizException(ErrorEnum.ERRCODE_0109);
		}
		AccountFlow transferBean = DataUtils.copyBean(flowDto, AccountFlow.class);
		if(transferBean.getCreateTime() == null) {
			transferBean.setCreateTime(new Date());
		}
		transferBean.setFlowId(generateFlowId());
		transferBean.setFlowRecordType(FlowRecordTypeEnum.TRANSFER.getCode());
		transferBean.setIsDel(false);
		
		FlowFlagEnum flowFlag = this.getFlowFlag(srcSysTypeEnum, destSysTypeEnum);
		transferBean.setFlowFlagType(flowFlag.getCode());
		FlowRecordTypeEnum recodeType = this.getFlowRecodeByFlag(flowFlag);
		if (recodeType == FlowRecordTypeEnum.INCOME) {
			handleTransferIncome(transferBean, srcAccountVO);
		} else if (recodeType == FlowRecordTypeEnum.OUTCOME) {
			handleTransferOutcome(transferBean, destAccountVo);
		} else {
			handleTransferSelf(transferBean, srcAccountVO, destAccountVo);
		}
		return transferBean;
	}
	
	private void handleTransferSelf(AccountFlow transferBean, AccountVO srcAccountVO, AccountVO destAccountVO) {
		accountFlowMapper.insert(transferBean);
		Integer srcAccId = transferBean.getSrcAccId();
		AccountDTO srcAccountDTO = new AccountDTO();
		srcAccountDTO.setAccId(srcAccId);
		BigDecimal accAmount = srcAccountVO.getAccAmount();
		BigDecimal flowAmount = transferBean.getFlowAmount();
		srcAccountDTO.setAccAmount(accAmount.subtract(flowAmount).setScale(2, RoundingMode.HALF_UP));
		accountService.updateByIdSelective(srcAccountDTO);
		
		Integer destAccId = transferBean.getDestAccId();
		AccountDTO destAccountDTO = new AccountDTO();
		destAccountDTO.setAccId(destAccId);
		BigDecimal destAccAmount = destAccountVO.getAccAmount();
		destAccountDTO.setAccAmount(destAccAmount.add(flowAmount).setScale(2, RoundingMode.HALF_UP));
		accountService.updateByIdSelective(destAccountDTO);
	}


	private void handleTransferOutcome(AccountFlow transferBean, AccountVO destAccountVo) {
		AccountFlowDTO flowDTO = DataUtils.copyBean(transferBean, AccountFlowDTO.class);
		flowDTO.setRelatFlowId(transferBean.getFlowId());
		flowDTO.setFlowRecordType(FlowRecordTypeEnum.OUTCOME);
		AccountFlow outcomeBean = this.insertOutcomeFlow(flowDTO);
		transferBean.setRelatFlowId(outcomeBean.getFlowId());
		accountFlowMapper.insert(transferBean);
		Integer destAccId = transferBean.getDestAccId();
		AccountDTO accountDTO = new AccountDTO();
		accountDTO.setAccId(destAccId);
		BigDecimal accAmount = destAccountVo.getAccAmount();
		BigDecimal flowAmount = flowDTO.getFlowAmount();
		accountDTO.setAccAmount(accAmount.add(flowAmount).setScale(2, RoundingMode.HALF_UP));
		
		accountService.updateByIdSelective(accountDTO);
	}


	private void handleTransferIncome(AccountFlow transferBean, AccountVO srcAccountVO) {
		AccountFlowDTO flowDTO = DataUtils.copyBean(transferBean, AccountFlowDTO.class);
		flowDTO.setRelatFlowId(transferBean.getFlowId());
		flowDTO.setFlowRecordType(FlowRecordTypeEnum.INCOME);
		AccountFlow incomeBean = this.insertIncomeFlow(flowDTO);
		transferBean.setRelatFlowId(incomeBean.getFlowId());
		accountFlowMapper.insert(transferBean);
		Integer srcAccId = transferBean.getSrcAccId();
		AccountDTO accountDTO = new AccountDTO();
		accountDTO.setAccId(srcAccId);
		BigDecimal accAmount = srcAccountVO.getAccAmount();
		BigDecimal flowAmount = flowDTO.getFlowAmount();
		accountDTO.setAccAmount(accAmount.subtract(flowAmount).setScale(2, RoundingMode.HALF_UP));

		accountService.updateByIdSelective(accountDTO);
	}

	private FlowFlagEnum getFlowFlag(AccountSysTypeEnum srcType, AccountSysTypeEnum destType) {
		if(srcType == AccountSysTypeEnum.FREE_ACCOUNT && destType == AccountSysTypeEnum.CREDIT_ACCOUNT) {
			return FlowFlagEnum.FREE_TO_CREDIT;
		} else if (srcType == AccountSysTypeEnum.FREE_ACCOUNT && destType == AccountSysTypeEnum.INVEST_ACCOUNT) {
			return FlowFlagEnum.FREE_TO_INVEST;
		} else if (srcType == AccountSysTypeEnum.FREE_ACCOUNT && destType == AccountSysTypeEnum.SINGLE_ACCOUNT) {
			return FlowFlagEnum.FREE_TO_OVER;
		} else if (srcType == AccountSysTypeEnum.CREDIT_ACCOUNT && destType == AccountSysTypeEnum.FREE_ACCOUNT) {
			return FlowFlagEnum.CREDIT_TO_FREE;
		} else if (srcType == AccountSysTypeEnum.INVEST_ACCOUNT && destType == AccountSysTypeEnum.FREE_ACCOUNT) {
			return FlowFlagEnum.INVEST_TO_FREE;
		} else {
			return FlowFlagEnum.SELF;
		}
	}
	
	private FlowRecordTypeEnum getFlowRecodeByFlag(FlowFlagEnum flowFlag) {
		if(flowFlag == FlowFlagEnum.FREE_TO_CREDIT) {
			return FlowRecordTypeEnum.OUTCOME;
		} else if(flowFlag == FlowFlagEnum.FREE_TO_INVEST) {
			return FlowRecordTypeEnum.OUTCOME;
		} else if (flowFlag == FlowFlagEnum.FREE_TO_OVER) {
			return FlowRecordTypeEnum.OUTCOME;
		} else if (flowFlag == FlowFlagEnum.CREDIT_TO_FREE) {
			return FlowRecordTypeEnum.INCOME;
		} else if (flowFlag == FlowFlagEnum.INVEST_TO_FREE) {
			return FlowRecordTypeEnum.INCOME;
		} else {
			return null;
		}
	}

	@Override
	public AccountFlow insertRechargeFlow(AccountFlowDTO flowDto) {
		Integer srcAccId = flowDto.getSrcAccId();
		AccountVO accountVO = accountService.findOne(srcAccId);
		BigDecimal flowAmount = flowDto.getFlowAmount();
		BigDecimal accAmount = accountVO.getAccAmount();
		BigDecimal subtractAmount = flowAmount.subtract(accAmount);
		flowDto.setFlowAmount(subtractAmount);
		flowDto.setCateId1(0);
		flowDto.setCateId2(0);
		int compareTo = flowAmount.compareTo(accAmount);
		if(compareTo == 1) {
			return this.insertIncomeFlow(flowDto);
		} else if(compareTo == -1) {
			return this.insertOutcomeFlow(flowDto);
		} else {
			return null;
		}
		
	}
	
	/**
	 * 流水号生成 32-17
	 * @Title: generateFlowId
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return
	 */
	public String generateFlowId() {
		String randomString = UUID.randomUUID().toString().replaceAll("-", "");
		String datePrefix = DateUtils.toString(new Date(), DatePattern.SIMPLE_DATESEC_FORMATER);
		String subfix = randomString.substring(0, 15);
		return datePrefix + subfix;
	}
	
	
	@Override
	public PageVO<AccountFlowVO> queryPage(AccountFlowQuery query) {
		
		AccountFlowExample example = new ExampleProxy();
		
		super.handlePageOrder(query, false, example);
		
		// TODO Here build the condition you want
		
		List<AccountFlow> accountFlows = accountFlowMapper.selectByExample(example);
		
		return super.handlePageResult(accountFlows);
	}
	

	@Override
	public List<AccountFlowVO> queryList(AccountFlowQuery query) {
		query.setPageFlag(false);
		PageVO<AccountFlowVO> pageVO = this.queryPage(query);
		return pageVO.getData();
	}

	private class ExampleProxy extends AccountFlowExample {
		// 静态代理一下
		public Criteria createCriteria() {
			return (Criteria) CriteriaProxy.getInstance(super.createCriteria());
		}
		
		public Criteria or() {
			return (Criteria) CriteriaProxy.getInstance(super.or());
		}
		
	}

}
