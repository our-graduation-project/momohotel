package com.xqr.momohotel.service.Impl;

import com.github.pagehelper.PageInfo;
import com.xqr.momohotel.MomohotelApplication;
import com.xqr.momohotel.model.Orders;
import com.xqr.momohotel.service.OrdersService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MomohotelApplication.class)
class OrdersServiceImplTest {

    @Autowired
    private OrdersService ordersService;
    @Test
    void deleteOrder() {
        System.out.println(ordersService.deleteOrder(1));
    }

    @Test
    void updateState(){
        int i = ordersService.updateState(2, 0);
        System.out.println(i);
    }
    @Test
    void searchOrders() {
        PageInfo pageInfo=ordersService.searchOrders(1,1);
        System.out.println("i"+pageInfo.toString());

    }

    @Test
    void searchOrdersByPhone() {
        PageInfo<Orders> ordersPageInfo = ordersService.searchOrdersByPhone(1, 1, "15243896307");
        System.out.println(ordersPageInfo.toString());
    }

    @Test
    void searchOrderByCode() {
        Orders orders = ordersService.searchOrderByCode("123457");
        System.out.println(orders);
    }

    @Test
    void searchOrdersByPhoneAndCode() {
        PageInfo<Orders> ordersPageInfo = ordersService.
                searchOrdersByPhoneAndCode(1, 1,
                        "15243896308", "123457");
        System.out.println(ordersPageInfo.toString());
    }

    @Test
    void searchOrdersByState() {
        PageInfo<Orders> ordersPageInfo = ordersService.searchOrdersByState(1, 1, 1);
        System.out.println(ordersPageInfo.toString());
    }

    @Test
    void searchOrdersByTime() {
        PageInfo<Orders> ordersPageInfo = ordersService.searchOrdersByTime(1, 1, new Date());
        System.out.println(ordersPageInfo.toString());
    }
    @Test
    void searchOrdersById() {
        Orders orders = ordersService.searchOrdersById(2);
        System.out.println(orders);
    }
}