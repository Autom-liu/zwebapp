package com.scnu.zwebapp.common.enums;

/**
 * 自定义的排序枚举，用于实现动态排序功能，不能让接口直接传递需要排序的字段，只能传递排序编号，且必须在该枚举定义范围内 <br/>
 * 所有需要排序的字段枚举常量都需要实现该接口，以做分页排序逻辑处理
 * @author Autom
 * @see com.scnu.zwebapp.common.service.BaseService.handlePageOrder
 */
public interface BaseOrderByEnum extends BaseStatusEnum {
	
	String getOrderField();
	
	default String getMsg() {
		return null;
	}
	
}
