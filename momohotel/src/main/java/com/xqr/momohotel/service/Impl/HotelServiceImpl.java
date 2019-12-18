package com.xqr.momohotel.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xqr.momohotel.dao.HotelMapper;
import com.xqr.momohotel.model.Hotel;
import com.xqr.momohotel.model.HotelExample;
import com.xqr.momohotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelMapper hotelMapper;
    /**
     * 增加酒店
     * @param hotel
     * @return
     */
    @Override
    public int addHotel(Hotel hotel) {
        return hotelMapper.insert(hotel);
    }

    /**
     * 根据ID删除酒店
     * @param hotelId
     * @return
     */
    @Override
    public int deleteHotel(Integer hotelId) {
        return hotelMapper.deleteByPrimaryKey(hotelId);
    }

    /**
     * 修改酒店
     * @param hotel
     * @return
     */
    @Override
    public int updateHotel(Hotel hotel) {

        return hotelMapper.updateByPrimaryKeySelective(hotel);
    }

    /**
     * 查询所有酒店
     * @param page
     * @param pageSize
     * @return
     */
    @Override
    public PageInfo<Hotel> checkHotels(int page, int pageSize) {
        HotelExample hotelExample=new HotelExample();
        hotelExample.or();
        PageHelper.startPage(page,pageSize);
        List<Hotel> hotels=hotelMapper.selectByExample(hotelExample);
        PageInfo pageInfo=new PageInfo(hotels,3);
        return pageInfo;
    }

    /**
     * 根据ID查询酒店
     * @param hotelId
     * @return
     */
    @Override
    public Hotel checkHotelById(Integer hotelId) {
        Hotel hotel = hotelMapper.selectByPrimaryKey(hotelId);
        return hotel;
    }

    /**
     * 根据名称查询酒店
     * @param page
     * @param pageSize
     * @param hotelName
     * @return
     */
    @Override
    public PageInfo<Hotel> checkHotelByName(int page, int pageSize, String hotelName) {
        HotelExample hotelExample=new HotelExample();
        hotelExample.or().andHotelNameEqualTo(hotelName);
        PageHelper.startPage(page,pageSize);
        List<Hotel> hotels=hotelMapper.selectByExample(hotelExample);
        PageInfo pageInfo=new PageInfo(hotels,3);
        return pageInfo;
    }
}
