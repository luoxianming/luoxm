package com.example.mysqldemo.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
  * @Author: luoxianming
  * @Date: 2021/5/20 14:42
 */
/**
    * 院校专业人数信息表
    */
@ApiModel(value="com-example-mysqldemo-bean-BaseCollegeMajorNumber")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BaseCollegeMajorNumber implements Serializable {
    /**
    * 主键Id
    */
    @ApiModelProperty(value="主键Id")
    private Integer id;

    /**
    * 学校Id，关联Tpo_Base_School表中的sid
    */
    @ApiModelProperty(value="学校Id，关联Tpo_Base_School表中的sid")
    private Integer schoolid;

    /**
    * 学院Id，关联Base_College表中的Id
    */
    @ApiModelProperty(value="学院Id，关联Base_College表中的Id")
    private Integer collegeid;

    /**
    * 专业Id，关联Base_Major表中的Id
    */
    @ApiModelProperty(value="专业Id，关联Base_Major表中的Id")
    private Integer majorid;

    /**
    * 入学年份
    */
    @ApiModelProperty(value="入学年份")
    private Integer enrollmentyear;

    /**
    * 班级名称
    */
    @ApiModelProperty(value="班级名称")
    private String classname;

    /**
    * 人数
    */
    @ApiModelProperty(value="人数")
    private Integer number;

    /**
    * 是否删除
    */
    @ApiModelProperty(value="是否删除")
    private Integer isdelete;

    /**
    * 创建时间
    */
    @ApiModelProperty(value="创建时间")
    private Date createtime;

    /**
    * 创建人
    */
    @ApiModelProperty(value="创建人")
    private Integer createby;

    /**
    * 修改时间
    */
    @ApiModelProperty(value="修改时间")
    private Date updatetime;

    /**
    * 修改人
    */
    @ApiModelProperty(value="修改人")
    private Integer updateby;

    private static final long serialVersionUID = 1L;
}