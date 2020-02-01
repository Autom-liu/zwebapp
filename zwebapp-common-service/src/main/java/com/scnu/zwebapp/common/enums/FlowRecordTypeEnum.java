package com.scnu.zwebapp.common.enums;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.scnu.zwebapp.common.enums.BizEnum;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum FlowRecordTypeEnum implements BizEnum {
	
	/** 收入 **/
	INCOME("0001", "收入"),
	
	/** 支出 **/
	OUTCOME("0002", "支出"),
	
	/** 转账 **/
	TRANSFER("0003", "转账"),
	
	/** 余额变更 **/
	RECHARAGE("0004", "余额变更"),
	;
	
	private String code;
	
	private String msg;
	
	private FlowRecordTypeEnum(String code, String msg) {
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
