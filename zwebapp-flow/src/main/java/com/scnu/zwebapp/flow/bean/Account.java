package com.scnu.zwebapp.flow.bean;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.*;

import lombok.Data;

@Table(name = "zw_account")
@Data
public class Account implements Serializable {
    @Id
    @Column(name = "`acc_id`")
    private Integer accId;

    /**
     * 系统类型
     */
    @Column(name = "`acc_sys_type`")
    private String accSysType;

    /**
     * 用户类型
     */
    @Column(name = "`acc_user_type`")
    private String accUserType;

    /**
     * 账户名称
     */
    @Column(name = "`acc_name`")
    private String accName;

    /**
     * 账户图标
     */
    @Column(name = "`acc_icon`")
    private String accIcon;

    /**
     * 账户备注
     */
    @Column(name = "`acc_remark`")
    private String accRemark;

    /**
     * 账户金额
     */
    @Column(name = "`acc_amount`")
    private BigDecimal accAmount;

    /**
     * 是否有子账户
     */
    @Column(name = "`acc_has_child`")
    private Boolean accHasChild;

    /**
     * 是否可支付
     */
    @Column(name = "`acc_can_pay`")
    private Boolean accCanPay;

    /**
     * 是否可转账
     */
    @Column(name = "`acc_can_transfer`")
    private Boolean accCanTransfer;

    /**
     * 父账户名称
     */
    @Column(name = "`acc_parent_id`")
    private Integer accParentId;

    @Column(name = "`is_del`")
    private Boolean isDel;

    private static final long serialVersionUID = 1L;

}