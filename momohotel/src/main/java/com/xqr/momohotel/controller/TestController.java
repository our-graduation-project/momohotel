package com.xqr.momohotel.controller;

import com.xqr.momohotel.service.TestService;
import com.xqr.momohotel.utils.APIResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author 向清润
 * @createTime 2019.12.18.11:22
 */
@Controller
public class TestController {
    @Autowired
    TestService testService;


    @RequestMapping("admin/test")
    @ResponseBody
    public APIResult testAdmin(@RequestBody Map map){
        String  testData = (String) map.get("testData");
        System.out.println(testData);
        int i = testService.addAdmin();
        String s = "返回正常"+i;
        return new APIResult(s,true,200);
    }
}
