package com.zhang.picpig.entity;

import java.util.Date;

/**
 * Created by zhang on 2016/11/12.
 */
public class CPhoto {
    private int id;
    private int albumId;
    private String photoName;
    private String photoUrl;
    private String photoKey; //七牛存储
    private Integer createdBy;
    private Date createTime;
    private Integer modifyBy;
    private Date modityTime;
    private Boolean isDeleted;
}
