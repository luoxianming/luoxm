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
  * @Date: 2021/5/19 10:14
 */
/**
    * 学院信息表
    */
@ApiModel(value="com-example-mysqldemo-bean-TBsAcademy")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TBsAcademy implements Serializable {
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
    * 学院名称
    */
    @ApiModelProperty(value="学院名称")
    private String name;

    /**
    * 院校（校区）ID，关联t_bs_colleges主键Id
    */
    @ApiModelProperty(value="院校（校区）ID，关联t_bs_colleges主键Id")
    private Integer collegeAreaId;

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

    private static final long serialVersionUID = 1L;
}