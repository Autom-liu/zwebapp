package com.scnu.zwebapp.flow.bean;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "zw_other")
public class Other implements Serializable {
    /**
     * 主键s
     */
    @Id
    @Column(name = "`otr_id`")
    private Integer otrId;

    /**
     * 名称
     */
    @Column(name = "`otr_name`")
    private String otrName;

    /**
     * 最近使用的排序字段
     */
    @Column(name = "`otr_use_time`")
    private Integer otrUseTime;

    /**
     * 类型
     */
    @Column(name = "`otr_type`")
    private String otrType;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键s
     *
     * @return otr_id - 主键s
     */
    public Integer getOtrId() {
        return otrId;
    }

    /**
     * 设置主键s
     *
     * @param otrId 主键s
     */
    public void setOtrId(Integer otrId) {
        this.otrId = otrId;
    }

    /**
     * 获取名称
     *
     * @return otr_name - 名称
     */
    public String getOtrName() {
        return otrName;
    }

    /**
     * 设置名称
     *
     * @param otrName 名称
     */
    public void setOtrName(String otrName) {
        this.otrName = otrName == null ? null : otrName.trim();
    }

    /**
     * 获取最近使用的排序字段
     *
     * @return otr_use_time - 最近使用的排序字段
     */
    public Integer getOtrUseTime() {
        return otrUseTime;
    }

    /**
     * 设置最近使用的排序字段
     *
     * @param otrUseTime 最近使用的排序字段
     */
    public void setOtrUseTime(Integer otrUseTime) {
        this.otrUseTime = otrUseTime;
    }

    /**
     * 获取类型
     *
     * @return otr_type - 类型
     */
    public String getOtrType() {
        return otrType;
    }

    /**
     * 设置类型
     *
     * @param otrType 类型
     */
    public void setOtrType(String otrType) {
        this.otrType = otrType == null ? null : otrType.trim();
    }
}