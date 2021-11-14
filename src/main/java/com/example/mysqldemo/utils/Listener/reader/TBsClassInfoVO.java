package com.example.mysqldemo.utils.Listener.reader;/**
 * @Author: luoxianming
 * @Date: 2021/5/20 15:12
 */

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 *@author luoxianming
 *@date 2021/5/20
 *
 */
public class TBsClassInfoVO {

    /**
     * 主键Id
     */
    @ApiModelProperty(value="主键Id")
    private Integer id;

    /**
     * 业务主键Code
     */
    @ApiModelProperty(value="业务主键Code")
    private Integer code;

    /**
     * 院校（校区）ID，关联t_bs_college_areas主键Id
     */
    @ApiModelProperty(value="院校（校区）ID，关联t_bs_college_areas主键Id")
    private Integer collegeAreaId;

    /**
     * 学院业务主键Code，关联t_bs_academy表业务主键Code
     */
    @ApiModelProperty(value="学院业务主键Code，关联t_bs_academy表业务主键Code")
    private Integer academyCode;

    /**
     * 专业主键主键Code，关联t_bs_major表业务主键Code
     */
    @ApiModelProperty(value="专业主键主键Code，关联t_bs_major表业务主键Code")
    private Integer majorCode;

    /**
     * 班级名称
     */
    @ApiModelProperty(value="班级名称")
    private String className;

    /**
     * 入学年份，例:2020
     */
    @ApiModelProperty(value="入学年份，例:2020")
    private Integer enrollmentYear;

    /**
     * 人数
     */
    @ApiModelProperty(value="人数")
    private Integer number;

    /**
     * 创建人Id
     */
    @ApiModelProperty(value="创建人Id")
    private Integer createdBy;

    /**
     * 更新人Id
     */
    @ApiModelProperty(value="更新人Id")
    private Integer updatedBy;

    /**
     * 是否删除 (0:否,1:是)
     */
    @ApiModelProperty(value="是否删除 (0:否,1:是)")
    private Boolean isDelete;

    /**
     * 创建时间
     */
    @ApiModelProperty(value="创建时间")
    private Date createdAt;

    /**
     * 更新时间
     */
    @ApiModelProperty(value="更新时间")
    private Date updatedAt;

}
