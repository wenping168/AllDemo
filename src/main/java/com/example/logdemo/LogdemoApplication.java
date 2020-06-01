package com.example.logdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value="com.example.logdemo.mapper")
public class LogdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogdemoApplication.class, args);
    }

}
