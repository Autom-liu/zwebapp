package com.scnu.zwebapp.baseinfo.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "zw_flow_template")
public class FlowTemplate implements Serializable {
    @Id
    @Column(name = "`template_id`")
    private Integer templateId;

    @Column(name = "`acc_id`")
    private Integer accId;

    @Column(name = "`cate_id1`")
    private Integer cateId1;

    @Column(name = "`cate_id2`")
    private Integer cateId2;

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
     * 提醒时间
     */
    @Column(name = "`notify_time`")
    private Date notifyTime;

    private static final long serialVersionUID = 1L;

    /**
     * @return template_id
     */
    public Integer getTemplateId() {
        return templateId;
    }

    /**
     * @param templateId
     */
    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    /**
     * @return acc_id
     */
    public Integer getAccId() {
        return accId;
    }

    /**
     * @param accId
     */
    public void setAccId(Integer accId) {
        this.accId = accId;
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
     * 获取提醒时间
     *
     * @return notify_time - 提醒时间
     */
    public Date getNotifyTime() {
        return notifyTime;
    }

    /**
     * 设置提醒时间
     *
     * @param notifyTime 提醒时间
     */
    public void setNotifyTime(Date notifyTime) {
        this.notifyTime = notifyTime;
    }
}