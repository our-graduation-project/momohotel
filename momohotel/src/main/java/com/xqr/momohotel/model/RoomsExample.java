package com.xqr.momohotel.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RoomsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoomsExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andRoomIdIsNull() {
            addCriterion("room_id is null");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNotNull() {
            addCriterion("room_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoomIdEqualTo(Integer value) {
            addCriterion("room_id =", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotEqualTo(Integer value) {
            addCriterion("room_id <>", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThan(Integer value) {
            addCriterion("room_id >", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_id >=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThan(Integer value) {
            addCriterion("room_id <", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThanOrEqualTo(Integer value) {
            addCriterion("room_id <=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdIn(List<Integer> values) {
            addCriterion("room_id in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotIn(List<Integer> values) {
            addCriterion("room_id not in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdBetween(Integer value1, Integer value2) {
            addCriterion("room_id between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotBetween(Integer value1, Integer value2) {
            addCriterion("room_id not between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomNoIsNull() {
            addCriterion("room_no is null");
            return (Criteria) this;
        }

        public Criteria andRoomNoIsNotNull() {
            addCriterion("room_no is not null");
            return (Criteria) this;
        }

        public Criteria andRoomNoEqualTo(String value) {
            addCriterion("room_no =", value, "roomNo");
            return (Criteria) this;
        }

        public Criteria andRoomNoNotEqualTo(String value) {
            addCriterion("room_no <>", value, "roomNo");
            return (Criteria) this;
        }

        public Criteria andRoomNoGreaterThan(String value) {
            addCriterion("room_no >", value, "roomNo");
            return (Criteria) this;
        }

        public Criteria andRoomNoGreaterThanOrEqualTo(String value) {
            addCriterion("room_no >=", value, "roomNo");
            return (Criteria) this;
        }

        public Criteria andRoomNoLessThan(String value) {
            addCriterion("room_no <", value, "roomNo");
            return (Criteria) this;
        }

        public Criteria andRoomNoLessThanOrEqualTo(String value) {
            addCriterion("room_no <=", value, "roomNo");
            return (Criteria) this;
        }

        public Criteria andRoomNoLike(String value) {
            addCriterion("room_no like", value, "roomNo");
            return (Criteria) this;
        }

        public Criteria andRoomNoNotLike(String value) {
            addCriterion("room_no not like", value, "roomNo");
            return (Criteria) this;
        }

        public Criteria andRoomNoIn(List<String> values) {
            addCriterion("room_no in", values, "roomNo");
            return (Criteria) this;
        }

        public Criteria andRoomNoNotIn(List<String> values) {
            addCriterion("room_no not in", values, "roomNo");
            return (Criteria) this;
        }

        public Criteria andRoomNoBetween(String value1, String value2) {
            addCriterion("room_no between", value1, value2, "roomNo");
            return (Criteria) this;
        }

        public Criteria andRoomNoNotBetween(String value1, String value2) {
            addCriterion("room_no not between", value1, value2, "roomNo");
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

        public Criteria andRoomTypeIsNull() {
            addCriterion("room_type is null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIsNotNull() {
            addCriterion("room_type is not null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeEqualTo(String value) {
            addCriterion("room_type =", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotEqualTo(String value) {
            addCriterion("room_type <>", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeGreaterThan(String value) {
            addCriterion("room_type >", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeGreaterThanOrEqualTo(String value) {
            addCriterion("room_type >=", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLessThan(String value) {
            addCriterion("room_type <", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLessThanOrEqualTo(String value) {
            addCriterion("room_type <=", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLike(String value) {
            addCriterion("room_type like", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotLike(String value) {
            addCriterion("room_type not like", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIn(List<String> values) {
            addCriterion("room_type in", values, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotIn(List<String> values) {
            addCriterion("room_type not in", values, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeBetween(String value1, String value2) {
            addCriterion("room_type between", value1, value2, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotBetween(String value1, String value2) {
            addCriterion("room_type not between", value1, value2, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomEarnestIsNull() {
            addCriterion("room_earnest is null");
            return (Criteria) this;
        }

        public Criteria andRoomEarnestIsNotNull() {
            addCriterion("room_earnest is not null");
            return (Criteria) this;
        }

        public Criteria andRoomEarnestEqualTo(Double value) {
            addCriterion("room_earnest =", value, "roomEarnest");
            return (Criteria) this;
        }

        public Criteria andRoomEarnestNotEqualTo(Double value) {
            addCriterion("room_earnest <>", value, "roomEarnest");
            return (Criteria) this;
        }

        public Criteria andRoomEarnestGreaterThan(Double value) {
            addCriterion("room_earnest >", value, "roomEarnest");
            return (Criteria) this;
        }

        public Criteria andRoomEarnestGreaterThanOrEqualTo(Double value) {
            addCriterion("room_earnest >=", value, "roomEarnest");
            return (Criteria) this;
        }

        public Criteria andRoomEarnestLessThan(Double value) {
            addCriterion("room_earnest <", value, "roomEarnest");
            return (Criteria) this;
        }

        public Criteria andRoomEarnestLessThanOrEqualTo(Double value) {
            addCriterion("room_earnest <=", value, "roomEarnest");
            return (Criteria) this;
        }

        public Criteria andRoomEarnestIn(List<Double> values) {
            addCriterion("room_earnest in", values, "roomEarnest");
            return (Criteria) this;
        }

        public Criteria andRoomEarnestNotIn(List<Double> values) {
            addCriterion("room_earnest not in", values, "roomEarnest");
            return (Criteria) this;
        }

        public Criteria andRoomEarnestBetween(Double value1, Double value2) {
            addCriterion("room_earnest between", value1, value2, "roomEarnest");
            return (Criteria) this;
        }

        public Criteria andRoomEarnestNotBetween(Double value1, Double value2) {
            addCriterion("room_earnest not between", value1, value2, "roomEarnest");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(Double value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(Double value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(Double value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(Double value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(Double value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(Double value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<Double> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<Double> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(Double value1, Double value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(Double value1, Double value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andActualEarnestIsNull() {
            addCriterion("actual_earnest is null");
            return (Criteria) this;
        }

        public Criteria andActualEarnestIsNotNull() {
            addCriterion("actual_earnest is not null");
            return (Criteria) this;
        }

        public Criteria andActualEarnestEqualTo(Double value) {
            addCriterion("actual_earnest =", value, "actualEarnest");
            return (Criteria) this;
        }

        public Criteria andActualEarnestNotEqualTo(Double value) {
            addCriterion("actual_earnest <>", value, "actualEarnest");
            return (Criteria) this;
        }

        public Criteria andActualEarnestGreaterThan(Double value) {
            addCriterion("actual_earnest >", value, "actualEarnest");
            return (Criteria) this;
        }

        public Criteria andActualEarnestGreaterThanOrEqualTo(Double value) {
            addCriterion("actual_earnest >=", value, "actualEarnest");
            return (Criteria) this;
        }

        public Criteria andActualEarnestLessThan(Double value) {
            addCriterion("actual_earnest <", value, "actualEarnest");
            return (Criteria) this;
        }

        public Criteria andActualEarnestLessThanOrEqualTo(Double value) {
            addCriterion("actual_earnest <=", value, "actualEarnest");
            return (Criteria) this;
        }

        public Criteria andActualEarnestIn(List<Double> values) {
            addCriterion("actual_earnest in", values, "actualEarnest");
            return (Criteria) this;
        }

        public Criteria andActualEarnestNotIn(List<Double> values) {
            addCriterion("actual_earnest not in", values, "actualEarnest");
            return (Criteria) this;
        }

        public Criteria andActualEarnestBetween(Double value1, Double value2) {
            addCriterion("actual_earnest between", value1, value2, "actualEarnest");
            return (Criteria) this;
        }

        public Criteria andActualEarnestNotBetween(Double value1, Double value2) {
            addCriterion("actual_earnest not between", value1, value2, "actualEarnest");
            return (Criteria) this;
        }

        public Criteria andIntroduceIsNull() {
            addCriterion("introduce is null");
            return (Criteria) this;
        }

        public Criteria andIntroduceIsNotNull() {
            addCriterion("introduce is not null");
            return (Criteria) this;
        }

        public Criteria andIntroduceEqualTo(String value) {
            addCriterion("introduce =", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotEqualTo(String value) {
            addCriterion("introduce <>", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceGreaterThan(String value) {
            addCriterion("introduce >", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("introduce >=", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLessThan(String value) {
            addCriterion("introduce <", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLessThanOrEqualTo(String value) {
            addCriterion("introduce <=", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLike(String value) {
            addCriterion("introduce like", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotLike(String value) {
            addCriterion("introduce not like", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceIn(List<String> values) {
            addCriterion("introduce in", values, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotIn(List<String> values) {
            addCriterion("introduce not in", values, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceBetween(String value1, String value2) {
            addCriterion("introduce between", value1, value2, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotBetween(String value1, String value2) {
            addCriterion("introduce not between", value1, value2, "introduce");
            return (Criteria) this;
        }

        public Criteria andRoomPicIsNull() {
            addCriterion("room_pic is null");
            return (Criteria) this;
        }

        public Criteria andRoomPicIsNotNull() {
            addCriterion("room_pic is not null");
            return (Criteria) this;
        }

        public Criteria andRoomPicEqualTo(String value) {
            addCriterion("room_pic =", value, "roomPic");
            return (Criteria) this;
        }

        public Criteria andRoomPicNotEqualTo(String value) {
            addCriterion("room_pic <>", value, "roomPic");
            return (Criteria) this;
        }

        public Criteria andRoomPicGreaterThan(String value) {
            addCriterion("room_pic >", value, "roomPic");
            return (Criteria) this;
        }

        public Criteria andRoomPicGreaterThanOrEqualTo(String value) {
            addCriterion("room_pic >=", value, "roomPic");
            return (Criteria) this;
        }

        public Criteria andRoomPicLessThan(String value) {
            addCriterion("room_pic <", value, "roomPic");
            return (Criteria) this;
        }

        public Criteria andRoomPicLessThanOrEqualTo(String value) {
            addCriterion("room_pic <=", value, "roomPic");
            return (Criteria) this;
        }

        public Criteria andRoomPicLike(String value) {
            addCriterion("room_pic like", value, "roomPic");
            return (Criteria) this;
        }

        public Criteria andRoomPicNotLike(String value) {
            addCriterion("room_pic not like", value, "roomPic");
            return (Criteria) this;
        }

        public Criteria andRoomPicIn(List<String> values) {
            addCriterion("room_pic in", values, "roomPic");
            return (Criteria) this;
        }

        public Criteria andRoomPicNotIn(List<String> values) {
            addCriterion("room_pic not in", values, "roomPic");
            return (Criteria) this;
        }

        public Criteria andRoomPicBetween(String value1, String value2) {
            addCriterion("room_pic between", value1, value2, "roomPic");
            return (Criteria) this;
        }

        public Criteria andRoomPicNotBetween(String value1, String value2) {
            addCriterion("room_pic not between", value1, value2, "roomPic");
            return (Criteria) this;
        }

        public Criteria andBedNumberIsNull() {
            addCriterion("bed_number is null");
            return (Criteria) this;
        }

        public Criteria andBedNumberIsNotNull() {
            addCriterion("bed_number is not null");
            return (Criteria) this;
        }

        public Criteria andBedNumberEqualTo(Integer value) {
            addCriterion("bed_number =", value, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andBedNumberNotEqualTo(Integer value) {
            addCriterion("bed_number <>", value, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andBedNumberGreaterThan(Integer value) {
            addCriterion("bed_number >", value, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andBedNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("bed_number >=", value, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andBedNumberLessThan(Integer value) {
            addCriterion("bed_number <", value, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andBedNumberLessThanOrEqualTo(Integer value) {
            addCriterion("bed_number <=", value, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andBedNumberIn(List<Integer> values) {
            addCriterion("bed_number in", values, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andBedNumberNotIn(List<Integer> values) {
            addCriterion("bed_number not in", values, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andBedNumberBetween(Integer value1, Integer value2) {
            addCriterion("bed_number between", value1, value2, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andBedNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("bed_number not between", value1, value2, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleNumIsNull() {
            addCriterion("people_num is null");
            return (Criteria) this;
        }

        public Criteria andPeopleNumIsNotNull() {
            addCriterion("people_num is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleNumEqualTo(Integer value) {
            addCriterion("people_num =", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumNotEqualTo(Integer value) {
            addCriterion("people_num <>", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumGreaterThan(Integer value) {
            addCriterion("people_num >", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("people_num >=", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumLessThan(Integer value) {
            addCriterion("people_num <", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumLessThanOrEqualTo(Integer value) {
            addCriterion("people_num <=", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumIn(List<Integer> values) {
            addCriterion("people_num in", values, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumNotIn(List<Integer> values) {
            addCriterion("people_num not in", values, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumBetween(Integer value1, Integer value2) {
            addCriterion("people_num between", value1, value2, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumNotBetween(Integer value1, Integer value2) {
            addCriterion("people_num not between", value1, value2, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andRoomAreaIsNull() {
            addCriterion("room_area is null");
            return (Criteria) this;
        }

        public Criteria andRoomAreaIsNotNull() {
            addCriterion("room_area is not null");
            return (Criteria) this;
        }

        public Criteria andRoomAreaEqualTo(Double value) {
            addCriterion("room_area =", value, "roomArea");
            return (Criteria) this;
        }

        public Criteria andRoomAreaNotEqualTo(Double value) {
            addCriterion("room_area <>", value, "roomArea");
            return (Criteria) this;
        }

        public Criteria andRoomAreaGreaterThan(Double value) {
            addCriterion("room_area >", value, "roomArea");
            return (Criteria) this;
        }

        public Criteria andRoomAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("room_area >=", value, "roomArea");
            return (Criteria) this;
        }

        public Criteria andRoomAreaLessThan(Double value) {
            addCriterion("room_area <", value, "roomArea");
            return (Criteria) this;
        }

        public Criteria andRoomAreaLessThanOrEqualTo(Double value) {
            addCriterion("room_area <=", value, "roomArea");
            return (Criteria) this;
        }

        public Criteria andRoomAreaIn(List<Double> values) {
            addCriterion("room_area in", values, "roomArea");
            return (Criteria) this;
        }

        public Criteria andRoomAreaNotIn(List<Double> values) {
            addCriterion("room_area not in", values, "roomArea");
            return (Criteria) this;
        }

        public Criteria andRoomAreaBetween(Double value1, Double value2) {
            addCriterion("room_area between", value1, value2, "roomArea");
            return (Criteria) this;
        }

        public Criteria andRoomAreaNotBetween(Double value1, Double value2) {
            addCriterion("room_area not between", value1, value2, "roomArea");
            return (Criteria) this;
        }

        public Criteria andBreakfastIsNull() {
            addCriterion("breakfast is null");
            return (Criteria) this;
        }

        public Criteria andBreakfastIsNotNull() {
            addCriterion("breakfast is not null");
            return (Criteria) this;
        }

        public Criteria andBreakfastEqualTo(Integer value) {
            addCriterion("breakfast =", value, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastNotEqualTo(Integer value) {
            addCriterion("breakfast <>", value, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastGreaterThan(Integer value) {
            addCriterion("breakfast >", value, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastGreaterThanOrEqualTo(Integer value) {
            addCriterion("breakfast >=", value, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastLessThan(Integer value) {
            addCriterion("breakfast <", value, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastLessThanOrEqualTo(Integer value) {
            addCriterion("breakfast <=", value, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastIn(List<Integer> values) {
            addCriterion("breakfast in", values, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastNotIn(List<Integer> values) {
            addCriterion("breakfast not in", values, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastBetween(Integer value1, Integer value2) {
            addCriterion("breakfast between", value1, value2, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastNotBetween(Integer value1, Integer value2) {
            addCriterion("breakfast not between", value1, value2, "breakfast");
            return (Criteria) this;
        }

        public Criteria andWifiIsNull() {
            addCriterion("wifi is null");
            return (Criteria) this;
        }

        public Criteria andWifiIsNotNull() {
            addCriterion("wifi is not null");
            return (Criteria) this;
        }

        public Criteria andWifiEqualTo(Integer value) {
            addCriterion("wifi =", value, "wifi");
            return (Criteria) this;
        }

        public Criteria andWifiNotEqualTo(Integer value) {
            addCriterion("wifi <>", value, "wifi");
            return (Criteria) this;
        }

        public Criteria andWifiGreaterThan(Integer value) {
            addCriterion("wifi >", value, "wifi");
            return (Criteria) this;
        }

        public Criteria andWifiGreaterThanOrEqualTo(Integer value) {
            addCriterion("wifi >=", value, "wifi");
            return (Criteria) this;
        }

        public Criteria andWifiLessThan(Integer value) {
            addCriterion("wifi <", value, "wifi");
            return (Criteria) this;
        }

        public Criteria andWifiLessThanOrEqualTo(Integer value) {
            addCriterion("wifi <=", value, "wifi");
            return (Criteria) this;
        }

        public Criteria andWifiIn(List<Integer> values) {
            addCriterion("wifi in", values, "wifi");
            return (Criteria) this;
        }

        public Criteria andWifiNotIn(List<Integer> values) {
            addCriterion("wifi not in", values, "wifi");
            return (Criteria) this;
        }

        public Criteria andWifiBetween(Integer value1, Integer value2) {
            addCriterion("wifi between", value1, value2, "wifi");
            return (Criteria) this;
        }

        public Criteria andWifiNotBetween(Integer value1, Integer value2) {
            addCriterion("wifi not between", value1, value2, "wifi");
            return (Criteria) this;
        }

        public Criteria andRoomWindowIsNull() {
            addCriterion("room_window is null");
            return (Criteria) this;
        }

        public Criteria andRoomWindowIsNotNull() {
            addCriterion("room_window is not null");
            return (Criteria) this;
        }

        public Criteria andRoomWindowEqualTo(Integer value) {
            addCriterion("room_window =", value, "roomWindow");
            return (Criteria) this;
        }

        public Criteria andRoomWindowNotEqualTo(Integer value) {
            addCriterion("room_window <>", value, "roomWindow");
            return (Criteria) this;
        }

        public Criteria andRoomWindowGreaterThan(Integer value) {
            addCriterion("room_window >", value, "roomWindow");
            return (Criteria) this;
        }

        public Criteria andRoomWindowGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_window >=", value, "roomWindow");
            return (Criteria) this;
        }

        public Criteria andRoomWindowLessThan(Integer value) {
            addCriterion("room_window <", value, "roomWindow");
            return (Criteria) this;
        }

        public Criteria andRoomWindowLessThanOrEqualTo(Integer value) {
            addCriterion("room_window <=", value, "roomWindow");
            return (Criteria) this;
        }

        public Criteria andRoomWindowIn(List<Integer> values) {
            addCriterion("room_window in", values, "roomWindow");
            return (Criteria) this;
        }

        public Criteria andRoomWindowNotIn(List<Integer> values) {
            addCriterion("room_window not in", values, "roomWindow");
            return (Criteria) this;
        }

        public Criteria andRoomWindowBetween(Integer value1, Integer value2) {
            addCriterion("room_window between", value1, value2, "roomWindow");
            return (Criteria) this;
        }

        public Criteria andRoomWindowNotBetween(Integer value1, Integer value2) {
            addCriterion("room_window not between", value1, value2, "roomWindow");
            return (Criteria) this;
        }

        public Criteria andBigBedIsNull() {
            addCriterion("big_bed is null");
            return (Criteria) this;
        }

        public Criteria andBigBedIsNotNull() {
            addCriterion("big_bed is not null");
            return (Criteria) this;
        }

        public Criteria andBigBedEqualTo(Integer value) {
            addCriterion("big_bed =", value, "bigBed");
            return (Criteria) this;
        }

        public Criteria andBigBedNotEqualTo(Integer value) {
            addCriterion("big_bed <>", value, "bigBed");
            return (Criteria) this;
        }

        public Criteria andBigBedGreaterThan(Integer value) {
            addCriterion("big_bed >", value, "bigBed");
            return (Criteria) this;
        }

        public Criteria andBigBedGreaterThanOrEqualTo(Integer value) {
            addCriterion("big_bed >=", value, "bigBed");
            return (Criteria) this;
        }

        public Criteria andBigBedLessThan(Integer value) {
            addCriterion("big_bed <", value, "bigBed");
            return (Criteria) this;
        }

        public Criteria andBigBedLessThanOrEqualTo(Integer value) {
            addCriterion("big_bed <=", value, "bigBed");
            return (Criteria) this;
        }

        public Criteria andBigBedIn(List<Integer> values) {
            addCriterion("big_bed in", values, "bigBed");
            return (Criteria) this;
        }

        public Criteria andBigBedNotIn(List<Integer> values) {
            addCriterion("big_bed not in", values, "bigBed");
            return (Criteria) this;
        }

        public Criteria andBigBedBetween(Integer value1, Integer value2) {
            addCriterion("big_bed between", value1, value2, "bigBed");
            return (Criteria) this;
        }

        public Criteria andBigBedNotBetween(Integer value1, Integer value2) {
            addCriterion("big_bed not between", value1, value2, "bigBed");
            return (Criteria) this;
        }

        public Criteria andRoomNumIsNull() {
            addCriterion("room_num is null");
            return (Criteria) this;
        }

        public Criteria andRoomNumIsNotNull() {
            addCriterion("room_num is not null");
            return (Criteria) this;
        }

        public Criteria andRoomNumEqualTo(Integer value) {
            addCriterion("room_num =", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumNotEqualTo(Integer value) {
            addCriterion("room_num <>", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumGreaterThan(Integer value) {
            addCriterion("room_num >", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_num >=", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumLessThan(Integer value) {
            addCriterion("room_num <", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumLessThanOrEqualTo(Integer value) {
            addCriterion("room_num <=", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumIn(List<Integer> values) {
            addCriterion("room_num in", values, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumNotIn(List<Integer> values) {
            addCriterion("room_num not in", values, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumBetween(Integer value1, Integer value2) {
            addCriterion("room_num between", value1, value2, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumNotBetween(Integer value1, Integer value2) {
            addCriterion("room_num not between", value1, value2, "roomNum");
            return (Criteria) this;
        }

        public Criteria andFreeRoomIsNull() {
            addCriterion("free_room is null");
            return (Criteria) this;
        }

        public Criteria andFreeRoomIsNotNull() {
            addCriterion("free_room is not null");
            return (Criteria) this;
        }

        public Criteria andFreeRoomEqualTo(Integer value) {
            addCriterion("free_room =", value, "freeRoom");
            return (Criteria) this;
        }

        public Criteria andFreeRoomNotEqualTo(Integer value) {
            addCriterion("free_room <>", value, "freeRoom");
            return (Criteria) this;
        }

        public Criteria andFreeRoomGreaterThan(Integer value) {
            addCriterion("free_room >", value, "freeRoom");
            return (Criteria) this;
        }

        public Criteria andFreeRoomGreaterThanOrEqualTo(Integer value) {
            addCriterion("free_room >=", value, "freeRoom");
            return (Criteria) this;
        }

        public Criteria andFreeRoomLessThan(Integer value) {
            addCriterion("free_room <", value, "freeRoom");
            return (Criteria) this;
        }

        public Criteria andFreeRoomLessThanOrEqualTo(Integer value) {
            addCriterion("free_room <=", value, "freeRoom");
            return (Criteria) this;
        }

        public Criteria andFreeRoomIn(List<Integer> values) {
            addCriterion("free_room in", values, "freeRoom");
            return (Criteria) this;
        }

        public Criteria andFreeRoomNotIn(List<Integer> values) {
            addCriterion("free_room not in", values, "freeRoom");
            return (Criteria) this;
        }

        public Criteria andFreeRoomBetween(Integer value1, Integer value2) {
            addCriterion("free_room between", value1, value2, "freeRoom");
            return (Criteria) this;
        }

        public Criteria andFreeRoomNotBetween(Integer value1, Integer value2) {
            addCriterion("free_room not between", value1, value2, "freeRoom");
            return (Criteria) this;
        }

        public Criteria andRoomTimeIsNull() {
            addCriterion("room_time is null");
            return (Criteria) this;
        }

        public Criteria andRoomTimeIsNotNull() {
            addCriterion("room_time is not null");
            return (Criteria) this;
        }

        public Criteria andRoomTimeEqualTo(Date value) {
            addCriterionForJDBCDate("room_time =", value, "roomTime");
            return (Criteria) this;
        }

        public Criteria andRoomTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("room_time <>", value, "roomTime");
            return (Criteria) this;
        }

        public Criteria andRoomTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("room_time >", value, "roomTime");
            return (Criteria) this;
        }

        public Criteria andRoomTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("room_time >=", value, "roomTime");
            return (Criteria) this;
        }

        public Criteria andRoomTimeLessThan(Date value) {
            addCriterionForJDBCDate("room_time <", value, "roomTime");
            return (Criteria) this;
        }

        public Criteria andRoomTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("room_time <=", value, "roomTime");
            return (Criteria) this;
        }

        public Criteria andRoomTimeIn(List<Date> values) {
            addCriterionForJDBCDate("room_time in", values, "roomTime");
            return (Criteria) this;
        }

        public Criteria andRoomTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("room_time not in", values, "roomTime");
            return (Criteria) this;
        }

        public Criteria andRoomTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("room_time between", value1, value2, "roomTime");
            return (Criteria) this;
        }

        public Criteria andRoomTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("room_time not between", value1, value2, "roomTime");
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