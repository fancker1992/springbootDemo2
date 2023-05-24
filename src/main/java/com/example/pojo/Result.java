package com.example.pojo;

public class Result {

    public int code;
    public String msg;
    public Object data;

    public Result() {
    }

    public Result(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static Result success() {
        // 增删改 成功响应(不需要给前端返回数据)
        return new Result(0, "success", null);
    }

    public static Result success(Object data) {
        //查询  成功响应(把查询结果做为返回数据响应给前端)
        return new Result(0, "success", data);
    }


    public static Result error(String msg) {
        //失败响应
        return new Result(-1, msg, null);
    }
}
