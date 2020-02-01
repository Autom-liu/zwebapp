package com.scnu.zwebapp.baseinfo.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
public class CategoryVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer cateId;

    private Integer parentId;

    private String cateName;

    private Integer cateLevel;

    private String cateType;

}
