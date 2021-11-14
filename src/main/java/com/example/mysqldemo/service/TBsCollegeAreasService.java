package com.example.mysqldemo.service;

import com.example.mysqldemo.bean.TBsCollegeAreasExample;
import java.util.List;
import com.example.mysqldemo.bean.TBsCollegeAreas;
    /**
  * @Author: luoxianming
  * @Date: 2021/4/28 15:23
 */
public interface TBsCollegeAreasService{


    long countByExample(TBsCollegeAreasExample example);

    int deleteByExample(TBsCollegeAreasExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBsCollegeAreas record);

    int insertOrUpdate(TBsCollegeAreas record);

    int insertOrUpdateSelective(TBsCollegeAreas record);

    int insertSelective(TBsCollegeAreas record);

    List<TBsCollegeAreas> selectByExample(TBsCollegeAreasExample example);

    TBsCollegeAreas selectByPrimaryKey(Integer id);

    int updateByExampleSelective(TBsCollegeAreas record,TBsCollegeAreasExample example);

    int updateByExample(TBsCollegeAreas record,TBsCollegeAreasExample example);

    int updateByPrimaryKeySelective(TBsCollegeAreas record);

    int updateByPrimaryKey(TBsCollegeAreas record);

    int updateBatch(List<TBsCollegeAreas> list);

    int updateBatchSelective(List<TBsCollegeAreas> list);

    int batchInsert(List<TBsCollegeAreas> list);

}
