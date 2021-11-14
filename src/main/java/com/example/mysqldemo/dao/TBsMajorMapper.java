package com.example.mysqldemo.dao;

import com.example.mysqldemo.bean.TBsMajor;
import com.example.mysqldemo.bean.TBsMajorExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: luoxianming
 * @Date: 2021/5/20 16:36
 */
@Mapper
public interface TBsMajorMapper {
    long countByExample(TBsMajorExample example);

    int deleteByExample(TBsMajorExample example);

    /**
     * delete by primary key
     *
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(TBsMajor record);

    int insertOrUpdate(TBsMajor record);

    int insertOrUpdateSelective(TBsMajor record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(TBsMajor record);

    List<TBsMajor> selectByExample(TBsMajorExample example);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    TBsMajor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBsMajor record, @Param("example") TBsMajorExample example);

    int updateByExample(@Param("record") TBsMajor record, @Param("example") TBsMajorExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TBsMajor record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TBsMajor record);

    int updateBatch(List<TBsMajor> list);

    int updateBatchSelective(List<TBsMajor> list);

    int batchInsert(@Param("list") List<TBsMajor> list);
}