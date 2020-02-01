package com.scnu.zwebapp.common.enums;

/**
 * 公共业务枚举
 * @author Administrator
 */
public enum CommonBizEnum implements ExceptionEnums {
	/** 无效的排序字段  **/
	BAD_ORDER_FIELD("4000", "无效的排序字段"),
	;
	
	private String code;
	
	private String msg;

	private CommonBizEnum(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}
	
}
