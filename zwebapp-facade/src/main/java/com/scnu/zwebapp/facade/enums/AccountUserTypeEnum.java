package com.scnu.zwebapp.facade.enums;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.scnu.zwebapp.common.base.BaseBizEnum;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum AccountUserTypeEnum implements BaseBizEnum {

	/** 现金账户 **/
	CASH_ACCOUNT("0001", "现金账户"),
	
	/** 储蓄账户 **/
	DEBIT_ACCOUNT("0002", "储蓄账户"),
	
	/** 信用卡 **/
	CREDIT_ACCOUNT("0003", "信用卡"),
	
	/** 虚拟账户 **/
	VIRTURE_ACCOUNT("0004", "虚拟账户"),
	
	/** 理财账户 **/
	FINANCING_ACCOUNT("0005", "理财账户"),
	
	/** 负债账户 **/
	INDEBT_ACCOUNT("0006", "负债账户"),
	
	/** 债权账户 **/
	LIABILITY_ACCOUNT("0007", "债权账户"),
	;

	
	private String code;
	
	private String msg;
	
	private AccountUserTypeEnum(String code, String msg) {
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
