package com.scnu.zwebapp.flow.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scnu.zwebapp.common.proxy.CriteriaProxy;
import com.scnu.zwebapp.common.service.BaseService;
import com.scnu.zwebapp.common.vo.PageVO;
import com.scnu.zwebapp.flow.bean.Account;
import com.scnu.zwebapp.flow.bean.AccountExample;
import com.scnu.zwebapp.flow.dto.AccountDTO;
import com.scnu.zwebapp.flow.mapper.AccountMapper;
import com.scnu.zwebapp.flow.query.AccountQuery;
import com.scnu.zwebapp.flow.service.AccountService;
import com.scnu.zwebapp.flow.vo.AccountVO;

@Service
public class AccountServiceImpl extends BaseService<Account, AccountDTO, AccountVO> implements AccountService {

	@Autowired
	private AccountMapper accountMapper;
	
	@Override
	public PageVO<AccountVO> queryPage(AccountQuery query) {
		
		AccountExample example = new ExampleProxy();
		
		super.handlePageOrder(query, null, example);
		
		// TODO Here build the condition you want
		
		List<Account> accounts = accountMapper.selectByExample(example);
		
		return super.handlePageResult(accounts);
	}
	

	@Override
	public List<AccountVO> queryList(AccountQuery query) {
		query.setPageFlag(false);
		PageVO<AccountVO> pageVO = this.queryPage(query);
		return pageVO.getData();
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
