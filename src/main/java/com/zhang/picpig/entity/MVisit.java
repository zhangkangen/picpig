package com.zhang.picpig.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "m_visit")
public class MVisit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 被访问者
     */
    @Column(name = "visited_user_id")
    private Integer visitedUserId;

    /**
     * 访问时间
     */
    @Column(name = "visit_time")
    private Date visitTime;

    /**
     * 类型1:空间访问2:相册3:照片
     */
    @Column(name = "visit_type")
    private Integer visitType;

    /**
     * 访问资源id
     */
    @Column(name = "visit_source_id")
    private Integer visitSourceId;

    /**
     * 状态
     */
    @Column(name = "visit_state")
    private Integer visitState;

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
     * 获取用户
     *
     * @return user_id - 用户
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户
     *
     * @param userId 用户
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取被访问者
     *
     * @return visited_user_id - 被访问者
     */
    public Integer getVisitedUserId() {
        return visitedUserId;
    }

    /**
     * 设置被访问者
     *
     * @param visitedUserId 被访问者
     */
    public void setVisitedUserId(Integer visitedUserId) {
        this.visitedUserId = visitedUserId;
    }

    /**
     * 获取访问时间
     *
     * @return visit_time - 访问时间
     */
    public Date getVisitTime() {
        return visitTime;
    }

    /**
     * 设置访问时间
     *
     * @param visitTime 访问时间
     */
    public void setVisitTime(Date visitTime) {
        this.visitTime = visitTime;
    }

    /**
     * 获取类型1:空间访问2:相册3:照片
     *
     * @return visit_type - 类型1:空间访问2:相册3:照片
     */
    public Integer getVisitType() {
        return visitType;
    }

    /**
     * 设置类型1:空间访问2:相册3:照片
     *
     * @param visitType 类型1:空间访问2:相册3:照片
     */
    public void setVisitType(Integer visitType) {
        this.visitType = visitType;
    }

    /**
     * 获取访问资源id
     *
     * @return visit_source_id - 访问资源id
     */
    public Integer getVisitSourceId() {
        return visitSourceId;
    }

    /**
     * 设置访问资源id
     *
     * @param visitSourceId 访问资源id
     */
    public void setVisitSourceId(Integer visitSourceId) {
        this.visitSourceId = visitSourceId;
    }

    /**
     * 获取状态
     *
     * @return visit_state - 状态
     */
    public Integer getVisitState() {
        return visitState;
    }

    /**
     * 设置状态
     *
     * @param visitState 状态
     */
    public void setVisitState(Integer visitState) {
        this.visitState = visitState;
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