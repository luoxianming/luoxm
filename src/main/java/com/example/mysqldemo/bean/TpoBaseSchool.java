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
  * @Date: 2021/5/19 13:09
 */
/**
    * 学校
    */
@ApiModel(value="com-example-mysqldemo-bean-TpoBaseSchool")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TpoBaseSchool implements Serializable {
    /**
    * 主键
    */
    @ApiModelProperty(value="主键")
    private Integer sid;

    @ApiModelProperty(value="")
    private String identityguid;

    @ApiModelProperty(value="")
    private Integer identityid;

    @ApiModelProperty(value="")
    private String id;

    @ApiModelProperty(value="")
    private String name;

    /**
    * 城市id
    */
    @ApiModelProperty(value="城市id")
    private String areaguid;

    @ApiModelProperty(value="")
    private Date createtime;

    @ApiModelProperty(value="")
    private Integer createby;

    @ApiModelProperty(value="")
    private Date updatetime;

    @ApiModelProperty(value="")
    private Integer updateby;

    /**
    * erp学校guid
    */
    @ApiModelProperty(value="erp学校guid")
    private String erpguid;

    @ApiModelProperty(value="")
    private String countryCode;

    @ApiModelProperty(value="")
    private String provinceGuid;

    @ApiModelProperty(value="")
    private String area2guid;

    @ApiModelProperty(value="")
    private String secondName;

    /**
    * 修数据用的
    */
    @ApiModelProperty(value="修数据用的")
    private String schoolName;

    /**
    * 院校表Guid，关联Tpo_Base_Academy.Guid
    */
    @ApiModelProperty(value="院校表Guid，关联Tpo_Base_Academy.Guid")
    private String academyguid;

    /**
    * 学校状态：0启用; 1停用; 默认为0（启用）
    */
    @ApiModelProperty(value="学校状态：0启用; 1停用; 默认为0（启用）")
    private Integer deleted;

    /**
    * 校区名称
    */
    @ApiModelProperty(value="校区名称")
    private String campusname;

    /**
    * 学校名称
    */
    @ApiModelProperty(value="学校名称")
    private String schoolname;

    /**
    * 学校sid
    */
    @ApiModelProperty(value="学校sid")
    private Integer schoolSid;

    private static final long serialVersionUID = 1L;
}