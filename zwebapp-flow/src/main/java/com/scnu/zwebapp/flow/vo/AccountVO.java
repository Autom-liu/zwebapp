package com.scnu.zwebapp.flow.vo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
public class AccountVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer accId;

    private String accSysType;

    private String accUserType;

    private String accName;

    private String accIcon;

    private String accRemark;

    private BigDecimal accAmount;

    private Boolean accHasChild;

    private Boolean accCanPay;

    private Boolean accCanTransfer;

    private Integer accParentId;

    private Boolean isDel;
}
