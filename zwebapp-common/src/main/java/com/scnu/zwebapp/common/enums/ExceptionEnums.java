package com.scnu.zwebapp.common.enums;

/**
 * 异常类型枚举，一般用于定义错误码类枚举
 * 也就是说，错误码类枚举必须有code和msg字段，这是规范定义
 * @author Autom
 */
public interface ExceptionEnums {
	
	String getCode();
	
	String getMsg();
	
	/**
	 * 该方法可以用于创建不再本系统枚举范围内的错误码<br/>
	 * 创建一个兼容可其他系统的错误码枚举
	 * @param code
	 * @param msg
	 * @return
	 */
	public static ExceptionEnums getInstance(String code, String msg) {
		return new ExceptionEnums() {

			@Override
			public String getCode() {
				return code;
			}

			@Override
			public String getMsg() {
				return msg;
			}
			
		};
	}
}
