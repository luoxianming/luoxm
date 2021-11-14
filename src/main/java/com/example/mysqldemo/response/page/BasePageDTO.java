package com.example.mysqldemo.response.page;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @author Sunny.Zeng
 * @date 2020-09-11
 */
public abstract class BasePageDTO implements Pageable {

    @ApiModelProperty(value = "当前页面", required = true)
    @Min(value = 1, message = "当前页不能小于1")
    private int pageNum = 1;

    @ApiModelProperty(value = "每页数量", required = true)
    @Min(value = 1, message = "每页的数量不能小于1")
    @Max(value = 100, message = "每页的数量不能大于100")
    private int pageSize = 10;

    @Override
    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    @Override
    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
