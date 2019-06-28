package com.reponse;

import com.enums.StatusCode;

import java.io.Serializable;

/**
 * Description:
 *
 * @author:yh
 * @date:2019/6/25 23:04
 */
public class DataResponse<T> implements Serializable {
    private Integer code;
    private String msg;
    private T data;

    public DataResponse() {
    }

    public DataResponse(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public DataResponse(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public DataResponse(StatusCode statusCode) {
        this.code = statusCode.getCode();
        this.msg = statusCode.getMsg();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
