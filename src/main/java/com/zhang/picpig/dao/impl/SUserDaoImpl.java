package com.zhang.picpig.dao.impl;

import com.zhang.picpig.dao.SUserDao;
import com.zhang.picpig.entity.SUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionManager;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by zhang on 2016/11/11.
 */
@Repository
public class SUserDaoImpl implements SUserDao {
    @Resource
    SqlSessionTemplate sqlSessionTemplate;

    public SUser getUser(Integer id) {
        return sqlSessionTemplate.selectOne("com.zhang.picpig.mapper.SUserMapper.getUser", id);
    }

    public SUser getByUsername(String username) {
        return sqlSessionTemplate.selectOne("com.zhang.picpig.mapper.SUserMapper.getUserByUsername", username);
    }

    public void save(SUser user) {
        sqlSessionTemplate.insert("com.zhang.picpig.mapper.SUserMapper.insert", user);
    }
}
