package com.scnu.zwebapp.baseinfo.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.scnu.zwebapp.common.bean.BaseExample;

public class AccountFlowExample extends BaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountFlowExample() {
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

        public Criteria andFlowIdIsNull() {
            addCriterion("`flow_id` is null");
            return (Criteria) this;
        }

        public Criteria andFlowIdIsNotNull() {
            addCriterion("`flow_id` is not null");
            return (Criteria) this;
        }

        public Criteria andFlowIdEqualTo(String value) {
            addCriterion("`flow_id` =", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotEqualTo(String value) {
            addCriterion("`flow_id` <>", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdGreaterThan(String value) {
            addCriterion("`flow_id` >", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdGreaterThanOrEqualTo(String value) {
            addCriterion("`flow_id` >=", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdLessThan(String value) {
            addCriterion("`flow_id` <", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdLessThanOrEqualTo(String value) {
            addCriterion("`flow_id` <=", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdLike(String value) {
            addCriterion("`flow_id` like", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotLike(String value) {
            addCriterion("`flow_id` not like", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdIn(List<String> values) {
            addCriterion("`flow_id` in", values, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotIn(List<String> values) {
            addCriterion("`flow_id` not in", values, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdBetween(String value1, String value2) {
            addCriterion("`flow_id` between", value1, value2, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotBetween(String value1, String value2) {
            addCriterion("`flow_id` not between", value1, value2, "flowId");
            return (Criteria) this;
        }

        public Criteria andRelatFlowIdIsNull() {
            addCriterion("`relat_flow_id` is null");
            return (Criteria) this;
        }

        public Criteria andRelatFlowIdIsNotNull() {
            addCriterion("`relat_flow_id` is not null");
            return (Criteria) this;
        }

        public Criteria andRelatFlowIdEqualTo(String value) {
            addCriterion("`relat_flow_id` =", value, "relatFlowId");
            return (Criteria) this;
        }

        public Criteria andRelatFlowIdNotEqualTo(String value) {
            addCriterion("`relat_flow_id` <>", value, "relatFlowId");
            return (Criteria) this;
        }

        public Criteria andRelatFlowIdGreaterThan(String value) {
            addCriterion("`relat_flow_id` >", value, "relatFlowId");
            return (Criteria) this;
        }

        public Criteria andRelatFlowIdGreaterThanOrEqualTo(String value) {
            addCriterion("`relat_flow_id` >=", value, "relatFlowId");
            return (Criteria) this;
        }

        public Criteria andRelatFlowIdLessThan(String value) {
            addCriterion("`relat_flow_id` <", value, "relatFlowId");
            return (Criteria) this;
        }

        public Criteria andRelatFlowIdLessThanOrEqualTo(String value) {
            addCriterion("`relat_flow_id` <=", value, "relatFlowId");
            return (Criteria) this;
        }

        public Criteria andRelatFlowIdLike(String value) {
            addCriterion("`relat_flow_id` like", value, "relatFlowId");
            return (Criteria) this;
        }

        public Criteria andRelatFlowIdNotLike(String value) {
            addCriterion("`relat_flow_id` not like", value, "relatFlowId");
            return (Criteria) this;
        }

        public Criteria andRelatFlowIdIn(List<String> values) {
            addCriterion("`relat_flow_id` in", values, "relatFlowId");
            return (Criteria) this;
        }

        public Criteria andRelatFlowIdNotIn(List<String> values) {
            addCriterion("`relat_flow_id` not in", values, "relatFlowId");
            return (Criteria) this;
        }

        public Criteria andRelatFlowIdBetween(String value1, String value2) {
            addCriterion("`relat_flow_id` between", value1, value2, "relatFlowId");
            return (Criteria) this;
        }

        public Criteria andRelatFlowIdNotBetween(String value1, String value2) {
            addCriterion("`relat_flow_id` not between", value1, value2, "relatFlowId");
            return (Criteria) this;
        }

        public Criteria andSrcAccIdIsNull() {
            addCriterion("`src_acc_id` is null");
            return (Criteria) this;
        }

        public Criteria andSrcAccIdIsNotNull() {
            addCriterion("`src_acc_id` is not null");
            return (Criteria) this;
        }

        public Criteria andSrcAccIdEqualTo(Integer value) {
            addCriterion("`src_acc_id` =", value, "srcAccId");
            return (Criteria) this;
        }

        public Criteria andSrcAccIdNotEqualTo(Integer value) {
            addCriterion("`src_acc_id` <>", value, "srcAccId");
            return (Criteria) this;
        }

        public Criteria andSrcAccIdGreaterThan(Integer value) {
            addCriterion("`src_acc_id` >", value, "srcAccId");
            return (Criteria) this;
        }

        public Criteria andSrcAccIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("`src_acc_id` >=", value, "srcAccId");
            return (Criteria) this;
        }

        public Criteria andSrcAccIdLessThan(Integer value) {
            addCriterion("`src_acc_id` <", value, "srcAccId");
            return (Criteria) this;
        }

        public Criteria andSrcAccIdLessThanOrEqualTo(Integer value) {
            addCriterion("`src_acc_id` <=", value, "srcAccId");
            return (Criteria) this;
        }

        public Criteria andSrcAccIdIn(List<Integer> values) {
            addCriterion("`src_acc_id` in", values, "srcAccId");
            return (Criteria) this;
        }

        public Criteria andSrcAccIdNotIn(List<Integer> values) {
            addCriterion("`src_acc_id` not in", values, "srcAccId");
            return (Criteria) this;
        }

        public Criteria andSrcAccIdBetween(Integer value1, Integer value2) {
            addCriterion("`src_acc_id` between", value1, value2, "srcAccId");
            return (Criteria) this;
        }

        public Criteria andSrcAccIdNotBetween(Integer value1, Integer value2) {
            addCriterion("`src_acc_id` not between", value1, value2, "srcAccId");
            return (Criteria) this;
        }

        public Criteria andDestAccIdIsNull() {
            addCriterion("`dest_acc_id` is null");
            return (Criteria) this;
        }

        public Criteria andDestAccIdIsNotNull() {
            addCriterion("`dest_acc_id` is not null");
            return (Criteria) this;
        }

        public Criteria andDestAccIdEqualTo(Integer value) {
            addCriterion("`dest_acc_id` =", value, "destAccId");
            return (Criteria) this;
        }

        public Criteria andDestAccIdNotEqualTo(Integer value) {
            addCriterion("`dest_acc_id` <>", value, "destAccId");
            return (Criteria) this;
        }

        public Criteria andDestAccIdGreaterThan(Integer value) {
            addCriterion("`dest_acc_id` >", value, "destAccId");
            return (Criteria) this;
        }

        public Criteria andDestAccIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("`dest_acc_id` >=", value, "destAccId");
            return (Criteria) this;
        }

        public Criteria andDestAccIdLessThan(Integer value) {
            addCriterion("`dest_acc_id` <", value, "destAccId");
            return (Criteria) this;
        }

        public Criteria andDestAccIdLessThanOrEqualTo(Integer value) {
            addCriterion("`dest_acc_id` <=", value, "destAccId");
            return (Criteria) this;
        }

        public Criteria andDestAccIdIn(List<Integer> values) {
            addCriterion("`dest_acc_id` in", values, "destAccId");
            return (Criteria) this;
        }

        public Criteria andDestAccIdNotIn(List<Integer> values) {
            addCriterion("`dest_acc_id` not in", values, "destAccId");
            return (Criteria) this;
        }

        public Criteria andDestAccIdBetween(Integer value1, Integer value2) {
            addCriterion("`dest_acc_id` between", value1, value2, "destAccId");
            return (Criteria) this;
        }

        public Criteria andDestAccIdNotBetween(Integer value1, Integer value2) {
            addCriterion("`dest_acc_id` not between", value1, value2, "destAccId");
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

        public Criteria andFlowFlagTypeIsNull() {
            addCriterion("`flow_flag_type` is null");
            return (Criteria) this;
        }

        public Criteria andFlowFlagTypeIsNotNull() {
            addCriterion("`flow_flag_type` is not null");
            return (Criteria) this;
        }

        public Criteria andFlowFlagTypeEqualTo(String value) {
            addCriterion("`flow_flag_type` =", value, "flowFlagType");
            return (Criteria) this;
        }

        public Criteria andFlowFlagTypeNotEqualTo(String value) {
            addCriterion("`flow_flag_type` <>", value, "flowFlagType");
            return (Criteria) this;
        }

        public Criteria andFlowFlagTypeGreaterThan(String value) {
            addCriterion("`flow_flag_type` >", value, "flowFlagType");
            return (Criteria) this;
        }

        public Criteria andFlowFlagTypeGreaterThanOrEqualTo(String value) {
            addCriterion("`flow_flag_type` >=", value, "flowFlagType");
            return (Criteria) this;
        }

        public Criteria andFlowFlagTypeLessThan(String value) {
            addCriterion("`flow_flag_type` <", value, "flowFlagType");
            return (Criteria) this;
        }

        public Criteria andFlowFlagTypeLessThanOrEqualTo(String value) {
            addCriterion("`flow_flag_type` <=", value, "flowFlagType");
            return (Criteria) this;
        }

        public Criteria andFlowFlagTypeLike(String value) {
            addCriterion("`flow_flag_type` like", value, "flowFlagType");
            return (Criteria) this;
        }

        public Criteria andFlowFlagTypeNotLike(String value) {
            addCriterion("`flow_flag_type` not like", value, "flowFlagType");
            return (Criteria) this;
        }

        public Criteria andFlowFlagTypeIn(List<String> values) {
            addCriterion("`flow_flag_type` in", values, "flowFlagType");
            return (Criteria) this;
        }

        public Criteria andFlowFlagTypeNotIn(List<String> values) {
            addCriterion("`flow_flag_type` not in", values, "flowFlagType");
            return (Criteria) this;
        }

        public Criteria andFlowFlagTypeBetween(String value1, String value2) {
            addCriterion("`flow_flag_type` between", value1, value2, "flowFlagType");
            return (Criteria) this;
        }

        public Criteria andFlowFlagTypeNotBetween(String value1, String value2) {
            addCriterion("`flow_flag_type` not between", value1, value2, "flowFlagType");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("`create_time` is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("`create_time` is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("`create_time` =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("`create_time` <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("`create_time` >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("`create_time` >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("`create_time` <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("`create_time` <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("`create_time` in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("`create_time` not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("`create_time` between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("`create_time` not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("`is_del` is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("`is_del` is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(Boolean value) {
            addCriterion("`is_del` =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(Boolean value) {
            addCriterion("`is_del` <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(Boolean value) {
            addCriterion("`is_del` >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("`is_del` >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(Boolean value) {
            addCriterion("`is_del` <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(Boolean value) {
            addCriterion("`is_del` <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<Boolean> values) {
            addCriterion("`is_del` in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<Boolean> values) {
            addCriterion("`is_del` not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(Boolean value1, Boolean value2) {
            addCriterion("`is_del` between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("`is_del` not between", value1, value2, "isDel");
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
