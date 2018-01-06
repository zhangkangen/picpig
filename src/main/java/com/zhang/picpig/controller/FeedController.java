package com.zhang.picpig.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "动态相关api", tags = "动态相关api")
@RestController
public class FeedController {

    @ApiOperation(value = "获取列表",notes = "获取列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String index() {
        return "ok";
    }
}
