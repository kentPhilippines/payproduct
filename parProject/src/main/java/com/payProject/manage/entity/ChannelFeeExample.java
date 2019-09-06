package com.payProject.manage.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChannelFeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChannelFeeExample() {
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

        public Criteria andChannelNoIsNull() {
            addCriterion("channelNo is null");
            return (Criteria) this;
        }

        public Criteria andChannelNoIsNotNull() {
            addCriterion("channelNo is not null");
            return (Criteria) this;
        }

        public Criteria andChannelNoEqualTo(String value) {
            addCriterion("channelNo =", value, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoNotEqualTo(String value) {
            addCriterion("channelNo <>", value, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoGreaterThan(String value) {
            addCriterion("channelNo >", value, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoGreaterThanOrEqualTo(String value) {
            addCriterion("channelNo >=", value, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoLessThan(String value) {
            addCriterion("channelNo <", value, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoLessThanOrEqualTo(String value) {
            addCriterion("channelNo <=", value, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoLike(String value) {
            addCriterion("channelNo like", value, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoNotLike(String value) {
            addCriterion("channelNo not like", value, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoIn(List<String> values) {
            addCriterion("channelNo in", values, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoNotIn(List<String> values) {
            addCriterion("channelNo not in", values, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoBetween(String value1, String value2) {
            addCriterion("channelNo between", value1, value2, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoNotBetween(String value1, String value2) {
            addCriterion("channelNo not between", value1, value2, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelAccountIsNull() {
            addCriterion("channelAccount is null");
            return (Criteria) this;
        }

        public Criteria andChannelAccountIsNotNull() {
            addCriterion("channelAccount is not null");
            return (Criteria) this;
        }

        public Criteria andChannelAccountEqualTo(String value) {
            addCriterion("channelAccount =", value, "channelAccount");
            return (Criteria) this;
        }

        public Criteria andChannelAccountNotEqualTo(String value) {
            addCriterion("channelAccount <>", value, "channelAccount");
            return (Criteria) this;
        }

        public Criteria andChannelAccountGreaterThan(String value) {
            addCriterion("channelAccount >", value, "channelAccount");
            return (Criteria) this;
        }

        public Criteria andChannelAccountGreaterThanOrEqualTo(String value) {
            addCriterion("channelAccount >=", value, "channelAccount");
            return (Criteria) this;
        }

        public Criteria andChannelAccountLessThan(String value) {
            addCriterion("channelAccount <", value, "channelAccount");
            return (Criteria) this;
        }

        public Criteria andChannelAccountLessThanOrEqualTo(String value) {
            addCriterion("channelAccount <=", value, "channelAccount");
            return (Criteria) this;
        }

        public Criteria andChannelAccountLike(String value) {
            addCriterion("channelAccount like", value, "channelAccount");
            return (Criteria) this;
        }

        public Criteria andChannelAccountNotLike(String value) {
            addCriterion("channelAccount not like", value, "channelAccount");
            return (Criteria) this;
        }

        public Criteria andChannelAccountIn(List<String> values) {
            addCriterion("channelAccount in", values, "channelAccount");
            return (Criteria) this;
        }

        public Criteria andChannelAccountNotIn(List<String> values) {
            addCriterion("channelAccount not in", values, "channelAccount");
            return (Criteria) this;
        }

        public Criteria andChannelAccountBetween(String value1, String value2) {
            addCriterion("channelAccount between", value1, value2, "channelAccount");
            return (Criteria) this;
        }

        public Criteria andChannelAccountNotBetween(String value1, String value2) {
            addCriterion("channelAccount not between", value1, value2, "channelAccount");
            return (Criteria) this;
        }

        public Criteria andChannelNameIsNull() {
            addCriterion("channelName is null");
            return (Criteria) this;
        }

        public Criteria andChannelNameIsNotNull() {
            addCriterion("channelName is not null");
            return (Criteria) this;
        }

        public Criteria andChannelNameEqualTo(String value) {
            addCriterion("channelName =", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotEqualTo(String value) {
            addCriterion("channelName <>", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameGreaterThan(String value) {
            addCriterion("channelName >", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameGreaterThanOrEqualTo(String value) {
            addCriterion("channelName >=", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLessThan(String value) {
            addCriterion("channelName <", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLessThanOrEqualTo(String value) {
            addCriterion("channelName <=", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLike(String value) {
            addCriterion("channelName like", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotLike(String value) {
            addCriterion("channelName not like", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameIn(List<String> values) {
            addCriterion("channelName in", values, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotIn(List<String> values) {
            addCriterion("channelName not in", values, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameBetween(String value1, String value2) {
            addCriterion("channelName between", value1, value2, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotBetween(String value1, String value2) {
            addCriterion("channelName not between", value1, value2, "channelName");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("payType is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("payType is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(String value) {
            addCriterion("payType =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(String value) {
            addCriterion("payType <>", value, "payType");
            return (Criteria) this;
        }





        public Criteria andPayTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("payType not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andFeeIsNull() {
            addCriterion("fee is null");
            return (Criteria) this;
        }

        public Criteria andFeeIsNotNull() {
            addCriterion("fee is not null");
            return (Criteria) this;
        }

        public Criteria andFeeEqualTo(String value) {
            addCriterion("fee =", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotEqualTo(String value) {
            addCriterion("fee <>", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThan(String value) {
            addCriterion("fee >", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThanOrEqualTo(String value) {
            addCriterion("fee >=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThan(String value) {
            addCriterion("fee <", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThanOrEqualTo(String value) {
            addCriterion("fee <=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLike(String value) {
            addCriterion("fee like", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotLike(String value) {
            addCriterion("fee not like", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeIn(List<String> values) {
            addCriterion("fee in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotIn(List<String> values) {
            addCriterion("fee not in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeBetween(String value1, String value2) {
            addCriterion("fee between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotBetween(String value1, String value2) {
            addCriterion("fee not between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andSettleIsNull() {
            addCriterion("settle is null");
            return (Criteria) this;
        }

        public Criteria andSettleIsNotNull() {
            addCriterion("settle is not null");
            return (Criteria) this;
        }

        public Criteria andSettleEqualTo(String value) {
            addCriterion("settle =", value, "settle");
            return (Criteria) this;
        }

        public Criteria andSettleNotEqualTo(String value) {
            addCriterion("settle <>", value, "settle");
            return (Criteria) this;
        }

        public Criteria andSettleGreaterThan(String value) {
            addCriterion("settle >", value, "settle");
            return (Criteria) this;
        }

        public Criteria andSettleGreaterThanOrEqualTo(String value) {
            addCriterion("settle >=", value, "settle");
            return (Criteria) this;
        }

        public Criteria andSettleLessThan(String value) {
            addCriterion("settle <", value, "settle");
            return (Criteria) this;
        }

        public Criteria andSettleLessThanOrEqualTo(String value) {
            addCriterion("settle <=", value, "settle");
            return (Criteria) this;
        }

        public Criteria andSettleLike(String value) {
            addCriterion("settle like", value, "settle");
            return (Criteria) this;
        }

        public Criteria andSettleNotLike(String value) {
            addCriterion("settle not like", value, "settle");
            return (Criteria) this;
        }

        public Criteria andSettleIn(List<String> values) {
            addCriterion("settle in", values, "settle");
            return (Criteria) this;
        }

        public Criteria andSettleNotIn(List<String> values) {
            addCriterion("settle not in", values, "settle");
            return (Criteria) this;
        }

        public Criteria andSettleBetween(String value1, String value2) {
            addCriterion("settle between", value1, value2, "settle");
            return (Criteria) this;
        }

        public Criteria andSettleNotBetween(String value1, String value2) {
            addCriterion("settle not between", value1, value2, "settle");
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