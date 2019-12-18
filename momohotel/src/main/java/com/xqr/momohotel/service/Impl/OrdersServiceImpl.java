package com.xqr.momohotel.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xqr.momohotel.dao.OrdersMapper;
import com.xqr.momohotel.model.Orders;
import com.xqr.momohotel.model.OrdersExample;
import com.xqr.momohotel.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrdersMapper ordersMapper;

    /**
     * 根据ID删除订单
     * @param orderId
     * @return
     */
    @Override
    public int deleteOrder(Integer orderId) {
        return ordersMapper.deleteByPrimaryKey(orderId);
    }

    /**
     * 修改状态
     * @param orderId
     * @param roderState
     * @return
     */
    @Override
    public int updateState(Integer orderId, Integer roderState) {
        int len=0;
        Orders orders=searchOrdersById(orderId);
        if (orders!=null){
            orders.setRoderState(roderState);
            len=ordersMapper.updateByPrimaryKey(orders);
        }
        return len;
    }

    /**
     * 查询所有订单
     * @param page
     * @param pageSize
     * @return
     */
    @Override
    public PageInfo<Orders> searchOrders(int page, int pageSize) {
        OrdersExample ordersExample=new OrdersExample();
        ordersExample.or();
        PageHelper.startPage(page,pageSize);
        List<Orders> orders = ordersMapper.selectByExample(ordersExample);
        PageInfo pageInfo=new PageInfo(orders,3);
        return pageInfo;
    }

    /**
     * 根据用户电话查询订单
     * @param page
     * @param pageSize
     * @param userPhine
     * @return
     */
    @Override
    public PageInfo<Orders> searchOrdersByPhone(int page, int pageSize, String userPhine) {
        OrdersExample ordersExample=new OrdersExample();
        ordersExample.or().andUserPhineEqualTo(userPhine);
        PageHelper.startPage(page,pageSize);
        List<Orders> orders = ordersMapper.selectByExample(ordersExample);
        PageInfo pageInfo=new PageInfo(orders,3);
        return pageInfo;
    }

    /**
     * 根据入住吗查询订单
     * @param checkinCode
     * @return
     */
    @Override
    public Orders searchOrderByCode(String checkinCode) {
        OrdersExample ordersExample=new OrdersExample();
        ordersExample.or().andCheckinCodeEqualTo(checkinCode);
        List<Orders> orders = ordersMapper.selectByExample(ordersExample);
        if (orders!=null||orders.size()==1){
            return orders.get(0);
        }
        return null;
    }

    /**
     * 根据用户电话和入住吗查询订单
     * @param page
     * @param pageSize
     * @param userPhine
     * @param checkinCode
     * @return
     */
    @Override
    public PageInfo<Orders> searchOrdersByPhoneAndCode(int page, int pageSize, String userPhine, String checkinCode) {
        OrdersExample ordersExample=new OrdersExample();
        ordersExample.or().andUserPhineEqualTo(userPhine).andCheckinCodeEqualTo(checkinCode);
        PageHelper.startPage(page,pageSize);
        List<Orders> orders = ordersMapper.selectByExample(ordersExample);
        PageInfo pageInfo=new PageInfo(orders,3);
        return pageInfo;
    }

    /**
     * complete完成订单修改状态
     * 根据订单状态查询订单
     * @param page
     * @param pageSize
     * @param roderState
     * @return
     */
    @Override
    public PageInfo<Orders> searchOrdersByState(int page, int pageSize, Integer roderState) {
        OrdersExample ordersExample=new OrdersExample();
        ordersExample.or().andRoderStateEqualTo(roderState);
        PageHelper.startPage(page,pageSize);
        List<Orders> orders = ordersMapper.selectByExample(ordersExample);
        PageInfo pageInfo=new PageInfo(orders,3);
        return pageInfo;
    }

    /**
     * 查询今天入住的订单
     * @param page
     * @param pageSize
     * @param checkinTime
     * @return
     */
    @Override
    public PageInfo<Orders> searchOrdersByTime(int page, int pageSize, Date checkinTime) {
        OrdersExample ordersExample=new OrdersExample();
        ordersExample.or().andCheckinTimeEqualTo(checkinTime);
        PageHelper.startPage(page,pageSize);
        List<Orders> orders = ordersMapper.selectByExample(ordersExample);
        PageInfo pageInfo=new PageInfo(orders,3);
        return pageInfo;
    }

    /**
     * 根据id查询
     * @param orderId
     * @return
     */
    @Override
    public Orders searchOrdersById(Integer orderId) {
        Orders orders = ordersMapper.selectByPrimaryKey(orderId);
        return orders;
    }
}
