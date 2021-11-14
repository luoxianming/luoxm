package com.example.mysqldemo.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.example.mysqldemo.bean.TpoBaseSchoolExample;
import com.example.mysqldemo.dao.TpoBaseSchoolMapper;
import com.example.mysqldemo.bean.TpoBaseSchool;
import com.example.mysqldemo.service.TpoBaseSchoolService;
/**
  * @Author: luoxianming
  * @Date: 2021/5/19 13:09
 */
@Service
public class TpoBaseSchoolServiceImpl implements TpoBaseSchoolService{

    @Resource
    private TpoBaseSchoolMapper tpoBaseSchoolMapper;

    @Override
    public long countByExample(TpoBaseSchoolExample example) {
        return tpoBaseSchoolMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TpoBaseSchoolExample example) {
        return tpoBaseSchoolMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer sid) {
        return tpoBaseSchoolMapper.deleteByPrimaryKey(sid);
    }

    @Override
    public int insert(TpoBaseSchool record) {
        return tpoBaseSchoolMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(TpoBaseSchool record) {
        return tpoBaseSchoolMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(TpoBaseSchool record) {
        return tpoBaseSchoolMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(TpoBaseSchool record) {
        return tpoBaseSchoolMapper.insertSelective(record);
    }

    @Override
    public List<TpoBaseSchool> selectByExample(TpoBaseSchoolExample example) {
        return tpoBaseSchoolMapper.selectByExample(example);
    }

    @Override
    public TpoBaseSchool selectByPrimaryKey(Integer sid) {
        return tpoBaseSchoolMapper.selectByPrimaryKey(sid);
    }

    @Override
    public int updateByExampleSelective(TpoBaseSchool record,TpoBaseSchoolExample example) {
        return tpoBaseSchoolMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(TpoBaseSchool record,TpoBaseSchoolExample example) {
        return tpoBaseSchoolMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(TpoBaseSchool record) {
        return tpoBaseSchoolMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TpoBaseSchool record) {
        return tpoBaseSchoolMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<TpoBaseSchool> list) {
        return tpoBaseSchoolMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<TpoBaseSchool> list) {
        return tpoBaseSchoolMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<TpoBaseSchool> list) {
        return tpoBaseSchoolMapper.batchInsert(list);
    }

    @Override
    public Map<Integer, String> sidAndIdentityguidMap() {
        TpoBaseSchoolExample tpoBaseSchoolExample = new TpoBaseSchoolExample();
        List<TpoBaseSchool> tpoBaseSchools = this.selectByExample(tpoBaseSchoolExample);
        Map<Integer, String> sidAndIdentityguidMap = tpoBaseSchools.stream().collect(Collectors.toMap(TpoBaseSchool::getSid, TpoBaseSchool::getIdentityguid));
        return sidAndIdentityguidMap;
    }

}
