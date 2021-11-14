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
  * @Date: 2021/4/27 22:20
 */
/**
    * 全球高校信息
    */
@ApiModel(value="com-example-mysqldemo-bean-TBsColleges")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TBsColleges implements Serializable {
    /**
    * 高校ID
    */
    @ApiModelProperty(value="高校ID")
    private Integer id;

    /**
    * 高校名称
    */
    @ApiModelProperty(value="高校名称")
    private String name;

    /**
    * 高校名称（英文）
    */
    @ApiModelProperty(value="高校名称（英文）")
    private String enName;

    /**
    * 学校标识码
    */
    @ApiModelProperty(value="学校标识码")
    private String code;

    /**
    * 国家级ID
    */
    @ApiModelProperty(value="国家级ID")
    private Integer countryId;

    /**
    * 院校省级ID
    */
    @ApiModelProperty(value="院校省级ID")
    private Integer stateId;

    /**
    * 院校市级ID
    */
    @ApiModelProperty(value="院校市级ID")
    private Integer cityId;

    /**
    * 院校区级ID
    */
    @ApiModelProperty(value="院校区级ID")
    private Integer areaId;

    /**
    * 院校性质
    */
    @ApiModelProperty(value="院校性质")
    private Integer nature;

    /**
    * 院校类型(分类)
    */
    @ApiModelProperty(value="院校类型(分类)")
    private Integer collegeType;

    /**
    * 学历层次
    */
    @ApiModelProperty(value="学历层次")
    private Integer level;

    /**
    * 院校属性:211 (0:否,1:是)
    */
    @ApiModelProperty(value="院校属性:211 (0:否,1:是)")
    private Byte f211;

    /**
    * 院校属性:985 (0:否,1:是)
    */
    @ApiModelProperty(value="院校属性:985 (0:否,1:是)")
    private Byte f985;

    /**
    * 院校属性:双一流
    */
    @ApiModelProperty(value="院校属性:双一流")
    private Integer dualClass;

    /**
    * 院校属性:教育部直属 (0:否,1:是)
    */
    @ApiModelProperty(value="院校属性:教育部直属 (0:否,1:是)")
    private Byte department;

    /**
    * 院校属性:中央部委 (0:否,1:是)
    */
    @ApiModelProperty(value="院校属性:中央部委 (0:否,1:是)")
    private Byte central;

    /**
    * 院校属性:自主招生试点 (0:否,1:是)
    */
    @ApiModelProperty(value="院校属性:自主招生试点 (0:否,1:是)")
    private Byte admissions;

    /**
    * 院校属性:主管部门
    */
    @ApiModelProperty(value="院校属性:主管部门")
    private String belong;

    /**
    * 官网
    */
    @ApiModelProperty(value="官网")
    private String homepage;

    /**
    * 地址
    */
    @ApiModelProperty(value="地址")
    private String address;

    /**
    * 校徽LOGO
    */
    @ApiModelProperty(value="校徽LOGO")
    private String logo;

    /**
    * 院校属性:教育部是否认证 (0:否,1:是)
    */
    @ApiModelProperty(value="院校属性:教育部是否认证 (0:否,1:是)")
    private Byte identify;

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
    * 来源类型（1：公用，2：HI实习）
    */
    @ApiModelProperty(value="来源类型（1：公用，2：HI实习）")
    private Byte sourceType;

    /**
    * 学校类别
    */
    @ApiModelProperty(value="学校类别")
    private String schoolType;

    private static final long serialVersionUID = 1L;
}