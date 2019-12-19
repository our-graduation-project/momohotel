package com.xqr.momohotel.service.Impl;

import com.xqr.momohotel.dao.SuperAdminsMapper;
import com.xqr.momohotel.model.SuperAdmins;
import com.xqr.momohotel.model.SuperAdminsExample;
import com.xqr.momohotel.service.SuperAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Date: Created in 17:34 2019/12/18
 * @Modifued By:
 */
@Service
public class SuperAdminServiceImpl implements SuperAdminService {

    @Autowired
    private SuperAdminsMapper superAdminsMapper;

    /**
     * 添加平台管理员
     *
     * @param superAdmins 平台管理员
     * @return
     */
    @Override
    public int addSuperAdmin(SuperAdmins superAdmins) {
        int insert = superAdminsMapper.insert(superAdmins);
        return insert;
    }

    /**
     * 通过平台管理员id修改其密码
     * 先查询原密码是否正确  然后在对其是否进行密码更新
     * @param oldPassword 平台管理员原密码
     * @param newPassword 平台管理员新密码
     * @param id          平台管理员id
     * @return
     */
    @Override
    public int updatePassword(String oldPassword, String newPassword, int id) {
        SuperAdmins superAdmins = superAdminsMapper.selectByPrimaryKey(id);
        String superAdminPassword = superAdmins.getSuperAdminPassword();
        if(!superAdminPassword.equals(oldPassword)){
            return 0;
        }
        SuperAdmins superAdmins1 = new SuperAdmins();
        superAdmins1.setSuperAdminPassword(newPassword);
        superAdmins1.setSuperAdminId(id);
        int i = superAdminsMapper.updateByPrimaryKeySelective(superAdmins1);

        return i;
    }

    /**
     * 通过平台管理员id修改其密码
     *
     * @param name     平台管理员原密码
     * @param password 平台管理员新密码
     * @return
     */
    @Override
    public SuperAdmins login(String name, String password) {

        SuperAdminsExample superAdminsExample = new SuperAdminsExample();

        superAdminsExample.or().andSuperAdminNameEqualTo(name)
                .andSuperAdminPasswordEqualTo(password);

        List<SuperAdmins> superAdmins = superAdminsMapper.selectByExample(superAdminsExample);

        if(superAdmins == null && superAdmins.size() != 1){
            return null;
        }

        return superAdmins.get(0);
    }
}