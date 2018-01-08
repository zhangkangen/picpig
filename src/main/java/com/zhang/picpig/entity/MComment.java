package com.zhang.picpig.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "m_comment")
public class MComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "parent_id")
    private Integer parentId;

    /**
     * 关联id
     */
    @Column(name = "relation_id")
    private Integer relationId;

    /**
     * 评论内容
     */
    private String content;

    @Column(name = "comment_time")
    private Date commentTime;

    /**
     * 类型：动态评论、相册评论、照片平路
     */
    @Column(name = "comment_type")
    private Integer commentType;

    /**
     * 状态：
     */
    @Column(name = "comment_state")
    private Integer commentState;

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
     * @return parent_id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取关联id
     *
     * @return relation_id - 关联id
     */
    public Integer getRelationId() {
        return relationId;
    }

    /**
     * 设置关联id
     *
     * @param relationId 关联id
     */
    public void setRelationId(Integer relationId) {
        this.relationId = relationId;
    }

    /**
     * 获取评论内容
     *
     * @return content - 评论内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置评论内容
     *
     * @param content 评论内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return comment_time
     */
    public Date getCommentTime() {
        return commentTime;
    }

    /**
     * @param commentTime
     */
    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    /**
     * 获取类型：动态评论、相册评论、照片平路
     *
     * @return comment_type - 类型：动态评论、相册评论、照片平路
     */
    public Integer getCommentType() {
        return commentType;
    }

    /**
     * 设置类型：动态评论、相册评论、照片平路
     *
     * @param commentType 类型：动态评论、相册评论、照片平路
     */
    public void setCommentType(Integer commentType) {
        this.commentType = commentType;
    }

    /**
     * 获取状态：
     *
     * @return comment_state - 状态：
     */
    public Integer getCommentState() {
        return commentState;
    }

    /**
     * 设置状态：
     *
     * @param commentState 状态：
     */
    public void setCommentState(Integer commentState) {
        this.commentState = commentState;
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