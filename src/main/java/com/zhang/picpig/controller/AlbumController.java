package com.zhang.picpig.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @author zxk
 * @date 2018-01-06 23:28:27
 */
@Api(value = "相册相关api", tags = "相册相关api")
@Controller
@RequestMapping("album")
public class AlbumController {


    /**
     * 相册详情
     *
     * @param id
     * @return
     */
    @ApiIgnore
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String albumIndex(@PathVariable Integer id) {
        return "album/album";
    }

    /**
     * 个人相册列表
     *
     * @param id
     * @return
     */
    @ApiIgnore
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public String userAlbums(@PathVariable Integer id) {
        return "album/albums";
    }

    /**
     * 添加相册
     *
     * @return
     */
    @ApiOperation(value = "添加相册",notes = "添加相册")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String add() {
        return "ok";
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    @ResponseBody
    public String update() {
        return "相册修改";
    }

    @RequestMapping(value = "", method = RequestMethod.DELETE)
    @ResponseBody
    public String del() {
        return "相册已删除";
    }

}
