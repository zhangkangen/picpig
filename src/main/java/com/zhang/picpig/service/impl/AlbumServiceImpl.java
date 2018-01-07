package com.zhang.picpig.service.impl;

import com.zhang.picpig.dao.customer.AlbumMapper;
import com.zhang.picpig.entity.customer.Album;
import com.zhang.picpig.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zxk
 * @date 2018-01-07 19:37:59
 */
@Service
public class AlbumServiceImpl implements AlbumService {

    @Autowired
    private AlbumMapper albumMapper;

    @Override
    public Integer insert(Album album) {
        return albumMapper.insert(album);
    }
}
