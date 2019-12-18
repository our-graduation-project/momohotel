package com.xqr.momohotel.dao;


import com.xqr.momohotel.model.RolesRights;
import com.xqr.momohotel.model.RolesRightsExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface RolesRightsMapper {
    long countByExample(RolesRightsExample example);

    int deleteByExample(RolesRightsExample example);

    int insert(RolesRights record);

    int insertSelective(RolesRights record);

    List<RolesRights> selectByExample(RolesRightsExample example);

    int updateByExampleSelective(@Param("record") RolesRights record, @Param("example") RolesRightsExample example);

    int updateByExample(@Param("record") RolesRights record, @Param("example") RolesRightsExample example);
}