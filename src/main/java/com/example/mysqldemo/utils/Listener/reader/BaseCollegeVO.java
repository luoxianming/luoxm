package com.example.mysqldemo.utils.Listener.reader;/**
 * @Author: luoxianming
 * @Date: 2021/5/19 9:36
 */

import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 *@author luoxianming
 *@date 2021/5/19
 *
 */
@Data
public class BaseCollegeVO implements Serializable {

    /**
     * 主键Id
     */
    @ApiModelProperty(value="主键Id")
    @ExcelProperty(index = 0)
    private Integer id;

    /**
     * 学院名称
     */
    @ApiModelProperty(value="学院名称")
    @ExcelProperty(index = 1)
    private String name;

    /**
     * 学校Id，关联Tpo_Base_School表中的sid的值
     */
    @ApiModelProperty(value="学校Id，关联Tpo_Base_School表中的sid的值")
    @ExcelProperty(index = 2)
    private Integer schoolid;

    /**
     * 是否删除
     */
    @ApiModelProperty(value="是否删除")
    @ExcelProperty(index = 3)
    private Integer isdelete;

    /**
     * 创建时间
     */
    @ApiModelProperty(value="创建时间")
    @ExcelProperty(index = 4)
    private String createtime;

    /**
     * 创建人
     */
    @ApiModelProperty(value="创建人")
    @ExcelProperty(index = 5)
    private Integer createby;

    /**
     * 修改时间
     */
    @ApiModelProperty(value="修改时间")
    @ExcelProperty(index = 6)
    private String updatetime;

    /**
     * 修改人
     */
    @ApiModelProperty(value="修改人")
    @ExcelProperty(index = 7)
    private Integer updateby;

}
