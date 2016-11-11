package com.zhang.picpig.auth;

import com.zhang.picpig.entity.SUser;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zhang on 2016/11/11.
 */
public interface IAuthenticator {
    SUser authenticate(HttpServletRequest request, HttpServletResponse response);
}
