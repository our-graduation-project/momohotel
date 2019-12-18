package com.xqr.momohotel.service.Impl;

import com.github.pagehelper.PageInfo;
import com.xqr.momohotel.MomohotelApplication;
import com.xqr.momohotel.model.Hotel;
import com.xqr.momohotel.service.HotelService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MomohotelApplication.class)
class HotelServiceImplTest {

    @Autowired
    private HotelService hotelService;
    @Test
    void addHotel() {
        Hotel hotel=new Hotel();
        hotel.setHotelId(2);
        hotel.setHotelNo("16436105");
        hotel.setHotelName("如家");
        hotel.setHotelPic("gjygjtyjgb12345");
        hotel.setRegionId(2);
        hotel.setHotelData("最大酒店");
        hotel.setHotelAddress("中国北京市中关村");
        hotel.setRoomNumber(3000);
        hotel.setParkinglot(12);
        hotel.setWifi(1);
        hotel.setWake(0);
        hotel.setDeposit(1);
        hotel.setRestaurant(0);
        hotel.setLift(1);
        hotel.setTime(new Date());
        hotel.setTimeAgree(new Date());
        hotel.setBusinessLicense("fthtyhty1234567");
        hotel.setLegalPerson("李思");
        hotel.setLegalPersonIdcard("14118119991106001X");
        hotel.setCardPic("123456789123456");
        int i = hotelService.addHotel(hotel);
        System.out.println("-----i"+i);
    }

    @Test
    void deleteHotel() {
        System.out.println(hotelService.deleteHotel(17));
    }

    @Test
    void updateHotel() {
        System.out.println(hotelService
                .updateHotel(new Hotel(16,"1636105","你妹")));
    }

    @Test
    void checkHotels() {
        PageInfo pageInfo=hotelService.checkHotels(1,1);
        System.out.println("i"+pageInfo.toString());
    }

    @Test
    void checkHotelById() {
        Hotel hotel = hotelService.checkHotelById(16);
        System.out.println(hotel);
    }

    @Test
    void checkHotelByName() {
        PageInfo pageInfo = hotelService.checkHotelByName(1, 1, "如家");
        System.out.println("i"+pageInfo.toString());
    }
}