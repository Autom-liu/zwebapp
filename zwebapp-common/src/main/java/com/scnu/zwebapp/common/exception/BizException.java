package com.scnu.zwebapp.common.exception;

import com.scnu.zwebapp.common.enums.ExceptionEnums;

/**
 * 统一业务异常
 * @author Autom
 */
public class BizException extends RuntimeException {

	private static final long serialVersionUID = -8402477412842893090L;
	
	private ExceptionEnums exceptionEnum;

	public BizException(ExceptionEnums exceptionEnum) {
		super(exceptionEnum.getMsg());
		this.exceptionEnum = exceptionEnum;
	}

	public ExceptionEnums getExceptionEnum() {
		return exceptionEnum;
	}
	
	public String getCode() {
		return exceptionEnum.getCode();
	}
	
	public String getMsg() {
		return exceptionEnum.getMsg();
	}
}
