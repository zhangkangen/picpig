package com.zhang.picpig.interceptor;

import com.zhang.picpig.entity.SUser;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.annotation.Resource;

/**
 * Created by zhang on 2016/11/11.
 */
public class AuthInterceptor extends HandlerInterceptorAdapter {


    @Override
    public boolean preHandle(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, Object handler) throws Exception {
        SUser user = null;

        if (user==null){
            response.sendRedirect("/member/login");
            return false;
        }

        return super.preHandle(request, response, handler);
    }
}
