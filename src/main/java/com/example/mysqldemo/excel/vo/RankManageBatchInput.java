package com.example.mysqldemo.excel.vo;

import com.example.mysqldemo.utils.ExcelAnnotation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yeyanbo
 * @date 2020/6/6 14:55
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RankManageBatchInput {
    /*
     * 工号
     */
    @ExcelAnnotation(columnIndex = 0)
    private Integer workNo;

    /**
     * 所属年份
     */
    @ExcelAnnotation(columnIndex = 1)
    private Integer year;

    /**
     * 所属月份
     */
    @ExcelAnnotation(columnIndex = 2)
    private Integer month;

    /**
     * 职级编号
     */
    @ExcelAnnotation(columnIndex = 3)
    private String rankId;

}
