package com.example.mysqldemo.controller.input;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;

/**
 *
 * @date 2020/12/17 17:12
 * @author   Gaodun
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ObTagsItemInput implements Serializable {

    private static final long serialVersionUID = 225299270660930737L;
    /**
     * 属性元素id
     */
    @ApiModelProperty(value = "属性元素id")
    @NotNull
    private String objectId;

    /**
     * 属性元素名称
     */
    @ApiModelProperty(value = "属性元素名称")
    @NotNull
    private String objectName;

    /**
     * 属性元素类型
     */
    @ApiModelProperty(value = "属性元素类型")
    @NotNull
    private String objectType;

    /**
     * 国家、省、市、区路径，如：“1/4/”
     */
    @ApiModelProperty(value = "国家、省、市、区路径，如：'1/4/' ")
    private String ancestor;

    /**
     * 院校level：0： 国家  1 ：省  2：市  3：区
     */
    @ApiModelProperty(value = "院校level：0： 国家  1 ：省  2：市  3：区")
    private Integer level;
}
