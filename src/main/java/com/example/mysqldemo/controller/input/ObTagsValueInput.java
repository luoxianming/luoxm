package com.example.mysqldemo.controller.input;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author by luoxianming
 * @date 2021/2/3 13:42
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ObTagsValueInput implements Serializable {

    private static final long serialVersionUID = -6798611067931656417L;

    /**
     * 主键ID
     */
    @ApiModelProperty(value = "主键ID")
    private Integer id;

    /**
     * 标签值code
     */
    @ApiModelProperty(value = "标签值code")
    private Integer tagsValueCode;

    /**
     * 标签值名称
     */
    @ApiModelProperty(value = "标签值名称")
    private String tagsValueName;

    /**
     * 系统字段(国家、省份、城市、学历、学校、院校、学院) 用于前端回显
     */
    @ApiModelProperty(value="系统字段(国家、省份、城市、学历、学校、院校、学院) 用于前端回显")
    private Integer objectId;
}
