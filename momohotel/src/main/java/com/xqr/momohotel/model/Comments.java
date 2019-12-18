package com.xqr.momohotel.model;

import java.io.Serializable;
import java.util.Date;

public class Comments implements Serializable {

    public Comments() {
    }

    public Comments(Integer commentId, String commentNo, String commentData, Integer hoteleId, String userName, String userPhine, Date commentTime, String remark1, String remark2) {
        this.commentId = commentId;
        this.commentNo = commentNo;
        this.commentData = commentData;
        this.hoteleId = hoteleId;
        this.userName = userName;
        this.userPhine = userPhine;
        this.commentTime = commentTime;
        this.remark1 = remark1;
        this.remark2 = remark2;
    }

    public Comments(Integer commentId, String commentNo, String commentData, Integer hoteleId, String userName, String userPhine, Date commentTime) {
        this.commentId = commentId;
        this.commentNo = commentNo;
        this.commentData = commentData;
        this.hoteleId = hoteleId;
        this.userName = userName;
        this.userPhine = userPhine;
        this.commentTime = commentTime;
    }

    private Integer commentId;

    private String commentNo;

    private String commentData;

    private Integer hoteleId;

    private String userName;

    private String userPhine;

    private Date commentTime;

    private String remark1;

    private String remark2;

    private static final long serialVersionUID = 1L;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getCommentNo() {
        return commentNo;
    }

    public void setCommentNo(String commentNo) {
        this.commentNo = commentNo;
    }

    public String getCommentData() {
        return commentData;
    }

    public void setCommentData(String commentData) {
        this.commentData = commentData;
    }

    public Integer getHoteleId() {
        return hoteleId;
    }

    public void setHoteleId(Integer hoteleId) {
        this.hoteleId = hoteleId;
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

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
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
        sb.append(", commentId=").append(commentId);
        sb.append(", commentNo=").append(commentNo);
        sb.append(", commentData=").append(commentData);
        sb.append(", hoteleId=").append(hoteleId);
        sb.append(", userName=").append(userName);
        sb.append(", userPhine=").append(userPhine);
        sb.append(", commentTime=").append(commentTime);
        sb.append(", remark1=").append(remark1);
        sb.append(", remark2=").append(remark2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}