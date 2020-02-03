package com.scnu.zwebapp.common.exception;

import com.scnu.zwebapp.common.enums.IErrorEnum;

/**
 * 统一业务异常
 * @author Autom
 * @date 2020年2月4日
 * @version 1.0
 *
 */
public class BizException extends RuntimeException {

	private static final long serialVersionUID = -8402477412842893090L;
	
	private IErrorEnum exceptionEnum;

	public BizException(IErrorEnum exceptionEnum) {
		super(exceptionEnum.getMsg());
		this.exceptionEnum = exceptionEnum;
	}

	public IErrorEnum getExceptionEnum() {
		return exceptionEnum;
	}
	
	public String getCode() {
		return exceptionEnum.getCode();
	}
	
	public String getMsg() {
		return exceptionEnum.getMsg();
	}
}
