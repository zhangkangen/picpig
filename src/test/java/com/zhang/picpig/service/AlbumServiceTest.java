package com.zhang.picpig.service;

import com.zhang.picpig.entity.customer.Album;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AlbumServiceTest {

    @Autowired
    private AlbumService albumService;

    @Test
    public void testInsert(){
        Album album = new Album();

        albumService.insert(album);
        System.out.println(album);
    }
}
