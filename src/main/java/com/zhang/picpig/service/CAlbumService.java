package com.zhang.picpig.service;

import com.zhang.picpig.core.ResMsg;
import com.zhang.picpig.entity.CAlbum;

import java.util.List;

/**
 * Created by zhang on 2016/11/12.
 */
public interface CAlbumService {
    List<CAlbum> findAllByUserId(Integer userId);

    CAlbum getByNameUserId(CAlbum cAlbum);

    void save(CAlbum cAlbum);

    ResMsg delete(Integer id);
}
