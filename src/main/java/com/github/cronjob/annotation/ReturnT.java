package com.github.cronjob.annotation;

import java.io.Serializable;


public class ReturnT<T> implements Serializable {
    public static final long serialVersionUID = 42L;

    public static final ReturnT<String> SUCCESS = new ReturnT<String>();
    public static final ReturnT<String> FAIL = new ReturnT<String>(false, null);

    private boolean success;
    private String msg = "default message";

    public ReturnT() {
        this.success = true;
    }

    public ReturnT(boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public ReturnT<T> setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public boolean getSuccess() {
        return success;
    }

    public String getMsg() {
        return msg;
    }

    public ReturnT<T> setMsg(String msg) {
        this.msg = msg;
        return this;
    }


    @Override
    public String toString() {
        return "ReturnT [success=" + success + ", msg=" + msg + "]";
    }

}