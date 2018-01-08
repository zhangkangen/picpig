package com.zhang.picpig.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "c_album")
public class CAlbum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String memo;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "album_cover")
    private String albumCover;

    /**
     * 类型：公开、好友可见、个人可见
     */
    @Column(name = "album_type")
    private Integer albumType;

    /**
     * 状态：正常、删除
     */
    @Column(name = "album_state")
    private Integer albumState;

    /**
     * 照片数量
     */
    @Column(name = "photo_num")
    private Integer photoNum;

    @Column(name = "create_by")
    private Integer createBy;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_by")
    private Integer updateBy;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "deleted_tag")
    private Boolean deletedTag;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return memo
     */
    public String getMemo() {
        return memo;
    }

    /**
     * @param memo
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return album_cover
     */
    public String getAlbumCover() {
        return albumCover;
    }

    /**
     * @param albumCover
     */
    public void setAlbumCover(String albumCover) {
        this.albumCover = albumCover;
    }

    /**
     * 获取类型：公开、好友可见、个人可见
     *
     * @return album_type - 类型：公开、好友可见、个人可见
     */
    public Integer getAlbumType() {
        return albumType;
    }

    /**
     * 设置类型：公开、好友可见、个人可见
     *
     * @param albumType 类型：公开、好友可见、个人可见
     */
    public void setAlbumType(Integer albumType) {
        this.albumType = albumType;
    }

    /**
     * 获取状态：正常、删除
     *
     * @return album_state - 状态：正常、删除
     */
    public Integer getAlbumState() {
        return albumState;
    }

    /**
     * 设置状态：正常、删除
     *
     * @param albumState 状态：正常、删除
     */
    public void setAlbumState(Integer albumState) {
        this.albumState = albumState;
    }

    /**
     * 获取照片数量
     *
     * @return photo_num - 照片数量
     */
    public Integer getPhotoNum() {
        return photoNum;
    }

    /**
     * 设置照片数量
     *
     * @param photoNum 照片数量
     */
    public void setPhotoNum(Integer photoNum) {
        this.photoNum = photoNum;
    }

    /**
     * @return create_by
     */
    public Integer getCreateBy() {
        return createBy;
    }

    /**
     * @param createBy
     */
    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_by
     */
    public Integer getUpdateBy() {
        return updateBy;
    }

    /**
     * @param updateBy
     */
    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return deleted_tag
     */
    public Boolean getDeletedTag() {
        return deletedTag;
    }

    /**
     * @param deletedTag
     */
    public void setDeletedTag(Boolean deletedTag) {
        this.deletedTag = deletedTag;
    }
}