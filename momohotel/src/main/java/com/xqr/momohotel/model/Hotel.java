package com.xqr.momohotel.model;

import java.io.Serializable;
import java.util.Date;

public class Hotel implements Serializable {
    private Integer hotelId;

    private String hotelNo;

    private String hotelName;

    private String hotelPic;

    private Integer regionId;

    private String hotelData;

    private String hotelAddress;

    private Integer roomNumber;

    private Integer parkinglot;

    private Integer wifi;

    private Integer wake;

    private Integer deposit;

    private Integer restaurant;

    private Integer lift;

    private Date time;

    private Date timeAgree;

    private String businessLicense;

    private String legalPerson;

    private String legalPersonIdcard;

    private String cardPic;

    private String remark1;

    private String remark2;

    private static final long serialVersionUID = 1L;

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelNo() {
        return hotelNo;
    }

    public void setHotelNo(String hotelNo) {
        this.hotelNo = hotelNo;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelPic() {
        return hotelPic;
    }

    public void setHotelPic(String hotelPic) {
        this.hotelPic = hotelPic;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public String getHotelData() {
        return hotelData;
    }

    public void setHotelData(String hotelData) {
        this.hotelData = hotelData;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Integer getParkinglot() {
        return parkinglot;
    }

    public void setParkinglot(Integer parkinglot) {
        this.parkinglot = parkinglot;
    }

    public Integer getWifi() {
        return wifi;
    }

    public void setWifi(Integer wifi) {
        this.wifi = wifi;
    }

    public Integer getWake() {
        return wake;
    }

    public void setWake(Integer wake) {
        this.wake = wake;
    }

    public Integer getDeposit() {
        return deposit;
    }

    public void setDeposit(Integer deposit) {
        this.deposit = deposit;
    }

    public Integer getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Integer restaurant) {
        this.restaurant = restaurant;
    }

    public Integer getLift() {
        return lift;
    }

    public void setLift(Integer lift) {
        this.lift = lift;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getTimeAgree() {
        return timeAgree;
    }

    public void setTimeAgree(Date timeAgree) {
        this.timeAgree = timeAgree;
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    public String getLegalPersonIdcard() {
        return legalPersonIdcard;
    }

    public void setLegalPersonIdcard(String legalPersonIdcard) {
        this.legalPersonIdcard = legalPersonIdcard;
    }

    public String getCardPic() {
        return cardPic;
    }

    public void setCardPic(String cardPic) {
        this.cardPic = cardPic;
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1;
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hotelId=").append(hotelId);
        sb.append(", hotelNo=").append(hotelNo);
        sb.append(", hotelName=").append(hotelName);
        sb.append(", hotelPic=").append(hotelPic);
        sb.append(", regionId=").append(regionId);
        sb.append(", hotelData=").append(hotelData);
        sb.append(", hotelAddress=").append(hotelAddress);
        sb.append(", roomNumber=").append(roomNumber);
        sb.append(", parkinglot=").append(parkinglot);
        sb.append(", wifi=").append(wifi);
        sb.append(", wake=").append(wake);
        sb.append(", deposit=").append(deposit);
        sb.append(", restaurant=").append(restaurant);
        sb.append(", lift=").append(lift);
        sb.append(", time=").append(time);
        sb.append(", timeAgree=").append(timeAgree);
        sb.append(", businessLicense=").append(businessLicense);
        sb.append(", legalPerson=").append(legalPerson);
        sb.append(", legalPersonIdcard=").append(legalPersonIdcard);
        sb.append(", cardPic=").append(cardPic);
        sb.append(", remark1=").append(remark1);
        sb.append(", remark2=").append(remark2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}