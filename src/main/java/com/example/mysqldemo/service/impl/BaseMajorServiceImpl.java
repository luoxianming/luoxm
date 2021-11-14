package com.example.mysqldemo.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.mysqldemo.dao.BaseMajorMapper;
import java.util.List;
import com.example.mysqldemo.bean.BaseMajor;
import com.example.mysqldemo.bean.BaseMajorExample;
import com.example.mysqldemo.service.BaseMajorService;
/**
  * @Author: luoxianming
  * @Date: 2021/5/19 15:11
 */
@Service
public class BaseMajorServiceImpl implements BaseMajorService{

    @Resource
    private BaseMajorMapper baseMajorMapper;

    @Override
    public long countByExample(BaseMajorExample example) {
        return baseMajorMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(BaseMajorExample example) {
        return baseMajorMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return baseMajorMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(BaseMajor record) {
        return baseMajorMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(BaseMajor record) {
        return baseMajorMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(BaseMajor record) {
        return baseMajorMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(BaseMajor record) {
        return baseMajorMapper.insertSelective(record);
    }

    @Override
    public List<BaseMajor> selectByExample(BaseMajorExample example) {
        return baseMajorMapper.selectByExample(example);
    }

    @Override
    public BaseMajor selectByPrimaryKey(Integer id) {
        return baseMajorMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(BaseMajor record,BaseMajorExample example) {
        return baseMajorMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(BaseMajor record,BaseMajorExample example) {
        return baseMajorMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(BaseMajor record) {
        return baseMajorMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BaseMajor record) {
        return baseMajorMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<BaseMajor> list) {
        return baseMajorMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<BaseMajor> list) {
        return baseMajorMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<BaseMajor> list) {
        return baseMajorMapper.batchInsert(list);
    }

}
