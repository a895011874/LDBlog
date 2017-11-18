package com.dong.HttpUtils;

import java.util.List;

/**
 * Created by Administrator on 2017/11/18.
 */
public class HttpRes
{
    public static final String SUCCESS = "success";

    public static final String FAILURE = "failure";

    //请求状态
    private String state;

    //错误信息
    private String errMsg;

    //返回数据
    private List data;

    public String getState() {
        return state;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public List getData() {
        return data;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public void setData(List data) {
        this.data = data;
    }

}
