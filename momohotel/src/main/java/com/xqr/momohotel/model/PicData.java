package com.xqr.momohotel.model;

import java.io.Serializable;
import java.util.Date;

public class PicData implements Serializable {
    private Integer picId;

    private String picAddress;

    private Date picTime;

    private String individualNo;

    private String remark1;

    private String remark2;

    private static final long serialVersionUID = 1L;

    public Integer getPicId() {
        return picId;
    }

    public void setPicId(Integer picId) {
        this.picId = picId;
    }

    public String getPicAddress() {
        return picAddress;
    }

    public void setPicAddress(String picAddress) {
        this.picAddress = picAddress;
    }

    public Date getPicTime() {
        return picTime;
    }

    public void setPicTime(Date picTime) {
        this.picTime = picTime;
    }

    public String getIndividualNo() {
        return individualNo;
    }

    public void setIndividualNo(String individualNo) {
        this.individualNo = individualNo;
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
        sb.append(", picId=").append(picId);
        sb.append(", picAddress=").append(picAddress);
        sb.append(", picTime=").append(picTime);
        sb.append(", individualNo=").append(individualNo);
        sb.append(", remark1=").append(remark1);
        sb.append(", remark2=").append(remark2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}