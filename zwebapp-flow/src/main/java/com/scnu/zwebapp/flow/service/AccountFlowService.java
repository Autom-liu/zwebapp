package com.scnu.zwebapp.flow.service;

import java.util.List;

import com.scnu.zwebapp.common.service.IService;
import com.scnu.zwebapp.common.vo.PageVO;
import com.scnu.zwebapp.flow.bean.AccountFlow;
import com.scnu.zwebapp.flow.dto.AccountFlowDTO;
import com.scnu.zwebapp.flow.query.AccountFlowQuery;
import com.scnu.zwebapp.flow.vo.AccountFlowVO;

/**
 * 流水业务处理接口
 * @author Autom
 * @date 2020年2月1日
 * @version 0.1
 */
public interface AccountFlowService extends IService<AccountFlow, AccountFlowDTO, AccountFlowVO> {
	
	/**
	 * 分页查询流水信息
	 * @Title: queryPage
	 * @Description: 分页查询流水信息
	 * @param query
	 * @return
	 */
	PageVO<AccountFlowVO> queryPage(AccountFlowQuery query);
	
	/**
	 * 条件查询流水信息
	 * @Title: queryList
	 * @Description: 条件查询流水信息
	 * @param query
	 * @return
	 */
	List<AccountFlowVO> queryList(AccountFlowQuery query);
	
	/**
	 * 新增收入流水
	 * @Title: insertIncomeFlow
	 * @Description: 新增收入流水
	 * @param flowDto
	 * @return
	 */
	AccountFlow insertIncomeFlow(AccountFlowDTO flowDto);
	
	/**
	 * 新增支出流水
	 * @Title: insertOutcomeFlow
	 * @Description: 新增支出流水
	 * @param flowDto
	 * @return
	 */
	boolean insertOutcomeFlow(AccountFlowDTO flowDto);
	
	/**
	 * 新增转账流水
	 * @Title: insertTransferFlow
	 * @Description: 新增转账流水
	 * @param flowDto
	 * @return
	 */
	boolean insertTransferFlow(AccountFlowDTO flowDto);
	
	/**
	 * 新增余额变更流水
	 * @Title: insertRechargeFlow
	 * @Description: 新增余额变更流水
	 * @param flowDto
	 * @return
	 */
	boolean insertRechargeFlow(AccountFlowDTO flowDto);
	
}
