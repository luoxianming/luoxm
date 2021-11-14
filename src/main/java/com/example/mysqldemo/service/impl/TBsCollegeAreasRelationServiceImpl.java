package com.example.mysqldemo.service.impl;

import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.example.mysqldemo.bean.TBsCollegeAreasRelationExample;
import com.example.mysqldemo.dao.TBsCollegeAreasRelationMapper;
import com.example.mysqldemo.bean.TBsCollegeAreasRelation;
import com.example.mysqldemo.service.TBsCollegeAreasRelationService;
/**
  * @Author: luoxianming
  * @Date: 2021/4/30 15:22
 */
@Service
public class TBsCollegeAreasRelationServiceImpl implements TBsCollegeAreasRelationService{

    @Resource
    private TBsCollegeAreasRelationMapper tBsCollegeAreasRelationMapper;

    @Override
    public long countByExample(TBsCollegeAreasRelationExample example) {
        return tBsCollegeAreasRelationMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TBsCollegeAreasRelationExample example) {
        return tBsCollegeAreasRelationMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return tBsCollegeAreasRelationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TBsCollegeAreasRelation record) {
        return tBsCollegeAreasRelationMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(TBsCollegeAreasRelation record) {
        return tBsCollegeAreasRelationMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(TBsCollegeAreasRelation record) {
        return tBsCollegeAreasRelationMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(TBsCollegeAreasRelation record) {
        return tBsCollegeAreasRelationMapper.insertSelective(record);
    }

    @Override
    public List<TBsCollegeAreasRelation> selectByExample(TBsCollegeAreasRelationExample example) {
        return tBsCollegeAreasRelationMapper.selectByExample(example);
    }

    @Override
    public TBsCollegeAreasRelation selectByPrimaryKey(Integer id) {
        return tBsCollegeAreasRelationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TBsCollegeAreasRelation record,TBsCollegeAreasRelationExample example) {
        return tBsCollegeAreasRelationMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(TBsCollegeAreasRelation record,TBsCollegeAreasRelationExample example) {
        return tBsCollegeAreasRelationMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(TBsCollegeAreasRelation record) {
        return tBsCollegeAreasRelationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TBsCollegeAreasRelation record) {
        return tBsCollegeAreasRelationMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<TBsCollegeAreasRelation> list) {
        return tBsCollegeAreasRelationMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<TBsCollegeAreasRelation> list) {
        return tBsCollegeAreasRelationMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<TBsCollegeAreasRelation> list) {
        return tBsCollegeAreasRelationMapper.batchInsert(list);
    }

    @Override
    public Map<String, Integer> identityGuidAndBsCollegeAreasIdMap(String identityGuid) {
        TBsCollegeAreasRelationExample tBsCollegeAreasRelationExample = new TBsCollegeAreasRelationExample();
        if (ObjectUtils.isNotEmpty(identityGuid)) {
            tBsCollegeAreasRelationExample.createCriteria().andIsDeletedEqualTo(false).andIdentityGuidEqualTo(identityGuid);
        }else {
            tBsCollegeAreasRelationExample.createCriteria().andIsDeletedEqualTo(false);
        }

        List<TBsCollegeAreasRelation> tBsCollegeAreasRelations = this.selectByExample(tBsCollegeAreasRelationExample);
        Map<String, Integer> identityGuidAndBsCollegeAreasIdMap = new HashMap<>();
//                tBsCollegeAreasRelations.stream().collect(Collectors.toMap(
//                TBsCollegeAreasRelation::getIdentityGuid, TBsCollegeAreasRelation::getBsCollegeAreasId));

        tBsCollegeAreasRelations.forEach(tBsCollegeAreasRelation -> {
            identityGuidAndBsCollegeAreasIdMap.put(tBsCollegeAreasRelation.getIdentityGuid(), tBsCollegeAreasRelation.getBsCollegeAreasId());
        });

        return identityGuidAndBsCollegeAreasIdMap;
    }

}
