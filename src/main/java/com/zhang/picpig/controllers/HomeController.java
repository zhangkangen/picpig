package com.zhang.picpig.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhang on 2016/11/10.
 */
@Controller
public class HomeController {

    @RequestMapping("/index")
    public String index(){
        System.out.println("ok");
        return "index";
    }
}
