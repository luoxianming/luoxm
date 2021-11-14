package com.example.mysqldemo.utils.Listener.reader;/**
 * @Author: luoxianming
 * @Date: 2021/5/20 14:44
 */

import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 *@author luoxianming
 *@date 2021/5/20
 *
 */
@Data
public class BaseCollegeMajorNumberVO {

    /**
     * 主键Id
     */
    @ApiModelProperty(value="主键Id")
    @ExcelProperty(index = 0)
    private Integer id;

    /**
     * 学校Id，关联Tpo_Base_School表中的sid
     */
    @ApiModelProperty(value="学校Id，关联Tpo_Base_School表中的sid")
    @ExcelProperty(index = 1)
    private Integer schoolid;

    /**
     * 学院Id，关联Base_College表中的Id
     */
    @ApiModelProperty(value="学院Id，关联Base_College表中的Id")
    @ExcelProperty(index = 2)
    private Integer collegeid;

    /**
     * 专业Id，关联Base_Major表中的Id
     */
    @ApiModelProperty(value="专业Id，关联Base_Major表中的Id")
    @ExcelProperty(index = 3)
    private Integer majorid;

    /**
     * 入学年份
     */
    @ApiModelProperty(value="入学年份")
    @ExcelProperty(index = 4)
    private Integer enrollmentyear;

    /**
     * 班级名称
     */
    @ApiModelProperty(value="班级名称")
    @ExcelProperty(index = 5)
    private String classname;

    /**
     * 人数
     */
    @ApiModelProperty(value="人数")
    @ExcelProperty(index = 6)
    private Integer number;

    /**
     * 是否删除
     */
    @ApiModelProperty(value="是否删除")
    @ExcelProperty(index = 7)
    private Integer isdelete;

    /**
     * 创建时间
     */
    @ApiModelProperty(value="创建时间")
    @ExcelProperty(index = 8)
    private String createtime;

    /**
     * 创建人
     */
    @ApiModelProperty(value="创建人")
    @ExcelProperty(index = 9)
    private Integer createby;

    /**
     * 修改时间
     */
    @ApiModelProperty(value="修改时间")
    @ExcelProperty(index = 10)
    private String updatetime;

    /**
     * 修改人
     */
    @ApiModelProperty(value="修改人")
    @ExcelProperty(index = 11)
    private Integer updateby;
}
