package com.zhang.picpig.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "s_staff")
public class SStaff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    private String nickname;

    private String realname;

    @Column(name = "staff_head")
    private String staffHead;

    @Column(name = "staff_sex")
    private Integer staffSex;

    @Column(name = "staff_birthday")
    private Date staffBirthday;

    private String xingzuo;

    private String country;

    @Column(name = "year_earn")
    private String yearEarn;

    @Column(name = "marriage_state")
    private String marriageState;

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
     * @return nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @param nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * @return realname
     */
    public String getRealname() {
        return realname;
    }

    /**
     * @param realname
     */
    public void setRealname(String realname) {
        this.realname = realname;
    }

    /**
     * @return staff_head
     */
    public String getStaffHead() {
        return staffHead;
    }

    /**
     * @param staffHead
     */
    public void setStaffHead(String staffHead) {
        this.staffHead = staffHead;
    }

    /**
     * @return staff_sex
     */
    public Integer getStaffSex() {
        return staffSex;
    }

    /**
     * @param staffSex
     */
    public void setStaffSex(Integer staffSex) {
        this.staffSex = staffSex;
    }

    /**
     * @return staff_birthday
     */
    public Date getStaffBirthday() {
        return staffBirthday;
    }

    /**
     * @param staffBirthday
     */
    public void setStaffBirthday(Date staffBirthday) {
        this.staffBirthday = staffBirthday;
    }

    /**
     * @return xingzuo
     */
    public String getXingzuo() {
        return xingzuo;
    }

    /**
     * @param xingzuo
     */
    public void setXingzuo(String xingzuo) {
        this.xingzuo = xingzuo;
    }

    /**
     * @return country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return year_earn
     */
    public String getYearEarn() {
        return yearEarn;
    }

    /**
     * @param yearEarn
     */
    public void setYearEarn(String yearEarn) {
        this.yearEarn = yearEarn;
    }

    /**
     * @return marriage_state
     */
    public String getMarriageState() {
        return marriageState;
    }

    /**
     * @param marriageState
     */
    public void setMarriageState(String marriageState) {
        this.marriageState = marriageState;
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