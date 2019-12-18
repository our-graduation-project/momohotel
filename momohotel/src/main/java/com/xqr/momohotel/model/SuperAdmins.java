package com.xqr.momohotel.model;

import java.io.Serializable;

public class SuperAdmins implements Serializable {
    private Integer superAdminId;

    private String superAdminNo;

    private String superAdminName;

    private String superAdminPassword;

    private String superAdminPhone;

    private String remark1;

    private String remark2;

    private static final long serialVersionUID = 1L;

    public Integer getSuperAdminId() {
        return superAdminId;
    }

    public void setSuperAdminId(Integer superAdminId) {
        this.superAdminId = superAdminId;
    }

    public String getSuperAdminNo() {
        return superAdminNo;
    }

    public void setSuperAdminNo(String superAdminNo) {
        this.superAdminNo = superAdminNo;
    }

    public String getSuperAdminName() {
        return superAdminName;
    }

    public void setSuperAdminName(String superAdminName) {
        this.superAdminName = superAdminName;
    }

    public String getSuperAdminPassword() {
        return superAdminPassword;
    }

    public void setSuperAdminPassword(String superAdminPassword) {
        this.superAdminPassword = superAdminPassword;
    }

    public String getSuperAdminPhone() {
        return superAdminPhone;
    }

    public void setSuperAdminPhone(String superAdminPhone) {
        this.superAdminPhone = superAdminPhone;
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
        sb.append(", superAdminId=").append(superAdminId);
        sb.append(", superAdminNo=").append(superAdminNo);
        sb.append(", superAdminName=").append(superAdminName);
        sb.append(", superAdminPassword=").append(superAdminPassword);
        sb.append(", superAdminPhone=").append(superAdminPhone);
        sb.append(", remark1=").append(remark1);
        sb.append(", remark2=").append(remark2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}