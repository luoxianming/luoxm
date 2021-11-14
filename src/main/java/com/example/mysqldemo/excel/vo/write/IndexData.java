package com.example.mysqldemo.excel.vo.write;

import com.alibaba.excel.annotation.ExcelProperty;
import com.example.mysqldemo.utils.ExcelAnnotation;
import lombok.Data;

/**
 * @Author: luoxianming
 * @Date: 2021/4/28 7:20
 */
@Data
public class IndexData {

    /**
     * 高校ID
     */
    @ExcelProperty(value = "id", index = 0)
    private Integer id;

    /**
     * 高校名称
     */
    @ExcelProperty(value = "name", index = 1)
    private String name;

    /**
     * 高校名称（英文）
     */
    @ExcelProperty(value = "enName", index = 2)
    private String enName;

    /**
     * 学校标识码
     */
    @ExcelAnnotation(columnIndex = 3)
    @ExcelProperty(value = "code",index = 3)
    private String code;

    /**
     * 国家级ID
     */
    @ExcelAnnotation(columnIndex = 4)
    @ExcelProperty(value ="countryId" ,index = 4)
    private String countryId;

    /**
     * 院校省级ID
     */
    @ExcelAnnotation(columnIndex = 5)
    @ExcelProperty(value ="stateId", index = 5)
    private String stateId;

    /**
     * 院校市级ID
     */
    @ExcelAnnotation(columnIndex = 6)
    @ExcelProperty(value = "cityId", index = 6)
    private String cityId;

    /**
     * 院校区级ID
     */
    @ExcelAnnotation(columnIndex = 7)
    @ExcelProperty(value ="areaId", index = 7)
    private String areaId;
}
