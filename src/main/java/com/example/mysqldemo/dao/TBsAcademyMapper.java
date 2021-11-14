package com.example.mysqldemo.dao;

import com.example.mysqldemo.bean.TBsAcademy;
import com.example.mysqldemo.bean.TBsAcademyExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
  * @Author: luoxianming
  * @Date: 2021/5/19 10:14
 */
@Mapper
public interface TBsAcademyMapper {
    long countByExample(TBsAcademyExample example);

    int deleteByExample(TBsAcademyExample example);

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
    int insert(TBsAcademy record);

    int insertOrUpdate(TBsAcademy record);

    int insertOrUpdateSelective(TBsAcademy record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(TBsAcademy record);

    List<TBsAcademy> selectByExample(TBsAcademyExample example);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    TBsAcademy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBsAcademy record, @Param("example") TBsAcademyExample example);

    int updateByExample(@Param("record") TBsAcademy record, @Param("example") TBsAcademyExample example);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TBsAcademy record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TBsAcademy record);

    int updateBatch(List<TBsAcademy> list);

    int updateBatchSelective(List<TBsAcademy> list);

    int batchInsert(@Param("list") List<TBsAcademy> list);
}