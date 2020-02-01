package com.scnu.zwebapp.common.web;

import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.scnu.zwebapp.common.enums.NotFoundEnum;
import com.scnu.zwebapp.common.exception.BizException;
import com.scnu.zwebapp.common.exception.NotFoundException;
import com.scnu.zwebapp.common.util.JsonUtils;
import com.scnu.zwebapp.common.vo.IResult;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class GobalExceptionHandler {
	
	/**
	 * 参数校验异常
	 * @param e
	 * @param request
	 * @return
	 */
	@ExceptionHandler(BindException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ResponseBody
	public IResult bindException(BindException e, HttpServletRequest request) {
		BindingResult bindingResult = e.getBindingResult();
		List<String> errorList = bindingResult.getFieldErrors().stream().map((fieldError) -> {
			return fieldError.getDefaultMessage();
		}).collect(Collectors.toList());
		
		log.error(request.getRequestURL() + e.getMessage());
		log.error("请求参数={}", JsonUtils.serialize(request.getParameterMap()));
		return IResult.error(HttpStatus.BAD_REQUEST.toString(), errorList.get(0), e);
	}
	
	/**
	 * 请求接口不存在404异常返回
	 * @param e
	 * @param request
	 * @return
	 */
	@ExceptionHandler(NoHandlerFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ResponseBody
	public IResult InterfaceNotFound(NoHandlerFoundException e, HttpServletRequest request) {
		log.error("请求不存在异常: {}", e.getMessage());
		log.error("请求url: {}", request.getRequestURL());
		log.error("请求参数: {}", JsonUtils.serialize(request.getParameterMap()));
		return IResult.error(HttpStatus.NOT_FOUND.toString(), NotFoundEnum.INTERFACE_NOT_FOUND, e);
	}
	
	/**
	 * 业务异常之没有数据
	 * @param e
	 * @param request
	 * @return
	 */
	@ExceptionHandler(NotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ResponseBody
	public IResult notFoundException(NotFoundException e, HttpServletRequest request) {
		log.error("业务异常: {}", e.getMessage());
		log.error("请求url: {}", request.getRequestURL());
		log.error("请求参数: {}", JsonUtils.serialize(request.getParameterMap()));
		return IResult.error(e.getCode(), e.getMsg(), e);
	}
	
	/**
	 * 业务异常
	 * @param e
	 * @param request
	 * @return
	 */
	@ExceptionHandler(BizException.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseBody
	public IResult bizException(BizException e, HttpServletRequest request) {
		log.error("业务异常: {}", e.getMessage());
		log.error("请求url: {}", request.getRequestURL());
		log.error("请求参数: {}", JsonUtils.serialize(request.getParameterMap()));
		return IResult.error(e.getCode(), e.getMsg());
	}
	
	/**
	 * 内部异常
	 * @param e
	 * @param request
	 * @return
	 */
	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseBody
	public IResult bizException(Exception e, HttpServletRequest request) {
		log.error("内部异常: {}", e.getMessage());
		log.error("请求url: {}", request.getRequestURL());
		log.error("请求参数: {}", JsonUtils.serialize(request.getParameterMap()));
		log.error("异常具体信息: ", e);
		return IResult.error(HttpStatus.INTERNAL_SERVER_ERROR.toString(), "系统内部异常");
	}
	
}
