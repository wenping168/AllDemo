package com.example.logdemo.mapper;

import com.example.logdemo.pojo.BusinessInfo;

public interface BusinessInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BusinessInfo record);

    int insertSelective(BusinessInfo record);

    BusinessInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BusinessInfo record);

    int updateByPrimaryKey(BusinessInfo record);
}