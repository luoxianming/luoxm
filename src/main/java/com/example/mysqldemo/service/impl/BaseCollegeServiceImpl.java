package com.example.mysqldemo.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.mysqldemo.dao.BaseCollegeMapper;
import java.util.List;
import com.example.mysqldemo.bean.BaseCollege;
import com.example.mysqldemo.bean.BaseCollegeExample;
import com.example.mysqldemo.service.BaseCollegeService;
/**
  * @Author: luoxianming
  * @Date: 2021/5/19 9:35
 */
@Service
public class BaseCollegeServiceImpl implements BaseCollegeService{

    @Resource
    private BaseCollegeMapper baseCollegeMapper;

    @Override
    public long countByExample(BaseCollegeExample example) {
        return baseCollegeMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(BaseCollegeExample example) {
        return baseCollegeMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return baseCollegeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(BaseCollege record) {
        return baseCollegeMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(BaseCollege record) {
        return baseCollegeMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(BaseCollege record) {
        return baseCollegeMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(BaseCollege record) {
        return baseCollegeMapper.insertSelective(record);
    }

    @Override
    public List<BaseCollege> selectByExample(BaseCollegeExample example) {
        return baseCollegeMapper.selectByExample(example);
    }

    @Override
    public BaseCollege selectByPrimaryKey(Integer id) {
        return baseCollegeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(BaseCollege record,BaseCollegeExample example) {
        return baseCollegeMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(BaseCollege record,BaseCollegeExample example) {
        return baseCollegeMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(BaseCollege record) {
        return baseCollegeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BaseCollege record) {
        return baseCollegeMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<BaseCollege> list) {
        return baseCollegeMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<BaseCollege> list) {
        return baseCollegeMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<BaseCollege> list) {
        return baseCollegeMapper.batchInsert(list);
    }

}
