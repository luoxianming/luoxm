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
  * @Date: 2021/5/19 9:35
 */
/**
    * 学院信息表
    */
@ApiModel(value="com-example-mysqldemo-bean-BaseCollege")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BaseCollege implements Serializable {
    /**
    * 主键Id
    */
    @ApiModelProperty(value="主键Id")
    private Integer id;

    /**
    * 学院名称
    */
    @ApiModelProperty(value="学院名称")
    private String name;

    /**
    * 学校Id，关联Tpo_Base_School表中的sid的值
    */
    @ApiModelProperty(value="学校Id，关联Tpo_Base_School表中的sid的值")
    private Integer schoolid;

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