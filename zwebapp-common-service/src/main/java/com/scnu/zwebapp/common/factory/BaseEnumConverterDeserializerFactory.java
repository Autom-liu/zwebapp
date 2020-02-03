package com.scnu.zwebapp.common.factory;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.scnu.zwebapp.common.base.BaseBizEnum;

/**
 * 通用枚举参数解析器  生成工厂
 * 所有实现{@link BaseBizEnum}的枚举在spring mvc参数解析阶段完成枚举类型注入
 * @author Autom
 * @date 2020年2月4日
 * @version 1.0
 *
 */
@SuppressWarnings({"unchecked", "rawtypes"})
@Component
public class BaseEnumConverterDeserializerFactory extends JsonDeserializer<BaseBizEnum> implements ConverterFactory<String, BaseBizEnum> {
	
	private static final Map<Class<?>, Converter> CONVERTERS = new ConcurrentHashMap<>();

	@Override
	public <T extends BaseBizEnum> Converter<String, T> getConverter(Class<T> targetType) {
		Converter<String, T> converter = CONVERTERS.get(targetType);
		if(converter == null) {
			converter = new CodeEnumConverter<>(targetType);
			CONVERTERS.put(targetType, converter);
		}
		return converter;
	}

	@Override
	public BaseBizEnum deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		JsonNode jsonNode = (JsonNode) p.getCodec().readTree(p);
		String currentName = p.getCurrentName();
		Object currentValue = p.getCurrentValue();
		Class propertyType = BeanUtils.findPropertyType(currentName, currentValue.getClass());
		String text = jsonNode.asText();
		Converter converter = this.getConverter(propertyType);
		Object convertResult = converter.convert(text);
		return convertResult instanceof BaseBizEnum ? (BaseBizEnum) convertResult : null;
	}

	public static class CodeEnumConverter<T extends BaseBizEnum> implements Converter<String, T> {
		
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
