package com.scnu.zwebapp.facade.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class CategoryDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer cateId;

    private Integer parentId;

    private String cateName;

    private Integer cateLevel;

    private String cateType;

    private Boolean isDel;
}
