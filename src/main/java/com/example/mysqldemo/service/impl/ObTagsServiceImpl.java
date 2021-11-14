package com.example.mysqldemo.service.impl;

import com.example.mysqldemo.bean.ObTagsItem;
import com.example.mysqldemo.bean.ObTagsValue;
import com.example.mysqldemo.service.ObTagsItemService;
import com.example.mysqldemo.service.ObTagsValueService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import com.example.mysqldemo.dao.ObTagsMapper;
import com.example.mysqldemo.bean.ObTagsExample;
import com.example.mysqldemo.bean.ObTags;
import com.example.mysqldemo.service.ObTagsService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
  * @Author: luoxianming
  * @Date: 2021/4/26 22:44
 */
@Service
public class ObTagsServiceImpl implements ObTagsService{

    @Resource
    private ObTagsMapper obTagsMapper;

    @Resource
    private ObTagsItemService obTagsItemService;

    @Resource
    private ObTagsValueService obTagsValueService;

    @Override
    public long countByExample(ObTagsExample example) {
        return obTagsMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ObTagsExample example) {
        return obTagsMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return obTagsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ObTags record) {
        return obTagsMapper.insert(record);
    }

    @Override
    public int insertSelective(ObTags record) {
        return obTagsMapper.insertSelective(record);
    }

    @Override
    public List<ObTags> selectByExample(ObTagsExample example) {
        return obTagsMapper.selectByExample(example);
    }

    @Override
    public ObTags selectByPrimaryKey(Integer id) {
        return obTagsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(ObTags record,ObTagsExample example) {
        return obTagsMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(ObTags record,ObTagsExample example) {
        return obTagsMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(ObTags record) {
        return obTagsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ObTags record) {
        return obTagsMapper.updateByPrimaryKey(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public int save(ObTags obTags) {

        try {
            obTags.setCode(13431);
            obTags.setCreatedAt(new Date());
            obTags.setDataSources(new Byte("0"));
            obTags.setCreatedBy(3);
            obTags.setIsDeleted(new Byte("0"));
            obTags.setLevel(new Byte("1"));
            obTags.setTypeId(1232);
            obTags.setName("tets");
            obTags.setSuportQuery(new Byte("0"));
            obTags.setUpdatedAt(new Date());

            obTagsMapper.insert(obTags);
        }catch (Exception exception){

        }

        itemSave();
        obTagsValueService.save(new ObTagsValue());
        return 0;
    }

    private void itemSave() {
        obTagsItemService.save(new ObTagsItem());
    }

}
