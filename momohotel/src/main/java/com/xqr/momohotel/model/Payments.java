package com.xqr.momohotel.model;

import java.io.Serializable;
import java.util.Date;

public class Payments implements Serializable {
    private Integer paymentId;

    private String paymentNo;

    private Double earnest;

    private Integer orderId;

    private Integer hoteleId;

    private Date paymentTime;

    private String remark1;

    private String remark2;

    private static final long serialVersionUID = 1L;

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentNo() {
        return paymentNo;
    }

    public void setPaymentNo(String paymentNo) {
        this.paymentNo = paymentNo;
    }

    public Double getEarnest() {
        return earnest;
    }

    public void setEarnest(Double earnest) {
        this.earnest = earnest;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getHoteleId() {
        return hoteleId;
    }

    public void setHoteleId(Integer hoteleId) {
        this.hoteleId = hoteleId;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
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
        sb.append(", paymentId=").append(paymentId);
        sb.append(", paymentNo=").append(paymentNo);
        sb.append(", earnest=").append(earnest);
        sb.append(", orderId=").append(orderId);
        sb.append(", hoteleId=").append(hoteleId);
        sb.append(", paymentTime=").append(paymentTime);
        sb.append(", remark1=").append(remark1);
        sb.append(", remark2=").append(remark2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}