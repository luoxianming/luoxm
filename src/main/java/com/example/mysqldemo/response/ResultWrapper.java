package com.example.mysqldemo.response;

import com.alibaba.fastjson.JSON;
import com.example.mysqldemo.response.code.BasicServiceCode;
import com.example.mysqldemo.response.code.ServiceCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author Sunny.Zeng
 * @date 2020-09-11
 */
@ApiModel(description = "返回信息")
public class ResultWrapper<T> extends AbstractJsonResponse implements Serializable {

    private static final long serialVersionUID = -3032015199552656978L;

    @ApiModelProperty(value = "返回参数")
    private T result;

    @ApiModelProperty(value = "返回参数")
    private T data;

    public ResultWrapper() {
    }

    public ResultWrapper(int status, String info, T result) {
        this.status = status;
        this.info = info;
        this.result = result;
    }

    //region ----------------------------------------------------------------------------------------------------------

    public static <T> ResultWrapper<T> success() {
        return create(BasicServiceCode.SUCCESS);
    }

    public static <T> ResultWrapper<T> success(T data) {
        return create(BasicServiceCode.SUCCESS, data);
    }

    public static <T> ResultWrapper<T> success(T data, ServiceCode code) {
        return create(code, data);
    }

    public static <T> ResultWrapper<T> success(String info) {
        return create(BasicServiceCode.SUCCESS.getStatus(), info, null);
    }

    public static <T> ResultWrapper<T> success(T data, String info) {
        return create(BasicServiceCode.SUCCESS.getStatus(), info, data);
    }

    public static <T> ResultWrapper<T> error() {
        return create(BasicServiceCode.FAILED);
    }

    public static <T> ResultWrapper<T> error(String info) {
        return create(BasicServiceCode.FAILED.getStatus(), info, null);
    }

    public static <T> ResultWrapper<T> error(ServiceCode serviceError) {
        return create(serviceError);
    }

    public static <T> ResultWrapper<T> error(ServiceCode serviceError, String info) {
        return create(serviceError.getStatus(), info, null);
    }

    public static <T> ResultWrapper<T> errorInfo(String info) {
        return create(BasicServiceCode.FAILED.getStatus(), info, null);
    }

    public static <T> ResultWrapper<T> errorData(T data, String info) {
        return create(BasicServiceCode.FAILED.getStatus(), info, data);
    }

    //endregion ----------------------------------------------------------------------------------------------------------

    private static <T> ResultWrapper<T> create(int status, String info, T data) {
        return new ResultWrapper<>(status, info, data);
    }

    private static <T> ResultWrapper<T> create(ServiceCode serviceCode) {
        return create(serviceCode.getStatus(), serviceCode.getInfo(), null);
    }

    private static <T> ResultWrapper<T> create(ServiceCode serviceCode, T data) {
        return create(serviceCode.getStatus(), serviceCode.getInfo(), data);
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    /**
     * 转Json字符串
     *
     * @return Json字符串
     */
    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
