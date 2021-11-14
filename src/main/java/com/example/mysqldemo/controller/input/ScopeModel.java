package com.example.mysqldemo.controller.input;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yeyanbo
 * @date 2020/6/15 15:39
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScopeModel {

    /**
     * 编号
     */
    @ApiModelProperty(value = "编号")
    private String id;

    /**
     * 名称
     */
    @ApiModelProperty(value = "名称")
    private String name;

    /**
     * 是否是部门，0-个人，1-部门
     */
    @ApiModelProperty(value = "是否是部门，0-个人，1-部门")
    private boolean organization;


    @ApiModelProperty(value = "父级组织")
    private String code;
}
