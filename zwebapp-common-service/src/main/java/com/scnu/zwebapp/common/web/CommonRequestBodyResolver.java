package com.scnu.zwebapp.common.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.MethodParameter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor;
import org.springframework.web.servlet.mvc.method.annotation.ServletModelAttributeMethodProcessor;

import com.scnu.zwebapp.common.enums.ExceptionEnums;
import com.scnu.zwebapp.common.exception.BizException;

/**
 * 一个HandlerMethodArgumentResolver的装饰器，使其同时支持json和表单形式的参数解析
 * @author Autom
 * @date 2020年2月1日
 * @version 0.1
 */
@Component
public class CommonRequestBodyResolver implements HandlerMethodArgumentResolver, Ordered, ApplicationListener<ApplicationReadyEvent> {

	private RequestMappingHandlerAdapter requestMappingHandlerAdapter;
	
	private List<HandlerMethodArgumentResolver> localResolver = new ArrayList<>();
	
	private boolean seal;
	
	private static Logger logger = LoggerFactory.getLogger(CommonRequestBodyResolver.class);

	private RequestResponseBodyMethodProcessor requestResponseBodyMethodProcessor;
	
	private ServletModelAttributeMethodProcessor servletModelAttributeMethodProcessor;
	
	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		if(!seal) {
			this.requestMappingHandlerAdapter = (RequestMappingHandlerAdapter) event.getApplicationContext().getBean("requestMappingHandlerAdapter");
			if (Objects.isNull(this.requestMappingHandlerAdapter)) {
				throw new BizException(ExceptionEnums.getInstance("9999", "自定义通用参数解析器加载失败"));
			}
			for(HandlerMethodArgumentResolver resolver : requestMappingHandlerAdapter.getArgumentResolvers()) {
				if(resolver instanceof RequestResponseBodyMethodProcessor) {
					this.requestResponseBodyMethodProcessor = (RequestResponseBodyMethodProcessor) resolver;
				}
				
				if(resolver instanceof ServletModelAttributeMethodProcessor) {
					this.servletModelAttributeMethodProcessor = (ServletModelAttributeMethodProcessor) resolver;
				}
			}
			
			localResolver.addAll(requestMappingHandlerAdapter.getArgumentResolvers());
		}
	}

	@Override
	public int getOrder() {
		return HIGHEST_PRECEDENCE + 1;
	}

	@Override
	public boolean supportsParameter(MethodParameter parameter) {
		if(!parameter.hasParameterAnnotation(PathVariable.class)) {
			logger.debug("will use CommonRequestBodyResolver to resolver parameter for: {}", parameter.getExecutable());
			return true;
		}
		return false;
	}

	@Override
	public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer,
			NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
		Class<?> parameterType = parameter.getParameterType();
		HttpServletRequest httpServletRequest = webRequest.getNativeRequest(HttpServletRequest.class);
		String contentType = httpServletRequest.getContentType();
		if(StringUtils.isBlank(contentType)) {
			logger.debug("default contentType");
			return servletModelAttributeMethodProcessor.resolveArgument(parameter, mavContainer, webRequest, binderFactory);
		}
		
		if(contentType.startsWith("application/x-www-form-urlencoded")) {
			logger.debug("contentType is application/x-www-form-urlencoded");
			return servletModelAttributeMethodProcessor.resolveArgument(parameter, mavContainer, webRequest, binderFactory);
		}
		
		if(contentType.startsWith("application/json")) {
			return requestResponseBodyMethodProcessor.resolveArgument(parameter, mavContainer, webRequest, binderFactory);
		}
		
		return doContinueResolver(localResolver, parameter, mavContainer, webRequest, binderFactory);
		
	}

	private Object doContinueResolver(List<HandlerMethodArgumentResolver> localResolver, MethodParameter parameter,
			ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
		if(CollectionUtils.isEmpty(localResolver)) {
			logger.warn("localResolver is empty");
			return null;
		}
		localResolver.remove(this);
		
		for(HandlerMethodArgumentResolver resolver : localResolver) {
			if(resolver.supportsParameter(parameter)) {
				return resolver.resolveArgument(parameter, mavContainer, webRequest, binderFactory);
			}
		}
		
		throw new BizException(ExceptionEnums.getInstance("9999", "自定义参数解析异常，无法解析该参数：" + parameter.getParameter()));
	}

}
