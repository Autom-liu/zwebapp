package com.scnu.zwebapp.facade.interfaces;

import java.util.List;

import com.scnu.zwebapp.common.service.IService;
import com.scnu.zwebapp.common.vo.PageVO;
import com.scnu.zwebapp.facade.dto.CategoryDTO;
import com.scnu.zwebapp.facade.query.CategoryQuery;
import com.scnu.zwebapp.facade.vo.CategoryVO;

/**
 * if your service don't need this method  you can remove it manually
 */
public interface CategoryService extends IService<CategoryDTO, CategoryVO> {
	
	PageVO<CategoryVO> queryPage(CategoryQuery query);
	
	List<CategoryVO> queryList(CategoryQuery query);
	
}
