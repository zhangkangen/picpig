package com.zhang.picpig.mapper;

import com.zhang.picpig.entity.SUser;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;

/**
 * Created by zhang on 2016/11/10.
 */
@CacheNamespace(size = 512)
public interface SUserMapper {
    public SUser get(@Param("id") Integer id);
}
