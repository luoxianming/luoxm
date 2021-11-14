package com.example.mysqldemo.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.example.mysqldemo.bean.ObTagsValueExample;
import com.example.mysqldemo.dao.ObTagsValueMapper;
import com.example.mysqldemo.bean.ObTagsValue;
import com.example.mysqldemo.service.ObTagsValueService;
/**
  * @Author: luoxianming
  * @Date: 2021/4/26 23:16
 */
@Service
public class ObTagsValueServiceImpl implements ObTagsValueService{

    @Resource
    private ObTagsValueMapper obTagsValueMapper;

    @Override
    public long countByExample(ObTagsValueExample example) {
        return obTagsValueMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ObTagsValueExample example) {
        return obTagsValueMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return obTagsValueMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ObTagsValue record) {
        return obTagsValueMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(ObTagsValue record) {
        return obTagsValueMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(ObTagsValue record) {
        return obTagsValueMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(ObTagsValue record) {
        return obTagsValueMapper.insertSelective(record);
    }

    @Override
    public List<ObTagsValue> selectByExample(ObTagsValueExample example) {
        return obTagsValueMapper.selectByExample(example);
    }

    @Override
    public ObTagsValue selectByPrimaryKey(Integer id) {
        return obTagsValueMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(ObTagsValue record,ObTagsValueExample example) {
        return obTagsValueMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(ObTagsValue record,ObTagsValueExample example) {
        return obTagsValueMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(ObTagsValue record) {
        return obTagsValueMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ObTagsValue record) {
        return obTagsValueMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<ObTagsValue> list) {
        return obTagsValueMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<ObTagsValue> list) {
        return obTagsValueMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<ObTagsValue> list) {
        return obTagsValueMapper.batchInsert(list);
    }

    @Override
    public int save(ObTagsValue record) {

        ObTagsValue obTagsValue = new ObTagsValue();

        obTagsValueMapper.insert(obTagsValue);
        return 0;
    }

}
