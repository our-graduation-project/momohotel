package com.xqr.momohotel.service;

import com.github.pagehelper.PageInfo;
import com.xqr.momohotel.model.Orders;

import java.util.Date;

public interface OrdersService {

    /**
     * 根据ID删除订单
     * @param orderId
     * @return
     */
    int deleteOrder(Integer orderId);

    /**
     * 修改订单状态
     * @param orderId
     * @param roderState
     * @return
     */
    int updateState(Integer orderId,Integer roderState);
    /**
     * 查询所有订单
     * @param page
     * @param pageSize
     * @return
     */
    PageInfo<Orders> searchOrders(int page, int pageSize);

    /**
     * 根据用户电话查询订单
     * @param userPhine
     * @return
     */
    PageInfo<Orders> searchOrdersByPhone(int page, int pageSize,String userPhine);

    /**
     * 根据入住嘛查询订单
     * @param checkinCode
     * @return
     */
    Orders searchOrderByCode(String checkinCode);

    /**
     * 根据入住吗和用户电话查询订单
     * @param userPhine
     * @param checkinCode
     * @return
     */
    PageInfo<Orders> searchOrdersByPhoneAndCode(int page, int pageSize,String userPhine,String checkinCode);

    /**
     * 根据订单状态查询订单
     * @param page
     * @param pageSize
     * @param roderState
     * @return
     */
    PageInfo<Orders> searchOrdersByState(int page, int pageSize,Integer roderState);

    /**
     * 查询今天入住的订单
     * @param page
     * @param pageSize
     * @param checkinTime
     * @return
     */
    PageInfo<Orders> searchOrdersByTime(int page, int pageSize, Date checkinTime);


    /**
     * 根据ID查询
     * @param orderId
     * @return
     */
    Orders searchOrdersById(Integer orderId);
}
