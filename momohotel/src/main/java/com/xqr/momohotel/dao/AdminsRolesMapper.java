package com.xqr.momohotel.dao;

import com.xqr.momohotel.model.AdminsRoles;
import com.xqr.momohotel.model.AdminsRolesExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface AdminsRolesMapper {
    long countByExample(AdminsRolesExample example);

    int deleteByExample(AdminsRolesExample example);

    int insert(AdminsRoles record);

    int insertSelective(AdminsRoles record);

    List<AdminsRoles> selectByExample(AdminsRolesExample example);

    int updateByExampleSelective(@Param("record") AdminsRoles record, @Param("example") AdminsRolesExample example);

    int updateByExample(@Param("record") AdminsRoles record, @Param("example") AdminsRolesExample example);
}