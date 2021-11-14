package com.example.mysqldemo.excel.vo.write;

import com.alibaba.excel.annotation.ExcelProperty;
import com.example.mysqldemo.utils.ExcelAnnotation;
import lombok.Data;

/**
 * @Author: luoxianming
 * @Date: 2021/4/28 9:10
 */
@Data
public class ColllegesTargetOutput {

    /**
     * 高校ID
     */
    @ExcelProperty(value = "id", index = 0)
    private String id;

    /**
     * 高校名称
     */
    @ExcelProperty(index = 1)
    private String name;

    /**
     * 高校名称（英文）
     */
    @ExcelProperty(index = 2)
    private String en_name;

    /**
     * 高校名称（英文）
     */
    @ExcelProperty(index = 3)
    private String full_name;

    /**
     * 高校名称（英文）
     */
    @ExcelProperty(index = 4)
    private String address;

    @ExcelProperty(index = 5)
    private Integer college_id;

    @ExcelProperty(index = 6)
    private String college_name;

    @ExcelProperty(index = 7)
    private String college_en_name;

    @ExcelProperty(index = 8)
    private String country_id;

    @ExcelProperty(index = 9)
    private String state_id;

    @ExcelProperty(index = 10)
    private String city_id;

    @ExcelProperty(index = 11)
    private String area_id;

    @ExcelProperty(index = 12)
    private String state;

    @ExcelProperty(index = 13)
    private String is_delete;

    @ExcelProperty(index = 14)
    private String created_at;

    @ExcelProperty(index = 15)
    private String updated_at;

    @ExcelProperty(index = 16)
    private String college_area_guid;
}
