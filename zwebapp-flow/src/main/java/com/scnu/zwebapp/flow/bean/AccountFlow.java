package com.scnu.zwebapp.flow.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

import lombok.Data;

@Table(name = "zw_account_flow")
@Data
public class AccountFlow implements Serializable {
    /**
     * 流水号
     */
    @Id
    @Column(name = "`flow_id`")
    private String flowId;

    /**
     * 关联流水号
     */
    @Column(name = "`relat_flow_id`")
    private String relatFlowId;

    /**
     * 原账户
     */
    @Column(name = "`src_acc_id`")
    private Integer srcAccId;

    /**
     * 目标账户
     */
    @Column(name = "`dest_acc_id`")
    private Integer destAccId;

    @Column(name = "`cate_id2`")
    private Integer cateId2;

    @Column(name = "`cate_id1`")
    private Integer cateId1;

    @Column(name = "`otr_id1`")
    private Integer otrId1;

    @Column(name = "`otr_id2`")
    private Integer otrId2;

    @Column(name = "`otr_id3`")
    private Integer otrId3;

    /**
     * 备注
     */
    @Column(name = "`flow_remark`")
    private String flowRemark;

    /**
     * 金额
     */
    @Column(name = "`flow_amount`")
    private BigDecimal flowAmount;

    /**
     * 记录类型
     */
    @Column(name = "`flow_record_type`")
    private String flowRecordType;

    /**
     * 流向类型
     */
    @Column(name = "`flow_flag_type`")
    private String flowFlagType;

    /**
     * 创建时间
     */
    @Column(name = "`create_time`")
    private Date createTime;

    @Column(name = "`is_del`")
    private Boolean isDel;

    private static final long serialVersionUID = 1L;

}