package com.example.mysqldemo.service;

import java.util.List;
import java.util.Map;

import com.example.mysqldemo.bean.TpoBaseSchoolExample;
import com.example.mysqldemo.bean.TpoBaseSchool;
    /**
  * @Author: luoxianming
  * @Date: 2021/5/19 13:09
 */
public interface TpoBaseSchoolService{


    long countByExample(TpoBaseSchoolExample example);

    int deleteByExample(TpoBaseSchoolExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(TpoBaseSchool record);

    int insertOrUpdate(TpoBaseSchool record);

    int insertOrUpdateSelective(TpoBaseSchool record);

    int insertSelective(TpoBaseSchool record);

    List<TpoBaseSchool> selectByExample(TpoBaseSchoolExample example);

    TpoBaseSchool selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(TpoBaseSchool record,TpoBaseSchoolExample example);

    int updateByExample(TpoBaseSchool record,TpoBaseSchoolExample example);

    int updateByPrimaryKeySelective(TpoBaseSchool record);

    int updateByPrimaryKey(TpoBaseSchool record);

    int updateBatch(List<TpoBaseSchool> list);

    int updateBatchSelective(List<TpoBaseSchool> list);

    int batchInsert(List<TpoBaseSchool> list);

    Map<Integer, String> sidAndIdentityguidMap();
}
