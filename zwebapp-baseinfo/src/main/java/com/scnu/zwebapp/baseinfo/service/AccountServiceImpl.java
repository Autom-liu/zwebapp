package com.scnu.zwebapp.baseinfo.service;

import java.math.BigDecimal;
import java.util.List;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.scnu.zwebapp.baseinfo.bean.Account;
import com.scnu.zwebapp.baseinfo.bean.AccountExample;
import com.scnu.zwebapp.baseinfo.mapper.AccountExtMapper;
import com.scnu.zwebapp.baseinfo.mapper.AccountMapper;
import com.scnu.zwebapp.common.enums.AccountSysTypeEnum;
import com.scnu.zwebapp.common.enums.ErrorEnum;
import com.scnu.zwebapp.common.exception.BizException;
import com.scnu.zwebapp.common.proxy.CriteriaProxy;
import com.scnu.zwebapp.common.service.BaseService;
import com.scnu.zwebapp.common.util.DataUtils;
import com.scnu.zwebapp.common.vo.PageVO;
import com.scnu.zwebapp.facade.dto.AccountDTO;
import com.scnu.zwebapp.facade.dto.SubAccountDTO;
import com.scnu.zwebapp.facade.enums.AccountUserTypeEnum;
import com.scnu.zwebapp.facade.interfaces.AccountService;
import com.scnu.zwebapp.facade.query.AccountQuery;
import com.scnu.zwebapp.facade.vo.AccountVO;

@Component
@Service
public class AccountServiceImpl extends BaseService<Account, AccountDTO, AccountVO> implements AccountService {

	@Autowired
	protected AccountMapper mapper;
	
	@Autowired
	private AccountExtMapper extMapper;
	
	@Override
	public PageVO<AccountVO> queryPage(AccountQuery query) {
		
		AccountExample example = new ExampleProxy();
		
		super.handlePageOrder(query, false, example);
		
		example.createCriteria()
			.andAccSysTypeEqualTo(query.getAccSysType())
			.andAccUserTypeEqualTo(query.getAccUserType())
			.andAccHasChildEqualTo(query.getAccHasChild())
			.andAccCanPayEqualTo(query.getAccCanPay())
			.andAccCanTransferEqualTo(query.getAccCanTransfer())
			.andIsDelEqualTo(false);
		
		List<Account> accounts = mapper.selectByExample(example);
		
		return super.handlePageResult(accounts);
	}
	

	@Override
	public List<AccountVO> queryList(AccountQuery query) {
		query.setPageFlag(false);
		PageVO<AccountVO> pageVO = this.queryPage(query);
		return pageVO.getData();
	}
	
	@Override
	public AccountVO findOne(Integer id) {
		Account bean = mapper.selectByPrimaryKey(id);
		if(bean.getIsDel()) {
			throw new BizException(ErrorEnum.ERRCODE_0011);
		}
		return DataUtils.copyBean(bean, AccountVO.class);
	}


	@Override
	@Transactional
	public int insert(AccountDTO accountDTO) {
		String accSysTypeCode = accountDTO.getAccSysType();
		String accUserTypeCode = accountDTO.getAccUserType();
		AccountSysTypeEnum accSysType = DataUtils.getEnumByCode(accSysTypeCode, AccountSysTypeEnum.class);
		AccountUserTypeEnum accUserType = DataUtils.getEnumByCode(accUserTypeCode, AccountUserTypeEnum.class);
		
		if(accSysType == null) {
			throw new BizException(ErrorEnum.ERRCODE_0006);
		}
		
		if(accUserType == null) {
			throw new BizException(ErrorEnum.ERRCODE_0007);
		}
		
		Account mainAccount = DataUtils.copyBean(accountDTO, Account.class);
		List<SubAccountDTO> subAccountList = accountDTO.getSubAccount();
		boolean hasChild = !CollectionUtils.isEmpty(subAccountList);
		mainAccount.setAccAmount(BigDecimal.ZERO);
		mainAccount.setAccParentId(0);
		mainAccount.setAccHasChild(hasChild);
		mainAccount.setAccCanPay(canPay(accSysTypeCode));
		mainAccount.setAccCanTransfer(canTransfer(accSysTypeCode));
		mainAccount.setIsDel(false);
		int mainRow = extMapper.insert(mainAccount);
		int childRow = 0;
		if(hasChild) {
			if(subAccountList.size() > 5) {
				throw new BizException(ErrorEnum.ERRCODE_0010);
			}
			List<Account> subAccounts = DataUtils.copyList(subAccountList, Account.class, (r, t) -> {
				t.setAccSysType(accSysTypeCode);
				t.setAccUserType(accUserTypeCode);
				t.setAccAmount(BigDecimal.ZERO);
				t.setAccParentId(mainAccount.getAccId());
				t.setAccHasChild(false);
				t.setIsDel(false);
				if(!mainAccount.getAccCanPay() && r.isAccCanPay()) {
					throw new BizException(ErrorEnum.ERRCODE_0008);
				}
				if(!mainAccount.getAccCanTransfer() && r.isAccCanTransfer()) {
					throw new BizException(ErrorEnum.ERRCODE_0009);
				}
				t.setAccCanPay(r.isAccCanPay());
				t.setAccCanTransfer(r.isAccCanTransfer());
			});
			childRow = mapper.insertList(subAccounts);
		}
		return mainRow + childRow;
	}


	@Override
	@Transactional
	public int deleteById(Integer id) {
		// TODO 调用预支管理模块功能，模板表和预支表记录要删除
		int mainRow = extMapper.deleteById(id);
		if(mainRow == 0) {
			throw new BizException(ErrorEnum.ERRCODE_0011);
		}
		
		int subRow = extMapper.deleteByParentId(id);
		return mainRow + subRow;
	}


	@Override
	public int updateByIdSelective(AccountDTO dto) {
		Account record = DataUtils.copyBean(dto, Account.class);
		int row = extMapper.updateByIdSelective(record);
		if(row == 0) {
			throw new BizException(ErrorEnum.ERRCODE_0011);
		}
		return row;
	}

	public boolean canPay(String sysType) {
		return !AccountSysTypeEnum.INVEST_ACCOUNT.equals(sysType);
	}
	
	public boolean canTransfer(String sysType) {
		return !AccountSysTypeEnum.SINGLE_ACCOUNT.equals(sysType);
	}

	private class ExampleProxy extends AccountExample {
		// 静态代理一下
		public Criteria createCriteria() {
			return (Criteria) CriteriaProxy.getInstance(super.createCriteria());
		}
		
		public Criteria or() {
			return (Criteria) CriteriaProxy.getInstance(super.or());
		}
		
	}
}
