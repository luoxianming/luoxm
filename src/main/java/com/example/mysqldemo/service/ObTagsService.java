package com.example.mysqldemo.service;

import java.util.List;
import com.example.mysqldemo.bean.ObTagsExample;
import com.example.mysqldemo.bean.ObTags;
    /**
  * @Author: luoxianming
  * @Date: 2021/4/26 22:44
 */
public interface ObTagsService{


    long countByExample(ObTagsExample example);

    int deleteByExample(ObTagsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ObTags record);

    int insertSelective(ObTags record);

    List<ObTags> selectByExample(ObTagsExample example);

    ObTags selectByPrimaryKey(Integer id);

    int updateByExampleSelective(ObTags record,ObTagsExample example);

    int updateByExample(ObTags record,ObTagsExample example);

    int updateByPrimaryKeySelective(ObTags record);

    int updateByPrimaryKey(ObTags record);

    int save(ObTags obTags);

}
