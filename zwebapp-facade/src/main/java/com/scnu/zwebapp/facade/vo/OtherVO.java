package com.scnu.zwebapp.facade.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
public class OtherVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer otrId;

    private String otrName;

    private Integer otrUseTime;

    private String otrType;
}
