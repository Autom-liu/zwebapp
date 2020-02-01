package com.scnu.zwebapp.baseinfo.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.scnu.zwebapp.common.bean.BaseExample;

public class DespoitExample extends BaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DespoitExample() {
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

        public Criteria andDepIdIsNull() {
            addCriterion("`dep_id` is null");
            return (Criteria) this;
        }

        public Criteria andDepIdIsNotNull() {
            addCriterion("`dep_id` is not null");
            return (Criteria) this;
        }

        public Criteria andDepIdEqualTo(Integer value) {
            addCriterion("`dep_id` =", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdNotEqualTo(Integer value) {
            addCriterion("`dep_id` <>", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdGreaterThan(Integer value) {
            addCriterion("`dep_id` >", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("`dep_id` >=", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdLessThan(Integer value) {
            addCriterion("`dep_id` <", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdLessThanOrEqualTo(Integer value) {
            addCriterion("`dep_id` <=", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdIn(List<Integer> values) {
            addCriterion("`dep_id` in", values, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdNotIn(List<Integer> values) {
            addCriterion("`dep_id` not in", values, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdBetween(Integer value1, Integer value2) {
            addCriterion("`dep_id` between", value1, value2, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdNotBetween(Integer value1, Integer value2) {
            addCriterion("`dep_id` not between", value1, value2, "depId");
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

        public Criteria andCateIdIsNull() {
            addCriterion("`cate_id` is null");
            return (Criteria) this;
        }

        public Criteria andCateIdIsNotNull() {
            addCriterion("`cate_id` is not null");
            return (Criteria) this;
        }

        public Criteria andCateIdEqualTo(Integer value) {
            addCriterion("`cate_id` =", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdNotEqualTo(Integer value) {
            addCriterion("`cate_id` <>", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdGreaterThan(Integer value) {
            addCriterion("`cate_id` >", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("`cate_id` >=", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdLessThan(Integer value) {
            addCriterion("`cate_id` <", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdLessThanOrEqualTo(Integer value) {
            addCriterion("`cate_id` <=", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdIn(List<Integer> values) {
            addCriterion("`cate_id` in", values, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdNotIn(List<Integer> values) {
            addCriterion("`cate_id` not in", values, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdBetween(Integer value1, Integer value2) {
            addCriterion("`cate_id` between", value1, value2, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("`cate_id` not between", value1, value2, "cateId");
            return (Criteria) this;
        }

        public Criteria andDepAmountIsNull() {
            addCriterion("`dep_amount` is null");
            return (Criteria) this;
        }

        public Criteria andDepAmountIsNotNull() {
            addCriterion("`dep_amount` is not null");
            return (Criteria) this;
        }

        public Criteria andDepAmountEqualTo(Long value) {
            addCriterion("`dep_amount` =", value, "depAmount");
            return (Criteria) this;
        }

        public Criteria andDepAmountNotEqualTo(Long value) {
            addCriterion("`dep_amount` <>", value, "depAmount");
            return (Criteria) this;
        }

        public Criteria andDepAmountGreaterThan(Long value) {
            addCriterion("`dep_amount` >", value, "depAmount");
            return (Criteria) this;
        }

        public Criteria andDepAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("`dep_amount` >=", value, "depAmount");
            return (Criteria) this;
        }

        public Criteria andDepAmountLessThan(Long value) {
            addCriterion("`dep_amount` <", value, "depAmount");
            return (Criteria) this;
        }

        public Criteria andDepAmountLessThanOrEqualTo(Long value) {
            addCriterion("`dep_amount` <=", value, "depAmount");
            return (Criteria) this;
        }

        public Criteria andDepAmountIn(List<Long> values) {
            addCriterion("`dep_amount` in", values, "depAmount");
            return (Criteria) this;
        }

        public Criteria andDepAmountNotIn(List<Long> values) {
            addCriterion("`dep_amount` not in", values, "depAmount");
            return (Criteria) this;
        }

        public Criteria andDepAmountBetween(Long value1, Long value2) {
            addCriterion("`dep_amount` between", value1, value2, "depAmount");
            return (Criteria) this;
        }

        public Criteria andDepAmountNotBetween(Long value1, Long value2) {
            addCriterion("`dep_amount` not between", value1, value2, "depAmount");
            return (Criteria) this;
        }

        public Criteria andDepNotifyIsNull() {
            addCriterion("`dep_notify` is null");
            return (Criteria) this;
        }

        public Criteria andDepNotifyIsNotNull() {
            addCriterion("`dep_notify` is not null");
            return (Criteria) this;
        }

        public Criteria andDepNotifyEqualTo(Long value) {
            addCriterion("`dep_notify` =", value, "depNotify");
            return (Criteria) this;
        }

        public Criteria andDepNotifyNotEqualTo(Long value) {
            addCriterion("`dep_notify` <>", value, "depNotify");
            return (Criteria) this;
        }

        public Criteria andDepNotifyGreaterThan(Long value) {
            addCriterion("`dep_notify` >", value, "depNotify");
            return (Criteria) this;
        }

        public Criteria andDepNotifyGreaterThanOrEqualTo(Long value) {
            addCriterion("`dep_notify` >=", value, "depNotify");
            return (Criteria) this;
        }

        public Criteria andDepNotifyLessThan(Long value) {
            addCriterion("`dep_notify` <", value, "depNotify");
            return (Criteria) this;
        }

        public Criteria andDepNotifyLessThanOrEqualTo(Long value) {
            addCriterion("`dep_notify` <=", value, "depNotify");
            return (Criteria) this;
        }

        public Criteria andDepNotifyIn(List<Long> values) {
            addCriterion("`dep_notify` in", values, "depNotify");
            return (Criteria) this;
        }

        public Criteria andDepNotifyNotIn(List<Long> values) {
            addCriterion("`dep_notify` not in", values, "depNotify");
            return (Criteria) this;
        }

        public Criteria andDepNotifyBetween(Long value1, Long value2) {
            addCriterion("`dep_notify` between", value1, value2, "depNotify");
            return (Criteria) this;
        }

        public Criteria andDepNotifyNotBetween(Long value1, Long value2) {
            addCriterion("`dep_notify` not between", value1, value2, "depNotify");
            return (Criteria) this;
        }

        public Criteria andDepCurrentIsNull() {
            addCriterion("`dep_current` is null");
            return (Criteria) this;
        }

        public Criteria andDepCurrentIsNotNull() {
            addCriterion("`dep_current` is not null");
            return (Criteria) this;
        }

        public Criteria andDepCurrentEqualTo(Long value) {
            addCriterion("`dep_current` =", value, "depCurrent");
            return (Criteria) this;
        }

        public Criteria andDepCurrentNotEqualTo(Long value) {
            addCriterion("`dep_current` <>", value, "depCurrent");
            return (Criteria) this;
        }

        public Criteria andDepCurrentGreaterThan(Long value) {
            addCriterion("`dep_current` >", value, "depCurrent");
            return (Criteria) this;
        }

        public Criteria andDepCurrentGreaterThanOrEqualTo(Long value) {
            addCriterion("`dep_current` >=", value, "depCurrent");
            return (Criteria) this;
        }

        public Criteria andDepCurrentLessThan(Long value) {
            addCriterion("`dep_current` <", value, "depCurrent");
            return (Criteria) this;
        }

        public Criteria andDepCurrentLessThanOrEqualTo(Long value) {
            addCriterion("`dep_current` <=", value, "depCurrent");
            return (Criteria) this;
        }

        public Criteria andDepCurrentIn(List<Long> values) {
            addCriterion("`dep_current` in", values, "depCurrent");
            return (Criteria) this;
        }

        public Criteria andDepCurrentNotIn(List<Long> values) {
            addCriterion("`dep_current` not in", values, "depCurrent");
            return (Criteria) this;
        }

        public Criteria andDepCurrentBetween(Long value1, Long value2) {
            addCriterion("`dep_current` between", value1, value2, "depCurrent");
            return (Criteria) this;
        }

        public Criteria andDepCurrentNotBetween(Long value1, Long value2) {
            addCriterion("`dep_current` not between", value1, value2, "depCurrent");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("`start_time` is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("`start_time` is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("`start_time` =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("`start_time` <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("`start_time` >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("`start_time` >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("`start_time` <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("`start_time` <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("`start_time` in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("`start_time` not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("`start_time` between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("`start_time` not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("`end_time` is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("`end_time` is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("`end_time` =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("`end_time` <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("`end_time` >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("`end_time` >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("`end_time` <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("`end_time` <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("`end_time` in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("`end_time` not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("`end_time` between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("`end_time` not between", value1, value2, "endTime");
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
