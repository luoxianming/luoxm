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
  * @Date: 2021/4/26 23:16
 */
/**
    * 标签值
    */
@ApiModel(value="com-example-mysqldemo-bean-ObTagsValue")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ObTagsValue implements Serializable {
    /**
    * 主键ID
    */
    @ApiModelProperty(value="主键ID")
    private Integer id;

    /**
    * 标签ID
    */
    @ApiModelProperty(value="标签ID")
    private Integer tagsId;

    /**
    * 标签值code
    */
    @ApiModelProperty(value="标签值code")
    private Integer tagsValueCode;

    /**
    * 标签值名称
    */
    @ApiModelProperty(value="标签值名称")
    private String tagsValueName;

    /**
    * 系统字段(国家、省份、城市、学历、学校、院校、学院) 用于前端回显
    */
    @ApiModelProperty(value="系统字段(国家、省份、城市、学历、学校、院校、学院) 用于前端回显")
    private Integer objectId;

    /**
    * 创建人
    */
    @ApiModelProperty(value="创建人")
    private Integer createdBy;

    /**
    * 创建时间
    */
    @ApiModelProperty(value="创建时间")
    private Date createdAt;

    /**
    * 更新人
    */
    @ApiModelProperty(value="更新人")
    private Integer updatedBy;

    /**
    * 更新时间
    */
    @ApiModelProperty(value="更新时间")
    private Date updatedAt;

    /**
    * 逻辑删除标志位
    */
    @ApiModelProperty(value="逻辑删除标志位")
    private Byte isDeleted;

    /**
    * 删除人
    */
    @ApiModelProperty(value="删除人")
    private Integer deletedBy;

    /**
    * 删除时间
    */
    @ApiModelProperty(value="删除时间")
    private Date deletedAt;

    private static final long serialVersionUID = 1L;
}