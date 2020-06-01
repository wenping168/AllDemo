package com.example.logdemo.pojo;

import java.util.Date;

public class Anchor {
    private Integer id;

    private String anchorName;

    private String nameEn;

    private String type;

    private String phone;

    private String openId;

    private Date createTime;

    private Date modiffiedTime;

    private String anchorImg;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAnchorName() {
        return anchorName;
    }

    public void setAnchorName(String anchorName) {
        this.anchorName = anchorName == null ? null : anchorName.trim();
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn == null ? null : nameEn.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModiffiedTime() {
        return modiffiedTime;
    }

    public void setModiffiedTime(Date modiffiedTime) {
        this.modiffiedTime = modiffiedTime;
    }

    public String getAnchorImg() {
        return anchorImg;
    }

    public void setAnchorImg(String anchorImg) {
        this.anchorImg = anchorImg == null ? null : anchorImg.trim();
    }
}