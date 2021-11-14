package com.example.mysqldemo.dao;

import com.example.mysqldemo.bean.ObTagsItem;
import com.example.mysqldemo.bean.ObTagsItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
  * @Author: luoxianming
  * @Date: 2021/4/26 23:16
 */
@Mapper
public interface ObTagsItemMapper {
    long countByExample(ObTagsItemExample example);

    int deleteByExample(ObTagsItemExample example);

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
    int insert(ObTagsItem record);

    int insertOrUpdate(ObTagsItem record);

    int insertOrUpdateSelective(ObTagsItem record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(ObTagsItem record);

    List<ObTagsItem> selectByExample(ObTagsItemExample example);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    ObTagsItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ObTagsItem record, @Param("example") ObTagsItemExample example);

    int updateByExample(@Param("record") ObTagsItem record, @Param("example") ObTagsItemExample example);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(ObTagsItem record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(ObTagsItem record);

    int updateBatch(List<ObTagsItem> list);

    int updateBatchSelective(List<ObTagsItem> list);

    int batchInsert(@Param("list") List<ObTagsItem> list);
}