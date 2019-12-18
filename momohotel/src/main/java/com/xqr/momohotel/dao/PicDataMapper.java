package com.xqr.momohotel.dao;


import com.xqr.momohotel.model.PicData;
import com.xqr.momohotel.model.PicDataExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface PicDataMapper {
    long countByExample(PicDataExample example);

    int deleteByExample(PicDataExample example);

    int deleteByPrimaryKey(Integer picId);

    int insert(PicData record);

    int insertSelective(PicData record);

    List<PicData> selectByExample(PicDataExample example);

    PicData selectByPrimaryKey(Integer picId);

    int updateByExampleSelective(@Param("record") PicData record, @Param("example") PicDataExample example);

    int updateByExample(@Param("record") PicData record, @Param("example") PicDataExample example);

    int updateByPrimaryKeySelective(PicData record);

    int updateByPrimaryKey(PicData record);
}