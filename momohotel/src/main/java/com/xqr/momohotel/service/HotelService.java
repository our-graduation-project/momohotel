package com.xqr.momohotel.service;

import com.github.pagehelper.PageInfo;
import com.xqr.momohotel.model.Hotel;

public interface HotelService {

    /**
     * 增加酒店
     * @return
     */
    int addHotel(Hotel hotel);

    /**
     * 根据ID删除酒店
     * @param hotelId
     * @return
     */
    int deleteHotel(Integer hotelId);

    /**
     * 修改酒店
     * @param hotel
     * @return
     */
    int updateHotel(Hotel hotel);

    /**
     * 查询所有酒店
     * @param page
     * @param pageSize
     * @return
     */
    PageInfo<Hotel> checkHotels(int page, int pageSize);

    /**
     * 根据ID查询酒店
     * @param hotelId
     * @return
     */
    Hotel checkHotelById(Integer hotelId);

    /**
     * 根据名称查询酒店
     * @param page
     * @param pageSize
     * @param hotelName
     * @return
     */
    PageInfo<Hotel> checkHotelByName(int page, int pageSize,String hotelName);
}
