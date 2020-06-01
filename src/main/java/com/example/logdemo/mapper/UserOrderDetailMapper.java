package com.example.logdemo.mapper;

import com.example.logdemo.pojo.UserOrderDetail;

public interface UserOrderDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserOrderDetail record);

    int insertSelective(UserOrderDetail record);

    UserOrderDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserOrderDetail record);

    int updateByPrimaryKey(UserOrderDetail record);
}