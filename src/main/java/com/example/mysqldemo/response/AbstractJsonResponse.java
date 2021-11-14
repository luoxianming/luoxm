package com.example.mysqldemo.response;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author Sunny.Zeng
 * @date 2020-09-11
 */
public abstract class AbstractJsonResponse implements JsonResponse {

    @ApiModelProperty(value = "返回状态码")
    protected int status;
    @ApiModelProperty(value = "返回描述信息")
    protected String info;

    @Override
    public int getStatus() {
        return this.status;
    }

    @Override
    public String getInfo() {
        return this.info;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
