package com.example.mysqldemo.response;

import com.example.mysqldemo.response.code.BasicServiceCode;
import com.example.mysqldemo.response.code.ServiceCode;
import com.example.mysqldemo.response.list.ListResult;
import io.swagger.annotations.ApiModel;

import java.util.List;

/**
 * @author Sunny.Zeng
 * @date 2020-09-11
 */
@ApiModel(description = "返回信息")
@SuppressWarnings("unchecked")
public class ListResultWrapper<T> extends ResultWrapper<ListResult<T>> {

    public ListResultWrapper() {
        super();
    }

    public ListResultWrapper(int status, String info, List<T> data) {
        super(status, info, new ListResult<>(data));
    }

    //region ----------------------------------------------------------------------------------------------------------

    public static <T> ListResultWrapper<T> ok(List<T> data) {
        return create(BasicServiceCode.SUCCESS, data);
    }

    public static ListResultWrapper<Void> success() {
        return create(BasicServiceCode.SUCCESS);
    }

    public static <T> ListResultWrapper<T> success(List<T> data) {
        return create(BasicServiceCode.SUCCESS, data);
    }

    public static <T> ListResultWrapper<T> success(List<T> data, ServiceCode code) {
        return create(code, data);
    }

    public static ListResultWrapper<Void> successInfo(String info) {
        return create(BasicServiceCode.SUCCESS.getStatus(), info, null);
    }

    public static <T> ListResultWrapper<T> success(List<T> data, String info) {
        return create(BasicServiceCode.SUCCESS.getStatus(), info, data);
    }

    public static ListResultWrapper<Void> error() {
        return create(BasicServiceCode.FAILED);
    }

    public static ListResultWrapper<Void> error(String info) {
        return create(BasicServiceCode.FAILED.getStatus(), info, null);
    }

    public static ListResultWrapper<Void> error(ServiceCode serviceError) {
        return create(serviceError);
    }

    public static ListResultWrapper<Void> error(ServiceCode serviceError, String info) {
        return create(serviceError.getStatus(), info, null);
    }

    public static ListResultWrapper<Void> errorInfo(String info) {
        return create(BasicServiceCode.FAILED.getStatus(), info, null);
    }

    public static <T> ListResultWrapper<T> errorData(List<T> data, String info) {
        return create(BasicServiceCode.FAILED.getStatus(), info, data);
    }

    //endregion ----------------------------------------------------------------------------------------------------------

    private static <T> ListResultWrapper<T> create(int status, String info, List<T> data) {
        return new ListResultWrapper<>(status, info, data);
    }

    private static <T> ListResultWrapper<T> create(ServiceCode serviceCode) {
        return create(serviceCode.getStatus(), serviceCode.getInfo(), null);
    }

    private static <T> ListResultWrapper<T> create(ServiceCode serviceCode, List<T> data) {
        return create(serviceCode.getStatus(), serviceCode.getInfo(), data);
    }

}
