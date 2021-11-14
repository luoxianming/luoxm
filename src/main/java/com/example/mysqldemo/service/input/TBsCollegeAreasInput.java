package com.example.mysqldemo.service.input;/**
 * @Author: luoxianming
 * @Date: 2021/4/28 15:24
 */

import com.example.mysqldemo.utils.ExcelAnnotation;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 *@author luoxianming
 *@date 2021/4/28
 *
 */
@Data
public class TBsCollegeAreasInput {

    /**
     * 院校ID
     */
    @ExcelAnnotation(columnIndex = 0)
    @ApiModelProperty(value="院校ID")
    private Integer id;

    /**
     * 校区名称
     */
    @ExcelAnnotation(columnIndex = 1)
    @ApiModelProperty(value="校区名称")
    private String name;

    /**
     * 校区名称（英文）
     */
    @ExcelAnnotation(columnIndex = 2)
    @ApiModelProperty(value="校区名称（英文）")
    private String enName;

    /**
     * 院校名称
     */
    @ExcelAnnotation(columnIndex = 3)
    @ApiModelProperty(value="院校名称")
    private String fullName;

    /**
     * 地址
     */
    @ExcelAnnotation(columnIndex = 4)
    @ApiModelProperty(value="地址")
    private String address;

    /**
     * 高校ID
     */
    @ExcelAnnotation(columnIndex = 5)
    @ApiModelProperty(value="高校ID")
    private Integer collegeId;

    /**
     * 高校名称
     */
    @ExcelAnnotation(columnIndex = 6)
    @ApiModelProperty(value="高校名称")
    private String collegeName;

    /**
     * 高校名称（英文）
     */
    @ExcelAnnotation(columnIndex = 7)
    @ApiModelProperty(value="高校名称（英文）")
    private String collegeEnName;

    /**
     * 国家ID
     */
    @ExcelAnnotation(columnIndex = 8)
    @ApiModelProperty(value="国家ID")
    private Integer countryId;

    /**
     * 省、州级ID
     */
    @ExcelAnnotation(columnIndex = 9)
    @ApiModelProperty(value="省、州级ID")
    private Integer stateId;

    /**
     * 市级ID
     */
    @ExcelAnnotation(columnIndex = 10)
    @ApiModelProperty(value="市级ID")
    private Integer cityId;

    /**
     * 区级ID
     */
    @ExcelAnnotation(columnIndex = 11)
    @ApiModelProperty(value="区级ID")
    private Integer areaId;

    /**
     * 是否启用 (0:否,1:是)
     */
    @ExcelAnnotation(columnIndex = 12)
    @ApiModelProperty(value="是否启用 (0:否,1:是)")
    private Byte state;

    /**
     * 是否删除 (0:否,1:是)
     */
    @ExcelAnnotation(columnIndex = 13)
    @ApiModelProperty(value="是否删除 (0:否,1:是)")
    private Byte isDelete;

//    /**
//     * 创建时间
//     */
//    @ExcelAnnotation(columnIndex = 14)
//    @ApiModelProperty(value="创建时间")
//    private Date createdAt;
//
//    /**
//     * 更新时间
//     */
//    @ExcelAnnotation(columnIndex = 15)
//    @ApiModelProperty(value="更新时间")
//    private Date updatedAt;

    /**
     * 学校校区GUID
     */
    @ExcelAnnotation(columnIndex = 16)
    @ApiModelProperty(value="学校校区GUID")
    private String collegeAreaGuid;

}
