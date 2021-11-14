package com.example.mysqldemo.service.impl;

import com.alibaba.fastjson.JSON;
import com.example.mysqldemo.bean.*;
import com.example.mysqldemo.service.*;
import com.example.mysqldemo.utils.DateUtil;
import com.example.mysqldemo.utils.TxtExport;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.omg.CORBA.INTERNAL;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.example.mysqldemo.dao.TBsMajorMapper;

/**
  * @Author: luoxianming
  * @Date: 2021/5/19 20:05
 */
@Slf4j
@Service
public class TBsMajorServiceImpl implements TBsMajorService{

    @Resource
    private TBsMajorMapper tBsMajorMapper;

    @Resource
    private TBsAcademyService tBsAcademyService;

    @Resource
    private BaseMajorService baseMajorService;

    @Resource
    private TBsCollegeAreasRelationService tBsCollegeAreasRelationService;

    @Resource
    private TpoBaseSchoolService tpoBaseSchoolService;

    @Resource
    private BaseCollegeService baseCollegeService;

    @Override
    public long countByExample(TBsMajorExample example) {
        return tBsMajorMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TBsMajorExample example) {
        return tBsMajorMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return tBsMajorMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TBsMajor record) {
        return tBsMajorMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(TBsMajor record) {
        return tBsMajorMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(TBsMajor record) {
        return tBsMajorMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(TBsMajor record) {
        return tBsMajorMapper.insertSelective(record);
    }

    @Override
    public List<TBsMajor> selectByExample(TBsMajorExample example) {
        return tBsMajorMapper.selectByExample(example);
    }

    @Override
    public TBsMajor selectByPrimaryKey(Integer id) {
        return tBsMajorMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TBsMajor record,TBsMajorExample example) {
        return tBsMajorMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(TBsMajor record,TBsMajorExample example) {
        return tBsMajorMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(TBsMajor record) {
        return tBsMajorMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TBsMajor record) {
        return tBsMajorMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<TBsMajor> list) {
        return tBsMajorMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<TBsMajor> list) {
        return tBsMajorMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<TBsMajor> list) {
        return tBsMajorMapper.batchInsert(list);
    }

    @Override
    public void updateCollegeAreaId() {
        BaseMajorExample baseMajorExample = new BaseMajorExample();
        List<BaseMajor> baseMajors = baseMajorService.selectByExample(baseMajorExample);
        Map<Integer, Integer> codeAndSchoolIdMap = baseMajors.stream().collect(Collectors.toMap(BaseMajor::getId, BaseMajor::getSchoolid));


//        TBsAcademyExample tBsAcademyExample = new TBsAcademyExample();
//        List<TBsAcademy> tBsAcademies = tBsAcademyService.selectByExample(tBsAcademyExample);
//        Map<Integer, Integer>  codeAndCollegeAreaIdMap  = tBsAcademies.stream().collect(
//                Collectors.toMap(TBsAcademy::getCode, TBsAcademy::getCollegeAreaId));

        TBsMajorExample tBsMajorExample = new TBsMajorExample();
        tBsMajorExample.setOrderByClause("id asc");
        List<TBsMajor> tBsMajors = this.tBsMajorMapper.selectByExample(tBsMajorExample);

        // 读取 Tpo_Base_School
        Map<Integer, String> sidAndIdentityguidMap = tpoBaseSchoolService.sidAndIdentityguidMap();

        // 读取 t_bs_college_areas_relation 表
        Map<String, Integer> identityGuidAndBsCollegeAreasIdMap = tBsCollegeAreasRelationService.identityGuidAndBsCollegeAreasIdMap(null);

        try {
            LocalDate date  = LocalDate.now();
            TxtExport txtExport = new TxtExport();
            TxtExport.creatTxtFile("t_bs_major20210519_update_at"+LocalDate.now());
            for (TBsMajor tBsMajor : tBsMajors){

                Integer schoolId = codeAndSchoolIdMap.getOrDefault(tBsMajor.getCode(),null);
                if (null == schoolId){
                    log.warn("tBsAcademy id = {}, 没有查询到schoolId", tBsMajor.getId());
                    // 没有查询到schoolId
//                    TxtExport.writeTxtFile("没有查询到schoolId tBsAcademy.getId()=" + tBsAcademy.getId());
                    continue;
                }

                String identityguid = sidAndIdentityguidMap.getOrDefault(schoolId, null);
                if (null == identityguid){
                    log.warn("tBsAcademy id = {}, 没有查询到 identityguid", tBsMajor.getId());
                    // 没有查询到 identityguid
//                    TxtExport.writeTxtFile("没有查询到 identityguid tBsAcademy.getId()=" + tBsAcademy.getId());
                    continue;
                }

                Integer bsCollegeAreasId = identityGuidAndBsCollegeAreasIdMap.getOrDefault(identityguid, null);
                if (null == bsCollegeAreasId){
                    //没有查询到 bsCollegeAreasId
                    log.warn("tBsAcademy id = {}, 没有查询到 bsCollegeAreasId", tBsMajor.getId());
//                    TxtExport.writeTxtFile("没有查询到 bsCollegeAreasId =" + tBsAcademy.getId());
                    continue;
                }
                StringBuilder builder = new StringBuilder();
                builder.append("update t_bs_major set college_area_id =").append(bsCollegeAreasId)
                        .append(", updated_at = ").append("\\\"").append(date).append("\\\"")
                        .append(" where id = ").append(tBsMajor.getId()).append("\\;");

                TxtExport.writeTxtFile(builder.toString().replace("\\",""));
            }
        }catch (Exception e){

        }
    }

    @Override
    public void save() {
        BaseMajorExample baseMajorExample = new BaseMajorExample();
        baseMajorExample.createCriteria().andIdGreaterThan(74262);
        List<BaseMajor> baseMajors = baseMajorService.selectByExample(baseMajorExample);
        Map<Integer, Integer> codeAndSchoolIdMap = baseMajors.stream().collect(Collectors.toMap(BaseMajor::getId, BaseMajor::getSchoolid));

        TBsMajorExample tBsMajorExample = new TBsMajorExample();
        tBsMajorExample.setOrderByClause("id asc");
        List<TBsMajor> tBsMajors = this.tBsMajorMapper.selectByExample(tBsMajorExample);
        List<Integer> codes = tBsMajors.stream().map(TBsMajor::getCode).collect(Collectors.toList());

        // 读取 Tpo_Base_School
        Map<Integer, String> sidAndIdentityguidMap = tpoBaseSchoolService.sidAndIdentityguidMap();

        // 读取 t_bs_college_areas_relation 表
        Map<String, Integer> identityGuidAndBsCollegeAreasIdMap = tBsCollegeAreasRelationService.identityGuidAndBsCollegeAreasIdMap(null);

        for (BaseMajor baseMajor : baseMajors){
            if (codes.contains(baseMajor.getId())){
                continue;
            }

            String identityguid = sidAndIdentityguidMap.getOrDefault(baseMajor.getSchoolid(), null);
            if (null == identityguid){

                continue;
            }

            Integer bsCollegeAreasId = identityGuidAndBsCollegeAreasIdMap.getOrDefault(identityguid, null);
            if (null == bsCollegeAreasId){

                continue;
            }

            TBsMajor tBsMajor = new TBsMajor();
            tBsMajor.setCode(baseMajor.getId());
            tBsMajor.setAcademyCode(baseMajor.getCollegeid());
            tBsMajor.setCollegeAreaId(bsCollegeAreasId);
            tBsMajor.setName(baseMajor.getName());
            tBsMajor.setIsDelete(false);
            tBsMajor.setUpdatedAt(new Date());
            tBsMajor.setCreatedAt(new Date());
            tBsMajor.setCreatedBy(baseMajor.getCreateby());
            tBsMajor.setUpdatedBy(1);
            tBsMajor.setMajorType(baseMajor.getMajorType());


            try {
                tBsMajorMapper.insert(tBsMajor);
            }catch (Exception e){
                log.warn("du key tBsMajor = {}", JSON.toJSONString(tBsMajor));
            }

        }
    }

    @Override
    public void saveByIdentityguid(String identityguid) {
        TpoBaseSchoolExample tpoBaseSchoolExample  = new TpoBaseSchoolExample();
        tpoBaseSchoolExample.createCriteria().andIdentityguidEqualTo(identityguid);
        List<TpoBaseSchool> tpoBaseSchools = tpoBaseSchoolService.selectByExample(tpoBaseSchoolExample);
        if (ObjectUtils.isEmpty(tpoBaseSchools)) {
            log.warn("tpoBaseSchoolService.selectByExample没有查询到数据identityguid={}", identityguid);
            return;
        }
        TpoBaseSchool tpoBaseSchool = tpoBaseSchools.get(0);
//
//        // 读取 t_bs_college_areas_relation 表
//        Map<String, Integer> identityGuidAndBsCollegeAreasIdMap = tBsCollegeAreasRelationService.identityGuidAndBsCollegeAreasIdMap(identityguid);
        BaseCollegeExample baseCollegeExample = new BaseCollegeExample();
        baseCollegeExample.createCriteria().andSchoolidEqualTo(tpoBaseSchool.getSid());
        List<BaseCollege> baseColleges = baseCollegeService.selectByExample(baseCollegeExample);


    }

}
