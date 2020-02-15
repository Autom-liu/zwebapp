package com.scnu.zwebapp.facade.vo;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
public class AccountFlowVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String flowId;

    private String relatFlowId;

    private Integer srcAccId;

    private Integer destAccId;

    private Integer cateId2;

    private Integer cateId1;

    private Integer otrId1;

    private Integer otrId2;

    private Integer otrId3;

    private String flowRemark;

    private Long flowAmount;

    private String flowRecordType;

    private String flowFlagType;

    private Date createTime;

    private Boolean isDel;
}
