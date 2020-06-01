package com.example.logdemo.service;

import com.example.logdemo.mapper.ActivityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author camel
 * @Version 1.0
 * @Date 1.6.20 2:23 下午
 */
@Service
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    private ActivityMapper activityMapper ;

    @Override
    public void test() {
       // activityMapper.insertAllColumn();
    }


}
