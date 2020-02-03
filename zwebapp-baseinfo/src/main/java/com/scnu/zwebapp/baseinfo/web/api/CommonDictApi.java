package com.scnu.zwebapp.baseinfo.web.api;

import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scnu.zwebapp.baseinfo.enums.AccountUserTypeEnum;
import com.scnu.zwebapp.baseinfo.enums.OtrTypeEnum;
import com.scnu.zwebapp.common.enums.AccountSysTypeEnum;
import com.scnu.zwebapp.common.enums.FlowRecordTypeEnum;
import com.scnu.zwebapp.common.vo.ResultList;

@RestController
public class CommonDictApi {
	
	@GetMapping("/dict/otrtype")
	public ResultList<OtrTypeEnum> getOtrTypeDict() {
		return ResultList.success(Arrays.asList(OtrTypeEnum.values()));
	}
	
	@GetMapping("/dict/recordtype")
	public ResultList<FlowRecordTypeEnum> getRecordTypeDict() {
		return ResultList.success(Arrays.asList(FlowRecordTypeEnum.values()));
	}
	
	@GetMapping("/dict/accusertype")
	public ResultList<AccountUserTypeEnum> getAccUserTypeDict() {
		return ResultList.success(Arrays.asList(AccountUserTypeEnum.values()));
	}
	
	@GetMapping("/dict/accsystype")
	public ResultList<AccountSysTypeEnum> getAccSysTypeDict() {
		return ResultList.success(Arrays.asList(AccountSysTypeEnum.values()));
	}
	
}
