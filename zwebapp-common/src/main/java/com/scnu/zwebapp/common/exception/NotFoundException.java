package com.scnu.zwebapp.common.exception;

import com.scnu.zwebapp.common.enums.NotFoundEnum;

/**
 * 404 （空数据、找不到）异常用这个抛
 * @author Autom
 *
 */
public class NotFoundException extends RuntimeException {

	private static final long serialVersionUID = 2419651699941615039L;
	
	private NotFoundEnum notFoundEnums;

	public NotFoundException(NotFoundEnum notFoundEnums) {
		super(notFoundEnums.getMsg());
		this.notFoundEnums = notFoundEnums;
	}

	public NotFoundEnum getNotFoundEnums() {
		return notFoundEnums;
	}
	
	public String getCode() {
		return notFoundEnums.getCode();
	}
	
	public String getMsg() {
		return notFoundEnums.getMsg();
	}
}
