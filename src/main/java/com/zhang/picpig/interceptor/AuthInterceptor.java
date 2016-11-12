package com.zhang.picpig.interceptor;

import com.zhang.picpig.core.SecurityUtil;
import com.zhang.picpig.core.UserContext;
import com.zhang.picpig.entity.SUser;
import com.zhang.picpig.service.SUserService;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.net.HttpCookie;
import java.util.Calendar;
import java.util.Date;

import static org.apache.commons.lang.StringUtils.split;

/**
 * Created by zhang on 2016/11/11.
 */
public class AuthInterceptor extends HandlerInterceptorAdapter {

    Logger logger = Logger.getLogger(AuthInterceptor.class);

    @Resource
    SUserService sUserService;

    @Override
    public boolean preHandle(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, Object handler) throws Exception {
        SUser user = null;
        System.out.println("执行了拦截器");

        Cookie token = null;
        Cookie[] cookies = request.getCookies();
        if (null != cookies && cookies.length > 0) {
            for (Cookie cookie : cookies) {
                if (("Auth_Token").equals(cookie.getName())) {
                    token = cookie;
                }
            }
        }

        logger.debug("Auth_Token值:" + token.getValue());

        if (token == null || "".equals(token.getValue())) {
            response.sendRedirect("/member/login");
            return false;
        }
        String[] strs = token.getValue().split(":");

        Integer id = Integer.parseInt(strs[0]);
        Long timestemp = Long.parseLong(strs[1]);
        String md5 = strs[2];

        user = sUserService.getUser(id);
        if (user == null) {
            response.sendRedirect("/member/login");
            return false;
        }
        //校验时间戳
        if (Calendar.getInstance().getTimeInMillis() > timestemp) {

        }
        //校验签名
        String resultToken = SecurityUtil.GetMD5Code(user.getId() + ":" + user.getPassword() + ":" + timestemp + ":secret");
        if (!resultToken.equals(md5)) {
            response.sendRedirect("/member/login");
            return false;
        }
        //更新签名
        Calendar calender = Calendar.getInstance();
        calender.add(Calendar.MINUTE, 20);
        Long newTimestemp = calender.getTimeInMillis();

        String newMd5 = SecurityUtil.GetMD5Code(user.getId() + ":" + user.getPassword() + ":" + newTimestemp + ":" + "secret");
        String newToken = user.getId() + ":" + newTimestemp + ":" + newMd5;
        Cookie cookie = new Cookie("Auth_Token", newToken);
        cookie.setMaxAge(20 * 60);
        cookie.setPath("/");
        response.addCookie(cookie);
        UserContext.setCurrentUser(user);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

        super.postHandle(request, response, handler, modelAndView);
    }


}
