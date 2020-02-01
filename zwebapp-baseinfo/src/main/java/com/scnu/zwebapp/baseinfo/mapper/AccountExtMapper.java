package com.scnu.zwebapp.baseinfo.mapper;

import com.scnu.zwebapp.baseinfo.bean.Account;

public interface AccountExtMapper {

	/**
	 * 伪删除操作
	 * @param id
	 * @return
	 */
	int deleteById(Integer id);
	
	/**
	 * 插入并将自增主键返回
	 * @param id
	 * @return
	 */
	int insert(Account record);
	
	/**
	 * 根据父id删除
	 * @param parentId
	 * @return
	 */
	int deleteByParentId(Integer parentId);
	
	/**
	 * 编辑未删除的记录
	 * @param id
	 * @return
	 */
	int updateByIdSelective(Account record);
	
}
