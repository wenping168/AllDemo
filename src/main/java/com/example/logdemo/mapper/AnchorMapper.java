package com.example.logdemo.mapper;

import com.example.logdemo.pojo.Anchor;

public interface AnchorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Anchor record);

    int insertSelective(Anchor record);

    Anchor selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Anchor record);

    int updateByPrimaryKey(Anchor record);
}