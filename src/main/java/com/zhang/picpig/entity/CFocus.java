package com.zhang.picpig.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "c_focus")
public class CFocus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "focus_user_id")
    private Integer focusUserId;

    /**
     * 类型：单向，互相
     */
    @Column(name = "focus_type")
    private Integer focusType;

    @Column(name = "focus_state")
    private Integer focusState;

    @Column(name = "create_by")
    private Integer createBy;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_by")
    private Integer updateBy;

    @Column(name = "update_time")
    private Date updateTime;

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
     * @return focus_user_id
     */
    public Integer getFocusUserId() {
        return focusUserId;
    }

    /**
     * @param focusUserId
     */
    public void setFocusUserId(Integer focusUserId) {
        this.focusUserId = focusUserId;
    }

    /**
     * 获取类型：单向，互相
     *
     * @return focus_type - 类型：单向，互相
     */
    public Integer getFocusType() {
        return focusType;
    }

    /**
     * 设置类型：单向，互相
     *
     * @param focusType 类型：单向，互相
     */
    public void setFocusType(Integer focusType) {
        this.focusType = focusType;
    }

    /**
     * @return focus_state
     */
    public Integer getFocusState() {
        return focusState;
    }

    /**
     * @param focusState
     */
    public void setFocusState(Integer focusState) {
        this.focusState = focusState;
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
}