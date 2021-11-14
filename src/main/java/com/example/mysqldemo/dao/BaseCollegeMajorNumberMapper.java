package com.example.mysqldemo.dao;

import com.example.mysqldemo.bean.BaseCollegeMajorNumber;
import com.example.mysqldemo.bean.BaseCollegeMajorNumberExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
  * @Author: luoxianming
  * @Date: 2021/5/20 14:42
 */
@Mapper
public interface BaseCollegeMajorNumberMapper {
    long countByExample(BaseCollegeMajorNumberExample example);

    int deleteByExample(BaseCollegeMajorNumberExample example);

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
    int insert(BaseCollegeMajorNumber record);

    int insertOrUpdate(BaseCollegeMajorNumber record);

    int insertOrUpdateSelective(BaseCollegeMajorNumber record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(BaseCollegeMajorNumber record);

    List<BaseCollegeMajorNumber> selectByExample(BaseCollegeMajorNumberExample example);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    BaseCollegeMajorNumber selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseCollegeMajorNumber record, @Param("example") BaseCollegeMajorNumberExample example);

    int updateByExample(@Param("record") BaseCollegeMajorNumber record, @Param("example") BaseCollegeMajorNumberExample example);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(BaseCollegeMajorNumber record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(BaseCollegeMajorNumber record);

    int updateBatch(List<BaseCollegeMajorNumber> list);

    int updateBatchSelective(List<BaseCollegeMajorNumber> list);

    int batchInsert(@Param("list") List<BaseCollegeMajorNumber> list);
}