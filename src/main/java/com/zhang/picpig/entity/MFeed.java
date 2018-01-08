package com.zhang.picpig.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "m_feed")
public class MFeed {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    /**
     * 内容
     */
    @Column(name = "feed_content")
    private String feedContent;

    /**
     * 图片
     */
    @Column(name = "feed_img")
    private String feedImg;

    /**
     * 发布时间
     */
    @Column(name = "feed_time")
    private Date feedTime;

    /**
     * 类型：系统、用户
     */
    @Column(name = "feed_type")
    private Integer feedType;

    /**
     * 状态
     */
    @Column(name = "feed_state")
    private Integer feedState;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "create_by")
    private Integer createBy;

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
     * 获取内容
     *
     * @return feed_content - 内容
     */
    public String getFeedContent() {
        return feedContent;
    }

    /**
     * 设置内容
     *
     * @param feedContent 内容
     */
    public void setFeedContent(String feedContent) {
        this.feedContent = feedContent;
    }

    /**
     * 获取图片
     *
     * @return feed_img - 图片
     */
    public String getFeedImg() {
        return feedImg;
    }

    /**
     * 设置图片
     *
     * @param feedImg 图片
     */
    public void setFeedImg(String feedImg) {
        this.feedImg = feedImg;
    }

    /**
     * 获取发布时间
     *
     * @return feed_time - 发布时间
     */
    public Date getFeedTime() {
        return feedTime;
    }

    /**
     * 设置发布时间
     *
     * @param feedTime 发布时间
     */
    public void setFeedTime(Date feedTime) {
        this.feedTime = feedTime;
    }

    /**
     * 获取类型：系统、用户
     *
     * @return feed_type - 类型：系统、用户
     */
    public Integer getFeedType() {
        return feedType;
    }

    /**
     * 设置类型：系统、用户
     *
     * @param feedType 类型：系统、用户
     */
    public void setFeedType(Integer feedType) {
        this.feedType = feedType;
    }

    /**
     * 获取状态
     *
     * @return feed_state - 状态
     */
    public Integer getFeedState() {
        return feedState;
    }

    /**
     * 设置状态
     *
     * @param feedState 状态
     */
    public void setFeedState(Integer feedState) {
        this.feedState = feedState;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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