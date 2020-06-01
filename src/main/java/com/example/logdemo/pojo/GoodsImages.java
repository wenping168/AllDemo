package com.example.logdemo.pojo;

import java.util.Date;

public class GoodsImages {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private String url;

    private Long seq;

    private Long goodsId;

    private Long shopId;

    private Short imgLocal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Long getSeq() {
        return seq;
    }

    public void setSeq(Long seq) {
        this.seq = seq;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Short getImgLocal() {
        return imgLocal;
    }

    public void setImgLocal(Short imgLocal) {
        this.imgLocal = imgLocal;
    }
}