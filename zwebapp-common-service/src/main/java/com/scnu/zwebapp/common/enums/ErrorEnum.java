package com.scnu.zwebapp.common.enums;

public enum ErrorEnum implements IErrorEnum {

	
	ERRCODE_0000("0000", "success"),
	
	/******  0000 ~ 0100 基础中心错误码   ********/
	
	/** 分类类型必须是收入或支出 **/
	ERRCODE_0001("0001", "分类类型必须是收入或支出"),
	
	/** 分类id不能为空 **/
	ERRCODE_0002("0002", "分类id不能为空"),
	
	/** 分类数据不存在 **/
	ERRCODE_0003("0003", "分类数据不存在"),
	
	/** 系统账户类型不在预期指定范围内 **/
	ERRCODE_0006("0006", "系统账户类型不在预期指定范围内"),
	
	/** 用户账户类型不在预期指定范围内 **/
	ERRCODE_0007("0007", "用户账户类型不在预期指定范围内"),
	
	/** 该账户类型不支持设置支付权限 **/
	ERRCODE_0008("0008", "该账户类型不支持设置支付权限"),
	
	/** 该账户类型不支持设置转账权限 **/
	ERRCODE_0009("0009", "该账户类型不支持设置转账权限"),
	
	/** 最多只能有5个子账户  **/
	ERRCODE_0010("0010", "最多只能有5个子账户"),
	
	/** 账户数据不存在  **/
	ERRCODE_0011("0010", "账户数据不存在"),
	
	/** 账户id不能为空  **/
	ERRCODE_0012("0012", "账户id不能为空"),
	
	/** 其他项目id不能为空  **/
	ERRCODE_0016("0016", "其他项目id不能为空"),

	/** 查询排序方式不能为空 **/
	ERRCODE_0017("0017", "查询排序方式不能为空"),
	
	/** 查询类型不能为空 **/
	ERRCODE_0018("0018", "查询类型不能为空"),

	/** 其他项目类型不再指定范围内 **/
	ERRCODE_0019("0019", "其他项目类型不再指定范围内"),
	
	/******  0100 ~ 0200 记账中心错误码   ********/
	/** 流水记录类型不在指定范围内 **/
	ERRCODE_0101("0101", "流水记录类型不在指定范围内"),
	
	/**流水记录类型非收入  **/
	ERRCODE_0102("0102", "流水记录类型非收入"),
	
	/** 只有自由账户才能记为收入流水 **/
	ERRCODE_0105("0105", "只有自由账户才能记为收入流水"),
	
	
	/******  0200 ~ 0300 预支中心错误码   ********/
	
	/******  0300 ~ 0400 消息中心错误码   ********/
	
	/******  0400 ~ 0500 用户中心错误码   ********/
	
	/******  0500 ~ 0600 统计中心错误码   ********/
	
	/******  0600 ~ 0700 系统内部错误码   ********/
	
	
	;

	private String code;
	
	private String msg;
	
	private ErrorEnum(String code, String msg) {
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

	@Override
	public boolean isSuccess() {
		return this == ERRCODE_0000;
	}

	@Override
	public boolean isNotSuccess() {
		return this != ERRCODE_0000;
	}
	
}
