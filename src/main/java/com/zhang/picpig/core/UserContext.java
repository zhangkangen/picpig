package com.zhang.picpig.core;

import com.zhang.picpig.entity.SUser;

/**
 * Created by zhang on 2016/11/11.
 */
public class UserContext {
    static final ThreadLocal<SUser> current = new ThreadLocal<SUser>();

    public UserContext(SUser user){
        current.set(user);
    }

    public static SUser getCurrentUser(){
        return current.get();
    }
    public void close(){
        current.remove();;
    }
}
