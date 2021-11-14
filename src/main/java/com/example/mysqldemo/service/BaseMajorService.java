package com.example.mysqldemo.service;

import java.util.List;
import com.example.mysqldemo.bean.BaseMajor;
import com.example.mysqldemo.bean.BaseMajorExample;
    /**
  * @Author: luoxianming
  * @Date: 2021/5/19 15:11
 */
public interface BaseMajorService{


    long countByExample(BaseMajorExample example);

    int deleteByExample(BaseMajorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseMajor record);

    int insertOrUpdate(BaseMajor record);

    int insertOrUpdateSelective(BaseMajor record);

    int insertSelective(BaseMajor record);

    List<BaseMajor> selectByExample(BaseMajorExample example);

    BaseMajor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(BaseMajor record,BaseMajorExample example);

    int updateByExample(BaseMajor record,BaseMajorExample example);

    int updateByPrimaryKeySelective(BaseMajor record);

    int updateByPrimaryKey(BaseMajor record);

    int updateBatch(List<BaseMajor> list);

    int updateBatchSelective(List<BaseMajor> list);

    int batchInsert(List<BaseMajor> list);

}
