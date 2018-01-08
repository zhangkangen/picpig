package com.zhang.picpig.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "c_attachment_relation")
public class CAttachmentRelation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "attachment_id")
    private Integer attachmentId;

    /**
     * 资源类型
     */
    @Column(name = "relation_type")
    private Integer relationType;

    /**
     * 关联表
     */
    @Column(name = "relation_table")
    private String relationTable;

    private String memo;

    @Column(name = "createBy")
    private Integer createby;

    @Column(name = "createTime")
    private Date createtime;

    @Column(name = "updateBy")
    private Integer updateby;

    @Column(name = "updateTime")
    private Date updatetime;

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
     * @return attachment_id
     */
    public Integer getAttachmentId() {
        return attachmentId;
    }

    /**
     * @param attachmentId
     */
    public void setAttachmentId(Integer attachmentId) {
        this.attachmentId = attachmentId;
    }

    /**
     * 获取资源类型
     *
     * @return relation_type - 资源类型
     */
    public Integer getRelationType() {
        return relationType;
    }

    /**
     * 设置资源类型
     *
     * @param relationType 资源类型
     */
    public void setRelationType(Integer relationType) {
        this.relationType = relationType;
    }

    /**
     * 获取关联表
     *
     * @return relation_table - 关联表
     */
    public String getRelationTable() {
        return relationTable;
    }

    /**
     * 设置关联表
     *
     * @param relationTable 关联表
     */
    public void setRelationTable(String relationTable) {
        this.relationTable = relationTable;
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
     * @return createBy
     */
    public Integer getCreateby() {
        return createby;
    }

    /**
     * @param createby
     */
    public void setCreateby(Integer createby) {
        this.createby = createby;
    }

    /**
     * @return createTime
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * @return updateBy
     */
    public Integer getUpdateby() {
        return updateby;
    }

    /**
     * @param updateby
     */
    public void setUpdateby(Integer updateby) {
        this.updateby = updateby;
    }

    /**
     * @return updateTime
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * @param updatetime
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
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