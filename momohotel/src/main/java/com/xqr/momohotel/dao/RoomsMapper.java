package com.xqr.momohotel.dao;


import com.xqr.momohotel.model.Rooms;
import com.xqr.momohotel.model.RoomsExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface RoomsMapper {
    long countByExample(RoomsExample example);

    int deleteByExample(RoomsExample example);

    int deleteByPrimaryKey(Integer roomId);

    int insert(Rooms record);

    int insertSelective(Rooms record);

    List<Rooms> selectByExample(RoomsExample example);

    Rooms selectByPrimaryKey(Integer roomId);

    int updateByExampleSelective(@Param("record") Rooms record, @Param("example") RoomsExample example);

    int updateByExample(@Param("record") Rooms record, @Param("example") RoomsExample example);

    int updateByPrimaryKeySelective(Rooms record);

    int updateByPrimaryKey(Rooms record);

    /**
     * 根据房间号查询房间信息
     * @param roomNum
     * @return
     */
    Rooms selectRoomsByRoomNum(String roomNum);
}