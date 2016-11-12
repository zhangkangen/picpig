package com.zhang.picpig.mapper;

import com.zhang.picpig.entity.CAlbum;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by zhang on 2016/11/12.
 */
@CacheNamespace(size = 512)
public interface CAlbumMapper {

    @Select("select * from calbum where createdBy = #{userId} and isDeleted = 0")
    List<CAlbum> findAllByUserId(@Param("userId") Integer userId);

    @Select("select * from calbum where createdBy = #{createdBy} and albumName=#{albumName} and isDeleted = 0 limit 1")
    CAlbum getByNameUserId(@Param("album") CAlbum album);

    @Insert("insert into calbum(albumName,createdBy,createTime) values(#{albumName},#{createdBy},#{createTime})")
    void save(@Param("album") CAlbum album);
    @Select("select * from calbum where id = #{id} and isDeleted = 0")
    CAlbum get(@Param("id") Integer id);

    @Update("update calbum set isDeleted = 1 where id = #{id}")
    void delete(@Param("id") Integer id);
}
