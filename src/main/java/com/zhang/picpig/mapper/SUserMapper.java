package com.zhang.picpig.mapper;

import com.zhang.picpig.entity.SUser;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

/**
 * Created by zhang on 2016/11/10.
 */
@CacheNamespace(size = 512)
public interface SUserMapper {

    @Select("select count(*) from SUser")
    public Integer count();
}
