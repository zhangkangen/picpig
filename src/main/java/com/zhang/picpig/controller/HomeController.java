package com.zhang.picpig.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zxk
 */
@Controller
public class HomeController {


    @RequestMapping("")
    @ResponseBody
    public String index(){
        return "Hello World";
    }
}
