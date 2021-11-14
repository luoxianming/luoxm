package com.example.mysqldemo.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.mysqldemo.bean.TBsCollegeAreasExample;
import java.util.List;
import com.example.mysqldemo.dao.TBsCollegeAreasMapper;
import com.example.mysqldemo.bean.TBsCollegeAreas;
import com.example.mysqldemo.service.TBsCollegeAreasService;
/**
  * @Author: luoxianming
  * @Date: 2021/4/28 15:23
 */
@Service
public class TBsCollegeAreasServiceImpl implements TBsCollegeAreasService{

    @Resource
    private TBsCollegeAreasMapper tBsCollegeAreasMapper;

    @Override
    public long countByExample(TBsCollegeAreasExample example) {
        return tBsCollegeAreasMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TBsCollegeAreasExample example) {
        return tBsCollegeAreasMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return tBsCollegeAreasMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TBsCollegeAreas record) {
        return tBsCollegeAreasMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(TBsCollegeAreas record) {
        return tBsCollegeAreasMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(TBsCollegeAreas record) {
        return tBsCollegeAreasMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(TBsCollegeAreas record) {
        return tBsCollegeAreasMapper.insertSelective(record);
    }

    @Override
    public List<TBsCollegeAreas> selectByExample(TBsCollegeAreasExample example) {
        return tBsCollegeAreasMapper.selectByExample(example);
    }

    @Override
    public TBsCollegeAreas selectByPrimaryKey(Integer id) {
        return tBsCollegeAreasMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TBsCollegeAreas record,TBsCollegeAreasExample example) {
        return tBsCollegeAreasMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(TBsCollegeAreas record,TBsCollegeAreasExample example) {
        return tBsCollegeAreasMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(TBsCollegeAreas record) {
        return tBsCollegeAreasMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TBsCollegeAreas record) {
        return tBsCollegeAreasMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<TBsCollegeAreas> list) {
        return tBsCollegeAreasMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<TBsCollegeAreas> list) {
        return tBsCollegeAreasMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<TBsCollegeAreas> list) {
        return tBsCollegeAreasMapper.batchInsert(list);
    }

}
