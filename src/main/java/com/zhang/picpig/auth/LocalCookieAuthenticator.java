package com.zhang.picpig.auth;

import com.zhang.picpig.entity.SUser;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zhang on 2016/11/11.
 */
public class LocalCookieAuthenticator implements IAuthenticator {
    public SUser authenticate(HttpServletRequest request, HttpServletResponse response) {
        String cookie = getCookieFromRequest(request,"");
        if (cookie == null){
            return  null;
        }
        return getUserByCookie(cookie);
    }
    public SUser getUserByCookie(String cookie){
        //TODO 实现获取用户
        return null;
    }
    public String getCookieFromRequest(HttpServletRequest request,String key){
        //TODO 获取 cookie
        return "";
    }
}
