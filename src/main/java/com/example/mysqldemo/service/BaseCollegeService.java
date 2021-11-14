package com.example.mysqldemo.service;

import java.util.List;
import com.example.mysqldemo.bean.BaseCollege;
import com.example.mysqldemo.bean.BaseCollegeExample;
    /**
  * @Author: luoxianming
  * @Date: 2021/5/19 9:35
 */
public interface BaseCollegeService{


    long countByExample(BaseCollegeExample example);

    int deleteByExample(BaseCollegeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseCollege record);

    int insertOrUpdate(BaseCollege record);

    int insertOrUpdateSelective(BaseCollege record);

    int insertSelective(BaseCollege record);

    List<BaseCollege> selectByExample(BaseCollegeExample example);

    BaseCollege selectByPrimaryKey(Integer id);

    int updateByExampleSelective(BaseCollege record,BaseCollegeExample example);

    int updateByExample(BaseCollege record,BaseCollegeExample example);

    int updateByPrimaryKeySelective(BaseCollege record);

    int updateByPrimaryKey(BaseCollege record);

    int updateBatch(List<BaseCollege> list);

    int updateBatchSelective(List<BaseCollege> list);

    int batchInsert(List<BaseCollege> list);

}
