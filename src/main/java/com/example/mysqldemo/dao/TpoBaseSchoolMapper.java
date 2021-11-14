package com.example.mysqldemo.dao;

import com.example.mysqldemo.bean.TpoBaseSchool;
import com.example.mysqldemo.bean.TpoBaseSchoolExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
  * @Author: luoxianming
  * @Date: 2021/5/19 13:09
 */
@Mapper
public interface TpoBaseSchoolMapper {
    long countByExample(TpoBaseSchoolExample example);

    int deleteByExample(TpoBaseSchoolExample example);

    /**
     * delete by primary key
     * @param sid primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer sid);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(TpoBaseSchool record);

    int insertOrUpdate(TpoBaseSchool record);

    int insertOrUpdateSelective(TpoBaseSchool record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(TpoBaseSchool record);

    List<TpoBaseSchool> selectByExample(TpoBaseSchoolExample example);

    /**
     * select by primary key
     * @param sid primary key
     * @return object by primary key
     */
    TpoBaseSchool selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") TpoBaseSchool record, @Param("example") TpoBaseSchoolExample example);

    int updateByExample(@Param("record") TpoBaseSchool record, @Param("example") TpoBaseSchoolExample example);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TpoBaseSchool record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TpoBaseSchool record);

    int updateBatch(List<TpoBaseSchool> list);

    int updateBatchSelective(List<TpoBaseSchool> list);

    int batchInsert(@Param("list") List<TpoBaseSchool> list);
}