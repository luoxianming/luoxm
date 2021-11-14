package com.example.mysqldemo.excel.vo;/**
 * @Author: luoxianming
 * @Date: 2021/4/28 15:56
 */

import com.alibaba.excel.annotation.ExcelProperty;
import com.example.mysqldemo.utils.ExcelAnnotation;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 *@author luoxianming
 *@date 2021/4/28
 *
 */
@Data
public class CollegesWaitInput {

    /**
     * 高校ID
     */
    private Integer id;

    /**
     * 国家级ID
     */
    @ExcelAnnotation(columnIndex = 1)
    @ExcelProperty(index = 1)
    private String country;

    /**
     * 院校省级ID
     */
    @ExcelAnnotation(columnIndex = 2)
    @ExcelProperty(index = 2)
    private String state;

    /**
     * 院校市级ID
     */
    @ExcelAnnotation(columnIndex = 3)
    @ExcelProperty(index = 3)
    private String city;

    /**
     * 院校区级ID
     */
    @ExcelAnnotation(columnIndex = 4)
    @ExcelProperty(index = 4)
    private String areaId;

    /**
     * 高校名称
     */
    @ApiModelProperty(value="校区名称")
    @ExcelAnnotation(columnIndex = 5)
    @ExcelProperty(index = 5)
    private String collegeName;

    /**
     * 高校名称
     */
    @ApiModelProperty(value="校区名称")
    @ExcelAnnotation(columnIndex = 6)
    @ExcelProperty(index = 6)
    private Integer collegeId;

    /**
     * 院校名称
     */
    @ApiModelProperty(value="院校名称")
    @ExcelAnnotation(columnIndex = 7)
    @ExcelProperty(index = 7)
    private String name;


}
