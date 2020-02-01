package com.scnu.zwebapp.baseinfo.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "zw_account_flow")
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
    private Long flowAmount;

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

    /**
     * 获取流水号
     *
     * @return flow_id - 流水号
     */
    public String getFlowId() {
        return flowId;
    }

    /**
     * 设置流水号
     *
     * @param flowId 流水号
     */
    public void setFlowId(String flowId) {
        this.flowId = flowId == null ? null : flowId.trim();
    }

    /**
     * 获取关联流水号
     *
     * @return relat_flow_id - 关联流水号
     */
    public String getRelatFlowId() {
        return relatFlowId;
    }

    /**
     * 设置关联流水号
     *
     * @param relatFlowId 关联流水号
     */
    public void setRelatFlowId(String relatFlowId) {
        this.relatFlowId = relatFlowId == null ? null : relatFlowId.trim();
    }

    /**
     * 获取原账户
     *
     * @return src_acc_id - 原账户
     */
    public Integer getSrcAccId() {
        return srcAccId;
    }

    /**
     * 设置原账户
     *
     * @param srcAccId 原账户
     */
    public void setSrcAccId(Integer srcAccId) {
        this.srcAccId = srcAccId;
    }

    /**
     * 获取目标账户
     *
     * @return dest_acc_id - 目标账户
     */
    public Integer getDestAccId() {
        return destAccId;
    }

    /**
     * 设置目标账户
     *
     * @param destAccId 目标账户
     */
    public void setDestAccId(Integer destAccId) {
        this.destAccId = destAccId;
    }

    /**
     * @return cate_id2
     */
    public Integer getCateId2() {
        return cateId2;
    }

    /**
     * @param cateId2
     */
    public void setCateId2(Integer cateId2) {
        this.cateId2 = cateId2;
    }

    /**
     * @return cate_id1
     */
    public Integer getCateId1() {
        return cateId1;
    }

    /**
     * @param cateId1
     */
    public void setCateId1(Integer cateId1) {
        this.cateId1 = cateId1;
    }

    /**
     * @return otr_id1
     */
    public Integer getOtrId1() {
        return otrId1;
    }

    /**
     * @param otrId1
     */
    public void setOtrId1(Integer otrId1) {
        this.otrId1 = otrId1;
    }

    /**
     * @return otr_id2
     */
    public Integer getOtrId2() {
        return otrId2;
    }

    /**
     * @param otrId2
     */
    public void setOtrId2(Integer otrId2) {
        this.otrId2 = otrId2;
    }

    /**
     * @return otr_id3
     */
    public Integer getOtrId3() {
        return otrId3;
    }

    /**
     * @param otrId3
     */
    public void setOtrId3(Integer otrId3) {
        this.otrId3 = otrId3;
    }

    /**
     * 获取备注
     *
     * @return flow_remark - 备注
     */
    public String getFlowRemark() {
        return flowRemark;
    }

    /**
     * 设置备注
     *
     * @param flowRemark 备注
     */
    public void setFlowRemark(String flowRemark) {
        this.flowRemark = flowRemark == null ? null : flowRemark.trim();
    }

    /**
     * 获取金额
     *
     * @return flow_amount - 金额
     */
    public Long getFlowAmount() {
        return flowAmount;
    }

    /**
     * 设置金额
     *
     * @param flowAmount 金额
     */
    public void setFlowAmount(Long flowAmount) {
        this.flowAmount = flowAmount;
    }

    /**
     * 获取记录类型
     *
     * @return flow_record_type - 记录类型
     */
    public String getFlowRecordType() {
        return flowRecordType;
    }

    /**
     * 设置记录类型
     *
     * @param flowRecordType 记录类型
     */
    public void setFlowRecordType(String flowRecordType) {
        this.flowRecordType = flowRecordType == null ? null : flowRecordType.trim();
    }

    /**
     * 获取流向类型
     *
     * @return flow_flag_type - 流向类型
     */
    public String getFlowFlagType() {
        return flowFlagType;
    }

    /**
     * 设置流向类型
     *
     * @param flowFlagType 流向类型
     */
    public void setFlowFlagType(String flowFlagType) {
        this.flowFlagType = flowFlagType == null ? null : flowFlagType.trim();
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return is_del
     */
    public Boolean getIsDel() {
        return isDel;
    }

    /**
     * @param isDel
     */
    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }
}