package com.scnu.zwebapp.baseinfo.service;

import java.util.List;

import com.scnu.zwebapp.common.service.IService;
import com.scnu.zwebapp.common.vo.PageVO;
import com.scnu.zwebapp.baseinfo.bean.Account;
import com.scnu.zwebapp.baseinfo.dto.AccountDTO;
import com.scnu.zwebapp.baseinfo.query.AccountQuery;
import com.scnu.zwebapp.baseinfo.vo.AccountVO;

/**
 * if your service don't need this method  you can remove it manually
 */
public interface AccountService extends IService<Account, AccountDTO, AccountVO> {
	
	PageVO<AccountVO> queryPage(AccountQuery query);
	
	List<AccountVO> queryList(AccountQuery query);
	
}
