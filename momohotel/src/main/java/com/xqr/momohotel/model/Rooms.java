package com.xqr.momohotel.model;

import java.io.Serializable;
import java.util.Date;

public class Rooms implements Serializable {
    private Integer roomId;

    private String roomNo;

    private Integer hoteleId;

    private String roomName;

    private String roomType;

    private Double roomEarnest;

    private Double discount;

    private Double actualEarnest;

    private String introduce;

    private String roomPic;

    private Integer bedNumber;

    private Integer peopleNum;

    private Double roomArea;

    private Integer breakfast;

    private Integer wifi;

    private Integer roomWindow;

    private Integer bigBed;

    private Integer roomNum;

    private Integer freeRoom;

    private Date roomTime;

    private String remark1;

    private String remark2;

    private static final long serialVersionUID = 1L;

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public Integer getHoteleId() {
        return hoteleId;
    }

    public void setHoteleId(Integer hoteleId) {
        this.hoteleId = hoteleId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Double getRoomEarnest() {
        return roomEarnest;
    }

    public void setRoomEarnest(Double roomEarnest) {
        this.roomEarnest = roomEarnest;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getActualEarnest() {
        return actualEarnest;
    }

    public void setActualEarnest(Double actualEarnest) {
        this.actualEarnest = actualEarnest;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getRoomPic() {
        return roomPic;
    }

    public void setRoomPic(String roomPic) {
        this.roomPic = roomPic;
    }

    public Integer getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(Integer bedNumber) {
        this.bedNumber = bedNumber;
    }

    public Integer getPeopleNum() {
        return peopleNum;
    }

    public void setPeopleNum(Integer peopleNum) {
        this.peopleNum = peopleNum;
    }

    public Double getRoomArea() {
        return roomArea;
    }

    public void setRoomArea(Double roomArea) {
        this.roomArea = roomArea;
    }

    public Integer getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(Integer breakfast) {
        this.breakfast = breakfast;
    }

    public Integer getWifi() {
        return wifi;
    }

    public void setWifi(Integer wifi) {
        this.wifi = wifi;
    }

    public Integer getRoomWindow() {
        return roomWindow;
    }

    public void setRoomWindow(Integer roomWindow) {
        this.roomWindow = roomWindow;
    }

    public Integer getBigBed() {
        return bigBed;
    }

    public void setBigBed(Integer bigBed) {
        this.bigBed = bigBed;
    }

    public Integer getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(Integer roomNum) {
        this.roomNum = roomNum;
    }

    public Integer getFreeRoom() {
        return freeRoom;
    }

    public void setFreeRoom(Integer freeRoom) {
        this.freeRoom = freeRoom;
    }

    public Date getRoomTime() {
        return roomTime;
    }

    public void setRoomTime(Date roomTime) {
        this.roomTime = roomTime;
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
        sb.append(", roomId=").append(roomId);
        sb.append(", roomNo=").append(roomNo);
        sb.append(", hoteleId=").append(hoteleId);
        sb.append(", roomName=").append(roomName);
        sb.append(", roomType=").append(roomType);
        sb.append(", roomEarnest=").append(roomEarnest);
        sb.append(", discount=").append(discount);
        sb.append(", actualEarnest=").append(actualEarnest);
        sb.append(", introduce=").append(introduce);
        sb.append(", roomPic=").append(roomPic);
        sb.append(", bedNumber=").append(bedNumber);
        sb.append(", peopleNum=").append(peopleNum);
        sb.append(", roomArea=").append(roomArea);
        sb.append(", breakfast=").append(breakfast);
        sb.append(", wifi=").append(wifi);
        sb.append(", roomWindow=").append(roomWindow);
        sb.append(", bigBed=").append(bigBed);
        sb.append(", roomNum=").append(roomNum);
        sb.append(", freeRoom=").append(freeRoom);
        sb.append(", roomTime=").append(roomTime);
        sb.append(", remark1=").append(remark1);
        sb.append(", remark2=").append(remark2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}