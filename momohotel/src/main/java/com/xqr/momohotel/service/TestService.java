package com.xqr.momohotel.service;

import com.xqr.momohotel.dao.AdminsMapper;
import com.xqr.momohotel.model.Admins;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 向清润
 * @createTime 2019.12.18.10:28
 */
@Service
public class TestService {

    @Autowired
    @Resource(type = AdminsMapper.class)
    private AdminsMapper adminsMapper;

    public int addAdmin(){
        Admins admins = new Admins();
        admins.setAdminName("sss");
        admins.setAdminNo("222");
        admins.setAdminPassword("aaaa");
        admins.setAdminPhone("323452");
        admins.setHoteleId(12);
        int i = adminsMapper.insert(admins);
        return i;
    }
//    public static void main(String[] args) {
//        testService testAdmin = new testService();
//        testAdmin.addAdmin();
//
//
//
//    }
}
