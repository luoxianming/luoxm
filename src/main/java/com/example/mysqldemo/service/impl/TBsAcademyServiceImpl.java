package com.example.mysqldemo.service.impl;

import com.alibaba.fastjson.JSON;
import com.example.mysqldemo.bean.*;
import com.example.mysqldemo.service.BaseCollegeService;
import com.example.mysqldemo.service.TBsCollegeAreasRelationService;
import com.example.mysqldemo.service.TpoBaseSchoolService;
import com.example.mysqldemo.utils.TxtExport;
import io.swagger.models.auth.In;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

import com.example.mysqldemo.dao.TBsAcademyMapper;
import com.example.mysqldemo.service.TBsAcademyService;
/**
  * @Author: luoxianming
  * @Date: 2021/5/19 10:14
 */
@Slf4j
@Service
public class TBsAcademyServiceImpl implements TBsAcademyService{

    @Resource
    private BaseCollegeService baseCollegeService;

    @Resource
    private TBsAcademyMapper tBsAcademyMapper;

    @Resource
    private TBsCollegeAreasRelationService tBsCollegeAreasRelationService;

    @Resource
    private TpoBaseSchoolService tpoBaseSchoolService;

    @Override
    public long countByExample(TBsAcademyExample example) {
        return tBsAcademyMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TBsAcademyExample example) {
        return tBsAcademyMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return tBsAcademyMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TBsAcademy record) {
        return tBsAcademyMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(TBsAcademy record) {
        return tBsAcademyMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(TBsAcademy record) {
        return tBsAcademyMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(TBsAcademy record) {
        return tBsAcademyMapper.insertSelective(record);
    }

    @Override
    public List<TBsAcademy> selectByExample(TBsAcademyExample example) {
        return tBsAcademyMapper.selectByExample(example);
    }

    @Override
    public TBsAcademy selectByPrimaryKey(Integer id) {
        return tBsAcademyMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TBsAcademy record,TBsAcademyExample example) {
        return tBsAcademyMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(TBsAcademy record,TBsAcademyExample example) {
        return tBsAcademyMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(TBsAcademy record) {
        return tBsAcademyMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TBsAcademy record) {
        return tBsAcademyMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<TBsAcademy> list) {
        return tBsAcademyMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<TBsAcademy> list) {
        return tBsAcademyMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<TBsAcademy> list) {
        return tBsAcademyMapper.batchInsert(list);
    }

    // 学院表（t_bs_academy）中的所有数据由老crm内的学院表复制一份过来；
    //其中code字段取老crm学院表的id；
    //t_bs_college_area_id字段的取值逻辑：通过code字段找到它对应老crm内关联的tpo_base_school表的院校id，然后通过relation表，找到院校id对应的t_bs_college_area_id
    @Override
    public void updateOrInsert() {
        // 读取老crm内的学院表 数据 Base_College
        BaseCollegeExample baseCollegeExample = new BaseCollegeExample();
        List<BaseCollege> baseColleges = baseCollegeService.selectByExample(baseCollegeExample);
        Map<Integer, Integer> codeSchoolIdMap = baseColleges.stream().collect(Collectors.toMap(BaseCollege::getId, BaseCollege::getSchoolid));
        // 读取
        TBsAcademyExample tBsAcademyExample = new TBsAcademyExample();
        List<TBsAcademy> tBsAcademies = this.tBsAcademyMapper.selectByExample(tBsAcademyExample);
        List<Integer> codeList = tBsAcademies.stream().map(TBsAcademy::getCode).collect(Collectors.toList());

        // 读取 Tpo_Base_School
        Map<Integer, String> sidAndIdentityguidMap = tpoBaseSchoolService.sidAndIdentityguidMap();

        // 读取 t_bs_college_areas_relation 表
        Map<String, Integer> identityGuidAndBsCollegeAreasIdMap = tBsCollegeAreasRelationService.identityGuidAndBsCollegeAreasIdMap(null);

        Date date = new Date();
        try {
            TxtExport txtExport = new TxtExport();
            TxtExport.creatTxtFile("t_bs_academy20210519_update_at");
            // 更新  collegeAreaId 取值
            for (TBsAcademy tBsAcademy : tBsAcademies){
                Integer bsCollegeAreasId = getBsCollegeAreaId(codeSchoolIdMap, sidAndIdentityguidMap, identityGuidAndBsCollegeAreasIdMap, tBsAcademy);
                if (bsCollegeAreasId == null) {
                    continue;
                }

                StringBuilder builder = new StringBuilder();
                builder.append("update t_bs_academy set college_area_id =").append(bsCollegeAreasId)
                        .append(", updated_at = ").append("\\\"").append(date).append("\\\"")
                        .append(" where id = ").append(tBsAcademy.getId()).append("\\;");

                TxtExport.writeTxtFile(builder.toString().replace("\\",""));
            }
        }catch (Exception e){
            log.warn("错误");
        }
    }

    @Override
    public void save() {
        // 读取老crm内的学院表 数据 Base_College
        BaseCollegeExample baseCollegeExample = new BaseCollegeExample();
        baseCollegeExample.createCriteria().andIdGreaterThan( 20588);
        List<BaseCollege> baseColleges = baseCollegeService.selectByExample(baseCollegeExample);
        Map<Integer, Integer> codeSchoolIdMap = baseColleges.stream().collect(Collectors.toMap(BaseCollege::getId, BaseCollege::getSchoolid));
        // 读取
        TBsAcademyExample tBsAcademyExample = new TBsAcademyExample();
        List<TBsAcademy> tBsAcademies = this.tBsAcademyMapper.selectByExample(tBsAcademyExample);
        List<Integer> codeList = tBsAcademies.stream().map(TBsAcademy::getCode).collect(Collectors.toList());

        // 读取 Tpo_Base_School
        Map<Integer, String> sidAndIdentityguidMap = tpoBaseSchoolService.sidAndIdentityguidMap();

        // 读取 t_bs_college_areas_relation 表
        Map<String, Integer> identityGuidAndBsCollegeAreasIdMap = tBsCollegeAreasRelationService.identityGuidAndBsCollegeAreasIdMap(null);

        try {
            TxtExport txtExport = new TxtExport();
            TxtExport.creatTxtFile("t_bs_academy20210728_save_at");
            for (BaseCollege baseCollege : baseColleges){
                if (codeList.contains(baseCollege.getId())){
                    continue;
                }
                TBsAcademy tBsAcademy = new TBsAcademy();
                tBsAcademy.setCode(baseCollege.getId());
                tBsAcademy.setCollegeAreaId(getBsCollegeAreaId(codeSchoolIdMap, sidAndIdentityguidMap, identityGuidAndBsCollegeAreasIdMap, tBsAcademy));
                tBsAcademy.setIsDelete(baseCollege.getIsdelete() == 1);
                tBsAcademy.setCreatedBy(baseCollege.getCreateby());
                tBsAcademy.setName(baseCollege.getName());
                tBsAcademy.setCreatedAt(baseCollege.getCreatetime());
                tBsAcademy.setUpdatedAt(baseCollege.getUpdatetime());

                try {
                    tBsAcademyMapper.insert(tBsAcademy);
                }catch (Exception exception){
                    log.warn("Duplicate entry tBsAcademy ={}", JSON.toJSONString(tBsAcademy));
                    TxtExport.writeTxtFile(JSON.toJSONString(tBsAcademy).replace("\\",""));
                }
            }
        }catch (Exception exception){
            log.error("错误  exception",exception);
        }


    }

    @Nullable
    private Integer getBsCollegeAreaId(Map<Integer, Integer> codeSchoolIdMap, Map<Integer, String> sidAndIdentityguidMap, Map<String, Integer> identityGuidAndBsCollegeAreasIdMap, TBsAcademy tBsAcademy) {
        Integer schoolId = codeSchoolIdMap.getOrDefault(tBsAcademy.getCode(),null);
        if (null == schoolId){
            log.warn("tBsAcademy id = {}, 没有查询到schoolId", tBsAcademy.getId());
            // 没有查询到schoolId
//                    TxtExport.writeTxtFile("没有查询到schoolId tBsAcademy.getId()=" + tBsAcademy.getId());
            return null;
        }

        String identityguid = sidAndIdentityguidMap.getOrDefault(schoolId, null);
        if (null == identityguid){
            log.warn("tBsAcademy id = {}, 没有查询到 identityguid", tBsAcademy.getId());
            // 没有查询到 identityguid
//                    TxtExport.writeTxtFile("没有查询到 identityguid tBsAcademy.getId()=" + tBsAcademy.getId());
            return null;
        }

        Integer bsCollegeAreasId = identityGuidAndBsCollegeAreasIdMap.getOrDefault(identityguid, null);
        if (null == bsCollegeAreasId){
            //没有查询到 bsCollegeAreasId
            log.warn("tBsAcademy id = {}, 没有查询到 bsCollegeAreasId", tBsAcademy.getId());
//                    TxtExport.writeTxtFile("没有查询到 bsCollegeAreasId =" + tBsAcademy.getId());
            return null;
        }
        return bsCollegeAreasId;
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

        // 读取 t_bs_college_areas_relation 表
        Map<String, Integer> identityGuidAndBsCollegeAreasIdMap = tBsCollegeAreasRelationService.identityGuidAndBsCollegeAreasIdMap(identityguid);

        try {
            TxtExport txtExport = new TxtExport();
            TxtExport.creatTxtFile("t_bs_academy20210610_save_at");
            for (BaseCollege baseCollege : baseColleges){

                TBsAcademy tBsAcademy = new TBsAcademy();
                tBsAcademy.setCode(baseCollege.getId());
                tBsAcademy.setCollegeAreaId(identityGuidAndBsCollegeAreasIdMap.get(identityguid));
                tBsAcademy.setIsDelete(baseCollege.getIsdelete() == 1);
                tBsAcademy.setCreatedBy(baseCollege.getCreateby());
                tBsAcademy.setName(baseCollege.getName());
                tBsAcademy.setCreatedAt(baseCollege.getCreatetime());
                tBsAcademy.setUpdatedAt(baseCollege.getUpdatetime());

                try {
                    tBsAcademyMapper.insert(tBsAcademy);
                }catch (Exception exception){
                    log.warn("Duplicate entry tBsAcademy ={}", JSON.toJSONString(tBsAcademy));
                    TxtExport.writeTxtFile(JSON.toJSONString(tBsAcademy).replace("\\",""));
                }
            }
        }catch (Exception exception){
            log.error("错误  exception",exception);
        }

    }

}
