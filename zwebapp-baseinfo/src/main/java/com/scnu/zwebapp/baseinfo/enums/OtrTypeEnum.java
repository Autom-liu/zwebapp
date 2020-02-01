package com.scnu.zwebapp.baseinfo.enums;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.scnu.zwebapp.common.enums.BizEnum;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum OtrTypeEnum implements BizEnum {
	
	/** 项目 **/
	PROJECT("0001", "项目"),
	
	/** 成员 **/
	NUMBER("0002", "成员"),
	
	/** 商家 **/
	SHOPPER("0003", "商家"),
	
	;

	private String code;
	
	private String msg;
	
	private OtrTypeEnum(String code, String msg) {
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
