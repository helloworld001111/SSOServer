package com.dubei.sso.common;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;

public class Result<T> implements Serializable {
    private ObjectMapper objectMapper = new ObjectMapper();
    private T data;
    private String desc = "执行失败!";
    private int code = 500;

    public Result() {
    }

    public static <T> Result<T> fail() {
        return new Result();
    }

    public static <T> Result<T> fail(String desc,T t) {
        Result<T> result = fail();
        result.setDesc(desc);
        result.setData(t);
        return result;
    }

    public static <T> Result<T> fail(T t) {
        Result<T> result = fail();
        result.setData(t);
        return result;
    }

    public static <T> Result<T> fail(String desc) {
        Result<T> result = fail();
        result.setDesc(desc);
        return result;
    }

    public static <T> Result<T> success(String desc,T data) {
        Result<T> result = success();
        result.setDesc(desc);
        result.setData(data);
        return result;
    }

    public static <T> Result<T> success(String desc) {
        Result<T> result = success();
        result.setDesc(desc);
        return result;
    }

    public static <T> Result<T> success() {
        Result<T> result = new Result();
        result.setDesc(ResponseCode.UOK.getDesc());
        result.setCode(ResponseCode.UOK.getCode());
        return result;
    }

    public static <T> Result<T> success(T t) {
        Result<T> result = success();
        result.setData(t);
        return result;
    }


    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }


    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Result{" +
                "objectMapper=" + objectMapper +
                ", data=" + data +
                ", desc='" + desc + '\'' +
                ", code=" + code +
                '}';
    }
}
