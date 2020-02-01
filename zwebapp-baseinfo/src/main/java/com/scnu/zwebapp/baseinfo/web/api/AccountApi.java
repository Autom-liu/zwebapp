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

import com.scnu.zwebapp.baseinfo.dto.AccountDTO;
import com.scnu.zwebapp.baseinfo.query.AccountQuery;
import com.scnu.zwebapp.baseinfo.service.AccountService;
import com.scnu.zwebapp.baseinfo.vo.AccountVO;
import com.scnu.zwebapp.common.enums.ErrorEnum;
import com.scnu.zwebapp.common.vo.IResult;
import com.scnu.zwebapp.common.vo.Result;
import com.scnu.zwebapp.common.vo.ResultList;

@RestController
public class AccountApi {
	
	@Autowired
	private AccountService accountService;

	@PostMapping("/account/add")
	public IResult addAccount(@Valid AccountDTO dto) {
		// TODO 必传字段校验
		accountService.insert(dto);
		return Result.success("");
	}
	
	@PostMapping("/account/edit")
	public IResult editAccount(AccountDTO dto) {
		if(StringUtils.isEmpty(dto.getAccId())) {
			return IResult.error(ErrorEnum.ERRCODE_0012);
		}
		dto.setAccSysType(null);
		dto.setAccUserType(null);
		dto.setSubAccount(null);
		accountService.updateByIdSelective(dto);
		return Result.success("");
	}
	
	@DeleteMapping("/account/{id}")
	public IResult deleteAccount(@PathVariable("id") Integer id) {
		accountService.deleteById(id);
		return Result.success("");
	}
	
	@GetMapping("/account/{id}")
	public Result<AccountVO> findOne(@PathVariable("id") Integer id) {
		AccountVO accountVO = accountService.findOne(id);
		return Result.success(accountVO);
	}
	
	@GetMapping("/account/list")
	public ResultList<AccountVO> findList(AccountQuery query) {
		List<AccountVO> result = accountService.queryList(query);
		return ResultList.success(result);
	}
	
}
