package com.zhang.picpig.dao;

import com.zhang.picpig.entity.CAlbum;

import java.util.List;

/**
 * Created by zhang on 2016/11/12.
 */
public interface CAlbumDao {
    List<CAlbum> findAllByUserId(Integer userId);
    CAlbum getByNameUserId(CAlbum cAlbum);

    void save(CAlbum cAlbum);

    CAlbum get(Integer id);

    void delete(Integer id);
}
