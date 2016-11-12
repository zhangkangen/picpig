package com.zhang.picpig.core;

/**
 * Created by zhang on 2016/11/13.
 */
public class ResMsg {
    private Boolean success;
    private String msg;

    public static ResMsg buildSuccess(String msg){
        return  new ResMsg(true,msg);
    }
    public static ResMsg buildError(String msg){
        return new ResMsg(false,msg);
    }

    public ResMsg(Boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
