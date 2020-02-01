package com.scnu.zwebapp.baseinfo.bean;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "zw_category")
public class Category implements Serializable {
    /**
     * 主键id
     */
    @Id
    @Column(name = "`cate_id`")
    private Integer cateId;

    @Column(name = "`parent_id`")
    private Integer parentId;

    /**
     * 分类名称
     */
    @Column(name = "`cate_name`")
    private String cateName;

    /**
     * 分类级别
     */
    @Column(name = "`cate_level`")
    private Integer cateLevel;

    /**
     * 收入和支出
     */
    @Column(name = "`cate_type`")
    private String cateType;

    @Column(name = "`is_del`")
    private Boolean isDel;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键id
     *
     * @return cate_id - 主键id
     */
    public Integer getCateId() {
        return cateId;
    }

    /**
     * 设置主键id
     *
     * @param cateId 主键id
     */
    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    /**
     * @return parent_id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取分类名称
     *
     * @return cate_name - 分类名称
     */
    public String getCateName() {
        return cateName;
    }

    /**
     * 设置分类名称
     *
     * @param cateName 分类名称
     */
    public void setCateName(String cateName) {
        this.cateName = cateName == null ? null : cateName.trim();
    }

    /**
     * 获取分类级别
     *
     * @return cate_level - 分类级别
     */
    public Integer getCateLevel() {
        return cateLevel;
    }

    /**
     * 设置分类级别
     *
     * @param cateLevel 分类级别
     */
    public void setCateLevel(Integer cateLevel) {
        this.cateLevel = cateLevel;
    }

    /**
     * 获取收入和支出
     *
     * @return cate_type - 收入和支出
     */
    public String getCateType() {
        return cateType;
    }

    /**
     * 设置收入和支出
     *
     * @param cateType 收入和支出
     */
    public void setCateType(String cateType) {
        this.cateType = cateType == null ? null : cateType.trim();
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