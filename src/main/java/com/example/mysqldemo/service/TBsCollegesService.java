package com.example.mysqldemo.service;

import java.util.List;
import com.example.mysqldemo.bean.TBsColleges;
import com.example.mysqldemo.bean.TBsCollegesExample;
import com.example.mysqldemo.excel.vo.TbCollegeTargetInput;

/**
  * @Author: luoxianming
  * @Date: 2021/4/27 22:20
 */
public interface TBsCollegesService{


    long countByExample(TBsCollegesExample example);

    int deleteByExample(TBsCollegesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBsColleges record);

    int insertOrUpdate(TBsColleges record);

    int insertOrUpdateSelective(TBsColleges record);

    int insertSelective(TBsColleges record);

    List<TBsColleges> selectByExample(TBsCollegesExample example);

    TBsColleges selectByPrimaryKey(Integer id);

    int updateByExampleSelective(TBsColleges record,TBsCollegesExample example);

    int updateByExample(TBsColleges record,TBsCollegesExample example);

    int updateByPrimaryKeySelective(TBsColleges record);

    int updateByPrimaryKey(TBsColleges record);

    int updateBatch(List<TBsColleges> list);

    int updateBatchSelective(List<TBsColleges> list);

    int batchInsert(List<TBsColleges> list);

    int readExcel();

    List<TBsColleges> getByCollegeName(String collegeName);
}
