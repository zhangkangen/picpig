package com.zhang.picpig.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "c_attachment")
public class CAttachment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 名称
     */
    @Column(name = "attachment_name")
    private String attachmentName;

    /**
     * 后缀
     */
    @Column(name = "attachment_subffix")
    private String attachmentSubffix;

    /**
     * 大小
     */
    @Column(name = "attachment_size")
    private Long attachmentSize;

    /**
     * 类型
     */
    @Column(name = "attachment_type")
    private Integer attachmentType;

    /**
     * 相对地址
     */
    @Column(name = "attachment_path")
    private String attachmentPath;

    /**
     * 存储名称
     */
    @Column(name = "temp_name")
    private String tempName;

    /**
     * 状态
     */
    @Column(name = "attachment_state")
    private Integer attachmentState;

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
     * 获取名称
     *
     * @return attachment_name - 名称
     */
    public String getAttachmentName() {
        return attachmentName;
    }

    /**
     * 设置名称
     *
     * @param attachmentName 名称
     */
    public void setAttachmentName(String attachmentName) {
        this.attachmentName = attachmentName;
    }

    /**
     * 获取后缀
     *
     * @return attachment_subffix - 后缀
     */
    public String getAttachmentSubffix() {
        return attachmentSubffix;
    }

    /**
     * 设置后缀
     *
     * @param attachmentSubffix 后缀
     */
    public void setAttachmentSubffix(String attachmentSubffix) {
        this.attachmentSubffix = attachmentSubffix;
    }

    /**
     * 获取大小
     *
     * @return attachment_size - 大小
     */
    public Long getAttachmentSize() {
        return attachmentSize;
    }

    /**
     * 设置大小
     *
     * @param attachmentSize 大小
     */
    public void setAttachmentSize(Long attachmentSize) {
        this.attachmentSize = attachmentSize;
    }

    /**
     * 获取类型
     *
     * @return attachment_type - 类型
     */
    public Integer getAttachmentType() {
        return attachmentType;
    }

    /**
     * 设置类型
     *
     * @param attachmentType 类型
     */
    public void setAttachmentType(Integer attachmentType) {
        this.attachmentType = attachmentType;
    }

    /**
     * 获取相对地址
     *
     * @return attachment_path - 相对地址
     */
    public String getAttachmentPath() {
        return attachmentPath;
    }

    /**
     * 设置相对地址
     *
     * @param attachmentPath 相对地址
     */
    public void setAttachmentPath(String attachmentPath) {
        this.attachmentPath = attachmentPath;
    }

    /**
     * 获取存储名称
     *
     * @return temp_name - 存储名称
     */
    public String getTempName() {
        return tempName;
    }

    /**
     * 设置存储名称
     *
     * @param tempName 存储名称
     */
    public void setTempName(String tempName) {
        this.tempName = tempName;
    }

    /**
     * 获取状态
     *
     * @return attachment_state - 状态
     */
    public Integer getAttachmentState() {
        return attachmentState;
    }

    /**
     * 设置状态
     *
     * @param attachmentState 状态
     */
    public void setAttachmentState(Integer attachmentState) {
        this.attachmentState = attachmentState;
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