package com.zhang.picpig.interceptor;

import com.zhang.picpig.entity.SUser;
import com.zhang.picpig.service.SUserService;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Date;

import static org.apache.commons.lang.StringUtils.split;

/**
 * Created by zhang on 2016/11/11.
 */
public class AuthInterceptor extends HandlerInterceptorAdapter {

    @Resource
    SUserService sUserService;

    @Override
    public boolean preHandle(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, Object handler) throws Exception {
        SUser user = null;
        System.out.println("执行了拦截器");
        String token = "";
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("Auth_Token")) {
                token = cookie.getValue();
            }
        }
        System.out.println(token);
        if (token == null || token.equals("")) {
            response.sendRedirect("/member/login");
            return  false;
        }
        //TODO 获取 id

        String[] strs = token.split(":");

        Integer id = Integer.parseInt(strs[0]);
        Date cookieDate = new Date(Long.parseLong(strs[1]));
        String md5 = strs[2];

        System.out.println(id);
        System.out.println(cookieDate.toString());
        System.out.println(md5);

        user = sUserService.getUser(id);
        if (user == null) {
            response.sendRedirect("/member/login");
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

        Cookie[] cookies = request.getCookies();

        super.postHandle(request, response, handler, modelAndView);
    }
}
