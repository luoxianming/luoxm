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
  * @Date: 2021/5/20 16:36
 */

/**
 * 专业信息表
 */
@ApiModel(value = "com-example-mysqldemo-bean-TBsMajor")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TBsMajor implements Serializable {
    /**
     * 主键Id
     */
    @ApiModelProperty(value = "主键Id")
    private Integer id;

    /**
     * 业务主键Code
     */
    @ApiModelProperty(value = "业务主键Code")
    private Integer code;

    /**
     * 专业名称
     */
    @ApiModelProperty(value = "专业名称")
    private String name;

    /**
     * 院校（校区）ID，关联t_bs_college_areas主键Id
     */
    @ApiModelProperty(value = "院校（校区）ID，关联t_bs_college_areas主键Id")
    private Integer collegeAreaId;

    /**
     * 学院业务主键Code，关联t_bs_academy表业务主键Code
     */
    @ApiModelProperty(value = "学院业务主键Code，关联t_bs_academy表业务主键Code")
    private Integer academyCode;

    /**
     * 创建人Id
     */
    @ApiModelProperty(value = "创建人Id")
    private Integer createdBy;

    /**
     * 更新人Id
     */
    @ApiModelProperty(value = "更新人Id")
    private Integer updatedBy;

    /**
     * 是否删除 (0:否,1:是)
     */
    @ApiModelProperty(value = "是否删除 (0:否,1:是)")
    private Boolean isDelete;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private Date createdAt;

    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    private Date updatedAt;

    /**
     * 专业类型(0:本科专业,1:硕士专业)
     */
    @ApiModelProperty(value = "专业类型(0:本科专业,1:硕士专业)")
    private Byte majorType;

    private static final long serialVersionUID = 1L;
}