package com.example.mysqldemo.bean;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserBehavior implements Serializable,Cloneable {
    /**
     * 自增主键
     */
    private Integer id;

    /**
     * 业务主键，不可重复
     */
    private Long behaviorId;

    /**
     * 用户行为类型名称
     */
    private String behaviorTypeName;

    /**
     * 用户行为名称
     */
    private String behaviorName;

    /**
     * 父级用户行为ID
     */
    private Integer parentId;

    /**
     * 全名称
     */
    private String fullName;

    /**
     * 用户行为全路径编码
     */
    private String fullCode;

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
     * 是否删除
     */
    private boolean isDeleted;

    /**
     * 排序
     */
    private Integer sourceSort;

    /**
     * 行为描述
     */
    private String description;

    /**
     * 行为分类
     */
    private String classification;

    /**
     * 是否有子节点
     */
    private boolean hasChild;

    private static final long serialVersionUID = 1L;


}