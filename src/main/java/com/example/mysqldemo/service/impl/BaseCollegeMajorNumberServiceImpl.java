package com.example.mysqldemo.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.mysqldemo.bean.BaseCollegeMajorNumber;
import java.util.List;
import com.example.mysqldemo.dao.BaseCollegeMajorNumberMapper;
import com.example.mysqldemo.bean.BaseCollegeMajorNumberExample;
import com.example.mysqldemo.service.BaseCollegeMajorNumberService;
/**
  * @Author: luoxianming
  * @Date: 2021/5/20 14:42
 */
@Service
public class BaseCollegeMajorNumberServiceImpl implements BaseCollegeMajorNumberService{

    @Resource
    private BaseCollegeMajorNumberMapper baseCollegeMajorNumberMapper;

    @Override
    public long countByExample(BaseCollegeMajorNumberExample example) {
        return baseCollegeMajorNumberMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(BaseCollegeMajorNumberExample example) {
        return baseCollegeMajorNumberMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return baseCollegeMajorNumberMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(BaseCollegeMajorNumber record) {
        return baseCollegeMajorNumberMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(BaseCollegeMajorNumber record) {
        return baseCollegeMajorNumberMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(BaseCollegeMajorNumber record) {
        return baseCollegeMajorNumberMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(BaseCollegeMajorNumber record) {
        return baseCollegeMajorNumberMapper.insertSelective(record);
    }

    @Override
    public List<BaseCollegeMajorNumber> selectByExample(BaseCollegeMajorNumberExample example) {
        return baseCollegeMajorNumberMapper.selectByExample(example);
    }

    @Override
    public BaseCollegeMajorNumber selectByPrimaryKey(Integer id) {
        return baseCollegeMajorNumberMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(BaseCollegeMajorNumber record,BaseCollegeMajorNumberExample example) {
        return baseCollegeMajorNumberMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(BaseCollegeMajorNumber record,BaseCollegeMajorNumberExample example) {
        return baseCollegeMajorNumberMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(BaseCollegeMajorNumber record) {
        return baseCollegeMajorNumberMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BaseCollegeMajorNumber record) {
        return baseCollegeMajorNumberMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<BaseCollegeMajorNumber> list) {
        return baseCollegeMajorNumberMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<BaseCollegeMajorNumber> list) {
        return baseCollegeMajorNumberMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<BaseCollegeMajorNumber> list) {
        return baseCollegeMajorNumberMapper.batchInsert(list);
    }

}
