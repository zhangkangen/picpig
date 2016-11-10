package com.zhang.picpig.controllers;

import com.zhang.picpig.service.SUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by zhang on 2016/11/10.
 */
@Controller
public class HomeController {

    @Resource
    public SUserService sUserService;

    @RequestMapping("/index")
    public String index(){
        String str = sUserService.getNameById(1);
        System.out.println(str);
        System.out.println("ok");
        return "index";
    }
}
