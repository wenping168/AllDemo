package com.example.logdemo.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.logdemo.pojo.Activity;

public interface ActivityMapper extends BaseMapper<Activity> {

    int deleteByPrimaryKey(Long id);

    int insert(Activity record);

    int insertSelective(Activity record);

    Activity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Activity record);

    int updateByPrimaryKey(Activity record);

}