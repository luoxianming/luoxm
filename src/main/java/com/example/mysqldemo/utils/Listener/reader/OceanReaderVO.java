package com.example.mysqldemo.utils.Listener.reader;

import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author luoxianming
 * @date 2021/7/2 10:28
 */
public class OceanReaderVO {

    /**
     * 主键Id
     */
    @ApiModelProperty(value="海域种类")
    @ExcelProperty(index = 4)
    private Integer oceanCategoryName;

    @ApiModelProperty(value="类型")
    @ExcelProperty(index = 5)
    private Integer oceanTypeName;

    /**
     * 海域名称
     */
    @ApiModelProperty(value = "海域名称")
    @ExcelProperty(index = 6)
    private String oceanName;
}
