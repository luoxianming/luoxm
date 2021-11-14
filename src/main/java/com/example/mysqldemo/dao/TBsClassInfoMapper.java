package com.example.mysqldemo.dao;

import com.example.mysqldemo.bean.TBsClassInfo;
import com.example.mysqldemo.bean.TBsClassInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
  * @Author: luoxianming
  * @Date: 2021/5/20 14:43
 */
@Mapper
public interface TBsClassInfoMapper {
    long countByExample(TBsClassInfoExample example);

    int deleteByExample(TBsClassInfoExample example);

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
    int insert(TBsClassInfo record);

    int insertOrUpdate(TBsClassInfo record);

    int insertOrUpdateSelective(TBsClassInfo record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(TBsClassInfo record);

    List<TBsClassInfo> selectByExample(TBsClassInfoExample example);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    TBsClassInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBsClassInfo record, @Param("example") TBsClassInfoExample example);

    int updateByExample(@Param("record") TBsClassInfo record, @Param("example") TBsClassInfoExample example);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TBsClassInfo record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TBsClassInfo record);

    int updateBatch(List<TBsClassInfo> list);

    int updateBatchSelective(List<TBsClassInfo> list);

    int batchInsert(@Param("list") List<TBsClassInfo> list);
}