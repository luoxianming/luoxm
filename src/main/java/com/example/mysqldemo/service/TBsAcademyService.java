package com.example.mysqldemo.service;

import java.util.List;
import com.example.mysqldemo.bean.TBsAcademy;
import com.example.mysqldemo.bean.TBsAcademyExample;
    /**
  * @Author: luoxianming
  * @Date: 2021/5/19 10:14
 */
public interface TBsAcademyService{


    long countByExample(TBsAcademyExample example);

    int deleteByExample(TBsAcademyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBsAcademy record);

    int insertOrUpdate(TBsAcademy record);

    int insertOrUpdateSelective(TBsAcademy record);

    int insertSelective(TBsAcademy record);

    List<TBsAcademy> selectByExample(TBsAcademyExample example);

    TBsAcademy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(TBsAcademy record,TBsAcademyExample example);

    int updateByExample(TBsAcademy record,TBsAcademyExample example);

    int updateByPrimaryKeySelective(TBsAcademy record);

    int updateByPrimaryKey(TBsAcademy record);

    int updateBatch(List<TBsAcademy> list);

    int updateBatchSelective(List<TBsAcademy> list);

    int batchInsert(List<TBsAcademy> list);

    void updateOrInsert();

    void save();

    void saveByIdentityguid(String identityguid);
}
