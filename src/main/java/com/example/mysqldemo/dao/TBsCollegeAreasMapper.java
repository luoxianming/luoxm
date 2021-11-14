package com.example.mysqldemo.dao;

import com.example.mysqldemo.bean.TBsCollegeAreas;
import com.example.mysqldemo.bean.TBsCollegeAreasExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
  * @Author: luoxianming
  * @Date: 2021/4/28 15:23
 */
@Mapper
public interface TBsCollegeAreasMapper {
    long countByExample(TBsCollegeAreasExample example);

    int deleteByExample(TBsCollegeAreasExample example);

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
    int insert(TBsCollegeAreas record);

    int insertOrUpdate(TBsCollegeAreas record);

    int insertOrUpdateSelective(TBsCollegeAreas record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(TBsCollegeAreas record);

    List<TBsCollegeAreas> selectByExample(TBsCollegeAreasExample example);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    TBsCollegeAreas selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBsCollegeAreas record, @Param("example") TBsCollegeAreasExample example);

    int updateByExample(@Param("record") TBsCollegeAreas record, @Param("example") TBsCollegeAreasExample example);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TBsCollegeAreas record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TBsCollegeAreas record);

    int updateBatch(List<TBsCollegeAreas> list);

    int updateBatchSelective(List<TBsCollegeAreas> list);

    int batchInsert(@Param("list") List<TBsCollegeAreas> list);
//
//    List<TBsCollegeAreas> selectByCountryIdAndFullNameAndCollegeEnName(@Param("countryId")Integer countryId,@Param("fullName")String fullName,@Param("collegeEnName")String collegeEnName);

    List<TBsCollegeAreas> selectByCountryIdAndCollegeIdAndName(@Param("countryId")Integer countryId,@Param("collegeId")Integer collegeId,@Param("name")String name);



    List<TBsCollegeAreas> selectByCountryIdAndCollegeName(@Param("countryId")Integer countryId,@Param("collegeName")String collegeName);


}