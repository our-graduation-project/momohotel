package com.xqr.momohotel.service;

import com.xqr.momohotel.MomohotelApplication;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 向清润
 * @createTime 2019.12.18.10:49
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MomohotelApplication.class)
class testServiceTest {

    @Autowired
    private TestService testService;

    @Test
    void addAdmin() {
        int i = testService.addAdmin();
        System.out.println("i_____________"+i);
    }
}