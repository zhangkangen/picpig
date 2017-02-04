package com.zhang.picpig.dao.impl;

import com.zhang.picpig.dao.CAlbumDao;
import com.zhang.picpig.entity.CAlbum;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhang on 2016/11/12.
 */
public class CAlbumDaoImpl implements CAlbumDao {

    @Resource
    SqlSessionTemplate sqlSessionTemplate;

    public List<CAlbum> findAllByUserId(Integer userId) {
        return sqlSessionTemplate.selectList("com.zhang.picpig.mapper.CAlbumMapper.findAllByUserId", userId);
    }

    @Override
    public CAlbum getByNameUserId(CAlbum cAlbum) {
        return sqlSessionTemplate.selectOne("com.zhang.picpig.mapper.CAlbumMapper.getByNameUserId", cAlbum);
    }

    @Override
    public void save(CAlbum cAlbum) {
        sqlSessionTemplate.insert("com.zhang.picpig.mapper.CAlbumMapper.save", cAlbum);
    }

    @Override
    public CAlbum get(Integer id) {
        return sqlSessionTemplate.selectOne("com.zhang.picpig.mapper.CAlbumMapper.get", id);
    }

    @Override
    public void delete(Integer id) {
        sqlSessionTemplate.update("com.zhang.picpig.mapper.CAlbumMapper.delete", id);
    }
}
