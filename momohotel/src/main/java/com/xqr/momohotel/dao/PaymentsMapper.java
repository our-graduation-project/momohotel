package com.xqr.momohotel.dao;


import com.xqr.momohotel.model.Payments;
import com.xqr.momohotel.model.PaymentsExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface PaymentsMapper {
    long countByExample(PaymentsExample example);

    int deleteByExample(PaymentsExample example);

    int deleteByPrimaryKey(Integer paymentId);

    int insert(Payments record);

    int insertSelective(Payments record);

    List<Payments> selectByExample(PaymentsExample example);

    Payments selectByPrimaryKey(Integer paymentId);

    int updateByExampleSelective(@Param("record") Payments record, @Param("example") PaymentsExample example);

    int updateByExample(@Param("record") Payments record, @Param("example") PaymentsExample example);

    int updateByPrimaryKeySelective(Payments record);

    int updateByPrimaryKey(Payments record);
}