package com.example.mysqldemo.utils.Listener.reader;/**
 * @Author: luoxianming
 * @Date: 2021/5/19 13:09
 */

import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 *@author luoxianming
 *@date 2021/5/19
 *
 */
@Data
public class TpoBaseSchoolVO {

    /**
     * 主键
     */
    @ApiModelProperty(value="主键")
    @ExcelProperty(index = 0)
    private Integer sid;

    @ApiModelProperty(value="")
    @ExcelProperty(index = 1)
    private String identityguid;

    @ApiModelProperty(value="")
    @ExcelProperty(index = 2)
    private Integer identityid;

    @ApiModelProperty(value="")
    @ExcelProperty(index = 3)
    private String id;

    @ApiModelProperty(value="")
    @ExcelProperty(index = 4)
    private String name;

    /**
     * 城市id
     */
    @ApiModelProperty(value="城市id")
    @ExcelProperty(index = 5)
    private String areaguid;

    @ApiModelProperty(value="")
    @ExcelProperty(index = 6)
    private String createtime;

//    @ApiModelProperty(value="")
//    @ExcelProperty(index = 7)
//    private String createby;

    @ApiModelProperty(value="")
    @ExcelProperty(index = 8)
    private String updatetime;

//    @ApiModelProperty(value="")
//    @ExcelProperty(index = 9)
//    private Integer updateby;

    /**
     * erp学校guid
     */
    @ApiModelProperty(value="erp学校guid")
    @ExcelProperty(index = 10)
    private String erpguid;

    @ApiModelProperty(value="")
    @ExcelProperty(index = 11)
    private String countryCode;

    @ApiModelProperty(value="")
    @ExcelProperty(index = 12)
    private String provinceGuid;

    @ApiModelProperty(value="")
    @ExcelProperty(index = 13)
    private String area2guid;

    @ApiModelProperty(value="")
    @ExcelProperty(index = 14)
    private String secondName;

    /**
     * 修数据用的
     */
    @ApiModelProperty(value="修数据用的")
    @ExcelProperty(index = 15)
    private String schoolName;

    /**
     * 院校表Guid，关联Tpo_Base_Academy.Guid
     */
    @ApiModelProperty(value="院校表Guid，关联Tpo_Base_Academy.Guid")
    @ExcelProperty(index = 16)
    private String academyguid;

    /**
     * 学校状态：0启用; 1停用; 默认为0（启用）
     */
    @ApiModelProperty(value="学校状态：0启用; 1停用; 默认为0（启用）")
    @ExcelProperty(index = 17)
    private Integer deleted;

    /**
     * 校区名称
     */
    @ApiModelProperty(value="校区名称")
    @ExcelProperty(index = 18)
    private String campusname;

    /**
     * 学校名称
     */
    @ApiModelProperty(value="学校名称")
    @ExcelProperty(index = 19)
    private String schoolname;

//    /**
//     * 学校sid
//     */
//    @ApiModelProperty(value="学校sid")
//    @ExcelProperty(index = 20)
//    private Integer schoolSid;

}
