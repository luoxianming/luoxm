package com.example.mysqldemo.dao;

import com.example.mysqldemo.bean.TBsCollegeAreasRelation;
import com.example.mysqldemo.bean.TBsCollegeAreasRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
  * @Author: luoxianming
  * @Date: 2021/4/30 15:22
 */
@Mapper
public interface TBsCollegeAreasRelationMapper {
    long countByExample(TBsCollegeAreasRelationExample example);

    int deleteByExample(TBsCollegeAreasRelationExample example);

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
    int insert(TBsCollegeAreasRelation record);

    int insertOrUpdate(TBsCollegeAreasRelation record);

    int insertOrUpdateSelective(TBsCollegeAreasRelation record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(TBsCollegeAreasRelation record);

    List<TBsCollegeAreasRelation> selectByExample(TBsCollegeAreasRelationExample example);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    TBsCollegeAreasRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBsCollegeAreasRelation record, @Param("example") TBsCollegeAreasRelationExample example);

    int updateByExample(@Param("record") TBsCollegeAreasRelation record, @Param("example") TBsCollegeAreasRelationExample example);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TBsCollegeAreasRelation record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TBsCollegeAreasRelation record);

    int updateBatch(List<TBsCollegeAreasRelation> list);

    int updateBatchSelective(List<TBsCollegeAreasRelation> list);

    int batchInsert(@Param("list") List<TBsCollegeAreasRelation> list);
}