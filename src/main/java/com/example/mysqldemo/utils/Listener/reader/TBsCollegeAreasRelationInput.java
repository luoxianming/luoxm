package com.example.mysqldemo.utils.Listener.reader;

import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

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
public class TBsCollegeAreasRelationInput implements Serializable {

    /**
     * Tpo_Base_School（IdentityGuid）
     */
    @ApiModelProperty(value="Tpo_Base_School（IdentityGuid）")
    @ExcelProperty(index = 0)
    private String id;

    /**
    * Tpo_Base_School（IdentityGuid）
    */
    @ApiModelProperty(value="Tpo_Base_School（IdentityGuid）")
    @ExcelProperty(index = 1)
    private String identityGuid;

    /**
    * Tpo_Base_School（name）
    */
    @ApiModelProperty(value="Tpo_Base_School（name）")
    @ExcelProperty(index = 2)
    private String name;

    /**
    * 校区id
    */
    @ApiModelProperty(value="校区id")
    @ExcelProperty(index = 3)
    private Integer bsCollegeAreasId;

    /**
    * 校区名称
    */
    @ApiModelProperty(value="校区名称")
    @ExcelProperty(index = 4)
    private String bsCollegeAreasName;



    private static final long serialVersionUID = 1L;
}