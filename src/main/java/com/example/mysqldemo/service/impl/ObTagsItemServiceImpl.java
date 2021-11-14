package com.example.mysqldemo.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.mysqldemo.dao.ObTagsItemMapper;
import java.util.List;
import com.example.mysqldemo.bean.ObTagsItemExample;
import com.example.mysqldemo.bean.ObTagsItem;
import com.example.mysqldemo.service.ObTagsItemService;
/**
  * @Author: luoxianming
  * @Date: 2021/4/26 23:16
 */
@Service
public class ObTagsItemServiceImpl implements ObTagsItemService{

    @Resource
    private ObTagsItemMapper obTagsItemMapper;

    @Override
    public long countByExample(ObTagsItemExample example) {
        return obTagsItemMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ObTagsItemExample example) {
        return obTagsItemMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return obTagsItemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ObTagsItem record) {
        return obTagsItemMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(ObTagsItem record) {
        return obTagsItemMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(ObTagsItem record) {
        return obTagsItemMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(ObTagsItem record) {
        return obTagsItemMapper.insertSelective(record);
    }

    @Override
    public List<ObTagsItem> selectByExample(ObTagsItemExample example) {
        return obTagsItemMapper.selectByExample(example);
    }

    @Override
    public ObTagsItem selectByPrimaryKey(Integer id) {
        return obTagsItemMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(ObTagsItem record,ObTagsItemExample example) {
        return obTagsItemMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(ObTagsItem record,ObTagsItemExample example) {
        return obTagsItemMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(ObTagsItem record) {
        return obTagsItemMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ObTagsItem record) {
        return obTagsItemMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<ObTagsItem> list) {
        return obTagsItemMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<ObTagsItem> list) {
        return obTagsItemMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<ObTagsItem> list) {
        return obTagsItemMapper.batchInsert(list);
    }

    @Override
    public int save(ObTagsItem record) {
        this.selectByPrimaryKey(1);
//        int i = 1/0;
        return 0;
    }

}
