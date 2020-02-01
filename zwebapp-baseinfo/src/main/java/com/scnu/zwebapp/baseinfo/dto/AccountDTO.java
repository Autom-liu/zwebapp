package com.scnu.zwebapp.baseinfo.dto;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class AccountDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer accId;

    @NotEmpty(message = "账户系统类型不能为空")
    private String accSysType;

    @NotEmpty(message = "账户用户类型不能为空")
    private String accUserType;

    @NotEmpty(message = "账户名称不能为空")
    private String accName;

    private String accIcon;

    private String accRemark;

    private List<SubAccountDTO> subAccount;
}
