package com.zhang.picpig.service.impl;

import com.zhang.picpig.core.ResMsg;
import com.zhang.picpig.dao.CAlbumDao;
import com.zhang.picpig.entity.CAlbum;
import com.zhang.picpig.service.CAlbumService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhang on 2016/11/12.
 */
@Service
public class CAlbumServiceImpl  implements CAlbumService{
    @Resource
    CAlbumDao cAlbumDao;
    public List<CAlbum> findAllByUserId(Integer userId) {
        if (null == userId){
            return new ArrayList<CAlbum>();
        }
        return cAlbumDao.findAllByUserId(userId);
    }

    @Override
    public CAlbum getByNameUserId(CAlbum cAlbum) {
        return cAlbumDao.getByNameUserId(cAlbum);
    }

    @Override
    public void save(CAlbum cAlbum) {
        cAlbumDao.save(cAlbum);
    }

    @Override
    public ResMsg delete(Integer id) {
        if (null == id){
            return ResMsg.buildError("此相册不存在");
        }
        CAlbum cAlbum = cAlbumDao.get(id);
        if (null==cAlbum){
            return ResMsg.buildError("此相册存在");
        }
        //TODO 相册中是否有图片
        //TODO 删除相册
        cAlbumDao.delete(id);
        return ResMsg.buildSuccess("此相册已删除");
    }
}
