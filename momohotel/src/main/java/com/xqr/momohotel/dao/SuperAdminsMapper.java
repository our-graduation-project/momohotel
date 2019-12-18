package com.xqr.momohotel.dao;


import com.xqr.momohotel.model.SuperAdmins;
import com.xqr.momohotel.model.SuperAdminsExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface SuperAdminsMapper {
    long countByExample(SuperAdminsExample example);

    int deleteByExample(SuperAdminsExample example);

    int deleteByPrimaryKey(Integer superAdminId);

    int insert(SuperAdmins record);

    int insertSelective(SuperAdmins record);

    List<SuperAdmins> selectByExample(SuperAdminsExample example);

    SuperAdmins selectByPrimaryKey(Integer superAdminId);

    int updateByExampleSelective(@Param("record") SuperAdmins record, @Param("example") SuperAdminsExample example);

    int updateByExample(@Param("record") SuperAdmins record, @Param("example") SuperAdminsExample example);

    int updateByPrimaryKeySelective(SuperAdmins record);

    int updateByPrimaryKey(SuperAdmins record);
}