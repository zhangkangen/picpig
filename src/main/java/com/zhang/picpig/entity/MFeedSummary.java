package com.zhang.picpig.entity;

import javax.persistence.*;

@Table(name = "m_feed_summary")
public class MFeedSummary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "source_id")
    private Integer sourceId;

    /**
     * 赞
     */
    @Column(name = "up_vote")
    private Integer upVote;

    /**
     * 踩
     */
    @Column(name = "down_vote")
    private Integer downVote;

    /**
     * 评论次数
     */
    @Column(name = "comment_count")
    private Integer commentCount;

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
     * @return source_id
     */
    public Integer getSourceId() {
        return sourceId;
    }

    /**
     * @param sourceId
     */
    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * 获取赞
     *
     * @return up_vote - 赞
     */
    public Integer getUpVote() {
        return upVote;
    }

    /**
     * 设置赞
     *
     * @param upVote 赞
     */
    public void setUpVote(Integer upVote) {
        this.upVote = upVote;
    }

    /**
     * 获取踩
     *
     * @return down_vote - 踩
     */
    public Integer getDownVote() {
        return downVote;
    }

    /**
     * 设置踩
     *
     * @param downVote 踩
     */
    public void setDownVote(Integer downVote) {
        this.downVote = downVote;
    }

    /**
     * 获取评论次数
     *
     * @return comment_count - 评论次数
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * 设置评论次数
     *
     * @param commentCount 评论次数
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
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