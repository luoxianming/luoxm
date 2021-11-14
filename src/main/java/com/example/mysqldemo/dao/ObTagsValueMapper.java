package com.example.mysqldemo.dao;

import com.example.mysqldemo.bean.ObTagsValue;
import com.example.mysqldemo.bean.ObTagsValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
  * @Author: luoxianming
  * @Date: 2021/4/26 23:16
 */
@Mapper
public interface ObTagsValueMapper {
    long countByExample(ObTagsValueExample example);

    int deleteByExample(ObTagsValueExample example);

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
    int insert(ObTagsValue record);

    int insertOrUpdate(ObTagsValue record);

    int insertOrUpdateSelective(ObTagsValue record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(ObTagsValue record);

    List<ObTagsValue> selectByExample(ObTagsValueExample example);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    ObTagsValue selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ObTagsValue record, @Param("example") ObTagsValueExample example);

    int updateByExample(@Param("record") ObTagsValue record, @Param("example") ObTagsValueExample example);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(ObTagsValue record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(ObTagsValue record);

    int updateBatch(List<ObTagsValue> list);

    int updateBatchSelective(List<ObTagsValue> list);

    int batchInsert(@Param("list") List<ObTagsValue> list);
}