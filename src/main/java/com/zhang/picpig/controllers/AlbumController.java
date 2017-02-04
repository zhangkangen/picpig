package com.zhang.picpig.controllers;

import com.zhang.picpig.core.ResMsg;
import com.zhang.picpig.core.UserContext;
import com.zhang.picpig.entity.CAlbum;
import com.zhang.picpig.entity.SUser;
import com.zhang.picpig.service.CAlbumService;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Created by zhang on 2016/11/11.
 */
@Controller
@RequestMapping("/album")
public class AlbumController {


    Logger logger = Logger.getLogger(AlbumController.class);

    //@Resource
    CAlbumService cAlbumService;

    @RequestMapping("")
    public String album(ModelMap map) {

        SUser user = UserContext.getCurrentUser();

        List<CAlbum> list = cAlbumService.findAllByUserId(user.getId());
        map.addAttribute("title", "相册列表");
        map.addAttribute("albumList", list);
        logger.debug(list.get(0).getAlbumName());
        return "album/album";
    }

    @RequestMapping(value = {"/{id}"})
    public String pic(@PathVariable Integer id) {
        logger.debug(Integer.valueOf(id));
        return "album/album_detail";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(CAlbum cAlbum) {

        cAlbum.setCreatedBy(UserContext.getCurrentUser().getId());

        RedirectAttributesModelMap map = new RedirectAttributesModelMap();
        CAlbum entity = cAlbumService.getByNameUserId(cAlbum);
        if (null != entity) {
            map.addAttribute("ResponseMsg","该相册已存在");
            map.addAttribute("albumList", new ArrayList<Calendar>());
        }else {
            cAlbum.setCreateTime(new Date());
            cAlbumService.save(cAlbum);
            map.addAttribute("ResponseMsg","添加成功");
        }
        return "redirect:/album";
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public @ResponseBody ResMsg delete(@PathVariable Integer id){
        logger.debug(id);
         return cAlbumService.delete(id);
    }

    @RequestMapping(value = "/upload", method = RequestMethod.GET)
    public String upload() {
        return "album/upload";
    }


    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String upload(@RequestParam("file") MultipartFile file) throws IOException {

        FileUtils.copyInputStreamToFile(file.getInputStream(), new File("", ""));

        return "album/upload";
    }
    @RequestMapping("/**")
    public String albumDefault(ModelMap map){
        return "album/album";
    }

}
