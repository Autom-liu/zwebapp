package com.scnu.zwebapp.baseinfo.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "zw_despoit")
public class Despoit implements Serializable {
    @Id
    @Column(name = "`dep_id`")
    private Integer depId;

    @Column(name = "`acc_id`")
    private Integer accId;

    @Column(name = "`cate_id`")
    private Integer cateId;

    /**
     * 预制金额
     */
    @Column(name = "`dep_amount`")
    private Long depAmount;

    /**
     * 告警金额
     */
    @Column(name = "`dep_notify`")
    private Long depNotify;

    /**
     * 当前已用金额
     */
    @Column(name = "`dep_current`")
    private Long depCurrent;

    /**
     * 生效日期
     */
    @Column(name = "`start_time`")
    private Date startTime;

    /**
     * 结束日期
     */
    @Column(name = "`end_time`")
    private Date endTime;

    private static final long serialVersionUID = 1L;

    /**
     * @return dep_id
     */
    public Integer getDepId() {
        return depId;
    }

    /**
     * @param depId
     */
    public void setDepId(Integer depId) {
        this.depId = depId;
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
     * @return cate_id
     */
    public Integer getCateId() {
        return cateId;
    }

    /**
     * @param cateId
     */
    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    /**
     * 获取预制金额
     *
     * @return dep_amount - 预制金额
     */
    public Long getDepAmount() {
        return depAmount;
    }

    /**
     * 设置预制金额
     *
     * @param depAmount 预制金额
     */
    public void setDepAmount(Long depAmount) {
        this.depAmount = depAmount;
    }

    /**
     * 获取告警金额
     *
     * @return dep_notify - 告警金额
     */
    public Long getDepNotify() {
        return depNotify;
    }

    /**
     * 设置告警金额
     *
     * @param depNotify 告警金额
     */
    public void setDepNotify(Long depNotify) {
        this.depNotify = depNotify;
    }

    /**
     * 获取当前已用金额
     *
     * @return dep_current - 当前已用金额
     */
    public Long getDepCurrent() {
        return depCurrent;
    }

    /**
     * 设置当前已用金额
     *
     * @param depCurrent 当前已用金额
     */
    public void setDepCurrent(Long depCurrent) {
        this.depCurrent = depCurrent;
    }

    /**
     * 获取生效日期
     *
     * @return start_time - 生效日期
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置生效日期
     *
     * @param startTime 生效日期
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取结束日期
     *
     * @return end_time - 结束日期
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置结束日期
     *
     * @param endTime 结束日期
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}