package com.example.logdemo.mapper;

import com.example.logdemo.pojo.LiveRoom;

public interface LiveRoomMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LiveRoom record);

    int insertSelective(LiveRoom record);

    LiveRoom selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LiveRoom record);

    int updateByPrimaryKey(LiveRoom record);
}