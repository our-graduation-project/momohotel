package com.xqr.momohotel.service.Impl;

import com.xqr.momohotel.MomohotelApplication;
import com.xqr.momohotel.dao.SuperAdminsMapper;
import com.xqr.momohotel.model.SuperAdmins;
import com.xqr.momohotel.service.SuperAdminService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: Zxw
 * @Description:
 * @Date: Created in 20:13 2019/12/18
 * @Modifued By:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MomohotelApplication.class)
class SuperAdminServiceImplTest {

    @Autowired
    private SuperAdminService superAdminService;

    @Test
    void addSuperAdmin() {
        SuperAdmins superAdmins = new SuperAdmins();
        superAdmins.setSuperAdminPassword("123");
        superAdmins.setSuperAdminName("zxw");
        superAdmins.setSuperAdminNo("123");
        superAdmins.setSuperAdminPhone("15697404466");
        int i = superAdminService.addSuperAdmin(superAdmins);
        System.out.println("i----------------"+i);

    }

    @Test
    void updatePassword() {
        int i = superAdminService.updatePassword("123", "1234", 1);
        System.out.println("i----------------"+i);
    }

    @Test
    void login() {

        SuperAdmins superAdmins = superAdminService.login("zxw", "123");
        System.out.println(superAdmins);

    }
}