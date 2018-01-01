package com.zhang.picpig.dao.customer;


import com.zhang.picpig.entity.customer.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserDaoTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testGet(){
        User user  = userMapper.selectByPrimaryKey(1);
        Assert.assertNotNull(user);
    }
}
