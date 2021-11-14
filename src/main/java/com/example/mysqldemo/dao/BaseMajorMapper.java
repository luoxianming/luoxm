package com.example.mysqldemo.dao;

import com.example.mysqldemo.bean.BaseMajor;
import com.example.mysqldemo.bean.BaseMajorExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
  * @Author: luoxianming
  * @Date: 2021/5/19 15:11
 */
@Mapper
public interface BaseMajorMapper {
    long countByExample(BaseMajorExample example);

    int deleteByExample(BaseMajorExample example);

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
    int insert(BaseMajor record);

    int insertOrUpdate(BaseMajor record);

    int insertOrUpdateSelective(BaseMajor record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(BaseMajor record);

    List<BaseMajor> selectByExample(BaseMajorExample example);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    BaseMajor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseMajor record, @Param("example") BaseMajorExample example);

    int updateByExample(@Param("record") BaseMajor record, @Param("example") BaseMajorExample example);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(BaseMajor record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(BaseMajor record);

    int updateBatch(List<BaseMajor> list);

    int updateBatchSelective(List<BaseMajor> list);

    int batchInsert(@Param("list") List<BaseMajor> list);
}