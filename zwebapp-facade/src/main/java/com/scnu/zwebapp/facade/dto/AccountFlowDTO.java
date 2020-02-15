package com.scnu.zwebapp.facade.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.scnu.zwebapp.common.enums.FlowRecordTypeEnum;

import lombok.Data;

@Data
public class AccountFlowDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String flowId;
    
    private String relatFlowId;

    @NotNull(message = "账户不能为空")
    private Integer srcAccId;

    private Integer destAccId;

    private Integer cateId2;

    private Integer cateId1;

    private Integer otrId1;

    private Integer otrId2;

    private Integer otrId3;

    private String flowRemark;

    @NotNull(message = "流水金额不能为空")
    private BigDecimal flowAmount;

    @NotNull(message = "流水记录类型不能为空")
    private FlowRecordTypeEnum flowRecordType;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    
    private String flowFlagType;
}
