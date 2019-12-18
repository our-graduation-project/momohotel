package com.xqr.momohotel.dao;


import com.xqr.momohotel.model.Rights;
import com.xqr.momohotel.model.RightsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RightsMapper {
    long countByExample(RightsExample example);

    int deleteByExample(RightsExample example);

    int deleteByPrimaryKey(Integer rightId);

    int insert(Rights record);

    int insertSelective(Rights record);

    List<Rights> selectByExample(RightsExample example);

    Rights selectByPrimaryKey(Integer rightId);

    int updateByExampleSelective(@Param("record") Rights record, @Param("example") RightsExample example);

    int updateByExample(@Param("record") Rights record, @Param("example") RightsExample example);

    int updateByPrimaryKeySelective(Rights record);

    int updateByPrimaryKey(Rights record);
}