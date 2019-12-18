package com.xqr.momohotel.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HotelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HotelExample() {
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

        public Criteria andHotelIdIsNull() {
            addCriterion("hotel_id is null");
            return (Criteria) this;
        }

        public Criteria andHotelIdIsNotNull() {
            addCriterion("hotel_id is not null");
            return (Criteria) this;
        }

        public Criteria andHotelIdEqualTo(Integer value) {
            addCriterion("hotel_id =", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdNotEqualTo(Integer value) {
            addCriterion("hotel_id <>", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdGreaterThan(Integer value) {
            addCriterion("hotel_id >", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotel_id >=", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdLessThan(Integer value) {
            addCriterion("hotel_id <", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdLessThanOrEqualTo(Integer value) {
            addCriterion("hotel_id <=", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdIn(List<Integer> values) {
            addCriterion("hotel_id in", values, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdNotIn(List<Integer> values) {
            addCriterion("hotel_id not in", values, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdBetween(Integer value1, Integer value2) {
            addCriterion("hotel_id between", value1, value2, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hotel_id not between", value1, value2, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelNoIsNull() {
            addCriterion("hotel_no is null");
            return (Criteria) this;
        }

        public Criteria andHotelNoIsNotNull() {
            addCriterion("hotel_no is not null");
            return (Criteria) this;
        }

        public Criteria andHotelNoEqualTo(String value) {
            addCriterion("hotel_no =", value, "hotelNo");
            return (Criteria) this;
        }

        public Criteria andHotelNoNotEqualTo(String value) {
            addCriterion("hotel_no <>", value, "hotelNo");
            return (Criteria) this;
        }

        public Criteria andHotelNoGreaterThan(String value) {
            addCriterion("hotel_no >", value, "hotelNo");
            return (Criteria) this;
        }

        public Criteria andHotelNoGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_no >=", value, "hotelNo");
            return (Criteria) this;
        }

        public Criteria andHotelNoLessThan(String value) {
            addCriterion("hotel_no <", value, "hotelNo");
            return (Criteria) this;
        }

        public Criteria andHotelNoLessThanOrEqualTo(String value) {
            addCriterion("hotel_no <=", value, "hotelNo");
            return (Criteria) this;
        }

        public Criteria andHotelNoLike(String value) {
            addCriterion("hotel_no like", value, "hotelNo");
            return (Criteria) this;
        }

        public Criteria andHotelNoNotLike(String value) {
            addCriterion("hotel_no not like", value, "hotelNo");
            return (Criteria) this;
        }

        public Criteria andHotelNoIn(List<String> values) {
            addCriterion("hotel_no in", values, "hotelNo");
            return (Criteria) this;
        }

        public Criteria andHotelNoNotIn(List<String> values) {
            addCriterion("hotel_no not in", values, "hotelNo");
            return (Criteria) this;
        }

        public Criteria andHotelNoBetween(String value1, String value2) {
            addCriterion("hotel_no between", value1, value2, "hotelNo");
            return (Criteria) this;
        }

        public Criteria andHotelNoNotBetween(String value1, String value2) {
            addCriterion("hotel_no not between", value1, value2, "hotelNo");
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

        public Criteria andHotelPicIsNull() {
            addCriterion("hotel_pic is null");
            return (Criteria) this;
        }

        public Criteria andHotelPicIsNotNull() {
            addCriterion("hotel_pic is not null");
            return (Criteria) this;
        }

        public Criteria andHotelPicEqualTo(String value) {
            addCriterion("hotel_pic =", value, "hotelPic");
            return (Criteria) this;
        }

        public Criteria andHotelPicNotEqualTo(String value) {
            addCriterion("hotel_pic <>", value, "hotelPic");
            return (Criteria) this;
        }

        public Criteria andHotelPicGreaterThan(String value) {
            addCriterion("hotel_pic >", value, "hotelPic");
            return (Criteria) this;
        }

        public Criteria andHotelPicGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_pic >=", value, "hotelPic");
            return (Criteria) this;
        }

        public Criteria andHotelPicLessThan(String value) {
            addCriterion("hotel_pic <", value, "hotelPic");
            return (Criteria) this;
        }

        public Criteria andHotelPicLessThanOrEqualTo(String value) {
            addCriterion("hotel_pic <=", value, "hotelPic");
            return (Criteria) this;
        }

        public Criteria andHotelPicLike(String value) {
            addCriterion("hotel_pic like", value, "hotelPic");
            return (Criteria) this;
        }

        public Criteria andHotelPicNotLike(String value) {
            addCriterion("hotel_pic not like", value, "hotelPic");
            return (Criteria) this;
        }

        public Criteria andHotelPicIn(List<String> values) {
            addCriterion("hotel_pic in", values, "hotelPic");
            return (Criteria) this;
        }

        public Criteria andHotelPicNotIn(List<String> values) {
            addCriterion("hotel_pic not in", values, "hotelPic");
            return (Criteria) this;
        }

        public Criteria andHotelPicBetween(String value1, String value2) {
            addCriterion("hotel_pic between", value1, value2, "hotelPic");
            return (Criteria) this;
        }

        public Criteria andHotelPicNotBetween(String value1, String value2) {
            addCriterion("hotel_pic not between", value1, value2, "hotelPic");
            return (Criteria) this;
        }

        public Criteria andRegionIdIsNull() {
            addCriterion("region_id is null");
            return (Criteria) this;
        }

        public Criteria andRegionIdIsNotNull() {
            addCriterion("region_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegionIdEqualTo(Integer value) {
            addCriterion("region_id =", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotEqualTo(Integer value) {
            addCriterion("region_id <>", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdGreaterThan(Integer value) {
            addCriterion("region_id >", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("region_id >=", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLessThan(Integer value) {
            addCriterion("region_id <", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLessThanOrEqualTo(Integer value) {
            addCriterion("region_id <=", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdIn(List<Integer> values) {
            addCriterion("region_id in", values, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotIn(List<Integer> values) {
            addCriterion("region_id not in", values, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdBetween(Integer value1, Integer value2) {
            addCriterion("region_id between", value1, value2, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("region_id not between", value1, value2, "regionId");
            return (Criteria) this;
        }

        public Criteria andHotelDataIsNull() {
            addCriterion("Hotel_data is null");
            return (Criteria) this;
        }

        public Criteria andHotelDataIsNotNull() {
            addCriterion("Hotel_data is not null");
            return (Criteria) this;
        }

        public Criteria andHotelDataEqualTo(String value) {
            addCriterion("Hotel_data =", value, "hotelData");
            return (Criteria) this;
        }

        public Criteria andHotelDataNotEqualTo(String value) {
            addCriterion("Hotel_data <>", value, "hotelData");
            return (Criteria) this;
        }

        public Criteria andHotelDataGreaterThan(String value) {
            addCriterion("Hotel_data >", value, "hotelData");
            return (Criteria) this;
        }

        public Criteria andHotelDataGreaterThanOrEqualTo(String value) {
            addCriterion("Hotel_data >=", value, "hotelData");
            return (Criteria) this;
        }

        public Criteria andHotelDataLessThan(String value) {
            addCriterion("Hotel_data <", value, "hotelData");
            return (Criteria) this;
        }

        public Criteria andHotelDataLessThanOrEqualTo(String value) {
            addCriterion("Hotel_data <=", value, "hotelData");
            return (Criteria) this;
        }

        public Criteria andHotelDataLike(String value) {
            addCriterion("Hotel_data like", value, "hotelData");
            return (Criteria) this;
        }

        public Criteria andHotelDataNotLike(String value) {
            addCriterion("Hotel_data not like", value, "hotelData");
            return (Criteria) this;
        }

        public Criteria andHotelDataIn(List<String> values) {
            addCriterion("Hotel_data in", values, "hotelData");
            return (Criteria) this;
        }

        public Criteria andHotelDataNotIn(List<String> values) {
            addCriterion("Hotel_data not in", values, "hotelData");
            return (Criteria) this;
        }

        public Criteria andHotelDataBetween(String value1, String value2) {
            addCriterion("Hotel_data between", value1, value2, "hotelData");
            return (Criteria) this;
        }

        public Criteria andHotelDataNotBetween(String value1, String value2) {
            addCriterion("Hotel_data not between", value1, value2, "hotelData");
            return (Criteria) this;
        }

        public Criteria andHotelAddressIsNull() {
            addCriterion("hotel_address is null");
            return (Criteria) this;
        }

        public Criteria andHotelAddressIsNotNull() {
            addCriterion("hotel_address is not null");
            return (Criteria) this;
        }

        public Criteria andHotelAddressEqualTo(String value) {
            addCriterion("hotel_address =", value, "hotelAddress");
            return (Criteria) this;
        }

        public Criteria andHotelAddressNotEqualTo(String value) {
            addCriterion("hotel_address <>", value, "hotelAddress");
            return (Criteria) this;
        }

        public Criteria andHotelAddressGreaterThan(String value) {
            addCriterion("hotel_address >", value, "hotelAddress");
            return (Criteria) this;
        }

        public Criteria andHotelAddressGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_address >=", value, "hotelAddress");
            return (Criteria) this;
        }

        public Criteria andHotelAddressLessThan(String value) {
            addCriterion("hotel_address <", value, "hotelAddress");
            return (Criteria) this;
        }

        public Criteria andHotelAddressLessThanOrEqualTo(String value) {
            addCriterion("hotel_address <=", value, "hotelAddress");
            return (Criteria) this;
        }

        public Criteria andHotelAddressLike(String value) {
            addCriterion("hotel_address like", value, "hotelAddress");
            return (Criteria) this;
        }

        public Criteria andHotelAddressNotLike(String value) {
            addCriterion("hotel_address not like", value, "hotelAddress");
            return (Criteria) this;
        }

        public Criteria andHotelAddressIn(List<String> values) {
            addCriterion("hotel_address in", values, "hotelAddress");
            return (Criteria) this;
        }

        public Criteria andHotelAddressNotIn(List<String> values) {
            addCriterion("hotel_address not in", values, "hotelAddress");
            return (Criteria) this;
        }

        public Criteria andHotelAddressBetween(String value1, String value2) {
            addCriterion("hotel_address between", value1, value2, "hotelAddress");
            return (Criteria) this;
        }

        public Criteria andHotelAddressNotBetween(String value1, String value2) {
            addCriterion("hotel_address not between", value1, value2, "hotelAddress");
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

        public Criteria andRoomNumberEqualTo(Integer value) {
            addCriterion("room_number =", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberNotEqualTo(Integer value) {
            addCriterion("room_number <>", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberGreaterThan(Integer value) {
            addCriterion("room_number >", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_number >=", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberLessThan(Integer value) {
            addCriterion("room_number <", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberLessThanOrEqualTo(Integer value) {
            addCriterion("room_number <=", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberIn(List<Integer> values) {
            addCriterion("room_number in", values, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberNotIn(List<Integer> values) {
            addCriterion("room_number not in", values, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberBetween(Integer value1, Integer value2) {
            addCriterion("room_number between", value1, value2, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("room_number not between", value1, value2, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andParkinglotIsNull() {
            addCriterion("parkingLot is null");
            return (Criteria) this;
        }

        public Criteria andParkinglotIsNotNull() {
            addCriterion("parkingLot is not null");
            return (Criteria) this;
        }

        public Criteria andParkinglotEqualTo(Integer value) {
            addCriterion("parkingLot =", value, "parkinglot");
            return (Criteria) this;
        }

        public Criteria andParkinglotNotEqualTo(Integer value) {
            addCriterion("parkingLot <>", value, "parkinglot");
            return (Criteria) this;
        }

        public Criteria andParkinglotGreaterThan(Integer value) {
            addCriterion("parkingLot >", value, "parkinglot");
            return (Criteria) this;
        }

        public Criteria andParkinglotGreaterThanOrEqualTo(Integer value) {
            addCriterion("parkingLot >=", value, "parkinglot");
            return (Criteria) this;
        }

        public Criteria andParkinglotLessThan(Integer value) {
            addCriterion("parkingLot <", value, "parkinglot");
            return (Criteria) this;
        }

        public Criteria andParkinglotLessThanOrEqualTo(Integer value) {
            addCriterion("parkingLot <=", value, "parkinglot");
            return (Criteria) this;
        }

        public Criteria andParkinglotIn(List<Integer> values) {
            addCriterion("parkingLot in", values, "parkinglot");
            return (Criteria) this;
        }

        public Criteria andParkinglotNotIn(List<Integer> values) {
            addCriterion("parkingLot not in", values, "parkinglot");
            return (Criteria) this;
        }

        public Criteria andParkinglotBetween(Integer value1, Integer value2) {
            addCriterion("parkingLot between", value1, value2, "parkinglot");
            return (Criteria) this;
        }

        public Criteria andParkinglotNotBetween(Integer value1, Integer value2) {
            addCriterion("parkingLot not between", value1, value2, "parkinglot");
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

        public Criteria andWakeIsNull() {
            addCriterion("wake is null");
            return (Criteria) this;
        }

        public Criteria andWakeIsNotNull() {
            addCriterion("wake is not null");
            return (Criteria) this;
        }

        public Criteria andWakeEqualTo(Integer value) {
            addCriterion("wake =", value, "wake");
            return (Criteria) this;
        }

        public Criteria andWakeNotEqualTo(Integer value) {
            addCriterion("wake <>", value, "wake");
            return (Criteria) this;
        }

        public Criteria andWakeGreaterThan(Integer value) {
            addCriterion("wake >", value, "wake");
            return (Criteria) this;
        }

        public Criteria andWakeGreaterThanOrEqualTo(Integer value) {
            addCriterion("wake >=", value, "wake");
            return (Criteria) this;
        }

        public Criteria andWakeLessThan(Integer value) {
            addCriterion("wake <", value, "wake");
            return (Criteria) this;
        }

        public Criteria andWakeLessThanOrEqualTo(Integer value) {
            addCriterion("wake <=", value, "wake");
            return (Criteria) this;
        }

        public Criteria andWakeIn(List<Integer> values) {
            addCriterion("wake in", values, "wake");
            return (Criteria) this;
        }

        public Criteria andWakeNotIn(List<Integer> values) {
            addCriterion("wake not in", values, "wake");
            return (Criteria) this;
        }

        public Criteria andWakeBetween(Integer value1, Integer value2) {
            addCriterion("wake between", value1, value2, "wake");
            return (Criteria) this;
        }

        public Criteria andWakeNotBetween(Integer value1, Integer value2) {
            addCriterion("wake not between", value1, value2, "wake");
            return (Criteria) this;
        }

        public Criteria andDepositIsNull() {
            addCriterion("deposit is null");
            return (Criteria) this;
        }

        public Criteria andDepositIsNotNull() {
            addCriterion("deposit is not null");
            return (Criteria) this;
        }

        public Criteria andDepositEqualTo(Integer value) {
            addCriterion("deposit =", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotEqualTo(Integer value) {
            addCriterion("deposit <>", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThan(Integer value) {
            addCriterion("deposit >", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThanOrEqualTo(Integer value) {
            addCriterion("deposit >=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThan(Integer value) {
            addCriterion("deposit <", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThanOrEqualTo(Integer value) {
            addCriterion("deposit <=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositIn(List<Integer> values) {
            addCriterion("deposit in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotIn(List<Integer> values) {
            addCriterion("deposit not in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositBetween(Integer value1, Integer value2) {
            addCriterion("deposit between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotBetween(Integer value1, Integer value2) {
            addCriterion("deposit not between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andRestaurantIsNull() {
            addCriterion("restaurant is null");
            return (Criteria) this;
        }

        public Criteria andRestaurantIsNotNull() {
            addCriterion("restaurant is not null");
            return (Criteria) this;
        }

        public Criteria andRestaurantEqualTo(Integer value) {
            addCriterion("restaurant =", value, "restaurant");
            return (Criteria) this;
        }

        public Criteria andRestaurantNotEqualTo(Integer value) {
            addCriterion("restaurant <>", value, "restaurant");
            return (Criteria) this;
        }

        public Criteria andRestaurantGreaterThan(Integer value) {
            addCriterion("restaurant >", value, "restaurant");
            return (Criteria) this;
        }

        public Criteria andRestaurantGreaterThanOrEqualTo(Integer value) {
            addCriterion("restaurant >=", value, "restaurant");
            return (Criteria) this;
        }

        public Criteria andRestaurantLessThan(Integer value) {
            addCriterion("restaurant <", value, "restaurant");
            return (Criteria) this;
        }

        public Criteria andRestaurantLessThanOrEqualTo(Integer value) {
            addCriterion("restaurant <=", value, "restaurant");
            return (Criteria) this;
        }

        public Criteria andRestaurantIn(List<Integer> values) {
            addCriterion("restaurant in", values, "restaurant");
            return (Criteria) this;
        }

        public Criteria andRestaurantNotIn(List<Integer> values) {
            addCriterion("restaurant not in", values, "restaurant");
            return (Criteria) this;
        }

        public Criteria andRestaurantBetween(Integer value1, Integer value2) {
            addCriterion("restaurant between", value1, value2, "restaurant");
            return (Criteria) this;
        }

        public Criteria andRestaurantNotBetween(Integer value1, Integer value2) {
            addCriterion("restaurant not between", value1, value2, "restaurant");
            return (Criteria) this;
        }

        public Criteria andLiftIsNull() {
            addCriterion("lift is null");
            return (Criteria) this;
        }

        public Criteria andLiftIsNotNull() {
            addCriterion("lift is not null");
            return (Criteria) this;
        }

        public Criteria andLiftEqualTo(Integer value) {
            addCriterion("lift =", value, "lift");
            return (Criteria) this;
        }

        public Criteria andLiftNotEqualTo(Integer value) {
            addCriterion("lift <>", value, "lift");
            return (Criteria) this;
        }

        public Criteria andLiftGreaterThan(Integer value) {
            addCriterion("lift >", value, "lift");
            return (Criteria) this;
        }

        public Criteria andLiftGreaterThanOrEqualTo(Integer value) {
            addCriterion("lift >=", value, "lift");
            return (Criteria) this;
        }

        public Criteria andLiftLessThan(Integer value) {
            addCriterion("lift <", value, "lift");
            return (Criteria) this;
        }

        public Criteria andLiftLessThanOrEqualTo(Integer value) {
            addCriterion("lift <=", value, "lift");
            return (Criteria) this;
        }

        public Criteria andLiftIn(List<Integer> values) {
            addCriterion("lift in", values, "lift");
            return (Criteria) this;
        }

        public Criteria andLiftNotIn(List<Integer> values) {
            addCriterion("lift not in", values, "lift");
            return (Criteria) this;
        }

        public Criteria andLiftBetween(Integer value1, Integer value2) {
            addCriterion("lift between", value1, value2, "lift");
            return (Criteria) this;
        }

        public Criteria andLiftNotBetween(Integer value1, Integer value2) {
            addCriterion("lift not between", value1, value2, "lift");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterionForJDBCDate("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterionForJDBCDate("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterionForJDBCDate("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeAgreeIsNull() {
            addCriterion("time_agree is null");
            return (Criteria) this;
        }

        public Criteria andTimeAgreeIsNotNull() {
            addCriterion("time_agree is not null");
            return (Criteria) this;
        }

        public Criteria andTimeAgreeEqualTo(Date value) {
            addCriterionForJDBCDate("time_agree =", value, "timeAgree");
            return (Criteria) this;
        }

        public Criteria andTimeAgreeNotEqualTo(Date value) {
            addCriterionForJDBCDate("time_agree <>", value, "timeAgree");
            return (Criteria) this;
        }

        public Criteria andTimeAgreeGreaterThan(Date value) {
            addCriterionForJDBCDate("time_agree >", value, "timeAgree");
            return (Criteria) this;
        }

        public Criteria andTimeAgreeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time_agree >=", value, "timeAgree");
            return (Criteria) this;
        }

        public Criteria andTimeAgreeLessThan(Date value) {
            addCriterionForJDBCDate("time_agree <", value, "timeAgree");
            return (Criteria) this;
        }

        public Criteria andTimeAgreeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time_agree <=", value, "timeAgree");
            return (Criteria) this;
        }

        public Criteria andTimeAgreeIn(List<Date> values) {
            addCriterionForJDBCDate("time_agree in", values, "timeAgree");
            return (Criteria) this;
        }

        public Criteria andTimeAgreeNotIn(List<Date> values) {
            addCriterionForJDBCDate("time_agree not in", values, "timeAgree");
            return (Criteria) this;
        }

        public Criteria andTimeAgreeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time_agree between", value1, value2, "timeAgree");
            return (Criteria) this;
        }

        public Criteria andTimeAgreeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time_agree not between", value1, value2, "timeAgree");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIsNull() {
            addCriterion("business_License is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIsNotNull() {
            addCriterion("business_License is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseEqualTo(String value) {
            addCriterion("business_License =", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotEqualTo(String value) {
            addCriterion("business_License <>", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseGreaterThan(String value) {
            addCriterion("business_License >", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("business_License >=", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLessThan(String value) {
            addCriterion("business_License <", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLessThanOrEqualTo(String value) {
            addCriterion("business_License <=", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLike(String value) {
            addCriterion("business_License like", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotLike(String value) {
            addCriterion("business_License not like", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIn(List<String> values) {
            addCriterion("business_License in", values, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotIn(List<String> values) {
            addCriterion("business_License not in", values, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseBetween(String value1, String value2) {
            addCriterion("business_License between", value1, value2, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotBetween(String value1, String value2) {
            addCriterion("business_License not between", value1, value2, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNull() {
            addCriterion("legal_person is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNotNull() {
            addCriterion("legal_person is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonEqualTo(String value) {
            addCriterion("legal_person =", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotEqualTo(String value) {
            addCriterion("legal_person <>", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThan(String value) {
            addCriterion("legal_person >", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThanOrEqualTo(String value) {
            addCriterion("legal_person >=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThan(String value) {
            addCriterion("legal_person <", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThanOrEqualTo(String value) {
            addCriterion("legal_person <=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLike(String value) {
            addCriterion("legal_person like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotLike(String value) {
            addCriterion("legal_person not like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIn(List<String> values) {
            addCriterion("legal_person in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotIn(List<String> values) {
            addCriterion("legal_person not in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonBetween(String value1, String value2) {
            addCriterion("legal_person between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotBetween(String value1, String value2) {
            addCriterion("legal_person not between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdcardIsNull() {
            addCriterion("legal_person_idCard is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdcardIsNotNull() {
            addCriterion("legal_person_idCard is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdcardEqualTo(String value) {
            addCriterion("legal_person_idCard =", value, "legalPersonIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdcardNotEqualTo(String value) {
            addCriterion("legal_person_idCard <>", value, "legalPersonIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdcardGreaterThan(String value) {
            addCriterion("legal_person_idCard >", value, "legalPersonIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("legal_person_idCard >=", value, "legalPersonIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdcardLessThan(String value) {
            addCriterion("legal_person_idCard <", value, "legalPersonIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdcardLessThanOrEqualTo(String value) {
            addCriterion("legal_person_idCard <=", value, "legalPersonIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdcardLike(String value) {
            addCriterion("legal_person_idCard like", value, "legalPersonIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdcardNotLike(String value) {
            addCriterion("legal_person_idCard not like", value, "legalPersonIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdcardIn(List<String> values) {
            addCriterion("legal_person_idCard in", values, "legalPersonIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdcardNotIn(List<String> values) {
            addCriterion("legal_person_idCard not in", values, "legalPersonIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdcardBetween(String value1, String value2) {
            addCriterion("legal_person_idCard between", value1, value2, "legalPersonIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdcardNotBetween(String value1, String value2) {
            addCriterion("legal_person_idCard not between", value1, value2, "legalPersonIdcard");
            return (Criteria) this;
        }

        public Criteria andCardPicIsNull() {
            addCriterion("card_pic is null");
            return (Criteria) this;
        }

        public Criteria andCardPicIsNotNull() {
            addCriterion("card_pic is not null");
            return (Criteria) this;
        }

        public Criteria andCardPicEqualTo(String value) {
            addCriterion("card_pic =", value, "cardPic");
            return (Criteria) this;
        }

        public Criteria andCardPicNotEqualTo(String value) {
            addCriterion("card_pic <>", value, "cardPic");
            return (Criteria) this;
        }

        public Criteria andCardPicGreaterThan(String value) {
            addCriterion("card_pic >", value, "cardPic");
            return (Criteria) this;
        }

        public Criteria andCardPicGreaterThanOrEqualTo(String value) {
            addCriterion("card_pic >=", value, "cardPic");
            return (Criteria) this;
        }

        public Criteria andCardPicLessThan(String value) {
            addCriterion("card_pic <", value, "cardPic");
            return (Criteria) this;
        }

        public Criteria andCardPicLessThanOrEqualTo(String value) {
            addCriterion("card_pic <=", value, "cardPic");
            return (Criteria) this;
        }

        public Criteria andCardPicLike(String value) {
            addCriterion("card_pic like", value, "cardPic");
            return (Criteria) this;
        }

        public Criteria andCardPicNotLike(String value) {
            addCriterion("card_pic not like", value, "cardPic");
            return (Criteria) this;
        }

        public Criteria andCardPicIn(List<String> values) {
            addCriterion("card_pic in", values, "cardPic");
            return (Criteria) this;
        }

        public Criteria andCardPicNotIn(List<String> values) {
            addCriterion("card_pic not in", values, "cardPic");
            return (Criteria) this;
        }

        public Criteria andCardPicBetween(String value1, String value2) {
            addCriterion("card_pic between", value1, value2, "cardPic");
            return (Criteria) this;
        }

        public Criteria andCardPicNotBetween(String value1, String value2) {
            addCriterion("card_pic not between", value1, value2, "cardPic");
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