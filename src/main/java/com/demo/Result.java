package com.demo;

/**
 * Created by yzeng on 21/12/2016.
 */
public class Result {
    private int status;
    private String erroMsg;

    public Result(Integer status, String erroMsg) {
        this.status = status;
        this.erroMsg = erroMsg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getErroMsg() {
        return erroMsg;
    }

    public void setErroMsg(String erroMsg) {
        this.erroMsg = erroMsg;
    }
}
