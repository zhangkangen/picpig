package com.zhang.picpig.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhang on 2016/11/11.
 */
@Controller
@RequestMapping("/album")
public class AlbumController {

    @RequestMapping("/pic")
    public String pic(){
        return "album/album";
    }
}
