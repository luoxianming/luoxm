package com.example.mysqldemo.dao;

import com.example.mysqldemo.bean.BaseCollege;
import com.example.mysqldemo.bean.BaseCollegeExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
  * @Author: luoxianming
  * @Date: 2021/5/19 9:35
 */
@Mapper
public interface BaseCollegeMapper {
    long countByExample(BaseCollegeExample example);

    int deleteByExample(BaseCollegeExample example);

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
    int insert(BaseCollege record);

    int insertOrUpdate(BaseCollege record);

    int insertOrUpdateSelective(BaseCollege record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(BaseCollege record);

    List<BaseCollege> selectByExample(BaseCollegeExample example);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    BaseCollege selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseCollege record, @Param("example") BaseCollegeExample example);

    int updateByExample(@Param("record") BaseCollege record, @Param("example") BaseCollegeExample example);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(BaseCollege record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(BaseCollege record);

    int updateBatch(List<BaseCollege> list);

    int updateBatchSelective(List<BaseCollege> list);

    int batchInsert(@Param("list") List<BaseCollege> list);
}