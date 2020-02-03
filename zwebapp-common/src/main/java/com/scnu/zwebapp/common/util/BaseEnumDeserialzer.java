package com.scnu.zwebapp.common.util;

import java.io.IOException;

import org.springframework.beans.BeanUtils;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.scnu.zwebapp.common.enums.BaseStatusEnum;

public class BaseEnumDeserialzer extends JsonDeserializer<BaseStatusEnum> {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public BaseStatusEnum deserialize(JsonParser p, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode jsonNode = (JsonNode) p.getCodec().readTree(p);
		String currentName = p.getCurrentName();
		Object currentValue = p.getCurrentValue();
		Class propertyType = BeanUtils.findPropertyType(currentName, currentValue.getClass());
		String code = jsonNode.asText();
		return DataUtils.getEnumByCode(code, propertyType);
	}

}
