package com.scnu.zwebapp.common.enums;

/**
 * 业务枚举，其他模块的自定义枚举类型均需实现该接口，这是规范定义！
 * @author Autom
 *
 */
public interface BizEnum extends BaseStatusEnum {
	
	default boolean equals(String code) {
		return this.getCode().equals(code);
	}
	
}
