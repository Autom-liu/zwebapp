package com.scnu.zwebapp.baseinfo.web.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scnu.zwebapp.common.enums.ErrorEnum;
import com.scnu.zwebapp.common.vo.IResult;
import com.scnu.zwebapp.common.vo.Result;
import com.scnu.zwebapp.common.vo.ResultList;
import com.scnu.zwebapp.facade.dto.OtherDTO;
import com.scnu.zwebapp.facade.interfaces.OtherService;
import com.scnu.zwebapp.facade.query.OtherQuery;
import com.scnu.zwebapp.facade.vo.OtherVO;

@RestController
public class OtherApi {
	
	@Autowired
	private OtherService otrService;

	@PostMapping("/other/add")
	public IResult addOther(@Valid OtherDTO dto) {
		otrService.insert(dto);
		return Result.success("");
	}
	
	@PostMapping("/other/edit")
	public IResult editOther(OtherDTO dto) {
		if(dto.getOtrId() == null) {
			return IResult.error(ErrorEnum.ERRCODE_0016);
		}
		otrService.updateByIdSelective(dto);
		return Result.success("");
	}
	
	@DeleteMapping("/other/{id}")
	public IResult deleteOther(@PathVariable("id") Integer id) {
		otrService.deleteById(id);
		return Result.success("");
	}
	
	@GetMapping("/other/{id}")
	public IResult findOne(@PathVariable("id") Integer id) {
		OtherVO result = otrService.findOne(id);
		return Result.success(result);
	}
	
	@GetMapping("/other/list")
	public IResult findList(OtherQuery query) {
		if(StringUtils.isEmpty(query.getOrderBy())) {
			return IResult.error(ErrorEnum.ERRCODE_0017);
		}
		
		if(StringUtils.isEmpty(query.getOtrType())) {
			return IResult.error(ErrorEnum.ERRCODE_0018);
		}
		
		List<OtherVO> result = otrService.queryList(query);
		return ResultList.success(result);
	}
	
}
