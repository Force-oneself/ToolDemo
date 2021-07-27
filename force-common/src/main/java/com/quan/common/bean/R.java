package com.quan.common.bean;

import com.quan.common.constant.Code;

import java.io.Serializable;

/**
 * @Description: 统一返回实体
 * @Author force-oneself
 * @Date 2021-01-09
 **/
public class R<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private int code;

    private T data;

    private String msg;

    private Long timestamp = System.currentTimeMillis();

    public R() {
        this.code = Code.OK.getCode();
        this.msg = Code.OK.getMsg();
    }

    public R(T data) {
        this();
        this.data = data;
    }

    public R(Throwable e) {
        this.code = Code.ERROR.getCode();
        this.msg = e.getMessage();
    }

    public static <T> R<T> ok() {
        return new R<T>();
    }

    public static <T> R<T> ok(T data) {
        return new R<T>(data);
    }

    public static <T> R<T> fail() {
        return fail(null, Code.ERROR.getCode(), Code.ERROR.getMsg());
    }

    public static <T> R<T> fail(int code, String msg) {
        return fail(null, code, msg);
    }

    public static <T> R<T> fail(T data) {
        return fail(data, Code.ERROR);
    }

    public static <T> R<T> fail(T data, Code failCode) {
        return fail(data, failCode.getCode(), failCode.getMsg());
    }

    public static <T> R<T> fail(Code failCode) {
        return fail(null, failCode);
    }

    public static <T> R<T> fail(T data, int code, String msg) {
        return new R<T>().code(code).msg(msg).data(data);
    }

    public R<T> code(int code) {
        this.code = code;
        return this;
    }

    public R<T> msg(String msg) {
        this.msg = msg;
        return this;
    }

    public R<T> data(T data) {
        this.data = data;
        return this;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
