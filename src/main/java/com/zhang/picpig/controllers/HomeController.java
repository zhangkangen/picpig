package com.zhang.picpig.controllers;

import com.zhang.picpig.service.SUserService;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zhang on 2016/11/10.
 */
@Controller
public class HomeController {

    //@Resource
    //public SUserService sUserService;

    @RequestMapping("/index")
    public String index(HttpServletRequest request, HttpServletResponse response){
        return "index";
    }
}
