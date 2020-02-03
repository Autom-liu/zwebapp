package com.scnu.zwebapp.common.enums;

/**
 * 系统默认错误码
 * @author Autom
 * @date 2020年2月4日
 * @version 1.0
 *
 */
public enum DefaultSysErrorEnum implements IErrorEnum {
	/** 无效的排序字段  **/
	BAD_ORDER_FIELD("4000", "无效的排序字段"),
	;
	
	private String code;
	
	private String msg;

	private DefaultSysErrorEnum(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

	@Override
	public boolean isSuccess() {
		return false;
	}

	@Override
	public boolean isNotSuccess() {
		return true;
	}
	
}
