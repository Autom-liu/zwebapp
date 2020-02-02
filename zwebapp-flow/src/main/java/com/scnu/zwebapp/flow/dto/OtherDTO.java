package com.scnu.zwebapp.flow.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class OtherDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer otrId;

    private String otrName;

    private Integer otrUseTime;

    private String otrType;
}
