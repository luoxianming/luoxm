package com.example.mysqldemo.service;

import java.util.List;
import com.example.mysqldemo.bean.ObTagsValueExample;
import com.example.mysqldemo.bean.ObTagsValue;
    /**
  * @Author: luoxianming
  * @Date: 2021/4/26 23:16
 */
public interface ObTagsValueService{


    long countByExample(ObTagsValueExample example);

    int deleteByExample(ObTagsValueExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ObTagsValue record);

    int insertOrUpdate(ObTagsValue record);

    int insertOrUpdateSelective(ObTagsValue record);

    int insertSelective(ObTagsValue record);

    List<ObTagsValue> selectByExample(ObTagsValueExample example);

    ObTagsValue selectByPrimaryKey(Integer id);

    int updateByExampleSelective(ObTagsValue record,ObTagsValueExample example);

    int updateByExample(ObTagsValue record,ObTagsValueExample example);

    int updateByPrimaryKeySelective(ObTagsValue record);

    int updateByPrimaryKey(ObTagsValue record);

    int updateBatch(List<ObTagsValue> list);

    int updateBatchSelective(List<ObTagsValue> list);

    int batchInsert(List<ObTagsValue> list);

    int save(ObTagsValue record);

}
