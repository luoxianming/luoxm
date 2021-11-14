package com.example.mysqldemo.response.page;

import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Sunny.Zeng
 * @date 2020-09-11
 */
public class PageResult<T> {

    protected PageResult() {
    }

    /**
     * 当前页
     */
    private int pageNum;

    /**
     * 每页的数量
     */
    private int pageSize;

    /**
     * 当前页的数量
     */
    private int size;

    /**
     * 总页数
     */
    private int pages;

    /**
     * 总记录数
     */
    private long total;

    /**
     * 结果集
     */
    private List<T> list;

    /**
     * 基于 PageHelper 的 PageInfo构建
     *
     * @param pageInfo PageInfo
     * @param <T>      generic type
     * @return PageResult
     */
    public static <T> PageResult<T> build(PageInfo<T> pageInfo) {
        PageResult<T> response = new PageResult<>();
        response.pageNum = pageInfo.getPageNum();
        response.pageSize = pageInfo.getPageSize();
        response.size = pageInfo.getSize();
        response.pages = pageInfo.getPages();
        response.total = pageInfo.getTotal();
        response.list = pageInfo.getList();
        return response;
    }

    /**
     * 基于 PageHelper 的 PageInfo构建
     * 可定制返回值转换规则
     *
     * @param pageInfo          PageInfo
     * @param transformFunction 转换函数
     * @param <T>
     * @param <R>
     * @return
     */
    public static <T, R> PageResult<R> build(PageInfo<T> pageInfo, Function<T, R> transformFunction) {
        PageResult<R> response = new PageResult<>();
        response.pageNum = pageInfo.getPageNum();
        response.pageSize = pageInfo.getPageSize();
        response.size = pageInfo.getSize();
        response.pages = pageInfo.getPages();
        response.total = pageInfo.getTotal();
        if (null == transformFunction) {
            response.list = Lists.newArrayList();
        } else {
            response.list = pageInfo.getList().stream().map(transformFunction).collect(Collectors.toList());
        }

        return response;
    }

    /**
     * 分页为null情况下，使用
     *
     * @param pageNum  当前页
     * @param pageSize 每页的数量
     * @param <T>      generic type
     * @return PageResult
     */
    public static <T> PageResult<T> empty(int pageNum, int pageSize) {
        PageResult<T> response = new PageResult<>();
        response.pageNum = pageNum;
        response.pageSize = pageSize;
        response.list = Lists.newArrayList();
        return response;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public PageResult<T> setPageNum(int pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    public Integer getSize() {
        return size;
    }

    public PageResult<T> setSize(int size) {
        this.size = size;
        return this;
    }

    public List<T> getList() {
        return list;
    }

    public PageResult<T> setList(List<T> data) {
        this.list = data;
        return this;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pageCount) {
        this.pages = pageCount;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
