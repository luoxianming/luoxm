package com.example.mysqldemo.service.impl;

import com.example.mysqldemo.bean.TBsCollegeAreas;
import com.example.mysqldemo.excel.vo.SchoolAchievementTargetInput;
import com.example.mysqldemo.excel.vo.TBsCollegesInput;
import com.example.mysqldemo.service.TBsCollegeAreasService;
import com.example.mysqldemo.service.input.TBsCollegeAreasInput;
import com.example.mysqldemo.service.input.TBsCollegesExport;
import com.example.mysqldemo.utils.ExcelUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.example.mysqldemo.dao.TBsCollegesMapper;
import com.example.mysqldemo.bean.TBsColleges;
import com.example.mysqldemo.bean.TBsCollegesExample;
import com.example.mysqldemo.service.TBsCollegesService;
/**
  * @Author: luoxianming
  * @Date: 2021/4/27 22:20
 */
@Slf4j
@Service
public class TBsCollegesServiceImpl implements TBsCollegesService{

    @Resource
    private TBsCollegesMapper tBsCollegesMapper;

    @Resource
    private TBsCollegeAreasService tBsCollegeAreasService;

    @Override
    public long countByExample(TBsCollegesExample example) {
        return tBsCollegesMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TBsCollegesExample example) {
        return tBsCollegesMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return tBsCollegesMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TBsColleges record) {
        return tBsCollegesMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(TBsColleges record) {
        return tBsCollegesMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(TBsColleges record) {
        return tBsCollegesMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(TBsColleges record) {
        return tBsCollegesMapper.insertSelective(record);
    }

    @Override
    public List<TBsColleges> selectByExample(TBsCollegesExample example) {
        return tBsCollegesMapper.selectByExample(example);
    }

    @Override
    public TBsColleges selectByPrimaryKey(Integer id) {
        return tBsCollegesMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TBsColleges record,TBsCollegesExample example) {
        return tBsCollegesMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(TBsColleges record,TBsCollegesExample example) {
        return tBsCollegesMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(TBsColleges record) {
        return tBsCollegesMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TBsColleges record) {
        return tBsCollegesMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<TBsColleges> list) {
        return tBsCollegesMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<TBsColleges> list) {
        return tBsCollegesMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<TBsColleges> list) {
        return tBsCollegesMapper.batchInsert(list);
    }

    @Override
    public int readExcel() {
        String filePath ="C:/Users/luoxianming/Desktop/学校数据/2021429/test.xlsx";
        List<TBsCollegeAreasInput> batchLoad = ExcelUtils.readExcelObject(filePath, TBsCollegeAreasInput.class);
        log.info("test{}", batchLoad.get(0));

        List<TBsCollegeAreas> List = new ArrayList<>();
        for (TBsCollegeAreasInput collegeAreasInput : batchLoad){
            TBsCollegeAreas tBsCollegeAreas = new TBsCollegeAreas();
            BeanUtils.copyProperties(collegeAreasInput, tBsCollegeAreas);
            tBsCollegeAreas.setCreatedAt(new Date());
            tBsCollegeAreas.setUpdatedAt(new Date());
            List.add(tBsCollegeAreas);
//            tBsCollegeAreasService.insert(tBsCollegeAreas);
        }
        tBsCollegeAreasService.batchInsert(List);
        //Map<Integer, TBsCollegesInput> map = batchLoad.stream().collect(Collectors.toMap(TBsCollegesInput::getId, Function.identity()));
        return 0;
    }

    @Override
    @Cacheable(value = "tBsColleges",key = "#collegeName")
    public List<TBsColleges> getByCollegeName(String collegeName) {
        TBsCollegesExample tBsCollegesExample = new TBsCollegesExample();
        tBsCollegesExample.createCriteria().andNameEqualTo(collegeName);
        System.out.println("从数据库中读取，而非从缓存读取!");
        return this.tBsCollegesMapper.selectByExample(tBsCollegesExample);
    }

}
