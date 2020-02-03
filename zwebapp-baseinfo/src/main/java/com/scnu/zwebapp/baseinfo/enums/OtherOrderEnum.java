package com.scnu.zwebapp.baseinfo.enums;

import com.scnu.zwebapp.common.base.BaseOrderByEnum;

public enum OtherOrderEnum implements BaseOrderByEnum {
	
	/** 默认排序 **/
	DEFAULT_ORDERBY("0000", null),
	
	/** 使用次数排序 **/
	LASTEST_ORDERBY("0001", "otr_use_time"),
	
	;

	private String code;
	
	private String orderField;
	
	private OtherOrderEnum(String code, String orderField) {
		this.code = code;
		this.orderField = orderField;
	}

	@Override
	public String getCode() {
		return this.code;
	}

	@Override
	public String getOrderField() {
		return this.orderField;
	}

}
