package com.scnu.zwebapp.common.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;

import com.scnu.zwebapp.common.enums.BaseStatusEnum;

@SuppressWarnings({"unchecked", "rawtypes"})
public class EnumConverterFactory implements ConverterFactory<String, BaseStatusEnum> {
	
	private static final Map<Class<?>, Converter> CONVERTERS = new ConcurrentHashMap<>();

	@Override
	public <T extends BaseStatusEnum> Converter<String, T> getConverter(Class<T> targetType) {
		Converter<String, T> converter = CONVERTERS.get(targetType);
		if(converter == null) {
			converter = new CodeEnumConverter<>(targetType);
			CONVERTERS.put(targetType, converter);
		}
		return converter;
	}
	
	public static class CodeEnumConverter<T extends BaseStatusEnum> implements Converter<String, T> {
		
		private Map<String, T> enumMap = new HashMap<>();

		public CodeEnumConverter(Class<T> targetType) {
			T[] enumConstants = targetType.getEnumConstants();
			for(T e : enumConstants) {
				enumMap.put(e.getCode(), e);
			}
		}

		@Override
		public T convert(String source) {
			return enumMap.get(source);
		}
		
	}

}
