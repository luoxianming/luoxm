package com.example.mysqldemo.service;

import com.example.mysqldemo.bean.BaseCollegeMajorNumber;
import java.util.List;
import com.example.mysqldemo.bean.BaseCollegeMajorNumberExample;
    /**
  * @Author: luoxianming
  * @Date: 2021/5/20 14:42
 */
public interface BaseCollegeMajorNumberService{


    long countByExample(BaseCollegeMajorNumberExample example);

    int deleteByExample(BaseCollegeMajorNumberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseCollegeMajorNumber record);

    int insertOrUpdate(BaseCollegeMajorNumber record);

    int insertOrUpdateSelective(BaseCollegeMajorNumber record);

    int insertSelective(BaseCollegeMajorNumber record);

    List<BaseCollegeMajorNumber> selectByExample(BaseCollegeMajorNumberExample example);

    BaseCollegeMajorNumber selectByPrimaryKey(Integer id);

    int updateByExampleSelective(BaseCollegeMajorNumber record,BaseCollegeMajorNumberExample example);

    int updateByExample(BaseCollegeMajorNumber record,BaseCollegeMajorNumberExample example);

    int updateByPrimaryKeySelective(BaseCollegeMajorNumber record);

    int updateByPrimaryKey(BaseCollegeMajorNumber record);

    int updateBatch(List<BaseCollegeMajorNumber> list);

    int updateBatchSelective(List<BaseCollegeMajorNumber> list);

    int batchInsert(List<BaseCollegeMajorNumber> list);

}
