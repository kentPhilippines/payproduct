package com.payProject.manage.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RunOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RunOrderExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("createTime <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andOrderRunIdIsNull() {
            addCriterion("orderRunId is null");
            return (Criteria) this;
        }

        public Criteria andOrderRunIdIsNotNull() {
            addCriterion("orderRunId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderRunIdEqualTo(String value) {
            addCriterion("orderRunId =", value, "orderRunId");
            return (Criteria) this;
        }

        public Criteria andOrderRunIdNotEqualTo(String value) {
            addCriterion("orderRunId <>", value, "orderRunId");
            return (Criteria) this;
        }

        public Criteria andOrderRunIdGreaterThan(String value) {
            addCriterion("orderRunId >", value, "orderRunId");
            return (Criteria) this;
        }

        public Criteria andOrderRunIdGreaterThanOrEqualTo(String value) {
            addCriterion("orderRunId >=", value, "orderRunId");
            return (Criteria) this;
        }

        public Criteria andOrderRunIdLessThan(String value) {
            addCriterion("orderRunId <", value, "orderRunId");
            return (Criteria) this;
        }

        public Criteria andOrderRunIdLessThanOrEqualTo(String value) {
            addCriterion("orderRunId <=", value, "orderRunId");
            return (Criteria) this;
        }

        public Criteria andOrderRunIdLike(String value) {
            addCriterion("orderRunId like", value, "orderRunId");
            return (Criteria) this;
        }

        public Criteria andOrderRunIdNotLike(String value) {
            addCriterion("orderRunId not like", value, "orderRunId");
            return (Criteria) this;
        }

        public Criteria andOrderRunIdIn(List<String> values) {
            addCriterion("orderRunId in", values, "orderRunId");
            return (Criteria) this;
        }

        public Criteria andOrderRunIdNotIn(List<String> values) {
            addCriterion("orderRunId not in", values, "orderRunId");
            return (Criteria) this;
        }

        public Criteria andOrderRunIdBetween(String value1, String value2) {
            addCriterion("orderRunId between", value1, value2, "orderRunId");
            return (Criteria) this;
        }

        public Criteria andOrderRunIdNotBetween(String value1, String value2) {
            addCriterion("orderRunId not between", value1, value2, "orderRunId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("orderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("orderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("orderId =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("orderId <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("orderId >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("orderId >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("orderId <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("orderId <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("orderId like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("orderId not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("orderId in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("orderId not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("orderId between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("orderId not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andRunStatusIsNull() {
            addCriterion("runStatus is null");
            return (Criteria) this;
        }

        public Criteria andRunStatusIsNotNull() {
            addCriterion("runStatus is not null");
            return (Criteria) this;
        }

        public Criteria andRunStatusEqualTo(Integer value) {
            addCriterion("runStatus =", value, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusNotEqualTo(Integer value) {
            addCriterion("runStatus <>", value, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusGreaterThan(Integer value) {
            addCriterion("runStatus >", value, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("runStatus >=", value, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusLessThan(Integer value) {
            addCriterion("runStatus <", value, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusLessThanOrEqualTo(Integer value) {
            addCriterion("runStatus <=", value, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusIn(List<Integer> values) {
            addCriterion("runStatus in", values, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusNotIn(List<Integer> values) {
            addCriterion("runStatus not in", values, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusBetween(Integer value1, Integer value2) {
            addCriterion("runStatus between", value1, value2, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("runStatus not between", value1, value2, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunTypeIsNull() {
            addCriterion("runType is null");
            return (Criteria) this;
        }

        public Criteria andRunTypeIsNotNull() {
            addCriterion("runType is not null");
            return (Criteria) this;
        }

        public Criteria andRunTypeEqualTo(Integer value) {
            addCriterion("runType =", value, "runType");
            return (Criteria) this;
        }

        public Criteria andRunTypeNotEqualTo(Integer value) {
            addCriterion("runType <>", value, "runType");
            return (Criteria) this;
        }

        public Criteria andRunTypeGreaterThan(Integer value) {
            addCriterion("runType >", value, "runType");
            return (Criteria) this;
        }

        public Criteria andRunTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("runType >=", value, "runType");
            return (Criteria) this;
        }

        public Criteria andRunTypeLessThan(Integer value) {
            addCriterion("runType <", value, "runType");
            return (Criteria) this;
        }

        public Criteria andRunTypeLessThanOrEqualTo(Integer value) {
            addCriterion("runType <=", value, "runType");
            return (Criteria) this;
        }

        public Criteria andRunTypeIn(List<Integer> values) {
            addCriterion("runType in", values, "runType");
            return (Criteria) this;
        }

        public Criteria andRunTypeNotIn(List<Integer> values) {
            addCriterion("runType not in", values, "runType");
            return (Criteria) this;
        }

        public Criteria andRunTypeBetween(Integer value1, Integer value2) {
            addCriterion("runType between", value1, value2, "runType");
            return (Criteria) this;
        }

        public Criteria andRunTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("runType not between", value1, value2, "runType");
            return (Criteria) this;
        }

        public Criteria andOrderAccountIsNull() {
            addCriterion("orderAccount is null");
            return (Criteria) this;
        }

        public Criteria andOrderAccountIsNotNull() {
            addCriterion("orderAccount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAccountEqualTo(String value) {
            addCriterion("orderAccount =", value, "orderAccount");
            return (Criteria) this;
        }

        public Criteria andOrderAccountNotEqualTo(String value) {
            addCriterion("orderAccount <>", value, "orderAccount");
            return (Criteria) this;
        }

        public Criteria andOrderAccountGreaterThan(String value) {
            addCriterion("orderAccount >", value, "orderAccount");
            return (Criteria) this;
        }

        public Criteria andOrderAccountGreaterThanOrEqualTo(String value) {
            addCriterion("orderAccount >=", value, "orderAccount");
            return (Criteria) this;
        }

        public Criteria andOrderAccountLessThan(String value) {
            addCriterion("orderAccount <", value, "orderAccount");
            return (Criteria) this;
        }

        public Criteria andOrderAccountLessThanOrEqualTo(String value) {
            addCriterion("orderAccount <=", value, "orderAccount");
            return (Criteria) this;
        }

        public Criteria andOrderAccountLike(String value) {
            addCriterion("orderAccount like", value, "orderAccount");
            return (Criteria) this;
        }

        public Criteria andOrderAccountNotLike(String value) {
            addCriterion("orderAccount not like", value, "orderAccount");
            return (Criteria) this;
        }

        public Criteria andOrderAccountIn(List<String> values) {
            addCriterion("orderAccount in", values, "orderAccount");
            return (Criteria) this;
        }

        public Criteria andOrderAccountNotIn(List<String> values) {
            addCriterion("orderAccount not in", values, "orderAccount");
            return (Criteria) this;
        }

        public Criteria andOrderAccountBetween(String value1, String value2) {
            addCriterion("orderAccount between", value1, value2, "orderAccount");
            return (Criteria) this;
        }

        public Criteria andOrderAccountNotBetween(String value1, String value2) {
            addCriterion("orderAccount not between", value1, value2, "orderAccount");
            return (Criteria) this;
        }

        public Criteria andRunOrderAmountIsNull() {
            addCriterion("runOrderAmount is null");
            return (Criteria) this;
        }

        public Criteria andRunOrderAmountIsNotNull() {
            addCriterion("runOrderAmount is not null");
            return (Criteria) this;
        }

        public Criteria andRunOrderAmountEqualTo(String value) {
            addCriterion("runOrderAmount =", value, "runOrderAmount");
            return (Criteria) this;
        }

        public Criteria andRunOrderAmountNotEqualTo(String value) {
            addCriterion("runOrderAmount <>", value, "runOrderAmount");
            return (Criteria) this;
        }

        public Criteria andRunOrderAmountGreaterThan(String value) {
            addCriterion("runOrderAmount >", value, "runOrderAmount");
            return (Criteria) this;
        }

        public Criteria andRunOrderAmountGreaterThanOrEqualTo(String value) {
            addCriterion("runOrderAmount >=", value, "runOrderAmount");
            return (Criteria) this;
        }

        public Criteria andRunOrderAmountLessThan(String value) {
            addCriterion("runOrderAmount <", value, "runOrderAmount");
            return (Criteria) this;
        }

        public Criteria andRunOrderAmountLessThanOrEqualTo(String value) {
            addCriterion("runOrderAmount <=", value, "runOrderAmount");
            return (Criteria) this;
        }

        public Criteria andRunOrderAmountLike(String value) {
            addCriterion("runOrderAmount like", value, "runOrderAmount");
            return (Criteria) this;
        }

        public Criteria andRunOrderAmountNotLike(String value) {
            addCriterion("runOrderAmount not like", value, "runOrderAmount");
            return (Criteria) this;
        }

        public Criteria andRunOrderAmountIn(List<String> values) {
            addCriterion("runOrderAmount in", values, "runOrderAmount");
            return (Criteria) this;
        }

        public Criteria andRunOrderAmountNotIn(List<String> values) {
            addCriterion("runOrderAmount not in", values, "runOrderAmount");
            return (Criteria) this;
        }

        public Criteria andRunOrderAmountBetween(String value1, String value2) {
            addCriterion("runOrderAmount between", value1, value2, "runOrderAmount");
            return (Criteria) this;
        }

        public Criteria andRunOrderAmountNotBetween(String value1, String value2) {
            addCriterion("runOrderAmount not between", value1, value2, "runOrderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderGenerationIpIsNull() {
            addCriterion("orderGenerationIp is null");
            return (Criteria) this;
        }

        public Criteria andOrderGenerationIpIsNotNull() {
            addCriterion("orderGenerationIp is not null");
            return (Criteria) this;
        }

        public Criteria andOrderGenerationIpEqualTo(String value) {
            addCriterion("orderGenerationIp =", value, "orderGenerationIp");
            return (Criteria) this;
        }

        public Criteria andOrderGenerationIpNotEqualTo(String value) {
            addCriterion("orderGenerationIp <>", value, "orderGenerationIp");
            return (Criteria) this;
        }

        public Criteria andOrderGenerationIpGreaterThan(String value) {
            addCriterion("orderGenerationIp >", value, "orderGenerationIp");
            return (Criteria) this;
        }

        public Criteria andOrderGenerationIpGreaterThanOrEqualTo(String value) {
            addCriterion("orderGenerationIp >=", value, "orderGenerationIp");
            return (Criteria) this;
        }

        public Criteria andOrderGenerationIpLessThan(String value) {
            addCriterion("orderGenerationIp <", value, "orderGenerationIp");
            return (Criteria) this;
        }

        public Criteria andOrderGenerationIpLessThanOrEqualTo(String value) {
            addCriterion("orderGenerationIp <=", value, "orderGenerationIp");
            return (Criteria) this;
        }

        public Criteria andOrderGenerationIpLike(String value) {
            addCriterion("orderGenerationIp like", value, "orderGenerationIp");
            return (Criteria) this;
        }

        public Criteria andOrderGenerationIpNotLike(String value) {
            addCriterion("orderGenerationIp not like", value, "orderGenerationIp");
            return (Criteria) this;
        }

        public Criteria andOrderGenerationIpIn(List<String> values) {
            addCriterion("orderGenerationIp in", values, "orderGenerationIp");
            return (Criteria) this;
        }

        public Criteria andOrderGenerationIpNotIn(List<String> values) {
            addCriterion("orderGenerationIp not in", values, "orderGenerationIp");
            return (Criteria) this;
        }

        public Criteria andOrderGenerationIpBetween(String value1, String value2) {
            addCriterion("orderGenerationIp between", value1, value2, "orderGenerationIp");
            return (Criteria) this;
        }

        public Criteria andOrderGenerationIpNotBetween(String value1, String value2) {
            addCriterion("orderGenerationIp not between", value1, value2, "orderGenerationIp");
            return (Criteria) this;
        }

        public Criteria andCardRunDIsNull() {
            addCriterion("cardRunD is null");
            return (Criteria) this;
        }

        public Criteria andCardRunDIsNotNull() {
            addCriterion("cardRunD is not null");
            return (Criteria) this;
        }

        public Criteria andCardRunDEqualTo(String value) {
            addCriterion("cardRunD =", value, "cardRunD");
            return (Criteria) this;
        }

        public Criteria andCardRunDNotEqualTo(String value) {
            addCriterion("cardRunD <>", value, "cardRunD");
            return (Criteria) this;
        }

        public Criteria andCardRunDGreaterThan(String value) {
            addCriterion("cardRunD >", value, "cardRunD");
            return (Criteria) this;
        }

        public Criteria andCardRunDGreaterThanOrEqualTo(String value) {
            addCriterion("cardRunD >=", value, "cardRunD");
            return (Criteria) this;
        }

        public Criteria andCardRunDLessThan(String value) {
            addCriterion("cardRunD <", value, "cardRunD");
            return (Criteria) this;
        }

        public Criteria andCardRunDLessThanOrEqualTo(String value) {
            addCriterion("cardRunD <=", value, "cardRunD");
            return (Criteria) this;
        }

        public Criteria andCardRunDLike(String value) {
            addCriterion("cardRunD like", value, "cardRunD");
            return (Criteria) this;
        }

        public Criteria andCardRunDNotLike(String value) {
            addCriterion("cardRunD not like", value, "cardRunD");
            return (Criteria) this;
        }

        public Criteria andCardRunDIn(List<String> values) {
            addCriterion("cardRunD in", values, "cardRunD");
            return (Criteria) this;
        }

        public Criteria andCardRunDNotIn(List<String> values) {
            addCriterion("cardRunD not in", values, "cardRunD");
            return (Criteria) this;
        }

        public Criteria andCardRunDBetween(String value1, String value2) {
            addCriterion("cardRunD between", value1, value2, "cardRunD");
            return (Criteria) this;
        }

        public Criteria andCardRunDNotBetween(String value1, String value2) {
            addCriterion("cardRunD not between", value1, value2, "cardRunD");
            return (Criteria) this;
        }

        public Criteria andCardNameRunDIsNull() {
            addCriterion("cardNameRunD is null");
            return (Criteria) this;
        }

        public Criteria andCardNameRunDIsNotNull() {
            addCriterion("cardNameRunD is not null");
            return (Criteria) this;
        }

        public Criteria andCardNameRunDEqualTo(String value) {
            addCriterion("cardNameRunD =", value, "cardNameRunD");
            return (Criteria) this;
        }

        public Criteria andCardNameRunDNotEqualTo(String value) {
            addCriterion("cardNameRunD <>", value, "cardNameRunD");
            return (Criteria) this;
        }

        public Criteria andCardNameRunDGreaterThan(String value) {
            addCriterion("cardNameRunD >", value, "cardNameRunD");
            return (Criteria) this;
        }

        public Criteria andCardNameRunDGreaterThanOrEqualTo(String value) {
            addCriterion("cardNameRunD >=", value, "cardNameRunD");
            return (Criteria) this;
        }

        public Criteria andCardNameRunDLessThan(String value) {
            addCriterion("cardNameRunD <", value, "cardNameRunD");
            return (Criteria) this;
        }

        public Criteria andCardNameRunDLessThanOrEqualTo(String value) {
            addCriterion("cardNameRunD <=", value, "cardNameRunD");
            return (Criteria) this;
        }

        public Criteria andCardNameRunDLike(String value) {
            addCriterion("cardNameRunD like", value, "cardNameRunD");
            return (Criteria) this;
        }

        public Criteria andCardNameRunDNotLike(String value) {
            addCriterion("cardNameRunD not like", value, "cardNameRunD");
            return (Criteria) this;
        }

        public Criteria andCardNameRunDIn(List<String> values) {
            addCriterion("cardNameRunD in", values, "cardNameRunD");
            return (Criteria) this;
        }

        public Criteria andCardNameRunDNotIn(List<String> values) {
            addCriterion("cardNameRunD not in", values, "cardNameRunD");
            return (Criteria) this;
        }

        public Criteria andCardNameRunDBetween(String value1, String value2) {
            addCriterion("cardNameRunD between", value1, value2, "cardNameRunD");
            return (Criteria) this;
        }

        public Criteria andCardNameRunDNotBetween(String value1, String value2) {
            addCriterion("cardNameRunD not between", value1, value2, "cardNameRunD");
            return (Criteria) this;
        }

        public Criteria andCardRunWIsNull() {
            addCriterion("cardRunW is null");
            return (Criteria) this;
        }

        public Criteria andCardRunWIsNotNull() {
            addCriterion("cardRunW is not null");
            return (Criteria) this;
        }

        public Criteria andCardRunWEqualTo(String value) {
            addCriterion("cardRunW =", value, "cardRunW");
            return (Criteria) this;
        }

        public Criteria andCardRunWNotEqualTo(String value) {
            addCriterion("cardRunW <>", value, "cardRunW");
            return (Criteria) this;
        }

        public Criteria andCardRunWGreaterThan(String value) {
            addCriterion("cardRunW >", value, "cardRunW");
            return (Criteria) this;
        }

        public Criteria andCardRunWGreaterThanOrEqualTo(String value) {
            addCriterion("cardRunW >=", value, "cardRunW");
            return (Criteria) this;
        }

        public Criteria andCardRunWLessThan(String value) {
            addCriterion("cardRunW <", value, "cardRunW");
            return (Criteria) this;
        }

        public Criteria andCardRunWLessThanOrEqualTo(String value) {
            addCriterion("cardRunW <=", value, "cardRunW");
            return (Criteria) this;
        }

        public Criteria andCardRunWLike(String value) {
            addCriterion("cardRunW like", value, "cardRunW");
            return (Criteria) this;
        }

        public Criteria andCardRunWNotLike(String value) {
            addCriterion("cardRunW not like", value, "cardRunW");
            return (Criteria) this;
        }

        public Criteria andCardRunWIn(List<String> values) {
            addCriterion("cardRunW in", values, "cardRunW");
            return (Criteria) this;
        }

        public Criteria andCardRunWNotIn(List<String> values) {
            addCriterion("cardRunW not in", values, "cardRunW");
            return (Criteria) this;
        }

        public Criteria andCardRunWBetween(String value1, String value2) {
            addCriterion("cardRunW between", value1, value2, "cardRunW");
            return (Criteria) this;
        }

        public Criteria andCardRunWNotBetween(String value1, String value2) {
            addCriterion("cardRunW not between", value1, value2, "cardRunW");
            return (Criteria) this;
        }

        public Criteria andCardNameRunWIsNull() {
            addCriterion("cardNameRunW is null");
            return (Criteria) this;
        }

        public Criteria andCardNameRunWIsNotNull() {
            addCriterion("cardNameRunW is not null");
            return (Criteria) this;
        }

        public Criteria andCardNameRunWEqualTo(String value) {
            addCriterion("cardNameRunW =", value, "cardNameRunW");
            return (Criteria) this;
        }

        public Criteria andCardNameRunWNotEqualTo(String value) {
            addCriterion("cardNameRunW <>", value, "cardNameRunW");
            return (Criteria) this;
        }

        public Criteria andCardNameRunWGreaterThan(String value) {
            addCriterion("cardNameRunW >", value, "cardNameRunW");
            return (Criteria) this;
        }

        public Criteria andCardNameRunWGreaterThanOrEqualTo(String value) {
            addCriterion("cardNameRunW >=", value, "cardNameRunW");
            return (Criteria) this;
        }

        public Criteria andCardNameRunWLessThan(String value) {
            addCriterion("cardNameRunW <", value, "cardNameRunW");
            return (Criteria) this;
        }

        public Criteria andCardNameRunWLessThanOrEqualTo(String value) {
            addCriterion("cardNameRunW <=", value, "cardNameRunW");
            return (Criteria) this;
        }

        public Criteria andCardNameRunWLike(String value) {
            addCriterion("cardNameRunW like", value, "cardNameRunW");
            return (Criteria) this;
        }

        public Criteria andCardNameRunWNotLike(String value) {
            addCriterion("cardNameRunW not like", value, "cardNameRunW");
            return (Criteria) this;
        }

        public Criteria andCardNameRunWIn(List<String> values) {
            addCriterion("cardNameRunW in", values, "cardNameRunW");
            return (Criteria) this;
        }

        public Criteria andCardNameRunWNotIn(List<String> values) {
            addCriterion("cardNameRunW not in", values, "cardNameRunW");
            return (Criteria) this;
        }

        public Criteria andCardNameRunWBetween(String value1, String value2) {
            addCriterion("cardNameRunW between", value1, value2, "cardNameRunW");
            return (Criteria) this;
        }

        public Criteria andCardNameRunWNotBetween(String value1, String value2) {
            addCriterion("cardNameRunW not between", value1, value2, "cardNameRunW");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIsNull() {
            addCriterion("submitTime is null");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIsNotNull() {
            addCriterion("submitTime is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeEqualTo(Date value) {
            addCriterion("submitTime =", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotEqualTo(Date value) {
            addCriterion("submitTime <>", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeGreaterThan(Date value) {
            addCriterion("submitTime >", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("submitTime >=", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeLessThan(Date value) {
            addCriterion("submitTime <", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeLessThanOrEqualTo(Date value) {
            addCriterion("submitTime <=", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIn(List<Date> values) {
            addCriterion("submitTime in", values, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotIn(List<Date> values) {
            addCriterion("submitTime not in", values, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeBetween(Date value1, Date value2) {
            addCriterion("submitTime between", value1, value2, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotBetween(Date value1, Date value2) {
            addCriterion("submitTime not between", value1, value2, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitSystemIsNull() {
            addCriterion("submitSystem is null");
            return (Criteria) this;
        }

        public Criteria andSubmitSystemIsNotNull() {
            addCriterion("submitSystem is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitSystemEqualTo(String value) {
            addCriterion("submitSystem =", value, "submitSystem");
            return (Criteria) this;
        }

        public Criteria andSubmitSystemNotEqualTo(String value) {
            addCriterion("submitSystem <>", value, "submitSystem");
            return (Criteria) this;
        }

        public Criteria andSubmitSystemGreaterThan(String value) {
            addCriterion("submitSystem >", value, "submitSystem");
            return (Criteria) this;
        }

        public Criteria andSubmitSystemGreaterThanOrEqualTo(String value) {
            addCriterion("submitSystem >=", value, "submitSystem");
            return (Criteria) this;
        }

        public Criteria andSubmitSystemLessThan(String value) {
            addCriterion("submitSystem <", value, "submitSystem");
            return (Criteria) this;
        }

        public Criteria andSubmitSystemLessThanOrEqualTo(String value) {
            addCriterion("submitSystem <=", value, "submitSystem");
            return (Criteria) this;
        }

        public Criteria andSubmitSystemLike(String value) {
            addCriterion("submitSystem like", value, "submitSystem");
            return (Criteria) this;
        }

        public Criteria andSubmitSystemNotLike(String value) {
            addCriterion("submitSystem not like", value, "submitSystem");
            return (Criteria) this;
        }

        public Criteria andSubmitSystemIn(List<String> values) {
            addCriterion("submitSystem in", values, "submitSystem");
            return (Criteria) this;
        }

        public Criteria andSubmitSystemNotIn(List<String> values) {
            addCriterion("submitSystem not in", values, "submitSystem");
            return (Criteria) this;
        }

        public Criteria andSubmitSystemBetween(String value1, String value2) {
            addCriterion("submitSystem between", value1, value2, "submitSystem");
            return (Criteria) this;
        }

        public Criteria andSubmitSystemNotBetween(String value1, String value2) {
            addCriterion("submitSystem not between", value1, value2, "submitSystem");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRetain1IsNull() {
            addCriterion("retain1 is null");
            return (Criteria) this;
        }

        public Criteria andRetain1IsNotNull() {
            addCriterion("retain1 is not null");
            return (Criteria) this;
        }

        public Criteria andRetain1EqualTo(String value) {
            addCriterion("retain1 =", value, "retain1");
            return (Criteria) this;
        }

        public Criteria andRetain1NotEqualTo(String value) {
            addCriterion("retain1 <>", value, "retain1");
            return (Criteria) this;
        }

        public Criteria andRetain1GreaterThan(String value) {
            addCriterion("retain1 >", value, "retain1");
            return (Criteria) this;
        }

        public Criteria andRetain1GreaterThanOrEqualTo(String value) {
            addCriterion("retain1 >=", value, "retain1");
            return (Criteria) this;
        }

        public Criteria andRetain1LessThan(String value) {
            addCriterion("retain1 <", value, "retain1");
            return (Criteria) this;
        }

        public Criteria andRetain1LessThanOrEqualTo(String value) {
            addCriterion("retain1 <=", value, "retain1");
            return (Criteria) this;
        }

        public Criteria andRetain1Like(String value) {
            addCriterion("retain1 like", value, "retain1");
            return (Criteria) this;
        }

        public Criteria andRetain1NotLike(String value) {
            addCriterion("retain1 not like", value, "retain1");
            return (Criteria) this;
        }

        public Criteria andRetain1In(List<String> values) {
            addCriterion("retain1 in", values, "retain1");
            return (Criteria) this;
        }

        public Criteria andRetain1NotIn(List<String> values) {
            addCriterion("retain1 not in", values, "retain1");
            return (Criteria) this;
        }

        public Criteria andRetain1Between(String value1, String value2) {
            addCriterion("retain1 between", value1, value2, "retain1");
            return (Criteria) this;
        }

        public Criteria andRetain1NotBetween(String value1, String value2) {
            addCriterion("retain1 not between", value1, value2, "retain1");
            return (Criteria) this;
        }

        public Criteria andRetain2IsNull() {
            addCriterion("retain2 is null");
            return (Criteria) this;
        }

        public Criteria andRetain2IsNotNull() {
            addCriterion("retain2 is not null");
            return (Criteria) this;
        }

        public Criteria andRetain2EqualTo(String value) {
            addCriterion("retain2 =", value, "retain2");
            return (Criteria) this;
        }

        public Criteria andRetain2NotEqualTo(String value) {
            addCriterion("retain2 <>", value, "retain2");
            return (Criteria) this;
        }

        public Criteria andRetain2GreaterThan(String value) {
            addCriterion("retain2 >", value, "retain2");
            return (Criteria) this;
        }

        public Criteria andRetain2GreaterThanOrEqualTo(String value) {
            addCriterion("retain2 >=", value, "retain2");
            return (Criteria) this;
        }

        public Criteria andRetain2LessThan(String value) {
            addCriterion("retain2 <", value, "retain2");
            return (Criteria) this;
        }

        public Criteria andRetain2LessThanOrEqualTo(String value) {
            addCriterion("retain2 <=", value, "retain2");
            return (Criteria) this;
        }

        public Criteria andRetain2Like(String value) {
            addCriterion("retain2 like", value, "retain2");
            return (Criteria) this;
        }

        public Criteria andRetain2NotLike(String value) {
            addCriterion("retain2 not like", value, "retain2");
            return (Criteria) this;
        }

        public Criteria andRetain2In(List<String> values) {
            addCriterion("retain2 in", values, "retain2");
            return (Criteria) this;
        }

        public Criteria andRetain2NotIn(List<String> values) {
            addCriterion("retain2 not in", values, "retain2");
            return (Criteria) this;
        }

        public Criteria andRetain2Between(String value1, String value2) {
            addCriterion("retain2 between", value1, value2, "retain2");
            return (Criteria) this;
        }

        public Criteria andRetain2NotBetween(String value1, String value2) {
            addCriterion("retain2 not between", value1, value2, "retain2");
            return (Criteria) this;
        }

        public Criteria andRetain3IsNull() {
            addCriterion("retain3 is null");
            return (Criteria) this;
        }

        public Criteria andRetain3IsNotNull() {
            addCriterion("retain3 is not null");
            return (Criteria) this;
        }

        public Criteria andRetain3EqualTo(String value) {
            addCriterion("retain3 =", value, "retain3");
            return (Criteria) this;
        }

        public Criteria andRetain3NotEqualTo(String value) {
            addCriterion("retain3 <>", value, "retain3");
            return (Criteria) this;
        }

        public Criteria andRetain3GreaterThan(String value) {
            addCriterion("retain3 >", value, "retain3");
            return (Criteria) this;
        }

        public Criteria andRetain3GreaterThanOrEqualTo(String value) {
            addCriterion("retain3 >=", value, "retain3");
            return (Criteria) this;
        }

        public Criteria andRetain3LessThan(String value) {
            addCriterion("retain3 <", value, "retain3");
            return (Criteria) this;
        }

        public Criteria andRetain3LessThanOrEqualTo(String value) {
            addCriterion("retain3 <=", value, "retain3");
            return (Criteria) this;
        }

        public Criteria andRetain3Like(String value) {
            addCriterion("retain3 like", value, "retain3");
            return (Criteria) this;
        }

        public Criteria andRetain3NotLike(String value) {
            addCriterion("retain3 not like", value, "retain3");
            return (Criteria) this;
        }

        public Criteria andRetain3In(List<String> values) {
            addCriterion("retain3 in", values, "retain3");
            return (Criteria) this;
        }

        public Criteria andRetain3NotIn(List<String> values) {
            addCriterion("retain3 not in", values, "retain3");
            return (Criteria) this;
        }

        public Criteria andRetain3Between(String value1, String value2) {
            addCriterion("retain3 between", value1, value2, "retain3");
            return (Criteria) this;
        }

        public Criteria andRetain3NotBetween(String value1, String value2) {
            addCriterion("retain3 not between", value1, value2, "retain3");
            return (Criteria) this;
        }

        public Criteria andRetain4IsNull() {
            addCriterion("retain4 is null");
            return (Criteria) this;
        }

        public Criteria andRetain4IsNotNull() {
            addCriterion("retain4 is not null");
            return (Criteria) this;
        }

        public Criteria andRetain4EqualTo(String value) {
            addCriterion("retain4 =", value, "retain4");
            return (Criteria) this;
        }

        public Criteria andRetain4NotEqualTo(String value) {
            addCriterion("retain4 <>", value, "retain4");
            return (Criteria) this;
        }

        public Criteria andRetain4GreaterThan(String value) {
            addCriterion("retain4 >", value, "retain4");
            return (Criteria) this;
        }

        public Criteria andRetain4GreaterThanOrEqualTo(String value) {
            addCriterion("retain4 >=", value, "retain4");
            return (Criteria) this;
        }

        public Criteria andRetain4LessThan(String value) {
            addCriterion("retain4 <", value, "retain4");
            return (Criteria) this;
        }

        public Criteria andRetain4LessThanOrEqualTo(String value) {
            addCriterion("retain4 <=", value, "retain4");
            return (Criteria) this;
        }

        public Criteria andRetain4Like(String value) {
            addCriterion("retain4 like", value, "retain4");
            return (Criteria) this;
        }

        public Criteria andRetain4NotLike(String value) {
            addCriterion("retain4 not like", value, "retain4");
            return (Criteria) this;
        }

        public Criteria andRetain4In(List<String> values) {
            addCriterion("retain4 in", values, "retain4");
            return (Criteria) this;
        }

        public Criteria andRetain4NotIn(List<String> values) {
            addCriterion("retain4 not in", values, "retain4");
            return (Criteria) this;
        }

        public Criteria andRetain4Between(String value1, String value2) {
            addCriterion("retain4 between", value1, value2, "retain4");
            return (Criteria) this;
        }

        public Criteria andRetain4NotBetween(String value1, String value2) {
            addCriterion("retain4 not between", value1, value2, "retain4");
            return (Criteria) this;
        }

        public Criteria andRetain5IsNull() {
            addCriterion("retain5 is null");
            return (Criteria) this;
        }

        public Criteria andRetain5IsNotNull() {
            addCriterion("retain5 is not null");
            return (Criteria) this;
        }

        public Criteria andRetain5EqualTo(String value) {
            addCriterion("retain5 =", value, "retain5");
            return (Criteria) this;
        }

        public Criteria andRetain5NotEqualTo(String value) {
            addCriterion("retain5 <>", value, "retain5");
            return (Criteria) this;
        }

        public Criteria andRetain5GreaterThan(String value) {
            addCriterion("retain5 >", value, "retain5");
            return (Criteria) this;
        }

        public Criteria andRetain5GreaterThanOrEqualTo(String value) {
            addCriterion("retain5 >=", value, "retain5");
            return (Criteria) this;
        }

        public Criteria andRetain5LessThan(String value) {
            addCriterion("retain5 <", value, "retain5");
            return (Criteria) this;
        }

        public Criteria andRetain5LessThanOrEqualTo(String value) {
            addCriterion("retain5 <=", value, "retain5");
            return (Criteria) this;
        }

        public Criteria andRetain5Like(String value) {
            addCriterion("retain5 like", value, "retain5");
            return (Criteria) this;
        }

        public Criteria andRetain5NotLike(String value) {
            addCriterion("retain5 not like", value, "retain5");
            return (Criteria) this;
        }

        public Criteria andRetain5In(List<String> values) {
            addCriterion("retain5 in", values, "retain5");
            return (Criteria) this;
        }

        public Criteria andRetain5NotIn(List<String> values) {
            addCriterion("retain5 not in", values, "retain5");
            return (Criteria) this;
        }

        public Criteria andRetain5Between(String value1, String value2) {
            addCriterion("retain5 between", value1, value2, "retain5");
            return (Criteria) this;
        }

        public Criteria andRetain5NotBetween(String value1, String value2) {
            addCriterion("retain5 not between", value1, value2, "retain5");
            return (Criteria) this;
        }

        public Criteria andRetain6IsNull() {
            addCriterion("retain6 is null");
            return (Criteria) this;
        }

        public Criteria andRetain6IsNotNull() {
            addCriterion("retain6 is not null");
            return (Criteria) this;
        }

        public Criteria andRetain6EqualTo(String value) {
            addCriterion("retain6 =", value, "retain6");
            return (Criteria) this;
        }

        public Criteria andRetain6NotEqualTo(String value) {
            addCriterion("retain6 <>", value, "retain6");
            return (Criteria) this;
        }

        public Criteria andRetain6GreaterThan(String value) {
            addCriterion("retain6 >", value, "retain6");
            return (Criteria) this;
        }

        public Criteria andRetain6GreaterThanOrEqualTo(String value) {
            addCriterion("retain6 >=", value, "retain6");
            return (Criteria) this;
        }

        public Criteria andRetain6LessThan(String value) {
            addCriterion("retain6 <", value, "retain6");
            return (Criteria) this;
        }

        public Criteria andRetain6LessThanOrEqualTo(String value) {
            addCriterion("retain6 <=", value, "retain6");
            return (Criteria) this;
        }

        public Criteria andRetain6Like(String value) {
            addCriterion("retain6 like", value, "retain6");
            return (Criteria) this;
        }

        public Criteria andRetain6NotLike(String value) {
            addCriterion("retain6 not like", value, "retain6");
            return (Criteria) this;
        }

        public Criteria andRetain6In(List<String> values) {
            addCriterion("retain6 in", values, "retain6");
            return (Criteria) this;
        }

        public Criteria andRetain6NotIn(List<String> values) {
            addCriterion("retain6 not in", values, "retain6");
            return (Criteria) this;
        }

        public Criteria andRetain6Between(String value1, String value2) {
            addCriterion("retain6 between", value1, value2, "retain6");
            return (Criteria) this;
        }

        public Criteria andRetain6NotBetween(String value1, String value2) {
            addCriterion("retain6 not between", value1, value2, "retain6");
            return (Criteria) this;
        }

        public Criteria andRetain7IsNull() {
            addCriterion("retain7 is null");
            return (Criteria) this;
        }

        public Criteria andRetain7IsNotNull() {
            addCriterion("retain7 is not null");
            return (Criteria) this;
        }

        public Criteria andRetain7EqualTo(String value) {
            addCriterion("retain7 =", value, "retain7");
            return (Criteria) this;
        }

        public Criteria andRetain7NotEqualTo(String value) {
            addCriterion("retain7 <>", value, "retain7");
            return (Criteria) this;
        }

        public Criteria andRetain7GreaterThan(String value) {
            addCriterion("retain7 >", value, "retain7");
            return (Criteria) this;
        }

        public Criteria andRetain7GreaterThanOrEqualTo(String value) {
            addCriterion("retain7 >=", value, "retain7");
            return (Criteria) this;
        }

        public Criteria andRetain7LessThan(String value) {
            addCriterion("retain7 <", value, "retain7");
            return (Criteria) this;
        }

        public Criteria andRetain7LessThanOrEqualTo(String value) {
            addCriterion("retain7 <=", value, "retain7");
            return (Criteria) this;
        }

        public Criteria andRetain7Like(String value) {
            addCriterion("retain7 like", value, "retain7");
            return (Criteria) this;
        }

        public Criteria andRetain7NotLike(String value) {
            addCriterion("retain7 not like", value, "retain7");
            return (Criteria) this;
        }

        public Criteria andRetain7In(List<String> values) {
            addCriterion("retain7 in", values, "retain7");
            return (Criteria) this;
        }

        public Criteria andRetain7NotIn(List<String> values) {
            addCriterion("retain7 not in", values, "retain7");
            return (Criteria) this;
        }

        public Criteria andRetain7Between(String value1, String value2) {
            addCriterion("retain7 between", value1, value2, "retain7");
            return (Criteria) this;
        }

        public Criteria andRetain7NotBetween(String value1, String value2) {
            addCriterion("retain7 not between", value1, value2, "retain7");
            return (Criteria) this;
        }

        public Criteria andRetain8IsNull() {
            addCriterion("retain8 is null");
            return (Criteria) this;
        }

        public Criteria andRetain8IsNotNull() {
            addCriterion("retain8 is not null");
            return (Criteria) this;
        }

        public Criteria andRetain8EqualTo(String value) {
            addCriterion("retain8 =", value, "retain8");
            return (Criteria) this;
        }

        public Criteria andRetain8NotEqualTo(String value) {
            addCriterion("retain8 <>", value, "retain8");
            return (Criteria) this;
        }

        public Criteria andRetain8GreaterThan(String value) {
            addCriterion("retain8 >", value, "retain8");
            return (Criteria) this;
        }

        public Criteria andRetain8GreaterThanOrEqualTo(String value) {
            addCriterion("retain8 >=", value, "retain8");
            return (Criteria) this;
        }

        public Criteria andRetain8LessThan(String value) {
            addCriterion("retain8 <", value, "retain8");
            return (Criteria) this;
        }

        public Criteria andRetain8LessThanOrEqualTo(String value) {
            addCriterion("retain8 <=", value, "retain8");
            return (Criteria) this;
        }

        public Criteria andRetain8Like(String value) {
            addCriterion("retain8 like", value, "retain8");
            return (Criteria) this;
        }

        public Criteria andRetain8NotLike(String value) {
            addCriterion("retain8 not like", value, "retain8");
            return (Criteria) this;
        }

        public Criteria andRetain8In(List<String> values) {
            addCriterion("retain8 in", values, "retain8");
            return (Criteria) this;
        }

        public Criteria andRetain8NotIn(List<String> values) {
            addCriterion("retain8 not in", values, "retain8");
            return (Criteria) this;
        }

        public Criteria andRetain8Between(String value1, String value2) {
            addCriterion("retain8 between", value1, value2, "retain8");
            return (Criteria) this;
        }

        public Criteria andRetain8NotBetween(String value1, String value2) {
            addCriterion("retain8 not between", value1, value2, "retain8");
            return (Criteria) this;
        }

        public Criteria andRetain9IsNull() {
            addCriterion("retain9 is null");
            return (Criteria) this;
        }

        public Criteria andRetain9IsNotNull() {
            addCriterion("retain9 is not null");
            return (Criteria) this;
        }

        public Criteria andRetain9EqualTo(String value) {
            addCriterion("retain9 =", value, "retain9");
            return (Criteria) this;
        }

        public Criteria andRetain9NotEqualTo(String value) {
            addCriterion("retain9 <>", value, "retain9");
            return (Criteria) this;
        }

        public Criteria andRetain9GreaterThan(String value) {
            addCriterion("retain9 >", value, "retain9");
            return (Criteria) this;
        }

        public Criteria andRetain9GreaterThanOrEqualTo(String value) {
            addCriterion("retain9 >=", value, "retain9");
            return (Criteria) this;
        }

        public Criteria andRetain9LessThan(String value) {
            addCriterion("retain9 <", value, "retain9");
            return (Criteria) this;
        }

        public Criteria andRetain9LessThanOrEqualTo(String value) {
            addCriterion("retain9 <=", value, "retain9");
            return (Criteria) this;
        }

        public Criteria andRetain9Like(String value) {
            addCriterion("retain9 like", value, "retain9");
            return (Criteria) this;
        }

        public Criteria andRetain9NotLike(String value) {
            addCriterion("retain9 not like", value, "retain9");
            return (Criteria) this;
        }

        public Criteria andRetain9In(List<String> values) {
            addCriterion("retain9 in", values, "retain9");
            return (Criteria) this;
        }

        public Criteria andRetain9NotIn(List<String> values) {
            addCriterion("retain9 not in", values, "retain9");
            return (Criteria) this;
        }

        public Criteria andRetain9Between(String value1, String value2) {
            addCriterion("retain9 between", value1, value2, "retain9");
            return (Criteria) this;
        }

        public Criteria andRetain9NotBetween(String value1, String value2) {
            addCriterion("retain9 not between", value1, value2, "retain9");
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