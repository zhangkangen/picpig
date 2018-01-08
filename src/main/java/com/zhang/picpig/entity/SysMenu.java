package com.zhang.picpig.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_menu")
public class SysMenu {
    @Id
    @Column(name = "menu_id")
    private Integer menuId;

    @Column(name = "parent_id")
    private Integer parentId;

    @Column(name = "menu_name")
    private String menuName;

    @Column(name = "menu_url")
    private String menuUrl;

    /**
     * 1 -- 系统菜单，2 -- 业务菜单
     */
    @Column(name = "menu_type")
    private String menuType;

    @Column(name = "menu_icon")
    private String menuIcon;

    @Column(name = "sort_num")
    private Integer sortNum;

    /**
     * 创建这个菜单的用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 1-- 删除状态，0 -- 正常
     */
    @Column(name = "is_del")
    private Integer isDel;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "create_time")
    private Date createTime;

    /**
     * @return menu_id
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * @param menuId
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
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
     * @return menu_name
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * @param menuName
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    /**
     * @return menu_url
     */
    public String getMenuUrl() {
        return menuUrl;
    }

    /**
     * @param menuUrl
     */
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    /**
     * 获取1 -- 系统菜单，2 -- 业务菜单
     *
     * @return menu_type - 1 -- 系统菜单，2 -- 业务菜单
     */
    public String getMenuType() {
        return menuType;
    }

    /**
     * 设置1 -- 系统菜单，2 -- 业务菜单
     *
     * @param menuType 1 -- 系统菜单，2 -- 业务菜单
     */
    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    /**
     * @return menu_icon
     */
    public String getMenuIcon() {
        return menuIcon;
    }

    /**
     * @param menuIcon
     */
    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
    }

    /**
     * @return sort_num
     */
    public Integer getSortNum() {
        return sortNum;
    }

    /**
     * @param sortNum
     */
    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }

    /**
     * 获取创建这个菜单的用户id
     *
     * @return user_id - 创建这个菜单的用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置创建这个菜单的用户id
     *
     * @param userId 创建这个菜单的用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取1-- 删除状态，0 -- 正常
     *
     * @return is_del - 1-- 删除状态，0 -- 正常
     */
    public Integer getIsDel() {
        return isDel;
    }

    /**
     * 设置1-- 删除状态，0 -- 正常
     *
     * @param isDel 1-- 删除状态，0 -- 正常
     */
    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
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
}