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
    * 标签适用项目
    */
@ApiModel(value="com-example-mysqldemo-bean-ObTagsItem")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ObTagsItem implements Serializable {
    /**
    * 主键ID
    */
    @ApiModelProperty(value="主键ID")
    private Integer id;

    /**
    * 标签ID
    */
    @ApiModelProperty(value="标签ID")
    private Integer labelId;

    /**
    * 对象ID
    */
    @ApiModelProperty(value="对象ID")
    private String objectId;

    /**
    * 对象名称
    */
    @ApiModelProperty(value="对象名称")
    private String objectName;

    /**
    * 对象类型
    */
    @ApiModelProperty(value="对象类型")
    private String objectType;

    /**
    * 院校level,0-国家 ,1-省, 2-市,3-区
    */
    @ApiModelProperty(value="院校level,0-国家 ,1-省, 2-市,3-区")
    private String level;

    /**
    * 国家省市区路径
    */
    @ApiModelProperty(value="国家省市区路径")
    private String ancestor;

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