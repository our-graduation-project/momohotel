package com.xqr.momohotel.model;

import java.io.Serializable;
import java.util.Date;

public class Orders implements Serializable {
    private Integer orderId;

    private String orderNo;

    private Integer hoteleId;

    private String hotelName;

    private String roomName;

    private Integer roomId;

    private String roomNumber;

    private Double earnest;

    private String userName;

    private String userPhine;

    private String userSex;

    private String checkinCode;

    private Date orderTime;

    private Date checkinTime;

    private Date completeTime;

    private Integer roderState;

    private String remark1;

    private String remark2;

    private static final long serialVersionUID = 1L;

    public Orders() {
    }

    public Orders(String orderNo, Integer hoteleId, String hotelName, String roomName, Integer roomId, String roomNumber, Double earnest, String userName, String userPhine, String userSex, String checkinCode, Date orderTime, Date checkinTime, Date completeTime, Integer roderState) {
        this.orderNo = orderNo;
        this.hoteleId = hoteleId;
        this.hotelName = hotelName;
        this.roomName = roomName;
        this.roomId = roomId;
        this.roomNumber = roomNumber;
        this.earnest = earnest;
        this.userName = userName;
        this.userPhine = userPhine;
        this.userSex = userSex;
        this.checkinCode = checkinCode;
        this.orderTime = orderTime;
        this.checkinTime = checkinTime;
        this.completeTime = completeTime;
        this.roderState = roderState;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getHoteleId() {
        return hoteleId;
    }

    public void setHoteleId(Integer hoteleId) {
        this.hoteleId = hoteleId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Double getEarnest() {
        return earnest;
    }

    public void setEarnest(Double earnest) {
        this.earnest = earnest;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhine() {
        return userPhine;
    }

    public void setUserPhine(String userPhine) {
        this.userPhine = userPhine;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getCheckinCode() {
        return checkinCode;
    }

    public void setCheckinCode(String checkinCode) {
        this.checkinCode = checkinCode;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getCheckinTime() {
        return checkinTime;
    }

    public void setCheckinTime(Date checkinTime) {
        this.checkinTime = checkinTime;
    }

    public Date getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(Date completeTime) {
        this.completeTime = completeTime;
    }

    public Integer getRoderState() {
        return roderState;
    }

    public void setRoderState(Integer roderState) {
        this.roderState = roderState;
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
        sb.append(", orderId=").append(orderId);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", hoteleId=").append(hoteleId);
        sb.append(", hotelName=").append(hotelName);
        sb.append(", roomName=").append(roomName);
        sb.append(", roomId=").append(roomId);
        sb.append(", roomNumber=").append(roomNumber);
        sb.append(", earnest=").append(earnest);
        sb.append(", userName=").append(userName);
        sb.append(", userPhine=").append(userPhine);
        sb.append(", userSex=").append(userSex);
        sb.append(", checkinCode=").append(checkinCode);
        sb.append(", orderTime=").append(orderTime);
        sb.append(", checkinTime=").append(checkinTime);
        sb.append(", completeTime=").append(completeTime);
        sb.append(", roderState=").append(roderState);
        sb.append(", remark1=").append(remark1);
        sb.append(", remark2=").append(remark2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}