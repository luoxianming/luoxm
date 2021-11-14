package com.example.mysqldemo.utils.Listener.reader;

import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 *@author luoxianming
 *@date 2021/5/19
 *
 */
@Data
public class TbsAcademyVO implements Serializable {

    /**
     * 主键Id
     */
    @ApiModelProperty(value="主键Id")
    @ExcelProperty(index = 0)
    private Integer id;

    /**
     * 业务主键Code
     */
    @ApiModelProperty(value="业务主键Code")
    @ExcelProperty(index = 1)
    private Integer code;

    /**
     * 学院名称
     */
    @ApiModelProperty(value="学院名称")
    @ExcelProperty(index = 2)
    private String name;

    /**
     * 院校（校区）ID，关联t_bs_colleges主键Id
     */
    @ApiModelProperty(value="院校（校区）ID，关联t_bs_colleges主键Id")
    @ExcelProperty(index = 3)
    private Integer collegeAreaId;

    /**
     * 创建人Id
     */
    @ApiModelProperty(value="创建人Id")
    @ExcelProperty(index = 4)
    private Integer createdBy;

    /**
     * 更新人Id
     */
    @ApiModelProperty(value="更新人Id")
    @ExcelProperty(index = 5)
    private Integer updatedBy;

    /**
     * 是否删除 (0:否,1:是)
     */
    @ApiModelProperty(value="是否删除 (0:否,1:是)")
    @ExcelProperty(index = 6)
    private Boolean isDelete;

    /**
     * 创建时间
     */
    @ApiModelProperty(value="创建时间")
    @ExcelProperty(index = 7)
    private String createdAt;

    /**
     * 更新时间
     */
    @ApiModelProperty(value="更新时间")
    @ExcelProperty(index = 8)
    private String updatedAt;

}
