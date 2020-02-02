package com.scnu.zwebapp.flow.service.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.scnu.zwebapp.common.enums.ErrorEnum;
import com.scnu.zwebapp.common.exception.BizException;
import com.scnu.zwebapp.common.proxy.CriteriaProxy;
import com.scnu.zwebapp.common.service.BaseService;
import com.scnu.zwebapp.common.util.DataUtils;
import com.scnu.zwebapp.common.vo.PageVO;
import com.scnu.zwebapp.flow.bean.AccountFlow;
import com.scnu.zwebapp.flow.bean.AccountFlowExample;
import com.scnu.zwebapp.flow.dto.AccountDTO;
import com.scnu.zwebapp.flow.dto.AccountFlowDTO;
import com.scnu.zwebapp.flow.enums.AccountSysTypeEnum;
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
	public boolean insertIncomeFlow(AccountFlowDTO flowDto) {
		Integer destAccId = flowDto.getDestAccId();
		Integer srcAccId = flowDto.getSrcAccId();
		Integer reallyAccId = destAccId != null ? destAccId : srcAccId;
		AccountVO accountVO = accountService.findOne(reallyAccId);
		String accSysType = accountVO.getAccSysType();
		// 只有自由账户才能记为收入流水 
		if(!AccountSysTypeEnum.SINGLE_ACCOUNT.getCode().equals(accSysType)) {
			throw new BizException(ErrorEnum.ERRCODE_0105);
		}
		// 设置默认值
		AccountFlow bean = DataUtils.copyBean(flowDto, AccountFlow.class);
		if(bean.getCreateTime() == null) {
			bean.setCreateTime(new Date());
		}
		bean.setIsDel(false);
		// TODO 如果有其他项目，则需要累计其他项目的使用次数。（目前没有）
		// 如果存在目标账户，以目标账户为准，否则以原账户为准，累加账户表的金额。
		AccountDTO accountDTO = new AccountDTO();
		accountDTO.setAccId(reallyAccId);
		BigDecimal accAmount = accountVO.getAccAmount();
		BigDecimal flowAmount = flowDto.getFlowAmount();
		accountDTO.setAccAmount(accAmount.add(flowAmount).setScale(2, RoundingMode.HALF_UP));
		accountService.updateByIdSelective(accountDTO);
		return true;
	}


	@Override
	public boolean insertOutcomeFlow(AccountFlowDTO flowDto) {
		return false;
	}


	@Override
	public boolean insertTransferFlow(AccountFlowDTO flowDto) {
		return false;
	}


	@Override
	public boolean insertRechargeFlow(AccountFlowDTO flowDto) {
		return false;
	}
	
	@Override
	public PageVO<AccountFlowVO> queryPage(AccountFlowQuery query) {
		
		AccountFlowExample example = new ExampleProxy();
		
		super.handlePageOrder(query, null, example);
		
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
