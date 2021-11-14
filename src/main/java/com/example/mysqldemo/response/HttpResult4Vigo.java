package com.example.mysqldemo.response;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Vigo返回值
 *
 * @author Sunny.Zeng
 * @date 2020-09-11
 */
@Data
@NoArgsConstructor
public class HttpResult4Vigo<T> implements Serializable {
    private static final long serialVersionUID = -5165880283717404909L;

    /**
     * 成功返回code
     */
    public static final String SUCCESS_CODE = "success";

    /**
     * 请求Id
     */
    private String requestId;

    /**
     * 状态码
     */
    private String code;

    /**
     * 错误描述
     */
    private String message;

    /**
     * 返回数据
     */
    private T data;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
