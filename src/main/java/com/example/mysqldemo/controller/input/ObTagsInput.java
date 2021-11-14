package com.example.mysqldemo.controller.input;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.util.List;

/**
 * @date 2020/12/17 16:55
 * @author luoxianming
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ObTagsInput implements Serializable {

    private static final long serialVersionUID = -7296065674793227863L;
    /**
     * 自增主键
     */
    @ApiModelProperty(value = "id，新增时不传")
    private Integer id;
    /**
     * 业务主键（不可重复）
     */
    @ApiModelProperty(value = "code 后端生成，新增时不传")
    private Integer code;
    /**
     * 字典类型id
     */
    @ApiModelProperty(value = "字典类型id")
    @NotNull
    private Integer typeId;
    /**
     * 字段名称
     */
    @ApiModelProperty(value = "名称")
    @NotNull
    private String name;

    /**
     * 负责人
     */
    @ApiModelProperty(value = "名称")
    @NotNull
    private Integer ownerId;

    /**
     * 是否已删除，0=启动，1=禁用
     */
    @ApiModelProperty(value = "0=启动，1=禁用")
    @NotNull
    private Byte isDeleted;

    /**
     * 是否支持查询0-不支持，1支持
     */
    @ApiModelProperty(value = "是否支持查询 0-不支持，1支持")
    @NonNull
    private Byte suportQuery;

    /**
     * 是否单选 0-否，1是
     */
    @ApiModelProperty(value="是否单选 0-否，1是")
    private Integer singleChoice;

    /**
     * 标签值数据来源 0-自定义（默认） 1-系统
     */
    @ApiModelProperty(value = "标签值数据来源 0-自定义（默认） 1-系统")
    private Integer dataSources;

    /**
     * 选择字段 1-国家，2-省份，3-城市，4-学历，5-学校，6-院校
     */
    @ApiModelProperty(value = "选择字段 1-国家，2-省份，3-城市，4-学历，5-学校，6-院校")
    private Integer selectField;

    /**
     * 院校所属层级（1,2,3,4,5）
     */
    @ApiModelProperty(value = "院校所属层级（1,2,3,4,5）")
    private Integer level;

    /**
     * 适用项目
     */
    @ApiModelProperty(value = "适用项目")
    @NotNull
    List<ObTagsItemInput> obTagsItemInputList;

    /**
     * 适用范围
     */
    @NotNull
    @ApiModelProperty(value = "适用范围")
    private List<ScopeModel> userScopes;

    /**
     *  标签值
     */
    @ApiModelProperty(value = "标签值")
    private List<ObTagsValueInput> obTagsValueInputs;

    /**
     * 系统标签 可选范围
     */
    @ApiModelProperty(value = "系统标签 可选范围(省份类型 选中国家时传入的数据， 院校选择国家和省市时)")
    private List<ObTagsItemInput> systemObjectScopes;
}
