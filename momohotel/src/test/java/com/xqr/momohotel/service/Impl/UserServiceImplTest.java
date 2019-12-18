package com.xqr.momohotel.service.Impl;

import com.xqr.momohotel.MomohotelApplication;
import com.xqr.momohotel.model.Users;
import com.xqr.momohotel.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author whg
 * @date 2019/12/18 20:17
 **/

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MomohotelApplication.class)
class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    void selectUser() {

        System.out.println(userService.selectUser(0, 5));
    }

    @Test
    void addUser() {

        for (int i = 0; i < 10; i++) {
            System.out.println(userService.addUser(new Users(i, "i" + i, "whg" + 1, "1520030021" + i)));
        }

    }

    @Test
    void deleteUser() {

        System.out.println(userService.deleteUser(16));
    }

    @Test
    void seletUserById() {
        System.out.println(userService.seletUserById(16));
    }

    @Test
    void selectUserByPhone() {
        System.out.println(userService.selectUserByPhone("15200300215"));
    }
}