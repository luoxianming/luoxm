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
  * @Date: 2021/4/30 15:22
 */
/**
    * 全球高校校区信息老数据映射表
    */
@ApiModel(value="com-example-mysqldemo-bean-TBsCollegeAreasRelation")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TBsCollegeAreasRelation implements Serializable {
    /**
    * 主键ID
    */
    @ApiModelProperty(value="主键ID")
    private Integer id;

    /**
    * Tpo_Base_School（IdentityGuid）
    */
    @ApiModelProperty(value="Tpo_Base_School（IdentityGuid）")
    private String identityGuid;

    /**
    * Tpo_Base_School（name）
    */
    @ApiModelProperty(value="Tpo_Base_School（name）")
    private String name;

    /**
    * 校区id
    */
    @ApiModelProperty(value="校区id")
    private Integer bsCollegeAreasId;

    /**
    * 校区名称
    */
    @ApiModelProperty(value="校区名称")
    private String bsCollegeAreasName;

    /**
    * 状态：0启用，1删除
    */
    @ApiModelProperty(value="状态：0启用，1删除")
    private Boolean isDeleted;

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