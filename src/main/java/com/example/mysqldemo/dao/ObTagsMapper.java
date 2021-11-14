package com.example.mysqldemo.dao;

import com.example.mysqldemo.bean.ObTags;
import com.example.mysqldemo.bean.ObTagsExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
  * @Author: luoxianming
  * @Date: 2021/4/26 22:44
 */
@Mapper
public interface ObTagsMapper {
    long countByExample(ObTagsExample example);

    int deleteByExample(ObTagsExample example);

    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(ObTags record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(ObTags record);

    List<ObTags> selectByExample(ObTagsExample example);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    ObTags selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ObTags record, @Param("example") ObTagsExample example);

    int updateByExample(@Param("record") ObTags record, @Param("example") ObTagsExample example);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(ObTags record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(ObTags record);
}