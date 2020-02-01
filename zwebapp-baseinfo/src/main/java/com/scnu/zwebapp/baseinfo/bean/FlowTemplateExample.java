package com.scnu.zwebapp.baseinfo.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.scnu.zwebapp.common.bean.BaseExample;

public class FlowTemplateExample extends BaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FlowTemplateExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTemplateIdIsNull() {
            addCriterion("`template_id` is null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIsNotNull() {
            addCriterion("`template_id` is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdEqualTo(Integer value) {
            addCriterion("`template_id` =", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotEqualTo(Integer value) {
            addCriterion("`template_id` <>", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThan(Integer value) {
            addCriterion("`template_id` >", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("`template_id` >=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThan(Integer value) {
            addCriterion("`template_id` <", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThanOrEqualTo(Integer value) {
            addCriterion("`template_id` <=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIn(List<Integer> values) {
            addCriterion("`template_id` in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotIn(List<Integer> values) {
            addCriterion("`template_id` not in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdBetween(Integer value1, Integer value2) {
            addCriterion("`template_id` between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("`template_id` not between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andAccIdIsNull() {
            addCriterion("`acc_id` is null");
            return (Criteria) this;
        }

        public Criteria andAccIdIsNotNull() {
            addCriterion("`acc_id` is not null");
            return (Criteria) this;
        }

        public Criteria andAccIdEqualTo(Integer value) {
            addCriterion("`acc_id` =", value, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdNotEqualTo(Integer value) {
            addCriterion("`acc_id` <>", value, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdGreaterThan(Integer value) {
            addCriterion("`acc_id` >", value, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("`acc_id` >=", value, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdLessThan(Integer value) {
            addCriterion("`acc_id` <", value, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdLessThanOrEqualTo(Integer value) {
            addCriterion("`acc_id` <=", value, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdIn(List<Integer> values) {
            addCriterion("`acc_id` in", values, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdNotIn(List<Integer> values) {
            addCriterion("`acc_id` not in", values, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdBetween(Integer value1, Integer value2) {
            addCriterion("`acc_id` between", value1, value2, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdNotBetween(Integer value1, Integer value2) {
            addCriterion("`acc_id` not between", value1, value2, "accId");
            return (Criteria) this;
        }

        public Criteria andCateId1IsNull() {
            addCriterion("`cate_id1` is null");
            return (Criteria) this;
        }

        public Criteria andCateId1IsNotNull() {
            addCriterion("`cate_id1` is not null");
            return (Criteria) this;
        }

        public Criteria andCateId1EqualTo(Integer value) {
            addCriterion("`cate_id1` =", value, "cateId1");
            return (Criteria) this;
        }

        public Criteria andCateId1NotEqualTo(Integer value) {
            addCriterion("`cate_id1` <>", value, "cateId1");
            return (Criteria) this;
        }

        public Criteria andCateId1GreaterThan(Integer value) {
            addCriterion("`cate_id1` >", value, "cateId1");
            return (Criteria) this;
        }

        public Criteria andCateId1GreaterThanOrEqualTo(Integer value) {
            addCriterion("`cate_id1` >=", value, "cateId1");
            return (Criteria) this;
        }

        public Criteria andCateId1LessThan(Integer value) {
            addCriterion("`cate_id1` <", value, "cateId1");
            return (Criteria) this;
        }

        public Criteria andCateId1LessThanOrEqualTo(Integer value) {
            addCriterion("`cate_id1` <=", value, "cateId1");
            return (Criteria) this;
        }

        public Criteria andCateId1In(List<Integer> values) {
            addCriterion("`cate_id1` in", values, "cateId1");
            return (Criteria) this;
        }

        public Criteria andCateId1NotIn(List<Integer> values) {
            addCriterion("`cate_id1` not in", values, "cateId1");
            return (Criteria) this;
        }

        public Criteria andCateId1Between(Integer value1, Integer value2) {
            addCriterion("`cate_id1` between", value1, value2, "cateId1");
            return (Criteria) this;
        }

        public Criteria andCateId1NotBetween(Integer value1, Integer value2) {
            addCriterion("`cate_id1` not between", value1, value2, "cateId1");
            return (Criteria) this;
        }

        public Criteria andCateId2IsNull() {
            addCriterion("`cate_id2` is null");
            return (Criteria) this;
        }

        public Criteria andCateId2IsNotNull() {
            addCriterion("`cate_id2` is not null");
            return (Criteria) this;
        }

        public Criteria andCateId2EqualTo(Integer value) {
            addCriterion("`cate_id2` =", value, "cateId2");
            return (Criteria) this;
        }

        public Criteria andCateId2NotEqualTo(Integer value) {
            addCriterion("`cate_id2` <>", value, "cateId2");
            return (Criteria) this;
        }

        public Criteria andCateId2GreaterThan(Integer value) {
            addCriterion("`cate_id2` >", value, "cateId2");
            return (Criteria) this;
        }

        public Criteria andCateId2GreaterThanOrEqualTo(Integer value) {
            addCriterion("`cate_id2` >=", value, "cateId2");
            return (Criteria) this;
        }

        public Criteria andCateId2LessThan(Integer value) {
            addCriterion("`cate_id2` <", value, "cateId2");
            return (Criteria) this;
        }

        public Criteria andCateId2LessThanOrEqualTo(Integer value) {
            addCriterion("`cate_id2` <=", value, "cateId2");
            return (Criteria) this;
        }

        public Criteria andCateId2In(List<Integer> values) {
            addCriterion("`cate_id2` in", values, "cateId2");
            return (Criteria) this;
        }

        public Criteria andCateId2NotIn(List<Integer> values) {
            addCriterion("`cate_id2` not in", values, "cateId2");
            return (Criteria) this;
        }

        public Criteria andCateId2Between(Integer value1, Integer value2) {
            addCriterion("`cate_id2` between", value1, value2, "cateId2");
            return (Criteria) this;
        }

        public Criteria andCateId2NotBetween(Integer value1, Integer value2) {
            addCriterion("`cate_id2` not between", value1, value2, "cateId2");
            return (Criteria) this;
        }

        public Criteria andOtrId1IsNull() {
            addCriterion("`otr_id1` is null");
            return (Criteria) this;
        }

        public Criteria andOtrId1IsNotNull() {
            addCriterion("`otr_id1` is not null");
            return (Criteria) this;
        }

        public Criteria andOtrId1EqualTo(Integer value) {
            addCriterion("`otr_id1` =", value, "otrId1");
            return (Criteria) this;
        }

        public Criteria andOtrId1NotEqualTo(Integer value) {
            addCriterion("`otr_id1` <>", value, "otrId1");
            return (Criteria) this;
        }

        public Criteria andOtrId1GreaterThan(Integer value) {
            addCriterion("`otr_id1` >", value, "otrId1");
            return (Criteria) this;
        }

        public Criteria andOtrId1GreaterThanOrEqualTo(Integer value) {
            addCriterion("`otr_id1` >=", value, "otrId1");
            return (Criteria) this;
        }

        public Criteria andOtrId1LessThan(Integer value) {
            addCriterion("`otr_id1` <", value, "otrId1");
            return (Criteria) this;
        }

        public Criteria andOtrId1LessThanOrEqualTo(Integer value) {
            addCriterion("`otr_id1` <=", value, "otrId1");
            return (Criteria) this;
        }

        public Criteria andOtrId1In(List<Integer> values) {
            addCriterion("`otr_id1` in", values, "otrId1");
            return (Criteria) this;
        }

        public Criteria andOtrId1NotIn(List<Integer> values) {
            addCriterion("`otr_id1` not in", values, "otrId1");
            return (Criteria) this;
        }

        public Criteria andOtrId1Between(Integer value1, Integer value2) {
            addCriterion("`otr_id1` between", value1, value2, "otrId1");
            return (Criteria) this;
        }

        public Criteria andOtrId1NotBetween(Integer value1, Integer value2) {
            addCriterion("`otr_id1` not between", value1, value2, "otrId1");
            return (Criteria) this;
        }

        public Criteria andOtrId2IsNull() {
            addCriterion("`otr_id2` is null");
            return (Criteria) this;
        }

        public Criteria andOtrId2IsNotNull() {
            addCriterion("`otr_id2` is not null");
            return (Criteria) this;
        }

        public Criteria andOtrId2EqualTo(Integer value) {
            addCriterion("`otr_id2` =", value, "otrId2");
            return (Criteria) this;
        }

        public Criteria andOtrId2NotEqualTo(Integer value) {
            addCriterion("`otr_id2` <>", value, "otrId2");
            return (Criteria) this;
        }

        public Criteria andOtrId2GreaterThan(Integer value) {
            addCriterion("`otr_id2` >", value, "otrId2");
            return (Criteria) this;
        }

        public Criteria andOtrId2GreaterThanOrEqualTo(Integer value) {
            addCriterion("`otr_id2` >=", value, "otrId2");
            return (Criteria) this;
        }

        public Criteria andOtrId2LessThan(Integer value) {
            addCriterion("`otr_id2` <", value, "otrId2");
            return (Criteria) this;
        }

        public Criteria andOtrId2LessThanOrEqualTo(Integer value) {
            addCriterion("`otr_id2` <=", value, "otrId2");
            return (Criteria) this;
        }

        public Criteria andOtrId2In(List<Integer> values) {
            addCriterion("`otr_id2` in", values, "otrId2");
            return (Criteria) this;
        }

        public Criteria andOtrId2NotIn(List<Integer> values) {
            addCriterion("`otr_id2` not in", values, "otrId2");
            return (Criteria) this;
        }

        public Criteria andOtrId2Between(Integer value1, Integer value2) {
            addCriterion("`otr_id2` between", value1, value2, "otrId2");
            return (Criteria) this;
        }

        public Criteria andOtrId2NotBetween(Integer value1, Integer value2) {
            addCriterion("`otr_id2` not between", value1, value2, "otrId2");
            return (Criteria) this;
        }

        public Criteria andOtrId3IsNull() {
            addCriterion("`otr_id3` is null");
            return (Criteria) this;
        }

        public Criteria andOtrId3IsNotNull() {
            addCriterion("`otr_id3` is not null");
            return (Criteria) this;
        }

        public Criteria andOtrId3EqualTo(Integer value) {
            addCriterion("`otr_id3` =", value, "otrId3");
            return (Criteria) this;
        }

        public Criteria andOtrId3NotEqualTo(Integer value) {
            addCriterion("`otr_id3` <>", value, "otrId3");
            return (Criteria) this;
        }

        public Criteria andOtrId3GreaterThan(Integer value) {
            addCriterion("`otr_id3` >", value, "otrId3");
            return (Criteria) this;
        }

        public Criteria andOtrId3GreaterThanOrEqualTo(Integer value) {
            addCriterion("`otr_id3` >=", value, "otrId3");
            return (Criteria) this;
        }

        public Criteria andOtrId3LessThan(Integer value) {
            addCriterion("`otr_id3` <", value, "otrId3");
            return (Criteria) this;
        }

        public Criteria andOtrId3LessThanOrEqualTo(Integer value) {
            addCriterion("`otr_id3` <=", value, "otrId3");
            return (Criteria) this;
        }

        public Criteria andOtrId3In(List<Integer> values) {
            addCriterion("`otr_id3` in", values, "otrId3");
            return (Criteria) this;
        }

        public Criteria andOtrId3NotIn(List<Integer> values) {
            addCriterion("`otr_id3` not in", values, "otrId3");
            return (Criteria) this;
        }

        public Criteria andOtrId3Between(Integer value1, Integer value2) {
            addCriterion("`otr_id3` between", value1, value2, "otrId3");
            return (Criteria) this;
        }

        public Criteria andOtrId3NotBetween(Integer value1, Integer value2) {
            addCriterion("`otr_id3` not between", value1, value2, "otrId3");
            return (Criteria) this;
        }

        public Criteria andFlowRemarkIsNull() {
            addCriterion("`flow_remark` is null");
            return (Criteria) this;
        }

        public Criteria andFlowRemarkIsNotNull() {
            addCriterion("`flow_remark` is not null");
            return (Criteria) this;
        }

        public Criteria andFlowRemarkEqualTo(String value) {
            addCriterion("`flow_remark` =", value, "flowRemark");
            return (Criteria) this;
        }

        public Criteria andFlowRemarkNotEqualTo(String value) {
            addCriterion("`flow_remark` <>", value, "flowRemark");
            return (Criteria) this;
        }

        public Criteria andFlowRemarkGreaterThan(String value) {
            addCriterion("`flow_remark` >", value, "flowRemark");
            return (Criteria) this;
        }

        public Criteria andFlowRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("`flow_remark` >=", value, "flowRemark");
            return (Criteria) this;
        }

        public Criteria andFlowRemarkLessThan(String value) {
            addCriterion("`flow_remark` <", value, "flowRemark");
            return (Criteria) this;
        }

        public Criteria andFlowRemarkLessThanOrEqualTo(String value) {
            addCriterion("`flow_remark` <=", value, "flowRemark");
            return (Criteria) this;
        }

        public Criteria andFlowRemarkLike(String value) {
            addCriterion("`flow_remark` like", value, "flowRemark");
            return (Criteria) this;
        }

        public Criteria andFlowRemarkNotLike(String value) {
            addCriterion("`flow_remark` not like", value, "flowRemark");
            return (Criteria) this;
        }

        public Criteria andFlowRemarkIn(List<String> values) {
            addCriterion("`flow_remark` in", values, "flowRemark");
            return (Criteria) this;
        }

        public Criteria andFlowRemarkNotIn(List<String> values) {
            addCriterion("`flow_remark` not in", values, "flowRemark");
            return (Criteria) this;
        }

        public Criteria andFlowRemarkBetween(String value1, String value2) {
            addCriterion("`flow_remark` between", value1, value2, "flowRemark");
            return (Criteria) this;
        }

        public Criteria andFlowRemarkNotBetween(String value1, String value2) {
            addCriterion("`flow_remark` not between", value1, value2, "flowRemark");
            return (Criteria) this;
        }

        public Criteria andFlowAmountIsNull() {
            addCriterion("`flow_amount` is null");
            return (Criteria) this;
        }

        public Criteria andFlowAmountIsNotNull() {
            addCriterion("`flow_amount` is not null");
            return (Criteria) this;
        }

        public Criteria andFlowAmountEqualTo(Long value) {
            addCriterion("`flow_amount` =", value, "flowAmount");
            return (Criteria) this;
        }

        public Criteria andFlowAmountNotEqualTo(Long value) {
            addCriterion("`flow_amount` <>", value, "flowAmount");
            return (Criteria) this;
        }

        public Criteria andFlowAmountGreaterThan(Long value) {
            addCriterion("`flow_amount` >", value, "flowAmount");
            return (Criteria) this;
        }

        public Criteria andFlowAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("`flow_amount` >=", value, "flowAmount");
            return (Criteria) this;
        }

        public Criteria andFlowAmountLessThan(Long value) {
            addCriterion("`flow_amount` <", value, "flowAmount");
            return (Criteria) this;
        }

        public Criteria andFlowAmountLessThanOrEqualTo(Long value) {
            addCriterion("`flow_amount` <=", value, "flowAmount");
            return (Criteria) this;
        }

        public Criteria andFlowAmountIn(List<Long> values) {
            addCriterion("`flow_amount` in", values, "flowAmount");
            return (Criteria) this;
        }

        public Criteria andFlowAmountNotIn(List<Long> values) {
            addCriterion("`flow_amount` not in", values, "flowAmount");
            return (Criteria) this;
        }

        public Criteria andFlowAmountBetween(Long value1, Long value2) {
            addCriterion("`flow_amount` between", value1, value2, "flowAmount");
            return (Criteria) this;
        }

        public Criteria andFlowAmountNotBetween(Long value1, Long value2) {
            addCriterion("`flow_amount` not between", value1, value2, "flowAmount");
            return (Criteria) this;
        }

        public Criteria andFlowRecordTypeIsNull() {
            addCriterion("`flow_record_type` is null");
            return (Criteria) this;
        }

        public Criteria andFlowRecordTypeIsNotNull() {
            addCriterion("`flow_record_type` is not null");
            return (Criteria) this;
        }

        public Criteria andFlowRecordTypeEqualTo(String value) {
            addCriterion("`flow_record_type` =", value, "flowRecordType");
            return (Criteria) this;
        }

        public Criteria andFlowRecordTypeNotEqualTo(String value) {
            addCriterion("`flow_record_type` <>", value, "flowRecordType");
            return (Criteria) this;
        }

        public Criteria andFlowRecordTypeGreaterThan(String value) {
            addCriterion("`flow_record_type` >", value, "flowRecordType");
            return (Criteria) this;
        }

        public Criteria andFlowRecordTypeGreaterThanOrEqualTo(String value) {
            addCriterion("`flow_record_type` >=", value, "flowRecordType");
            return (Criteria) this;
        }

        public Criteria andFlowRecordTypeLessThan(String value) {
            addCriterion("`flow_record_type` <", value, "flowRecordType");
            return (Criteria) this;
        }

        public Criteria andFlowRecordTypeLessThanOrEqualTo(String value) {
            addCriterion("`flow_record_type` <=", value, "flowRecordType");
            return (Criteria) this;
        }

        public Criteria andFlowRecordTypeLike(String value) {
            addCriterion("`flow_record_type` like", value, "flowRecordType");
            return (Criteria) this;
        }

        public Criteria andFlowRecordTypeNotLike(String value) {
            addCriterion("`flow_record_type` not like", value, "flowRecordType");
            return (Criteria) this;
        }

        public Criteria andFlowRecordTypeIn(List<String> values) {
            addCriterion("`flow_record_type` in", values, "flowRecordType");
            return (Criteria) this;
        }

        public Criteria andFlowRecordTypeNotIn(List<String> values) {
            addCriterion("`flow_record_type` not in", values, "flowRecordType");
            return (Criteria) this;
        }

        public Criteria andFlowRecordTypeBetween(String value1, String value2) {
            addCriterion("`flow_record_type` between", value1, value2, "flowRecordType");
            return (Criteria) this;
        }

        public Criteria andFlowRecordTypeNotBetween(String value1, String value2) {
            addCriterion("`flow_record_type` not between", value1, value2, "flowRecordType");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeIsNull() {
            addCriterion("`notify_time` is null");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeIsNotNull() {
            addCriterion("`notify_time` is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeEqualTo(Date value) {
            addCriterion("`notify_time` =", value, "notifyTime");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeNotEqualTo(Date value) {
            addCriterion("`notify_time` <>", value, "notifyTime");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeGreaterThan(Date value) {
            addCriterion("`notify_time` >", value, "notifyTime");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("`notify_time` >=", value, "notifyTime");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeLessThan(Date value) {
            addCriterion("`notify_time` <", value, "notifyTime");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("`notify_time` <=", value, "notifyTime");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeIn(List<Date> values) {
            addCriterion("`notify_time` in", values, "notifyTime");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeNotIn(List<Date> values) {
            addCriterion("`notify_time` not in", values, "notifyTime");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeBetween(Date value1, Date value2) {
            addCriterion("`notify_time` between", value1, value2, "notifyTime");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("`notify_time` not between", value1, value2, "notifyTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
