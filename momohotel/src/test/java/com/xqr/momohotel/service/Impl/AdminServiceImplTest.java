package com.xqr.momohotel.service.Impl;

import com.github.pagehelper.PageInfo;
import com.xqr.momohotel.MomohotelApplication;
import com.xqr.momohotel.model.Admins;
import com.xqr.momohotel.service.AdminService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: Zxw
 * @Description:
 * @Date: Created in 20:13 2019/12/18
 * @Modifued By:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MomohotelApplication.class)
class AdminServiceImplTest {

    @Autowired
    private AdminService adminService;


    @Test
    void addAdmin() {
        Admins admins = new Admins();
        admins.setAdminNo("1");
        admins.setAdminName("zxw");
        admins.setAdminPhone("15697404466");
        admins.setAdminPassword("123");
        admins.setHoteleId(1);
        int i = adminService.addAdmin(admins);
        System.out.println("i------------"+i);
    }



    @Test
    void login() {
        Admins zxw = adminService.login("zxw", "123");
        System.out.println(zxw);

    }


    @Test
    void searchAdmins() {
        PageInfo pageInfo = adminService.searchAdmins(1, 1);
        System.out.println(pageInfo);
    }

    @Test
    void searchByIdAdmin() {
        Admins admins = adminService.searchByIdAdmin(17);
        System.out.println(admins);
    }

    @Test
    void addBatch() {
        Admins admins = new Admins();
        admins.setAdminNo("30");
        admins.setAdminName("zzz");
        admins.setAdminPhone("1569745044");
        admins.setAdminPassword("123");
        admins.setHoteleId(1);
//        Admins admins1 = new Admins();
//        admins1.setAdminNo("3");
//        admins1.setAdminName("zz");
//        admins1.setAdminPhone("15697404");
//        admins1.setAdminPassword("123");
//        admins1.setHoteleId(1);
        List<Admins> admins2 = new ArrayList<>();
        admins2.add(admins);
//        admins2.add(admins1);
        int i = adminService.addBatch(admins2);
        System.out.println("i_------------"+i);
    }

    @Test
    void updatePwd() {
        int i = adminService.updatePwd(16, "123", "1234");
        System.out.println("i--------------"+i);
    }

    @Test
    void searchAdminByName() {
        PageInfo pageInfo = adminService.searchAdminByName("z", 1, 2);
        System.out.println(pageInfo);
    }

    @Test
    void searchAdminByNo() {
        Admins admins = adminService.searchAdminByNo("1");
        System.out.println(admins);
    }

    @Test
    void deleteAdmin() {
        int i = adminService.deleteAdmin(1);
        System.out.println("i------------"+i);
    }
}