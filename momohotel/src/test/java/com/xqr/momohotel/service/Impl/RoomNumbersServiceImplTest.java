package com.xqr.momohotel.service.Impl;

import com.xqr.momohotel.MomohotelApplication;
import com.xqr.momohotel.model.RoomNo;
import com.xqr.momohotel.model.Rooms;
import com.xqr.momohotel.service.RoomNumbersService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Date 2019/12/20 19:16
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MomohotelApplication.class)
class RoomNumbersServiceImplTest {

    @Autowired
    private RoomNumbersService roomNumbersService;

    @Test
    void checkRoomHaveNumber() {
        List<RoomNo> roomNos = roomNumbersService.checkRoomHaveNumber(1);
        for (RoomNo roomNO:roomNos) {
            System.out.println(roomNO);
        }
    }

    @Test
    void checkNumberIsRoom() {
        Rooms rooms = roomNumbersService.checkNumberIsRoom("A1111");
        System.out.println(rooms);
    }

    @Test
    void addRoomNum() {
        int i = roomNumbersService.addRoomNum(1,1, "A11112");
        System.out.println(i);
    }

    @Test
    void deleteRoomNum() {
        roomNumbersService.deleteRoomNum("A11112");
    }
}