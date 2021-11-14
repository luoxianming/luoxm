package com.example.mysqldemo.service;

import java.util.List;
import com.example.mysqldemo.bean.TBsClassInfoExample;
import com.example.mysqldemo.bean.TBsClassInfo;
    /**
  * @Author: luoxianming
  * @Date: 2021/5/20 14:43
 */
public interface TBsClassInfoService{


    long countByExample(TBsClassInfoExample example);

    int deleteByExample(TBsClassInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBsClassInfo record);

    int insertOrUpdate(TBsClassInfo record);

    int insertOrUpdateSelective(TBsClassInfo record);

    int insertSelective(TBsClassInfo record);

    List<TBsClassInfo> selectByExample(TBsClassInfoExample example);

    TBsClassInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(TBsClassInfo record,TBsClassInfoExample example);

    int updateByExample(TBsClassInfo record,TBsClassInfoExample example);

    int updateByPrimaryKeySelective(TBsClassInfo record);

    int updateByPrimaryKey(TBsClassInfo record);

    int updateBatch(List<TBsClassInfo> list);

    int updateBatchSelective(List<TBsClassInfo> list);

    int batchInsert(List<TBsClassInfo> list);

    void save();
}
