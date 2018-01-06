package com.zhang.picpig.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @author zxk
 */
@Controller
public class HomeController {


    @ApiIgnore
    @RequestMapping("")
    @ResponseBody
    public String index() {
        return "Hello World";
    }

    @ApiIgnore
    @RequestMapping("login")
    public String login() {
        return "login";
    }
}
