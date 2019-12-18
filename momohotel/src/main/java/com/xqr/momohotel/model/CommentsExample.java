package com.xqr.momohotel.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentsExample() {
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

        public Criteria andCommentIdIsNull() {
            addCriterion("comment_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNotNull() {
            addCriterion("comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentIdEqualTo(Integer value) {
            addCriterion("comment_id =", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotEqualTo(Integer value) {
            addCriterion("comment_id <>", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThan(Integer value) {
            addCriterion("comment_id >", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_id >=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThan(Integer value) {
            addCriterion("comment_id <", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("comment_id <=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIn(List<Integer> values) {
            addCriterion("comment_id in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotIn(List<Integer> values) {
            addCriterion("comment_id not in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("comment_id between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_id not between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentNoIsNull() {
            addCriterion("comment_no is null");
            return (Criteria) this;
        }

        public Criteria andCommentNoIsNotNull() {
            addCriterion("comment_no is not null");
            return (Criteria) this;
        }

        public Criteria andCommentNoEqualTo(String value) {
            addCriterion("comment_no =", value, "commentNo");
            return (Criteria) this;
        }

        public Criteria andCommentNoNotEqualTo(String value) {
            addCriterion("comment_no <>", value, "commentNo");
            return (Criteria) this;
        }

        public Criteria andCommentNoGreaterThan(String value) {
            addCriterion("comment_no >", value, "commentNo");
            return (Criteria) this;
        }

        public Criteria andCommentNoGreaterThanOrEqualTo(String value) {
            addCriterion("comment_no >=", value, "commentNo");
            return (Criteria) this;
        }

        public Criteria andCommentNoLessThan(String value) {
            addCriterion("comment_no <", value, "commentNo");
            return (Criteria) this;
        }

        public Criteria andCommentNoLessThanOrEqualTo(String value) {
            addCriterion("comment_no <=", value, "commentNo");
            return (Criteria) this;
        }

        public Criteria andCommentNoLike(String value) {
            addCriterion("comment_no like", value, "commentNo");
            return (Criteria) this;
        }

        public Criteria andCommentNoNotLike(String value) {
            addCriterion("comment_no not like", value, "commentNo");
            return (Criteria) this;
        }

        public Criteria andCommentNoIn(List<String> values) {
            addCriterion("comment_no in", values, "commentNo");
            return (Criteria) this;
        }

        public Criteria andCommentNoNotIn(List<String> values) {
            addCriterion("comment_no not in", values, "commentNo");
            return (Criteria) this;
        }

        public Criteria andCommentNoBetween(String value1, String value2) {
            addCriterion("comment_no between", value1, value2, "commentNo");
            return (Criteria) this;
        }

        public Criteria andCommentNoNotBetween(String value1, String value2) {
            addCriterion("comment_no not between", value1, value2, "commentNo");
            return (Criteria) this;
        }

        public Criteria andCommentDataIsNull() {
            addCriterion("comment_data is null");
            return (Criteria) this;
        }

        public Criteria andCommentDataIsNotNull() {
            addCriterion("comment_data is not null");
            return (Criteria) this;
        }

        public Criteria andCommentDataEqualTo(String value) {
            addCriterion("comment_data =", value, "commentData");
            return (Criteria) this;
        }

        public Criteria andCommentDataNotEqualTo(String value) {
            addCriterion("comment_data <>", value, "commentData");
            return (Criteria) this;
        }

        public Criteria andCommentDataGreaterThan(String value) {
            addCriterion("comment_data >", value, "commentData");
            return (Criteria) this;
        }

        public Criteria andCommentDataGreaterThanOrEqualTo(String value) {
            addCriterion("comment_data >=", value, "commentData");
            return (Criteria) this;
        }

        public Criteria andCommentDataLessThan(String value) {
            addCriterion("comment_data <", value, "commentData");
            return (Criteria) this;
        }

        public Criteria andCommentDataLessThanOrEqualTo(String value) {
            addCriterion("comment_data <=", value, "commentData");
            return (Criteria) this;
        }

        public Criteria andCommentDataLike(String value) {
            addCriterion("comment_data like", value, "commentData");
            return (Criteria) this;
        }

        public Criteria andCommentDataNotLike(String value) {
            addCriterion("comment_data not like", value, "commentData");
            return (Criteria) this;
        }

        public Criteria andCommentDataIn(List<String> values) {
            addCriterion("comment_data in", values, "commentData");
            return (Criteria) this;
        }

        public Criteria andCommentDataNotIn(List<String> values) {
            addCriterion("comment_data not in", values, "commentData");
            return (Criteria) this;
        }

        public Criteria andCommentDataBetween(String value1, String value2) {
            addCriterion("comment_data between", value1, value2, "commentData");
            return (Criteria) this;
        }

        public Criteria andCommentDataNotBetween(String value1, String value2) {
            addCriterion("comment_data not between", value1, value2, "commentData");
            return (Criteria) this;
        }

        public Criteria andHoteleIdIsNull() {
            addCriterion("hotele_id is null");
            return (Criteria) this;
        }

        public Criteria andHoteleIdIsNotNull() {
            addCriterion("hotele_id is not null");
            return (Criteria) this;
        }

        public Criteria andHoteleIdEqualTo(Integer value) {
            addCriterion("hotele_id =", value, "hoteleId");
            return (Criteria) this;
        }

        public Criteria andHoteleIdNotEqualTo(Integer value) {
            addCriterion("hotele_id <>", value, "hoteleId");
            return (Criteria) this;
        }

        public Criteria andHoteleIdGreaterThan(Integer value) {
            addCriterion("hotele_id >", value, "hoteleId");
            return (Criteria) this;
        }

        public Criteria andHoteleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotele_id >=", value, "hoteleId");
            return (Criteria) this;
        }

        public Criteria andHoteleIdLessThan(Integer value) {
            addCriterion("hotele_id <", value, "hoteleId");
            return (Criteria) this;
        }

        public Criteria andHoteleIdLessThanOrEqualTo(Integer value) {
            addCriterion("hotele_id <=", value, "hoteleId");
            return (Criteria) this;
        }

        public Criteria andHoteleIdIn(List<Integer> values) {
            addCriterion("hotele_id in", values, "hoteleId");
            return (Criteria) this;
        }

        public Criteria andHoteleIdNotIn(List<Integer> values) {
            addCriterion("hotele_id not in", values, "hoteleId");
            return (Criteria) this;
        }

        public Criteria andHoteleIdBetween(Integer value1, Integer value2) {
            addCriterion("hotele_id between", value1, value2, "hoteleId");
            return (Criteria) this;
        }

        public Criteria andHoteleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hotele_id not between", value1, value2, "hoteleId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPhineIsNull() {
            addCriterion("user_phine is null");
            return (Criteria) this;
        }

        public Criteria andUserPhineIsNotNull() {
            addCriterion("user_phine is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhineEqualTo(String value) {
            addCriterion("user_phine =", value, "userPhine");
            return (Criteria) this;
        }

        public Criteria andUserPhineNotEqualTo(String value) {
            addCriterion("user_phine <>", value, "userPhine");
            return (Criteria) this;
        }

        public Criteria andUserPhineGreaterThan(String value) {
            addCriterion("user_phine >", value, "userPhine");
            return (Criteria) this;
        }

        public Criteria andUserPhineGreaterThanOrEqualTo(String value) {
            addCriterion("user_phine >=", value, "userPhine");
            return (Criteria) this;
        }

        public Criteria andUserPhineLessThan(String value) {
            addCriterion("user_phine <", value, "userPhine");
            return (Criteria) this;
        }

        public Criteria andUserPhineLessThanOrEqualTo(String value) {
            addCriterion("user_phine <=", value, "userPhine");
            return (Criteria) this;
        }

        public Criteria andUserPhineLike(String value) {
            addCriterion("user_phine like", value, "userPhine");
            return (Criteria) this;
        }

        public Criteria andUserPhineNotLike(String value) {
            addCriterion("user_phine not like", value, "userPhine");
            return (Criteria) this;
        }

        public Criteria andUserPhineIn(List<String> values) {
            addCriterion("user_phine in", values, "userPhine");
            return (Criteria) this;
        }

        public Criteria andUserPhineNotIn(List<String> values) {
            addCriterion("user_phine not in", values, "userPhine");
            return (Criteria) this;
        }

        public Criteria andUserPhineBetween(String value1, String value2) {
            addCriterion("user_phine between", value1, value2, "userPhine");
            return (Criteria) this;
        }

        public Criteria andUserPhineNotBetween(String value1, String value2) {
            addCriterion("user_phine not between", value1, value2, "userPhine");
            return (Criteria) this;
        }

        public Criteria andCommentTimeIsNull() {
            addCriterion("comment_time is null");
            return (Criteria) this;
        }

        public Criteria andCommentTimeIsNotNull() {
            addCriterion("comment_time is not null");
            return (Criteria) this;
        }

        public Criteria andCommentTimeEqualTo(Date value) {
            addCriterion("comment_time =", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotEqualTo(Date value) {
            addCriterion("comment_time <>", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeGreaterThan(Date value) {
            addCriterion("comment_time >", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("comment_time >=", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeLessThan(Date value) {
            addCriterion("comment_time <", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeLessThanOrEqualTo(Date value) {
            addCriterion("comment_time <=", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeIn(List<Date> values) {
            addCriterion("comment_time in", values, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotIn(List<Date> values) {
            addCriterion("comment_time not in", values, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeBetween(Date value1, Date value2) {
            addCriterion("comment_time between", value1, value2, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotBetween(Date value1, Date value2) {
            addCriterion("comment_time not between", value1, value2, "commentTime");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNull() {
            addCriterion("remark1 is null");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNotNull() {
            addCriterion("remark1 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark1EqualTo(String value) {
            addCriterion("remark1 =", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotEqualTo(String value) {
            addCriterion("remark1 <>", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThan(String value) {
            addCriterion("remark1 >", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThanOrEqualTo(String value) {
            addCriterion("remark1 >=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThan(String value) {
            addCriterion("remark1 <", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThanOrEqualTo(String value) {
            addCriterion("remark1 <=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Like(String value) {
            addCriterion("remark1 like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotLike(String value) {
            addCriterion("remark1 not like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1In(List<String> values) {
            addCriterion("remark1 in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotIn(List<String> values) {
            addCriterion("remark1 not in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Between(String value1, String value2) {
            addCriterion("remark1 between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotBetween(String value1, String value2) {
            addCriterion("remark1 not between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNull() {
            addCriterion("remark2 is null");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNotNull() {
            addCriterion("remark2 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark2EqualTo(String value) {
            addCriterion("remark2 =", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotEqualTo(String value) {
            addCriterion("remark2 <>", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThan(String value) {
            addCriterion("remark2 >", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThanOrEqualTo(String value) {
            addCriterion("remark2 >=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThan(String value) {
            addCriterion("remark2 <", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThanOrEqualTo(String value) {
            addCriterion("remark2 <=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Like(String value) {
            addCriterion("remark2 like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotLike(String value) {
            addCriterion("remark2 not like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2In(List<String> values) {
            addCriterion("remark2 in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotIn(List<String> values) {
            addCriterion("remark2 not in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Between(String value1, String value2) {
            addCriterion("remark2 between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotBetween(String value1, String value2) {
            addCriterion("remark2 not between", value1, value2, "remark2");
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