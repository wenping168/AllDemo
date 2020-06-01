package com.example.logdemo.pojo;

import java.util.Date;

public class LiveRoom {
    private Integer id;

    private String liveTitle;

    private String coverImg;

    private String url;

    private String liveStatus;

    private Date startTime;

    private Date endTime;

    private String anchorName;

    private String anchorImg;

    private Date createTime;

    private Date modifiedTime;

    private Long roomId;

    private Long anchorId;

    private Long cid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLiveTitle() {
        return liveTitle;
    }

    public void setLiveTitle(String liveTitle) {
        this.liveTitle = liveTitle == null ? null : liveTitle.trim();
    }

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg == null ? null : coverImg.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getLiveStatus() {
        return liveStatus;
    }

    public void setLiveStatus(String liveStatus) {
        this.liveStatus = liveStatus == null ? null : liveStatus.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getAnchorName() {
        return anchorName;
    }

    public void setAnchorName(String anchorName) {
        this.anchorName = anchorName == null ? null : anchorName.trim();
    }

    public String getAnchorImg() {
        return anchorImg;
    }

    public void setAnchorImg(String anchorImg) {
        this.anchorImg = anchorImg == null ? null : anchorImg.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public Long getAnchorId() {
        return anchorId;
    }

    public void setAnchorId(Long anchorId) {
        this.anchorId = anchorId;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }
}