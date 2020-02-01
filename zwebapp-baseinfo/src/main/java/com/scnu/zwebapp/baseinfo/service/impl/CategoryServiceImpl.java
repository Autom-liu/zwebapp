package com.scnu.zwebapp.baseinfo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scnu.zwebapp.common.enums.ErrorEnum;
import com.scnu.zwebapp.common.exception.BizException;
import com.scnu.zwebapp.common.proxy.CriteriaProxy;
import com.scnu.zwebapp.common.service.BaseService;
import com.scnu.zwebapp.common.util.DataUtils;
import com.scnu.zwebapp.common.vo.PageVO;
import com.scnu.zwebapp.baseinfo.bean.Category;
import com.scnu.zwebapp.baseinfo.bean.CategoryExample;
import com.scnu.zwebapp.baseinfo.dto.CategoryDTO;
import com.scnu.zwebapp.baseinfo.mapper.CategoryExtMapper;
import com.scnu.zwebapp.baseinfo.mapper.CategoryMapper;
import com.scnu.zwebapp.baseinfo.query.CategoryQuery;
import com.scnu.zwebapp.baseinfo.service.CategoryService;
import com.scnu.zwebapp.baseinfo.vo.CategoryVO;

@Service
public class CategoryServiceImpl extends BaseService<Category, CategoryDTO, CategoryVO> implements CategoryService {

	@Autowired
	private CategoryMapper categoryMapper;
	
	@Autowired
	private CategoryExtMapper categoryExtMapper;
	
	@Override
	public PageVO<CategoryVO> queryPage(CategoryQuery query) {
		
		CategoryExample example = new ExampleProxy();
		
		super.handlePageOrder(query, null, example);
		
		// TODO Here build the condition you want
		example.createCriteria()
			.andCateTypeEqualTo(query.getCategoryType())
			.andIsDelEqualTo(false);
		
		
		List<Category> categorys = categoryMapper.selectByExample(example);
		
		return super.handlePageResult(categorys);
	}
	
	
	
	@Override
	public CategoryVO findOne(Integer id) {
		Category category = categoryMapper.selectByPrimaryKey(id);
		if(category.getIsDel()) {
			throw new BizException(ErrorEnum.ERRCODE_0003);
		}
		
		return DataUtils.copyBean(category, CategoryVO.class);
	}



	@Override
	public List<CategoryVO> queryList(CategoryQuery query) {
		query.setPageFlag(false);
		PageVO<CategoryVO> pageVO = this.queryPage(query);
		return pageVO.getData();
	}
	
	@Override
	public int deleteById(Integer id) {
		int rows = categoryExtMapper.deleteById(id);
		
		if(rows == 0) {
			throw new BizException(ErrorEnum.ERRCODE_0003);
		}
		
		//TODO 联动删除
		return rows;
		
	}

	@Override
	public int updateByIdSelective(CategoryDTO dto) {
		Category bean = DataUtils.copyBean(dto, Category.class);
		int rows = categoryExtMapper.updateByIdSelective(bean);
		if(rows == 0) {
			throw new BizException(ErrorEnum.ERRCODE_0003);
		}
		return rows;
	}

	private class ExampleProxy extends CategoryExample {
		// 静态代理一下
		public Criteria createCriteria() {
			return (Criteria) CriteriaProxy.getInstance(super.createCriteria());
		}
		
		public Criteria or() {
			return (Criteria) CriteriaProxy.getInstance(super.or());
		}
		
	}
}
