package com.scnu.zwebapp.flow.service;

import java.util.List;

import com.scnu.zwebapp.common.service.IService;
import com.scnu.zwebapp.common.vo.PageVO;
import com.scnu.zwebapp.flow.bean.Account;
import com.scnu.zwebapp.flow.dto.AccountDTO;
import com.scnu.zwebapp.flow.query.AccountQuery;
import com.scnu.zwebapp.flow.vo.AccountVO;

/**
 * if your service don't need this method  you can remove it manually
 */
public interface AccountService extends IService<Account, AccountDTO, AccountVO> {
	
	PageVO<AccountVO> queryPage(AccountQuery query);
	
	List<AccountVO> queryList(AccountQuery query);
	
	AccountVO findOne(Integer id);
	
	int updateByIdSelective(AccountDTO accountDto);
	
}
