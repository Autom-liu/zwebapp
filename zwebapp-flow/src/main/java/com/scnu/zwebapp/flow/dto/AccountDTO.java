package com.scnu.zwebapp.flow.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;

@Data
public class AccountDTO implements Serializable {
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
