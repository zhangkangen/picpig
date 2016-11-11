package com.zhang.picpig.service.impl;

import com.zhang.picpig.dao.SUserDao;
import com.zhang.picpig.mapper.SUserMapper;
import com.zhang.picpig.service.SUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zhang on 2016/11/10.
 */
@Service
public class SUserServiceImpl implements SUserService {

    @Resource
    private SUserDao sUserDao;

    public String getNameById(Integer id) {
        return "nihaoma";
    }
}
