package com.xqr.momohotel.dao;


import com.xqr.momohotel.model.Admins;
import com.xqr.momohotel.model.AdminsExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface AdminsMapper {
    long countByExample(AdminsExample example);

    int deleteByExample(AdminsExample example);

    int deleteByPrimaryKey(Integer adminId);

    int insert(Admins record);

    int insertSelective(Admins record);

    List<Admins> selectByExample(AdminsExample example);

    Admins selectByPrimaryKey(Integer adminId);

    int updateByExampleSelective(@Param("record") Admins record, @Param("example") AdminsExample example);

    int updateByExample(@Param("record") Admins record, @Param("example") AdminsExample example);

    int updateByPrimaryKeySelective(Admins record);

    int updateByPrimaryKey(Admins record);
}