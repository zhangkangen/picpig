package com.zhang.picpig.service;

import com.zhang.picpig.entity.SUser;

/**
 * Created by zhang on 2016/11/10.
 */
public interface SUserService {
    SUser getUser(Integer id);

    /**
     * 根据用户名获取用户
     * @param username
     * @return
     */
    SUser getUserByUsername(String username);
    void save(SUser user);
}
