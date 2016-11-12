package com.zhang.picpig.core;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhang on 2016/11/13.
 */
public class ResponseMsg<T> {
    private Boolean success;
    private T single;
    private List<T> data = new ArrayList<T>();
    private String msg;

    public ResponseMsg(){

    }

    public ResponseMsg(T single,Boolean success,String msg)
    {
        this.single = single;
        this.success = success;
        this.msg = msg;
    }

    public ResponseMsg(List<T> data, Boolean success,String msg){
        this.data = data;
        this.success = success;
        this.msg = msg;
    }
}

