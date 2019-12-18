package com.xqr.momohotel.service;

import com.github.pagehelper.PageInfo;
import com.xqr.momohotel.model.Users;

import java.util.List;

/**
 * @author whg
 * @date 2019/12/18 19:15
 **/
public interface UserService {

    /**
     * 通过页码与每页的大小查询用户
     * @param pageNum
     * @param limit
     * @return
     */
    PageInfo<Users> selectUser(int pageNum, int limit);

    /**
     * 添加用户
     * @param user
     * @return
     */
    int addUser(Users user);

    /**
     * 通过id删除用户
     * @param userId
     * @return
     */
    int deleteUser(int userId);

    /**
     * 通过id查询用户
     * @param userId
     * @return
     */
    Users seletUserById(int userId);

    /**
     * 搜索用户通过电话
     * @param phone
     * @return
     */
    Users selectUserByPhone(String phone);
}
