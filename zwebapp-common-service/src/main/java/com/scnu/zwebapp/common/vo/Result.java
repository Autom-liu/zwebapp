package com.scnu.zwebapp.common.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
public class Result<T> implements Serializable, IResult {
	
	private static final long serialVersionUID = 514825312253081722L;

	private String code;
	
	private String msg;
	
	private T data;
	@JsonIgnore
	private Throwable t;
	
	public static<T> Result<T> success(T data) {
		Result<T> result = new Result<>();
		result.setCode("0000");
		result.setMsg("success");
		result.setData(data);
		return result;
	}
	
}
