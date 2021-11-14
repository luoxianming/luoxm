package com.example.mysqldemo.service;

import java.util.List;
import com.example.mysqldemo.bean.ObTagsItemExample;
import com.example.mysqldemo.bean.ObTagsItem;
    /**
  * @Author: luoxianming
  * @Date: 2021/4/26 23:16
 */
public interface ObTagsItemService{


    long countByExample(ObTagsItemExample example);

    int deleteByExample(ObTagsItemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ObTagsItem record);

    int insertOrUpdate(ObTagsItem record);

    int insertOrUpdateSelective(ObTagsItem record);

    int insertSelective(ObTagsItem record);

    List<ObTagsItem> selectByExample(ObTagsItemExample example);

    ObTagsItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(ObTagsItem record,ObTagsItemExample example);

    int updateByExample(ObTagsItem record,ObTagsItemExample example);

    int updateByPrimaryKeySelective(ObTagsItem record);

    int updateByPrimaryKey(ObTagsItem record);

    int updateBatch(List<ObTagsItem> list);

    int updateBatchSelective(List<ObTagsItem> list);

    int batchInsert(List<ObTagsItem> list);

    int save(ObTagsItem record);
}
