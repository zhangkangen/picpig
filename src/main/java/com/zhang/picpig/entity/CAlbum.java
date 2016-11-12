package com.zhang.picpig.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zhang on 2016/11/12.
 */
public class CAlbum implements Serializable{
    private Integer id;
    private String albumName;
    private String albumMemo;
    private Integer albumCover;
    private Boolean isDeleted;
    private Date createTime;
    private Integer createdBy;
    private Integer modifyBy;
    private Date modifyTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getAlbumMemo() {
        return albumMemo;
    }

    public void setAlbumMemo(String albumMemo) {
        this.albumMemo = albumMemo;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Integer getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(Integer modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getAlbumCover() {
        return albumCover;
    }

    public void setAlbumCover(Integer albumCover) {
        this.albumCover = albumCover;
    }
}
