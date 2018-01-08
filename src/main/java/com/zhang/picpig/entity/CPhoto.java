package com.zhang.picpig.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "c_photo")
public class CPhoto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String memo;

    @Column(name = "user_id")
    private Integer userId;

    /**
     * 相册
     */
    @Column(name = "album_id")
    private Integer albumId;

    /**
     * 相册路径
     */
    @Column(name = "photo_path")
    private String photoPath;

    @Column(name = "photo_type")
    private Integer photoType;

    @Column(name = "photo_state")
    private Integer photoState;

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
     * 获取相册
     *
     * @return album_id - 相册
     */
    public Integer getAlbumId() {
        return albumId;
    }

    /**
     * 设置相册
     *
     * @param albumId 相册
     */
    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    /**
     * 获取相册路径
     *
     * @return photo_path - 相册路径
     */
    public String getPhotoPath() {
        return photoPath;
    }

    /**
     * 设置相册路径
     *
     * @param photoPath 相册路径
     */
    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    /**
     * @return photo_type
     */
    public Integer getPhotoType() {
        return photoType;
    }

    /**
     * @param photoType
     */
    public void setPhotoType(Integer photoType) {
        this.photoType = photoType;
    }

    /**
     * @return photo_state
     */
    public Integer getPhotoState() {
        return photoState;
    }

    /**
     * @param photoState
     */
    public void setPhotoState(Integer photoState) {
        this.photoState = photoState;
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