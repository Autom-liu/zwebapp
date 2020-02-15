package com.scnu.zwebapp.facade.interfaces;

import java.util.List;

import com.scnu.zwebapp.common.service.IService;
import com.scnu.zwebapp.common.vo.PageVO;
import com.scnu.zwebapp.facade.dto.AccountDTO;
import com.scnu.zwebapp.facade.query.AccountQuery;
import com.scnu.zwebapp.facade.vo.AccountVO;

/**
 * if your service don't need this method  you can remove it manually
 */
public interface AccountService extends IService<AccountDTO, AccountVO> {
	
	PageVO<AccountVO> queryPage(AccountQuery query);
	
	List<AccountVO> queryList(AccountQuery query);
	
}
