package com.zhang.picpig.dao;

import com.zhang.picpig.entity.SUser;

/**
 * Created by zhang on 2016/11/11.
 */
public interface SUserDao {
    SUser getUser(Integer id);
    SUser getByUsername(String username);
    void save(SUser user);
}
