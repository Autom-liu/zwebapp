package com.scnu.zwebapp.baseinfo.service;

import java.util.List;

import com.scnu.zwebapp.common.service.IService;
import com.scnu.zwebapp.common.vo.PageVO;
import com.scnu.zwebapp.baseinfo.bean.Category;
import com.scnu.zwebapp.baseinfo.dto.CategoryDTO;
import com.scnu.zwebapp.baseinfo.query.CategoryQuery;
import com.scnu.zwebapp.baseinfo.vo.CategoryVO;

/**
 * if your service don't need this method  you can remove it manually
 */
public interface CategoryService extends IService<Category, CategoryDTO, CategoryVO> {
	
	PageVO<CategoryVO> queryPage(CategoryQuery query);
	
	List<CategoryVO> queryList(CategoryQuery query);
	
}
