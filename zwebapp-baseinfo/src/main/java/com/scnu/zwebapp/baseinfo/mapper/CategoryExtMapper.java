package com.scnu.zwebapp.baseinfo.mapper;

import com.scnu.zwebapp.baseinfo.bean.Category;

public interface CategoryExtMapper {
	
	/**
	 * 更新分类记录
	 * @param record
	 * @return
	 */
	int updateByIdSelective(Category record);
	
	/**
	 * 删除分类记录
	 * @param id
	 * @return
	 */
	int deleteById(Integer id);
	
}
