package com.scnu.zwebapp.facade.enums;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.scnu.zwebapp.common.base.BaseBizEnum;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum FlowFlagEnum implements BaseBizEnum {
	
	/** 自身流转 **/
	SELF("0000", "自身流转"),
	
	/** 自由转信贷 **/
	FREE_TO_CREDIT("0001", "自由转信贷"),
	
	/** 信贷转自由 **/
	CREDIT_TO_FREE("0002", "信贷转自由"),
	
	/** 自由转投资 **/
	FREE_TO_INVEST("0003", "自由转投资"),
	
	/** 投资转自由 **/
	INVEST_TO_FREE("0004", "投资转自由"),
	
	/** 自由转定向 **/
	FREE_TO_OVER("0005", "自由转定向"),
	;

	private String code;
	
	private String msg;
	
	private FlowFlagEnum(String code, String msg) {
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
