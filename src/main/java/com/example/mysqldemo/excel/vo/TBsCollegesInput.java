package com.example.mysqldemo.excel.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.example.mysqldemo.utils.ExcelAnnotation;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author: luoxianming
 * @Date: 2021/4/27 22:26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TBsCollegesInput {

    /**
     * 高校ID
     */
    @ExcelAnnotation(columnIndex = 0)
    @ExcelProperty(index = 0)
    private Integer id;

    /**
     * 高校名称
     */
    @ExcelAnnotation(columnIndex = 1)
    @ExcelProperty(index = 1)
    private String name;

    /**
     * 高校名称（英文）
     */
    @ExcelAnnotation(columnIndex = 2)
    @ExcelProperty(index = 2)
    private String enName;

    /**
     * 学校标识码
     */
    @ExcelAnnotation(columnIndex = 3)
    @ExcelProperty(index = 3)
    private String code;

    /**
     * 国家级ID
     */
    @ExcelAnnotation(columnIndex = 4)
    @ExcelProperty(index = 4)
    private String countryId;

    /**
     * 院校省级ID
     */
    @ExcelAnnotation(columnIndex = 5)
    @ExcelProperty(index = 5)
    private String stateId;

    /**
     * 院校市级ID
     */
    @ExcelAnnotation(columnIndex = 6)
    @ExcelProperty(index = 6)
    private String cityId;

    /**
     * 院校区级ID
     */
    @ExcelAnnotation(columnIndex = 7)
    @ExcelProperty(index = 7)
    private String areaId;

//    /**
//     * 院校性质
//     */
//    @ExcelAnnotation(columnIndex = 8)
//    private Integer nature;
//
//    /**
//     * 院校类型(分类)
//     */
//    @ExcelAnnotation(columnIndex = 9)
//    private Integer collegeType;
//
//    /**
//     * 学历层次
//     */
//    @ExcelAnnotation(columnIndex = 10)
//    private Integer level;
//
//    /**
//     * 院校属性:211 (0:否,1:是)
//     */
//    @ExcelAnnotation(columnIndex = 11)
//    private Byte f211;
//
//    /**
//     * 院校属性:985 (0:否,1:是)
//     */
//    @ExcelAnnotation(columnIndex = 12)
//    private Byte f985;
//
//    /**
//     * 院校属性:双一流
//     */
//    @ExcelAnnotation(columnIndex = 13)
//    private Integer dualClass;
//
//    /**
//     * 院校属性:教育部直属 (0:否,1:是)
//     */
//    @ExcelAnnotation(columnIndex = 14)
//    private Byte department;
//
//    /**
//     * 院校属性:中央部委 (0:否,1:是)
//     */
//    @ExcelAnnotation(columnIndex = 15)
//    private Byte central;
//
//    /**
//     * 院校属性:自主招生试点 (0:否,1:是)
//     */
//    @ExcelAnnotation(columnIndex = 16)
//    private Byte admissions;
//
//    /**
//     * 院校属性:主管部门
//     */
//    @ExcelAnnotation(columnIndex = 17)
//    private String belong;
//
//    /**
//     * 官网
//     */
//    @ExcelAnnotation(columnIndex = 18)
//    private String homepage;
//
//    /**
//     * 地址
//     */
//    @ExcelAnnotation(columnIndex = 19)
//    private String address;

//    /**
//     * 校徽LOGO
//     */
//    @ApiModelProperty(value="校徽LOGO")
//    private String logo;
//
//    /**
//     * 院校属性:教育部是否认证 (0:否,1:是)
//     */
//    @ApiModelProperty(value="院校属性:教育部是否认证 (0:否,1:是)")
//    private Byte identify;
//
//    /**
//     * 是否启用 (0:否,1:是)
//     */
//    @ApiModelProperty(value="是否启用 (0:否,1:是)")
//    private Byte state;
//
//    /**
//     * 是否删除 (0:否,1:是)
//     */
//    @ApiModelProperty(value="是否删除 (0:否,1:是)")
//    private Byte isDelete;
//
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
//
//    /**
//     * 来源类型（1：公用，2：HI实习）
//     */
//    @ApiModelProperty(value="来源类型（1：公用，2：HI实习）")
//    private Byte sourceType;
//
//    /**
//     * 学校类别
//     */
//    @ApiModelProperty(value="学校类别")
//    private String schoolType;
}
