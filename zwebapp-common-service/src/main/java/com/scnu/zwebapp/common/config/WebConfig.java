package com.scnu.zwebapp.common.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.OrderComparator;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.scnu.zwebapp.common.factory.EnumConverterFactory;
import com.scnu.zwebapp.common.web.CommonRequestBodyResolver;

/**
 * web mvc 相关配置
 * @author Autom
 * @date 2020年2月2日
 * @version 0.1
 *
 */
@Configuration
public class WebConfig extends WebMvcConfigurationSupport {

	@Autowired
	private CommonRequestBodyResolver commonRequestBodyResolver;
	
	@Override
	protected void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
		resolvers.add(commonRequestBodyResolver);
		OrderComparator.sort(resolvers);
	}

	@Override
	protected void addFormatters(FormatterRegistry registry) {
		registry.addConverterFactory(new EnumConverterFactory());
	}
	
}
