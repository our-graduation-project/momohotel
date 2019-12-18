package com.xqr.momohotel.model;

import java.util.ArrayList;
import java.util.List;

public class SuperAdminsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SuperAdminsExample() {
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

        public Criteria andSuperAdminIdIsNull() {
            addCriterion("super_admin_id is null");
            return (Criteria) this;
        }

        public Criteria andSuperAdminIdIsNotNull() {
            addCriterion("super_admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andSuperAdminIdEqualTo(Integer value) {
            addCriterion("super_admin_id =", value, "superAdminId");
            return (Criteria) this;
        }

        public Criteria andSuperAdminIdNotEqualTo(Integer value) {
            addCriterion("super_admin_id <>", value, "superAdminId");
            return (Criteria) this;
        }

        public Criteria andSuperAdminIdGreaterThan(Integer value) {
            addCriterion("super_admin_id >", value, "superAdminId");
            return (Criteria) this;
        }

        public Criteria andSuperAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("super_admin_id >=", value, "superAdminId");
            return (Criteria) this;
        }

        public Criteria andSuperAdminIdLessThan(Integer value) {
            addCriterion("super_admin_id <", value, "superAdminId");
            return (Criteria) this;
        }

        public Criteria andSuperAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("super_admin_id <=", value, "superAdminId");
            return (Criteria) this;
        }

        public Criteria andSuperAdminIdIn(List<Integer> values) {
            addCriterion("super_admin_id in", values, "superAdminId");
            return (Criteria) this;
        }

        public Criteria andSuperAdminIdNotIn(List<Integer> values) {
            addCriterion("super_admin_id not in", values, "superAdminId");
            return (Criteria) this;
        }

        public Criteria andSuperAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("super_admin_id between", value1, value2, "superAdminId");
            return (Criteria) this;
        }

        public Criteria andSuperAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("super_admin_id not between", value1, value2, "superAdminId");
            return (Criteria) this;
        }

        public Criteria andSuperAdminNoIsNull() {
            addCriterion("super_admin_no is null");
            return (Criteria) this;
        }

        public Criteria andSuperAdminNoIsNotNull() {
            addCriterion("super_admin_no is not null");
            return (Criteria) this;
        }

        public Criteria andSuperAdminNoEqualTo(String value) {
            addCriterion("super_admin_no =", value, "superAdminNo");
            return (Criteria) this;
        }

        public Criteria andSuperAdminNoNotEqualTo(String value) {
            addCriterion("super_admin_no <>", value, "superAdminNo");
            return (Criteria) this;
        }

        public Criteria andSuperAdminNoGreaterThan(String value) {
            addCriterion("super_admin_no >", value, "superAdminNo");
            return (Criteria) this;
        }

        public Criteria andSuperAdminNoGreaterThanOrEqualTo(String value) {
            addCriterion("super_admin_no >=", value, "superAdminNo");
            return (Criteria) this;
        }

        public Criteria andSuperAdminNoLessThan(String value) {
            addCriterion("super_admin_no <", value, "superAdminNo");
            return (Criteria) this;
        }

        public Criteria andSuperAdminNoLessThanOrEqualTo(String value) {
            addCriterion("super_admin_no <=", value, "superAdminNo");
            return (Criteria) this;
        }

        public Criteria andSuperAdminNoLike(String value) {
            addCriterion("super_admin_no like", value, "superAdminNo");
            return (Criteria) this;
        }

        public Criteria andSuperAdminNoNotLike(String value) {
            addCriterion("super_admin_no not like", value, "superAdminNo");
            return (Criteria) this;
        }

        public Criteria andSuperAdminNoIn(List<String> values) {
            addCriterion("super_admin_no in", values, "superAdminNo");
            return (Criteria) this;
        }

        public Criteria andSuperAdminNoNotIn(List<String> values) {
            addCriterion("super_admin_no not in", values, "superAdminNo");
            return (Criteria) this;
        }

        public Criteria andSuperAdminNoBetween(String value1, String value2) {
            addCriterion("super_admin_no between", value1, value2, "superAdminNo");
            return (Criteria) this;
        }

        public Criteria andSuperAdminNoNotBetween(String value1, String value2) {
            addCriterion("super_admin_no not between", value1, value2, "superAdminNo");
            return (Criteria) this;
        }

        public Criteria andSuperAdminNameIsNull() {
            addCriterion("super_admin_name is null");
            return (Criteria) this;
        }

        public Criteria andSuperAdminNameIsNotNull() {
            addCriterion("super_admin_name is not null");
            return (Criteria) this;
        }

        public Criteria andSuperAdminNameEqualTo(String value) {
            addCriterion("super_admin_name =", value, "superAdminName");
            return (Criteria) this;
        }

        public Criteria andSuperAdminNameNotEqualTo(String value) {
            addCriterion("super_admin_name <>", value, "superAdminName");
            return (Criteria) this;
        }

        public Criteria andSuperAdminNameGreaterThan(String value) {
            addCriterion("super_admin_name >", value, "superAdminName");
            return (Criteria) this;
        }

        public Criteria andSuperAdminNameGreaterThanOrEqualTo(String value) {
            addCriterion("super_admin_name >=", value, "superAdminName");
            return (Criteria) this;
        }

        public Criteria andSuperAdminNameLessThan(String value) {
            addCriterion("super_admin_name <", value, "superAdminName");
            return (Criteria) this;
        }

        public Criteria andSuperAdminNameLessThanOrEqualTo(String value) {
            addCriterion("super_admin_name <=", value, "superAdminName");
            return (Criteria) this;
        }

        public Criteria andSuperAdminNameLike(String value) {
            addCriterion("super_admin_name like", value, "superAdminName");
            return (Criteria) this;
        }

        public Criteria andSuperAdminNameNotLike(String value) {
            addCriterion("super_admin_name not like", value, "superAdminName");
            return (Criteria) this;
        }

        public Criteria andSuperAdminNameIn(List<String> values) {
            addCriterion("super_admin_name in", values, "superAdminName");
            return (Criteria) this;
        }

        public Criteria andSuperAdminNameNotIn(List<String> values) {
            addCriterion("super_admin_name not in", values, "superAdminName");
            return (Criteria) this;
        }

        public Criteria andSuperAdminNameBetween(String value1, String value2) {
            addCriterion("super_admin_name between", value1, value2, "superAdminName");
            return (Criteria) this;
        }

        public Criteria andSuperAdminNameNotBetween(String value1, String value2) {
            addCriterion("super_admin_name not between", value1, value2, "superAdminName");
            return (Criteria) this;
        }

        public Criteria andSuperAdminPasswordIsNull() {
            addCriterion("super_admin_password is null");
            return (Criteria) this;
        }

        public Criteria andSuperAdminPasswordIsNotNull() {
            addCriterion("super_admin_password is not null");
            return (Criteria) this;
        }

        public Criteria andSuperAdminPasswordEqualTo(String value) {
            addCriterion("super_admin_password =", value, "superAdminPassword");
            return (Criteria) this;
        }

        public Criteria andSuperAdminPasswordNotEqualTo(String value) {
            addCriterion("super_admin_password <>", value, "superAdminPassword");
            return (Criteria) this;
        }

        public Criteria andSuperAdminPasswordGreaterThan(String value) {
            addCriterion("super_admin_password >", value, "superAdminPassword");
            return (Criteria) this;
        }

        public Criteria andSuperAdminPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("super_admin_password >=", value, "superAdminPassword");
            return (Criteria) this;
        }

        public Criteria andSuperAdminPasswordLessThan(String value) {
            addCriterion("super_admin_password <", value, "superAdminPassword");
            return (Criteria) this;
        }

        public Criteria andSuperAdminPasswordLessThanOrEqualTo(String value) {
            addCriterion("super_admin_password <=", value, "superAdminPassword");
            return (Criteria) this;
        }

        public Criteria andSuperAdminPasswordLike(String value) {
            addCriterion("super_admin_password like", value, "superAdminPassword");
            return (Criteria) this;
        }

        public Criteria andSuperAdminPasswordNotLike(String value) {
            addCriterion("super_admin_password not like", value, "superAdminPassword");
            return (Criteria) this;
        }

        public Criteria andSuperAdminPasswordIn(List<String> values) {
            addCriterion("super_admin_password in", values, "superAdminPassword");
            return (Criteria) this;
        }

        public Criteria andSuperAdminPasswordNotIn(List<String> values) {
            addCriterion("super_admin_password not in", values, "superAdminPassword");
            return (Criteria) this;
        }

        public Criteria andSuperAdminPasswordBetween(String value1, String value2) {
            addCriterion("super_admin_password between", value1, value2, "superAdminPassword");
            return (Criteria) this;
        }

        public Criteria andSuperAdminPasswordNotBetween(String value1, String value2) {
            addCriterion("super_admin_password not between", value1, value2, "superAdminPassword");
            return (Criteria) this;
        }

        public Criteria andSuperAdminPhoneIsNull() {
            addCriterion("super_admin_phone is null");
            return (Criteria) this;
        }

        public Criteria andSuperAdminPhoneIsNotNull() {
            addCriterion("super_admin_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSuperAdminPhoneEqualTo(String value) {
            addCriterion("super_admin_phone =", value, "superAdminPhone");
            return (Criteria) this;
        }

        public Criteria andSuperAdminPhoneNotEqualTo(String value) {
            addCriterion("super_admin_phone <>", value, "superAdminPhone");
            return (Criteria) this;
        }

        public Criteria andSuperAdminPhoneGreaterThan(String value) {
            addCriterion("super_admin_phone >", value, "superAdminPhone");
            return (Criteria) this;
        }

        public Criteria andSuperAdminPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("super_admin_phone >=", value, "superAdminPhone");
            return (Criteria) this;
        }

        public Criteria andSuperAdminPhoneLessThan(String value) {
            addCriterion("super_admin_phone <", value, "superAdminPhone");
            return (Criteria) this;
        }

        public Criteria andSuperAdminPhoneLessThanOrEqualTo(String value) {
            addCriterion("super_admin_phone <=", value, "superAdminPhone");
            return (Criteria) this;
        }

        public Criteria andSuperAdminPhoneLike(String value) {
            addCriterion("super_admin_phone like", value, "superAdminPhone");
            return (Criteria) this;
        }

        public Criteria andSuperAdminPhoneNotLike(String value) {
            addCriterion("super_admin_phone not like", value, "superAdminPhone");
            return (Criteria) this;
        }

        public Criteria andSuperAdminPhoneIn(List<String> values) {
            addCriterion("super_admin_phone in", values, "superAdminPhone");
            return (Criteria) this;
        }

        public Criteria andSuperAdminPhoneNotIn(List<String> values) {
            addCriterion("super_admin_phone not in", values, "superAdminPhone");
            return (Criteria) this;
        }

        public Criteria andSuperAdminPhoneBetween(String value1, String value2) {
            addCriterion("super_admin_phone between", value1, value2, "superAdminPhone");
            return (Criteria) this;
        }

        public Criteria andSuperAdminPhoneNotBetween(String value1, String value2) {
            addCriterion("super_admin_phone not between", value1, value2, "superAdminPhone");
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