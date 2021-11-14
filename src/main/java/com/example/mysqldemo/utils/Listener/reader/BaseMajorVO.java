package com.example.mysqldemo.utils.Listener.reader;/**
 * @Author: luoxianming
 * @Date: 2021/5/19 15:12
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
public class BaseMajorVO implements Serializable {

    /**
     * 主键Id
     */
    @ApiModelProperty(value="主键Id")
    @ExcelProperty(index = 0)
    private Integer id;

    /**
     * 专业名称
     */
    @ApiModelProperty(value="专业名称")
    @ExcelProperty(index = 1)
    private String name;

    /**
     * 学校Id，关联Tpo_Base_School表中的sid
     */
    @ApiModelProperty(value="学校Id，关联Tpo_Base_School表中的sid")
    @ExcelProperty(index = 2)
    private Integer schoolid;

    /**
     * 学院Id，关联Base_College表中的Id
     */
    @ApiModelProperty(value="学院Id，关联Base_College表中的Id")
    @ExcelProperty(index = 3)
    private Integer collegeid;

    /**
     * 是否删除
     */
    @ApiModelProperty(value="是否删除")
    @ExcelProperty(index = 4)
    private Integer isdelete;

    /**
     * 创建时间
     */
    @ApiModelProperty(value="创建时间")
    @ExcelProperty(index = 5)
    private String createtime;

    /**
     * 创建人
     */
    @ApiModelProperty(value="创建人")
    @ExcelProperty(index = 6)
    private Integer createby;

    /**
     * 修改时间
     */
    @ApiModelProperty(value="修改时间")
    @ExcelProperty(index = 7)
    private String updatetime;

    /**
     * 修改人
     */
    @ApiModelProperty(value="修改人")
    @ExcelProperty(index = 8)
    private Integer updateby;

    /**
     * 专业类型(0:本科专业,1:硕士专业)
     */
    @ApiModelProperty(value="专业类型(0:本科专业,1:硕士专业)")
    @ExcelProperty(index = 9)
    private Byte majorType;
}
