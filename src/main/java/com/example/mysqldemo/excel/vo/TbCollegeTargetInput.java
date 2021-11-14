package com.example.mysqldemo.excel.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.example.mysqldemo.utils.ExcelAnnotation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: luoxianming
 * @Date: 2021/4/28 7:17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbCollegeTargetInput {

    /**
     * 高校ID
     */
    @ExcelAnnotation(columnIndex = 0)
    @ExcelProperty(index = 0)
    private Integer id;
}
