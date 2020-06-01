package com.example.logdemo.controller;

import com.example.logdemo.mapper.ActivityMapper;
import com.example.logdemo.pojo.Activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class LogDemoController {

    @Resource
    private ActivityMapper activityMapper ;

    public void rest (){

    }

   




}
