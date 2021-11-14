package com.example.mysqldemo.dao;

import com.example.mysqldemo.bean.UserBehavior;
import com.example.mysqldemo.excel.vo.Behavior;
import org.apache.ibatis.annotations.*;

/**
 * @Author: luoxianming
 * @Date: 2020/8/27 21:05
 */
@Mapper
public interface BehaviorDao {

    @Insert("insert into user_behavior (behavior_id, behavior_type_name, behavior_name, \n" +
            "      parent_id, full_name, full_code, \n" +
            "      created_by, created_at, updated_by, \n" +
            "      updated_at, is_deleted, source_sort, \n" +
            "      description, classification, has_child\n" +
            "      )\n" +
            "    values (#{behaviorId,jdbcType=BIGINT}, #{behaviorTypeName,jdbcType=VARCHAR}, #{behaviorName,jdbcType=VARCHAR}, \n" +
            "      #{parentId,jdbcType=INTEGER}, #{fullName,jdbcType=VARCHAR}, #{fullCode,jdbcType=VARCHAR}, \n" +
            "      #{createdBy,jdbcType=INTEGER}, #{createdAt,jdbcType=TIMESTAMP}, #{updatedBy,jdbcType=INTEGER}, \n" +
            "      #{updatedAt,jdbcType=TIMESTAMP}, #{isDeleted,jdbcType=TINYINT}, #{sourceSort,jdbcType=INTEGER}, \n" +
            "      #{description,jdbcType=VARCHAR}, #{classification,jdbcType=VARCHAR}, #{hasChild,jdbcType=TINYINT}\n" +
            "      )")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(UserBehavior behavior);

    @Update("update user_behavior a set a.behavior_id =#{behaviord}, a.full_code=#{fullCode} where a.id =#{id}")
    int update(Integer id, Integer behaviord, String fullCode);
}
