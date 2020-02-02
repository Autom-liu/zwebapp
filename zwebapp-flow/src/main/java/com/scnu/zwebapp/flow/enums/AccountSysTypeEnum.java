package com.scnu.zwebapp.flow.enums;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.scnu.zwebapp.common.enums.BizEnum;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum AccountSysTypeEnum implements BizEnum {
	
	/** 自由账户 **/
	FREE_ACCOUNT("0001", "自由账户"),
	
	/** 信贷账户 **/
	CREDIT_ACCOUNT("0002", "信贷账户"),
	
	/** 投资账户 **/
	INVEST_ACCOUNT("0003", "投资账户"),
	
	/** 定向账户 **/
	SINGLE_ACCOUNT("0004", "定向账户"),
	
	;

	private final String code;
	
	private final String msg;
	
	private AccountSysTypeEnum(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	@Override
	public String getCode() {
		return this.code;
	}

	@Override
	public String getMsg() {
		return this.msg;
	}

}

