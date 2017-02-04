package com.zhang.picpig.service.impl;

import com.zhang.picpig.dao.SUserDao;
import com.zhang.picpig.entity.SUser;
import com.zhang.picpig.service.SUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zhang on 2016/11/10.
 */
public class SUserServiceImpl implements SUserService {

    @Resource
    private SUserDao sUserDao;

    public String getNameById(Integer id) {
        return "nihaoma";
    }

    public SUser getUser(Integer id) {
        return sUserDao.getUser(id);
    }

    /**
     * 根据用户名获取用户
     *
     * @param username
     * @return
     */
    public SUser getUserByUsername(String username) {
        return sUserDao.getByUsername(username);
    }

    public void save(SUser user){
        sUserDao.save(user);
    }
}
