package com.xqr.momohotel.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
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

        public Criteria andHotelNameIsNull() {
            addCriterion("hotel_name is null");
            return (Criteria) this;
        }

        public Criteria andHotelNameIsNotNull() {
            addCriterion("hotel_name is not null");
            return (Criteria) this;
        }

        public Criteria andHotelNameEqualTo(String value) {
            addCriterion("hotel_name =", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameNotEqualTo(String value) {
            addCriterion("hotel_name <>", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameGreaterThan(String value) {
            addCriterion("hotel_name >", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_name >=", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameLessThan(String value) {
            addCriterion("hotel_name <", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameLessThanOrEqualTo(String value) {
            addCriterion("hotel_name <=", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameLike(String value) {
            addCriterion("hotel_name like", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameNotLike(String value) {
            addCriterion("hotel_name not like", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameIn(List<String> values) {
            addCriterion("hotel_name in", values, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameNotIn(List<String> values) {
            addCriterion("hotel_name not in", values, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameBetween(String value1, String value2) {
            addCriterion("hotel_name between", value1, value2, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameNotBetween(String value1, String value2) {
            addCriterion("hotel_name not between", value1, value2, "hotelName");
            return (Criteria) this;
        }

        public Criteria andRoomNameIsNull() {
            addCriterion("room_name is null");
            return (Criteria) this;
        }

        public Criteria andRoomNameIsNotNull() {
            addCriterion("room_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoomNameEqualTo(String value) {
            addCriterion("room_name =", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameNotEqualTo(String value) {
            addCriterion("room_name <>", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameGreaterThan(String value) {
            addCriterion("room_name >", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameGreaterThanOrEqualTo(String value) {
            addCriterion("room_name >=", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameLessThan(String value) {
            addCriterion("room_name <", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameLessThanOrEqualTo(String value) {
            addCriterion("room_name <=", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameLike(String value) {
            addCriterion("room_name like", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameNotLike(String value) {
            addCriterion("room_name not like", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameIn(List<String> values) {
            addCriterion("room_name in", values, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameNotIn(List<String> values) {
            addCriterion("room_name not in", values, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameBetween(String value1, String value2) {
            addCriterion("room_name between", value1, value2, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameNotBetween(String value1, String value2) {
            addCriterion("room_name not between", value1, value2, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNumberIsNull() {
            addCriterion("room_number is null");
            return (Criteria) this;
        }

        public Criteria andRoomNumberIsNotNull() {
            addCriterion("room_number is not null");
            return (Criteria) this;
        }

        public Criteria andRoomNumberEqualTo(String value) {
            addCriterion("room_number =", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberNotEqualTo(String value) {
            addCriterion("room_number <>", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberGreaterThan(String value) {
            addCriterion("room_number >", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberGreaterThanOrEqualTo(String value) {
            addCriterion("room_number >=", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberLessThan(String value) {
            addCriterion("room_number <", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberLessThanOrEqualTo(String value) {
            addCriterion("room_number <=", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberLike(String value) {
            addCriterion("room_number like", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberNotLike(String value) {
            addCriterion("room_number not like", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberIn(List<String> values) {
            addCriterion("room_number in", values, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberNotIn(List<String> values) {
            addCriterion("room_number not in", values, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberBetween(String value1, String value2) {
            addCriterion("room_number between", value1, value2, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberNotBetween(String value1, String value2) {
            addCriterion("room_number not between", value1, value2, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andEarnestIsNull() {
            addCriterion("earnest is null");
            return (Criteria) this;
        }

        public Criteria andEarnestIsNotNull() {
            addCriterion("earnest is not null");
            return (Criteria) this;
        }

        public Criteria andEarnestEqualTo(Double value) {
            addCriterion("earnest =", value, "earnest");
            return (Criteria) this;
        }

        public Criteria andEarnestNotEqualTo(Double value) {
            addCriterion("earnest <>", value, "earnest");
            return (Criteria) this;
        }

        public Criteria andEarnestGreaterThan(Double value) {
            addCriterion("earnest >", value, "earnest");
            return (Criteria) this;
        }

        public Criteria andEarnestGreaterThanOrEqualTo(Double value) {
            addCriterion("earnest >=", value, "earnest");
            return (Criteria) this;
        }

        public Criteria andEarnestLessThan(Double value) {
            addCriterion("earnest <", value, "earnest");
            return (Criteria) this;
        }

        public Criteria andEarnestLessThanOrEqualTo(Double value) {
            addCriterion("earnest <=", value, "earnest");
            return (Criteria) this;
        }

        public Criteria andEarnestIn(List<Double> values) {
            addCriterion("earnest in", values, "earnest");
            return (Criteria) this;
        }

        public Criteria andEarnestNotIn(List<Double> values) {
            addCriterion("earnest not in", values, "earnest");
            return (Criteria) this;
        }

        public Criteria andEarnestBetween(Double value1, Double value2) {
            addCriterion("earnest between", value1, value2, "earnest");
            return (Criteria) this;
        }

        public Criteria andEarnestNotBetween(Double value1, Double value2) {
            addCriterion("earnest not between", value1, value2, "earnest");
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

        public Criteria andUserSexIsNull() {
            addCriterion("user_sex is null");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNotNull() {
            addCriterion("user_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUserSexEqualTo(String value) {
            addCriterion("user_sex =", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotEqualTo(String value) {
            addCriterion("user_sex <>", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThan(String value) {
            addCriterion("user_sex >", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThanOrEqualTo(String value) {
            addCriterion("user_sex >=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThan(String value) {
            addCriterion("user_sex <", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThanOrEqualTo(String value) {
            addCriterion("user_sex <=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLike(String value) {
            addCriterion("user_sex like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotLike(String value) {
            addCriterion("user_sex not like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexIn(List<String> values) {
            addCriterion("user_sex in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotIn(List<String> values) {
            addCriterion("user_sex not in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexBetween(String value1, String value2) {
            addCriterion("user_sex between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotBetween(String value1, String value2) {
            addCriterion("user_sex not between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andCheckinCodeIsNull() {
            addCriterion("checkin_code is null");
            return (Criteria) this;
        }

        public Criteria andCheckinCodeIsNotNull() {
            addCriterion("checkin_code is not null");
            return (Criteria) this;
        }

        public Criteria andCheckinCodeEqualTo(String value) {
            addCriterion("checkin_code =", value, "checkinCode");
            return (Criteria) this;
        }

        public Criteria andCheckinCodeNotEqualTo(String value) {
            addCriterion("checkin_code <>", value, "checkinCode");
            return (Criteria) this;
        }

        public Criteria andCheckinCodeGreaterThan(String value) {
            addCriterion("checkin_code >", value, "checkinCode");
            return (Criteria) this;
        }

        public Criteria andCheckinCodeGreaterThanOrEqualTo(String value) {
            addCriterion("checkin_code >=", value, "checkinCode");
            return (Criteria) this;
        }

        public Criteria andCheckinCodeLessThan(String value) {
            addCriterion("checkin_code <", value, "checkinCode");
            return (Criteria) this;
        }

        public Criteria andCheckinCodeLessThanOrEqualTo(String value) {
            addCriterion("checkin_code <=", value, "checkinCode");
            return (Criteria) this;
        }

        public Criteria andCheckinCodeLike(String value) {
            addCriterion("checkin_code like", value, "checkinCode");
            return (Criteria) this;
        }

        public Criteria andCheckinCodeNotLike(String value) {
            addCriterion("checkin_code not like", value, "checkinCode");
            return (Criteria) this;
        }

        public Criteria andCheckinCodeIn(List<String> values) {
            addCriterion("checkin_code in", values, "checkinCode");
            return (Criteria) this;
        }

        public Criteria andCheckinCodeNotIn(List<String> values) {
            addCriterion("checkin_code not in", values, "checkinCode");
            return (Criteria) this;
        }

        public Criteria andCheckinCodeBetween(String value1, String value2) {
            addCriterion("checkin_code between", value1, value2, "checkinCode");
            return (Criteria) this;
        }

        public Criteria andCheckinCodeNotBetween(String value1, String value2) {
            addCriterion("checkin_code not between", value1, value2, "checkinCode");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNull() {
            addCriterion("order_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("order_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(Date value) {
            addCriterion("order_time =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(Date value) {
            addCriterion("order_time <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(Date value) {
            addCriterion("order_time >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_time >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(Date value) {
            addCriterion("order_time <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_time <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<Date> values) {
            addCriterion("order_time in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<Date> values) {
            addCriterion("order_time not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(Date value1, Date value2) {
            addCriterion("order_time between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_time not between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andCheckinTimeIsNull() {
            addCriterion("checkin_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckinTimeIsNotNull() {
            addCriterion("checkin_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckinTimeEqualTo(Date value) {
            addCriterion("checkin_time =", value, "checkinTime");
            return (Criteria) this;
        }

        public Criteria andCheckinTimeNotEqualTo(Date value) {
            addCriterion("checkin_time <>", value, "checkinTime");
            return (Criteria) this;
        }

        public Criteria andCheckinTimeGreaterThan(Date value) {
            addCriterion("checkin_time >", value, "checkinTime");
            return (Criteria) this;
        }

        public Criteria andCheckinTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("checkin_time >=", value, "checkinTime");
            return (Criteria) this;
        }

        public Criteria andCheckinTimeLessThan(Date value) {
            addCriterion("checkin_time <", value, "checkinTime");
            return (Criteria) this;
        }

        public Criteria andCheckinTimeLessThanOrEqualTo(Date value) {
            addCriterion("checkin_time <=", value, "checkinTime");
            return (Criteria) this;
        }

        public Criteria andCheckinTimeIn(List<Date> values) {
            addCriterion("checkin_time in", values, "checkinTime");
            return (Criteria) this;
        }

        public Criteria andCheckinTimeNotIn(List<Date> values) {
            addCriterion("checkin_time not in", values, "checkinTime");
            return (Criteria) this;
        }

        public Criteria andCheckinTimeBetween(Date value1, Date value2) {
            addCriterion("checkin_time between", value1, value2, "checkinTime");
            return (Criteria) this;
        }

        public Criteria andCheckinTimeNotBetween(Date value1, Date value2) {
            addCriterion("checkin_time not between", value1, value2, "checkinTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeIsNull() {
            addCriterion("complete_time is null");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeIsNotNull() {
            addCriterion("complete_time is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeEqualTo(Date value) {
            addCriterion("complete_time =", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotEqualTo(Date value) {
            addCriterion("complete_time <>", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeGreaterThan(Date value) {
            addCriterion("complete_time >", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("complete_time >=", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeLessThan(Date value) {
            addCriterion("complete_time <", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("complete_time <=", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeIn(List<Date> values) {
            addCriterion("complete_time in", values, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotIn(List<Date> values) {
            addCriterion("complete_time not in", values, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeBetween(Date value1, Date value2) {
            addCriterion("complete_time between", value1, value2, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("complete_time not between", value1, value2, "completeTime");
            return (Criteria) this;
        }

        public Criteria andRoderStateIsNull() {
            addCriterion("roder_state is null");
            return (Criteria) this;
        }

        public Criteria andRoderStateIsNotNull() {
            addCriterion("roder_state is not null");
            return (Criteria) this;
        }

        public Criteria andRoderStateEqualTo(Integer value) {
            addCriterion("roder_state =", value, "roderState");
            return (Criteria) this;
        }

        public Criteria andRoderStateNotEqualTo(Integer value) {
            addCriterion("roder_state <>", value, "roderState");
            return (Criteria) this;
        }

        public Criteria andRoderStateGreaterThan(Integer value) {
            addCriterion("roder_state >", value, "roderState");
            return (Criteria) this;
        }

        public Criteria andRoderStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("roder_state >=", value, "roderState");
            return (Criteria) this;
        }

        public Criteria andRoderStateLessThan(Integer value) {
            addCriterion("roder_state <", value, "roderState");
            return (Criteria) this;
        }

        public Criteria andRoderStateLessThanOrEqualTo(Integer value) {
            addCriterion("roder_state <=", value, "roderState");
            return (Criteria) this;
        }

        public Criteria andRoderStateIn(List<Integer> values) {
            addCriterion("roder_state in", values, "roderState");
            return (Criteria) this;
        }

        public Criteria andRoderStateNotIn(List<Integer> values) {
            addCriterion("roder_state not in", values, "roderState");
            return (Criteria) this;
        }

        public Criteria andRoderStateBetween(Integer value1, Integer value2) {
            addCriterion("roder_state between", value1, value2, "roderState");
            return (Criteria) this;
        }

        public Criteria andRoderStateNotBetween(Integer value1, Integer value2) {
            addCriterion("roder_state not between", value1, value2, "roderState");
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