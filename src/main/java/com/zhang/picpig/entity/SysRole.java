package com.zhang.picpig.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_role")
public class SysRole {
    @Id
    @Column(name = "role_id")
    private Integer roleId;

    /**
     * 角色名
     */
    @Column(name = "role_name")
    private String roleName;

    @Column(name = "role_desc")
    private String roleDesc;

    /**
     * 最大权限的值
     */
    private String rights;

    @Column(name = "add_qx")
    private String addQx;

    @Column(name = "del_qx")
    private String delQx;

    @Column(name = "edit_qx")
    private String editQx;

    @Column(name = "query_qx")
    private String queryQx;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "create_time")
    private Date createTime;

    /**
     * @return role_id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * @param roleId
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取角色名
     *
     * @return role_name - 角色名
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 设置角色名
     *
     * @param roleName 角色名
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * @return role_desc
     */
    public String getRoleDesc() {
        return roleDesc;
    }

    /**
     * @param roleDesc
     */
    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    /**
     * 获取最大权限的值
     *
     * @return rights - 最大权限的值
     */
    public String getRights() {
        return rights;
    }

    /**
     * 设置最大权限的值
     *
     * @param rights 最大权限的值
     */
    public void setRights(String rights) {
        this.rights = rights;
    }

    /**
     * @return add_qx
     */
    public String getAddQx() {
        return addQx;
    }

    /**
     * @param addQx
     */
    public void setAddQx(String addQx) {
        this.addQx = addQx;
    }

    /**
     * @return del_qx
     */
    public String getDelQx() {
        return delQx;
    }

    /**
     * @param delQx
     */
    public void setDelQx(String delQx) {
        this.delQx = delQx;
    }

    /**
     * @return edit_qx
     */
    public String getEditQx() {
        return editQx;
    }

    /**
     * @param editQx
     */
    public void setEditQx(String editQx) {
        this.editQx = editQx;
    }

    /**
     * @return query_qx
     */
    public String getQueryQx() {
        return queryQx;
    }

    /**
     * @param queryQx
     */
    public void setQueryQx(String queryQx) {
        this.queryQx = queryQx;
    }

    /**
     * @return user_id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
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