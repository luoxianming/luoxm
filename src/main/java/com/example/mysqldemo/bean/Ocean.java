package com.example.mysqldemo.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Ocean {
    /**
     * 自增主键
     */
    private Integer id;

    /**
     * 业务主键（不可重复）
     */
    private Long oceanId;

    /**
     * 海域名称
     */
    private String oceanName;

    /**
     * 海域类型，1-新海，2-公海，3-内海，4-死海
     */
    private Integer oceanCategory;

    /**
     * 海域类型，1-主动领取型新海，2-手动分配型新海
     */
    private int oceanType;

    /**
     * 海域有新增待分配线索，是否提醒负责人，0-不提醒，1-提醒
     */
    private boolean remindRule;

    /**
     * 是否为总部(默认)，0-分校，1-总部
     */
    private Byte headQuarter;

    /**
     * 适用人员属性（0-销售，1-tmk，2-社群运营）
     */
    private Integer personnelAttributes;

    /**
     * 创建人
     */
    private Integer createdBy;

    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 更新人
     */
    private Integer updatedBy;

    /**
     * 更新时间
     */
    private Date updatedAt;

    /**
     * 是否已删除，0=未删除，1=已删除
     */
    private boolean isDeleted;

    /**
     * 删除人
     */
    private Integer deletedBy;

    /**
     * 删除时间
     */
    private Date deletedAt;
}