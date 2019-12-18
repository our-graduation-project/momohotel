package com.xqr.momohotel.dao;


import com.xqr.momohotel.model.RoomNo;
import com.xqr.momohotel.model.RoomNoExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RoomNoMapper {
    long countByExample(RoomNoExample example);

    int deleteByExample(RoomNoExample example);

    int insert(RoomNo record);

    int insertSelective(RoomNo record);

    List<RoomNo> selectByExample(RoomNoExample example);

    int updateByExampleSelective(@Param("record") RoomNo record, @Param("example") RoomNoExample example);

    int updateByExample(@Param("record") RoomNo record, @Param("example") RoomNoExample example);
}