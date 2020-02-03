package com.scnu.zwebapp.baseinfo.web.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scnu.zwebapp.baseinfo.dto.CategoryDTO;
import com.scnu.zwebapp.baseinfo.query.CategoryQuery;
import com.scnu.zwebapp.baseinfo.service.CategoryService;
import com.scnu.zwebapp.baseinfo.vo.CategoryVO;
import com.scnu.zwebapp.common.enums.ErrorEnum;
import com.scnu.zwebapp.common.enums.FlowRecordTypeEnum;
import com.scnu.zwebapp.common.vo.IResult;
import com.scnu.zwebapp.common.vo.Result;
import com.scnu.zwebapp.common.vo.ResultList;

@RestController
public class CategoryApi {
	
	@Autowired
	private CategoryService categoryService;
	
	@PostMapping("/cate/add")
	public IResult addCate(CategoryDTO category) {
		category.setIsDel(false);
		category.setCateId(null);
		String cateType = category.getCateType();
		if(FlowRecordTypeEnum.INCOME.equals(cateType) || FlowRecordTypeEnum.OUTCOME.equals(cateType)) {
			categoryService.insert(category);			
			return Result.success("");
		} else {
			return IResult.error(ErrorEnum.ERRCODE_0001);
		}
		
	}
	
	@PostMapping("/cate/edit")
	public IResult editCate(CategoryDTO category) {
		if(category.getCateId() == null) {
			return IResult.error(ErrorEnum.ERRCODE_0002);
		}
		category.setParentId(null);
		category.setIsDel(null);
		category.setCateLevel(null);
		categoryService.updateByIdSelective(category);
		return Result.success("");
	}
	
	@DeleteMapping("cate/{id}")
	public IResult deleteCate(@PathVariable("id") Integer id) {
		categoryService.deleteById(id);
		return Result.success("");			
	}
	
	@GetMapping("cate/{id}")
	public Result<CategoryVO> findOne(@PathVariable("id") Integer id) {
		CategoryVO result = categoryService.findOne(id);
		return Result.success(result);
	}
	
	@GetMapping("cate/list")
	public IResult findList(CategoryQuery query) {
		FlowRecordTypeEnum cateType = query.getCateType();
		
		if(FlowRecordTypeEnum.INCOME.equals(cateType) || FlowRecordTypeEnum.OUTCOME.equals(cateType)) {
			List<CategoryVO> list = categoryService.queryList(query);
			return ResultList.success(list);
		} else {
			return IResult.error(ErrorEnum.ERRCODE_0001);
		}
	}
	
}
