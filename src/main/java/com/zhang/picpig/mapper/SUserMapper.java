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

    @Select("select * from SUser where id=#{id}")
    public SUser getUser(@Param("id")Integer id);

    @Select("select * from SUser where username=#{username}")
    public SUser getUserByUsername(@Param("username")String username);

    @Insert("insert into SUser(username,password) values(#{username},#{password})")
    public void insert(@Param("SUser") SUser user);
}
