package com.example.mysqldemo.utils.Listener.reader;/**
 * @Author: luoxianming
 * @Date: 2021/5/8 14:59
 */

import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 *@author luoxianming
 *@date 2021/5/8
 *
 */
@Data
public class TBsCollegeAreasRelationVO implements Serializable {

    /**
     * 主键ID
     */
    @ApiModelProperty(value="主键ID")
    @ExcelProperty(index = 0)
    private Integer id;

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

    /**
     * 状态：0启用，1删除
     */
    @ApiModelProperty(value="状态：0启用，1删除")
    @ExcelProperty(index = 5)
    private Boolean isDeleted;
}
