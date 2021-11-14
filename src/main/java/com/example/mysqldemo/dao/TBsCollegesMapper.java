package com.example.mysqldemo.dao;

import com.example.mysqldemo.bean.TBsColleges;
import com.example.mysqldemo.bean.TBsCollegesExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
  * @Author: luoxianming
  * @Date: 2021/4/27 22:20
 */
@Mapper
public interface TBsCollegesMapper {
    long countByExample(TBsCollegesExample example);

    int deleteByExample(TBsCollegesExample example);

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
    int insert(TBsColleges record);

    int insertOrUpdate(TBsColleges record);

    int insertOrUpdateSelective(TBsColleges record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(TBsColleges record);

    List<TBsColleges> selectByExample(TBsCollegesExample example);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    TBsColleges selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBsColleges record, @Param("example") TBsCollegesExample example);

    int updateByExample(@Param("record") TBsColleges record, @Param("example") TBsCollegesExample example);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TBsColleges record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TBsColleges record);

    int updateBatch(List<TBsColleges> list);

    int updateBatchSelective(List<TBsColleges> list);

    int batchInsert(@Param("list") List<TBsColleges> list);
}