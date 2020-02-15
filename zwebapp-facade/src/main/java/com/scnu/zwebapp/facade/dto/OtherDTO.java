package com.scnu.zwebapp.facade.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class OtherDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer otrId;

    @NotEmpty(message = "名字不能为空")
    private String otrName;

    @NotEmpty(message = "类型不能为空")
    private String otrType;
}
