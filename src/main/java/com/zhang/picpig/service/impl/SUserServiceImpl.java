package com.zhang.picpig.service.impl;

import com.zhang.picpig.mapper.SUserMapper;
import com.zhang.picpig.service.SUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zhang on 2016/11/10.
 */
@Service
public class SUserServiceImpl implements SUserService {

    @Resource(name = "sUserMapper")
    SUserMapper sUserMapper;

    public String getNameById(Integer id) {
        Integer count = sUserMapper.count();
        System.out.println(count);
        return "nihaoma";
    }
}
