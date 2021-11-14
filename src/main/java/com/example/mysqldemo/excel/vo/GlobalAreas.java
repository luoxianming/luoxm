package com.example.mysqldemo.excel.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @Author: luoxianming
 * @Date: 2021/4/28 13:16
 */
@Data
public class GlobalAreas {

    /**
     * ID
     */
    @ExcelProperty(value = "id", index = 0)
    private Integer id;

    /**
     * 名称
     */
    @ExcelProperty(value = "name", index = 1)
    private String name;
}
