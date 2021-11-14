package com.example.mysqldemo.excel.vo;

import com.example.mysqldemo.utils.ExcelAnnotation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: luoxianming
 * @Date: 2020/8/27 20:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Behavior {

    /**
     * 工号
     */
    @ExcelAnnotation(columnIndex = 0)
    private String first;

    /**
     * 所属年份
     */
    @ExcelAnnotation(columnIndex = 1)
    private String second;
}
