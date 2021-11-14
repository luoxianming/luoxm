package com.example.mysqldemo.bean;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * 基础标签表
  * @author luoxianming
  * @date: 2021/4/26 22:44
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ObTags implements Serializable {
    /**
    * 自增主键
    */
    @ApiModelProperty(value="自增主键")
    private Integer id;

    /**
    * 业务主键（不可重复）
    */
    @ApiModelProperty(value="业务主键（不可重复）")
    private Integer code;

    /**
    * 字典类型id
    */
    @ApiModelProperty(value="字典类型id")
    private Integer typeId;

    /**
    * 字段名称
    */
    @ApiModelProperty(value="字段名称")
    private String name;

    /**
    * 排序
    */
    @ApiModelProperty(value="排序")
    private Integer sort;

    /**
    * 负责人id
    */
    @ApiModelProperty(value="负责人id")
    private Integer ownerId;

    /**
    * 是否支持查询0-不支持，1支持
    */
    @ApiModelProperty(value="是否支持查询0-不支持，1支持")
    private Byte suportQuery;

    /**
    * 是否单选 0-否，1是
    */
    @ApiModelProperty(value="是否单选 0-否，1是")
    private Byte singleChoice;

    /**
    * 标签值数据来源 0-自定义（默认） 1-系统
    */
    @ApiModelProperty(value="标签值数据来源 0-自定义（默认） 1-系统")
    private Byte dataSources;

    /**
    * 选择字段 1-国家，2-省份，3-城市，4-学历，5-学校，6-院校
    */
    @ApiModelProperty(value="选择字段 1-国家，2-省份，3-城市，4-学历，5-学校，6-院校")
    private Byte selectField;

    /**
    * 院校所属层级（1,2,3,4,5）
    */
    @ApiModelProperty(value="院校所属层级（1,2,3,4,5）")
    private Byte level;

    /**
    * 创建人
    */
    @ApiModelProperty(value="创建人")
    private Integer createdBy;

    /**
    * 创建时间
    */
    @ApiModelProperty(value="创建时间")
    private Date createdAt;

    /**
    * 更新人
    */
    @ApiModelProperty(value="更新人")
    private Integer updatedBy;

    /**
    * 更新时间
    */
    @ApiModelProperty(value="更新时间")
    private Date updatedAt;

    /**
    * 是否已删除，0=未删除，1=已删除
    */
    @ApiModelProperty(value="是否已删除，0=未删除，1=已删除")
    private Byte isDeleted;

    private static final long serialVersionUID = 1L;


}