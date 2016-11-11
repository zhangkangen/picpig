package com.zhang.picpig.controllers;

import com.zhang.picpig.core.SecurityUtil;
import com.zhang.picpig.entity.SUser;
import com.zhang.picpig.service.SUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sun.security.provider.MD5;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by zhang on 2016/11/11.
 */
@Controller
@RequestMapping("/member")
public class MemberController {

    @Resource
    SUserService sUserService;

    @RequestMapping(value = {"/", "/login"}, method = RequestMethod.GET)
    public String login() {
        return "member/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(SUser user, HttpServletRequest request, HttpServletResponse response) {

        SUser entity = sUserService.getUserByUsername(user.getUsername());
        if (entity == null) {
            System.out.println("用户名不存在");
        }
        if (!entity.getPassword().equals(user.getPassword())) {
            System.out.println("密码不正确");
        }

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MINUTE, 20);

        String token = entity.getId() + ":" + entity.getPassword() + ":" + calendar.getTimeInMillis() + "secret";

        String md5Token = SecurityUtil.GetMD5Code(token);

        String cookieValue = entity.getId() + ":" + calendar.getTimeInMillis() + ":" + md5Token;

        Cookie cookie = new Cookie("Auth_Token", cookieValue);
        cookie.setMaxAge(20 * 60);
        cookie.setPath("/");
        response.addCookie(cookie);
        return "redirect:/index";
    }

    @RequestMapping(value = "/reg", method = RequestMethod.GET)
    public String reg() {
        return "member/reg";
    }

    @RequestMapping(value = "/reg", method = RequestMethod.POST)
    public String reg(SUser user) {

        //TODO 判断用户名是否存在
        SUser entity = sUserService.getUserByUsername(user.getUsername());
        if (null == entity) {
            //TODO 添加用户
            sUserService.save(user);
        } else {
            System.out.println("用户名已存在");
            return "member/reg";
        }
        return "redirect:/index";
    }
}
