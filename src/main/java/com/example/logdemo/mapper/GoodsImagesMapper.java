package com.example.logdemo.mapper;

import com.example.logdemo.pojo.GoodsImages;

public interface GoodsImagesMapper {
    int deleteByPrimaryKey(Long id);

    int insert(GoodsImages record);

    int insertSelective(GoodsImages record);

    GoodsImages selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GoodsImages record);

    int updateByPrimaryKey(GoodsImages record);
}