package com.example.mysqldemo.service;

import java.util.List;
import com.example.mysqldemo.bean.TBsMajor;
import com.example.mysqldemo.bean.TBsMajorExample;
    /**
  * @Author: luoxianming
  * @Date: 2021/5/19 20:05
 */
public interface TBsMajorService{


    long countByExample(TBsMajorExample example);

    int deleteByExample(TBsMajorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBsMajor record);

    int insertOrUpdate(TBsMajor record);

    int insertOrUpdateSelective(TBsMajor record);

    int insertSelective(TBsMajor record);

    List<TBsMajor> selectByExample(TBsMajorExample example);

    TBsMajor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(TBsMajor record,TBsMajorExample example);

    int updateByExample(TBsMajor record,TBsMajorExample example);

    int updateByPrimaryKeySelective(TBsMajor record);

    int updateByPrimaryKey(TBsMajor record);

    int updateBatch(List<TBsMajor> list);

    int updateBatchSelective(List<TBsMajor> list);

    int batchInsert(List<TBsMajor> list);

    void updateCollegeAreaId();

    void save();

    void saveByIdentityguid(String identityguid);
}
