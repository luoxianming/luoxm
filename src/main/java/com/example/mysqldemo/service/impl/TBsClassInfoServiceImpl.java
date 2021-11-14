package com.example.mysqldemo.service.impl;

import com.example.mysqldemo.bean.BaseCollegeMajorNumber;
import com.example.mysqldemo.bean.BaseCollegeMajorNumberExample;
import com.example.mysqldemo.service.BaseCollegeMajorNumberService;
import com.example.mysqldemo.service.TBsCollegeAreasRelationService;
import com.example.mysqldemo.service.TpoBaseSchoolService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.mysqldemo.dao.TBsClassInfoMapper;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.example.mysqldemo.bean.TBsClassInfoExample;
import com.example.mysqldemo.bean.TBsClassInfo;
import com.example.mysqldemo.service.TBsClassInfoService;
/**
  * @Author: luoxianming
  * @Date: 2021/5/20 14:43
 */
@Service
public class TBsClassInfoServiceImpl implements TBsClassInfoService{

    @Resource
    private TBsClassInfoMapper tBsClassInfoMapper;
    @Resource
    private BaseCollegeMajorNumberService baseCollegeMajorNumberService;

    @Resource
    private TBsCollegeAreasRelationService tBsCollegeAreasRelationService;

    @Resource
    private TpoBaseSchoolService tpoBaseSchoolService;

    @Override
    public long countByExample(TBsClassInfoExample example) {
        return tBsClassInfoMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TBsClassInfoExample example) {
        return tBsClassInfoMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return tBsClassInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TBsClassInfo record) {
        return tBsClassInfoMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(TBsClassInfo record) {
        return tBsClassInfoMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(TBsClassInfo record) {
        return tBsClassInfoMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(TBsClassInfo record) {
        return tBsClassInfoMapper.insertSelective(record);
    }

    @Override
    public List<TBsClassInfo> selectByExample(TBsClassInfoExample example) {
        return tBsClassInfoMapper.selectByExample(example);
    }

    @Override
    public TBsClassInfo selectByPrimaryKey(Integer id) {
        return tBsClassInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TBsClassInfo record,TBsClassInfoExample example) {
        return tBsClassInfoMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(TBsClassInfo record,TBsClassInfoExample example) {
        return tBsClassInfoMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(TBsClassInfo record) {
        return tBsClassInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TBsClassInfo record) {
        return tBsClassInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<TBsClassInfo> list) {
        return tBsClassInfoMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<TBsClassInfo> list) {
        return tBsClassInfoMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<TBsClassInfo> list) {
        return tBsClassInfoMapper.batchInsert(list);
    }

    @Override
    public void save() {
        BaseCollegeMajorNumberExample example = new BaseCollegeMajorNumberExample();
        example.createCriteria().andIdGreaterThan(10452);
        List<BaseCollegeMajorNumber> baseCollegeMajorNumbers = baseCollegeMajorNumberService.selectByExample(example);


        // 读取 Tpo_Base_School
        Map<Integer, String> sidAndIdentityguidMap = tpoBaseSchoolService.sidAndIdentityguidMap();

        // 读取 t_bs_college_areas_relation 表
        Map<String, Integer> identityGuidAndBsCollegeAreasIdMap = tBsCollegeAreasRelationService.identityGuidAndBsCollegeAreasIdMap(null);

        Date date = new Date();

        for (BaseCollegeMajorNumber baseCollegeMajorNumber :baseCollegeMajorNumbers){
            TBsClassInfo tBsClassInfo = new TBsClassInfo();


            String identityguid = sidAndIdentityguidMap.getOrDefault(baseCollegeMajorNumber.getSchoolid(), null);
            if (null == identityguid){

                continue;
            }

            Integer bsCollegeAreasId = identityGuidAndBsCollegeAreasIdMap.getOrDefault(identityguid, null);
            if (null == bsCollegeAreasId){

                continue;
            }

            tBsClassInfo.setCode(baseCollegeMajorNumber.getId());
            tBsClassInfo.setCollegeAreaId(bsCollegeAreasId);
            tBsClassInfo.setAcademyCode(baseCollegeMajorNumber.getCollegeid());
            tBsClassInfo.setMajorCode(baseCollegeMajorNumber.getMajorid());
            tBsClassInfo.setClassName(baseCollegeMajorNumber.getClassname());
            tBsClassInfo.setEnrollmentYear(baseCollegeMajorNumber.getEnrollmentyear());
            tBsClassInfo.setNumber(baseCollegeMajorNumber.getNumber());
            tBsClassInfo.setCreatedBy(baseCollegeMajorNumber.getCreateby());
            tBsClassInfo.setCreatedAt(baseCollegeMajorNumber.getCreatetime());
            tBsClassInfo.setUpdatedAt(date);
            tBsClassInfo.setUpdatedBy(1);
            tBsClassInfo.setIsDelete(baseCollegeMajorNumber.getIsdelete() == 0);
            this.tBsClassInfoMapper.insert(tBsClassInfo);
        }
    }
}
