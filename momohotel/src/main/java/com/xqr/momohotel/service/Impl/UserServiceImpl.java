package com.xqr.momohotel.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xqr.momohotel.dao.UsersMapper;
import com.xqr.momohotel.model.Users;
import com.xqr.momohotel.model.UsersExample;
import com.xqr.momohotel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author whg
 * @date 2019/12/18 19:41
 **/

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UsersMapper usersMapper;

    /**
     * 通过页码与每页的大小查询用户
     *
     * @param pageNum
     * @param limit
     * @return
     */
    @Override
    public PageInfo<Users> selectUser(int pageNum, int limit) {
        PageHelper.startPage(pageNum,limit);
        UsersExample usersExample = new UsersExample();
        List<Users> users = usersMapper.selectByExample(usersExample);
        PageInfo<Users> pageInfo = new PageInfo<>(users,5);
        return pageInfo;
    }

    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    @Override
    public int addUser(Users user) {
        if(user == null){
            return 0;
        }
        return usersMapper.insert(user);
    }

    /**
     * 通过id删除用户
     *
     * @param userId
     * @return
     */
    @Override
    public int deleteUser(int userId) {

        return usersMapper.deleteByPrimaryKey(userId);

    }

    /**
     * 通过id查询用户
     *
     * @param userId
     * @return
     */
    @Override
    public Users seletUserById(int userId) {
        Users users = usersMapper.selectByPrimaryKey(userId);
        return users;
    }

    /**
     * 通过电话搜索用户,没有则返回null
     *
     * @param phone
     * @return
     */
    @Override
    public Users selectUserByPhone(String phone) {
        UsersExample usersExample = new UsersExample();
        usersExample.or().andUserPhoneEqualTo(phone);
        List<Users> users = usersMapper.selectByExample(usersExample);
        if(users == null || users.isEmpty()){
            return null;
        }
        return users.get(0);
    }
}
