package com.example.mysqldemo.service;

import java.util.List;
import java.util.Map;

import com.example.mysqldemo.bean.TBsCollegeAreasRelationExample;
import com.example.mysqldemo.bean.TBsCollegeAreasRelation;
    /**
  * @Author: luoxianming
  * @Date: 2021/4/30 15:22
 */
public interface TBsCollegeAreasRelationService{


    long countByExample(TBsCollegeAreasRelationExample example);

    int deleteByExample(TBsCollegeAreasRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBsCollegeAreasRelation record);

    int insertOrUpdate(TBsCollegeAreasRelation record);

    int insertOrUpdateSelective(TBsCollegeAreasRelation record);

    int insertSelective(TBsCollegeAreasRelation record);

    List<TBsCollegeAreasRelation> selectByExample(TBsCollegeAreasRelationExample example);

    TBsCollegeAreasRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(TBsCollegeAreasRelation record,TBsCollegeAreasRelationExample example);

    int updateByExample(TBsCollegeAreasRelation record,TBsCollegeAreasRelationExample example);

    int updateByPrimaryKeySelective(TBsCollegeAreasRelation record);

    int updateByPrimaryKey(TBsCollegeAreasRelation record);

    int updateBatch(List<TBsCollegeAreasRelation> list);

    int updateBatchSelective(List<TBsCollegeAreasRelation> list);

    int batchInsert(List<TBsCollegeAreasRelation> list);

    Map<String, Integer> identityGuidAndBsCollegeAreasIdMap(String identityGuid);

}
