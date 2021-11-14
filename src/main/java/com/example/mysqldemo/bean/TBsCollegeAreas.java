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
  * @Date: 2021/4/28 15:23
 */
/**
    * 全球高校校区信息
    */
@ApiModel(value="com-example-mysqldemo-bean-TBsCollegeAreas")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TBsCollegeAreas implements Serializable {
    /**
    * 院校ID
    */
    @ApiModelProperty(value="院校ID")
    private Integer id;

    /**
    * 校区名称
    */
    @ApiModelProperty(value="校区名称")
    private String name;

    /**
    * 校区名称（英文）
    */
    @ApiModelProperty(value="校区名称（英文）")
    private String enName;

    /**
    * 院校名称
    */
    @ApiModelProperty(value="院校名称")
    private String fullName;

    /**
    * 地址
    */
    @ApiModelProperty(value="地址")
    private String address;

    /**
    * 高校ID
    */
    @ApiModelProperty(value="高校ID")
    private Integer collegeId;

    /**
    * 高校名称
    */
    @ApiModelProperty(value="高校名称")
    private String collegeName;

    /**
    * 高校名称（英文）
    */
    @ApiModelProperty(value="高校名称（英文）")
    private String collegeEnName;

    /**
    * 国家ID
    */
    @ApiModelProperty(value="国家ID")
    private Integer countryId;

    /**
    * 省、州级ID
    */
    @ApiModelProperty(value="省、州级ID")
    private Integer stateId;

    /**
    * 市级ID
    */
    @ApiModelProperty(value="市级ID")
    private Integer cityId;

    /**
    * 区级ID
    */
    @ApiModelProperty(value="区级ID")
    private Integer areaId;

    /**
    * 是否启用 (0:否,1:是)
    */
    @ApiModelProperty(value="是否启用 (0:否,1:是)")
    private Byte state;

    /**
    * 是否删除 (0:否,1:是)
    */
    @ApiModelProperty(value="是否删除 (0:否,1:是)")
    private Byte isDelete;

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

    /**
    * 学校校区GUID
    */
    @ApiModelProperty(value="学校校区GUID")
    private String collegeAreaGuid;

    private static final long serialVersionUID = 1L;
}