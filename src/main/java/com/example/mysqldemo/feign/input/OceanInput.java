package com.example.mysqldemo.feign.input;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author yeyanbo
 * @date 2020/6/8 9:50
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor

public class OceanInput {

    /**
     * 业务主键（不可重复）
     */
    @ApiModelProperty(value = "业务主键")
    private Long oceanId;

    /**
     * 海域名称
     */
    @ApiModelProperty(value = "海域名称")
    private String oceanName;

    /**
     * 海域类型，1-新海，2-公海，3-内海，4-死海
     */

    @ApiModelProperty(value = "海域类型，1-新海，2-公海，3-内海，4-死海")
    private Integer oceanCategory;

    /**
     * 海域负责人
     */

    @ApiModelProperty(value = "海域负责人")
    private List<ScopeModel> oceanOwners;

    /**
     * 适用范围
     */

    @ApiModelProperty(value = "适用范围")
    private List<ScopeModel> oceanScopes;

    /**
     * 海域类型，1-主动领取型新海，2-手动分配型新海
     */
    @ApiModelProperty(value = "1-主动领取型新海，2-手动分配型新海")
    private Integer oceanType;

    /**
     * 海域有新增待分配线索，是否提醒负责人，0-不提醒，1-提醒
     */
    @ApiModelProperty(value = "海域有新增待分配线索，是否提醒负责人，0-不提醒，1-提醒")
    private boolean remindRule;

    /**
     * 适用人员属性（0-销售，1-tmk，2-社群运营）
     */
    @ApiModelProperty(value = "适用人员属性（0-销售，1-tmk，2-社群运营）")
    private Integer personnelAttributes;
}
