package com.example.mysqldemo.utils.Listener.reader;/**
 * @Author: luoxianming
 * @Date: 2021/5/18 22:53
 */

import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 *@author luoxianming
 *@date 2021/5/18
 *
 */
@Data
public class TBsCollegeAreasVo implements Serializable {


    /**
     * 院校ID
     */
    @ApiModelProperty(value="院校ID")
    @ExcelProperty(index = 0)
    private Integer id;

    /**
     * 校区名称
     */
    @ApiModelProperty(value="校区名称")
    @ExcelProperty(index = 1)
    private String name;

    /**
     * 校区名称（英文）
     */
    @ApiModelProperty(value="校区名称（英文）")
    @ExcelProperty(index = 2)
    private String enName;

    /**
     * 院校名称
     */
    @ApiModelProperty(value="院校名称")
    @ExcelProperty(index = 3)
    private String fullName;

    /**
     * 地址
     */
    @ApiModelProperty(value="地址")
    @ExcelProperty(index = 4)
    private String address;

    /**
     * 高校ID
     */
    @ApiModelProperty(value="高校ID")
    @ExcelProperty(index = 5)
    private String collegeId;

    /**
     * 高校名称
     */
    @ApiModelProperty(value="高校名称")
    @ExcelProperty(index = 6)
    private String collegeName;

    /**
     * 高校名称（英文）
     */
    @ApiModelProperty(value="高校名称（英文）")
    @ExcelProperty(index = 7)
    private String collegeEnName;

    /**
     * 国家ID
     */
    @ApiModelProperty(value="国家ID")
    @ExcelProperty(index = 8)
    private String countryId;

    /**
     * 省、州级ID
     */
    @ApiModelProperty(value="省、州级ID")
    @ExcelProperty(index = 9)
    private String stateId;

    /**
     * 市级ID
     */
    @ApiModelProperty(value="市级ID")
    @ExcelProperty(index = 10)
    private String cityId;

    /**
     * 区级ID
     */
    @ApiModelProperty(value="区级ID")
    @ExcelProperty(index = 11)
    private String areaId;

    /**
     * 是否启用 (0:否,1:是)
     */
    @ApiModelProperty(value="是否启用 (0:否,1:是)")
    @ExcelProperty(index = 12)
    private Byte state;

    /**
     * 是否删除 (0:否,1:是)
     */
    @ApiModelProperty(value="是否删除 (0:否,1:是)")
    @ExcelProperty(index = 13)
    private Byte isDelete;

//    /**
//     * 创建时间
//     */
//    @ApiModelProperty(value="创建时间")
//    private Date createdAt;
//
//    /**
//     * 更新时间
//     */
//    @ApiModelProperty(value="更新时间")
//    private Date updatedAt;

    /**
     * 学校校区GUID
     */
    @ApiModelProperty(value="学校校区GUID")
    @ExcelProperty(index = 16)
    private String collegeAreaGuid;
}
