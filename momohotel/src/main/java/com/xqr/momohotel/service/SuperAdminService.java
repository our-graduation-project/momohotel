package com.xqr.momohotel.service;

import com.xqr.momohotel.model.SuperAdmins;

/**
 * @Description:
 * @Date: Created in 17:20 2019/12/18
 * @Modifued By:
 */
public interface SuperAdminService {

    /**
     * 添加平台管理员
     *
     * @param superAdmins 平台管理员
     * @return
     */
    int addSuperAdmin(SuperAdmins superAdmins);

    /**
     * 通过平台管理员id修改其密码
     *
     * @param oldPassword 平台管理员原密码
     * @param newPassword 平台管理员新密码
     * @param id 平台管理员id
     * @return
     */
    int updatePassword(String oldPassword,String newPassword,int id);

    /**
     * 通过平台管理员姓名和其密码进行登录
     *
     * @param name 平台管理员原密码
     * @param password 平台管理员新密码
     * @return
     */
    SuperAdmins login(String name,String password);

}
