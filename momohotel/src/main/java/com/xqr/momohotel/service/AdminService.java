package com.xqr.momohotel.service;

import com.github.pagehelper.PageInfo;
import com.xqr.momohotel.model.Admins;

import java.util.List;

/**
 * @Description:
 * @Date: Created in 17:06 2019/12/18
 * @Modifued By:
 */
public interface AdminService {


    /**
     * 管理员登录验证
     *
     * @param adminName 管理员姓名
     * @param adminPassword 管理员密码
     * @return
     */
    Admins login(String adminName, String adminPassword);

    /**
     * 管理员增加
     *
     * @param admins 管理员
     * @return
     */
    int addAdmin(Admins admins);

    /**
     * 管理员增加
     *
     * @param indexPage 页码
     * @param pageSize 分页大小
     * @return
     */
    PageInfo searchAdmins(int indexPage,int pageSize);

    /**
     * 通过管理员id查询管理员
     *
     * @param adminId 页码
     * @return
     */
    Admins searchByIdAdmin(int adminId);

    /**
     * 批量增加管理员
     *
     * @param adminsList 管理员列表
     * @return
     */
    int addBatch(List<Admins> adminsList);

    /**
     * 管理员修改密码
     *
     * @param adminId 管理员id
     * @param adminPassword 管理员原密码
     * @param newPwd 管理员修改后密码
     * @return
     */
    int updatePwd(int adminId,String adminPassword,String newPwd);


    /**
     * 通过管理员名模糊分页查询管理员
     *
     * @param name 管理员名
     * @param indexPage  页码
     * @param pageSize  分页大小
     * @return
     */
    PageInfo searchAdminByName(String name,int indexPage,int pageSize);

    /**
     * 通过管理员编号查询管理员
     *
     * @param adminNo 管理员编号
     * @return
     */
    Admins searchAdminByNo(String adminNo);

    /**
     * 通过管理员id删除管理员
     *
     * @param adminId 管理员id
     * @return
     */
    int deleteAdmin(int adminId);

}
