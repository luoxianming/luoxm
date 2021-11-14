package com.example.mysqldemo;/**
 * @Author: luoxianming
 * @Date: 2021/4/30 15:23
 */

import com.alibaba.excel.EasyExcel;
import com.example.mysqldemo.bean.TBsCollegeAreasRelation;
import com.example.mysqldemo.bean.TBsCollegeAreasRelationExample;
import com.example.mysqldemo.excel.vo.GlobalAreas;
import com.example.mysqldemo.service.TBsCollegeAreasRelationService;
import com.example.mysqldemo.utils.Listener.reader.TBsCollegeAreasRelationInput;
import com.example.mysqldemo.utils.Listener.reader.TBsCollegeAreasRelationListener;
import com.example.mysqldemo.utils.Listener.reader.TBsCollegeAreasRelationVO;
import com.example.mysqldemo.utils.Listener.reader.TBsRelationListener;
import com.example.mysqldemo.utils.TxtExport;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *@author luoxianming
 *@date 2021/4/30
 *
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class TbsCollegesAreaRelationSerciceTest {

    @Resource
    private TBsCollegeAreasRelationService tBsCollegeAreasRelationService;

    @Test
    public void test(){
        String fileName = "C:/Users/luoxianming/Desktop/学校数据/2021429/relation0429.xlsx";
        TBsCollegeAreasRelationListener tBsCollegeAreasRelationListener = new TBsCollegeAreasRelationListener();
        EasyExcel.read(fileName, TBsCollegeAreasRelationInput.class, tBsCollegeAreasRelationListener).sheet().doRead();
        List<TBsCollegeAreasRelationInput> tBsCollegeAreasRelationInputs = tBsCollegeAreasRelationListener.getList();
        TBsCollegeAreasRelationExample example = new TBsCollegeAreasRelationExample();
        example.createCriteria().andIsDeletedEqualTo(false);
        List<TBsCollegeAreasRelation>  exsitList = tBsCollegeAreasRelationService.selectByExample(example);
        Map<String, TBsCollegeAreasRelation> map = exsitList.stream().collect(Collectors.toMap(TBsCollegeAreasRelation::getIdentityGuid, Function.identity()));

        List<TBsCollegeAreasRelation> insert = new ArrayList<>();
        List<TBsCollegeAreasRelation> update = new ArrayList<>();

        try {

            TxtExport txtExport = new TxtExport();
            TxtExport.creatTxtFile("t_bs_college_areas_relation20210429name"+""+System.currentTimeMillis());
            for (TBsCollegeAreasRelationInput t: tBsCollegeAreasRelationInputs){
                if (!map.containsKey(t.getIdentityGuid())){
                    TBsCollegeAreasRelation tBsCollegeAreasRelation = new TBsCollegeAreasRelation();
                    BeanUtils.copyProperties(t, tBsCollegeAreasRelation);
                    tBsCollegeAreasRelation.setIsDeleted(false);
                    tBsCollegeAreasRelation.setCreatedAt(new Date());
                    insert.add(tBsCollegeAreasRelation);
                    System.out.println(tBsCollegeAreasRelationService.insertSelective(tBsCollegeAreasRelation));
                }else{
                    TBsCollegeAreasRelation exist = map.get(t.getIdentityGuid());
                    if (!exist.getBsCollegeAreasId().equals(t.getBsCollegeAreasId())){
                        log.warn("exist={}", exist);
                        log.warn("read={}", t);
//                        update.add(exist);
                        StringBuilder builder = new StringBuilder();
//                        builder.append("update t_bs_college_areas_relation set bs_college_areas_id =")
//                                .append(t.getBsCollegeAreasId()+" , bs_college_areas_name = \\\"").append(t.getBsCollegeAreasName()+"\\\"")
                        builder.append("update t_bs_college_areas_relation set name =")
                        .append(" where identity_guid = ").append("\\\"").append(exist.getIdentityGuid()).append("\\\";");
                        txtExport.writeTxtFile(builder.toString().replace("\\",""));
                    }
                }
            }
        }catch (Exception exception){

        }




//
//        if (!insert.isEmpty()){
//            tBsCollegeAreasRelationService.updateBatchSelective(insert);
//        }
    }

    @Test
    public void insert(){
        String fileName = "C:/Users/luoxianming/Desktop/学校数据/2021713/relation_all.xlsx";
        TBsRelationListener tBsRelationListener = new TBsRelationListener();
        EasyExcel.read(fileName, TBsCollegeAreasRelationVO.class, tBsRelationListener).sheet().doRead();
        List<TBsCollegeAreasRelationVO> tBsCollegeAreasRelationInputs = tBsRelationListener.getList();
        List<TBsCollegeAreasRelation> relations = new ArrayList<>();
        tBsCollegeAreasRelationInputs.forEach(tBsCollegeAreasRelationVO -> {
            TBsCollegeAreasRelation tBsCollegeAreasRelation = new TBsCollegeAreasRelation();
            BeanUtils.copyProperties(tBsCollegeAreasRelationVO, tBsCollegeAreasRelation);
            tBsCollegeAreasRelation.setCreatedAt(new Date());
            tBsCollegeAreasRelation.setUpdatedAt(new Date());
            relations.add(tBsCollegeAreasRelation);
        });

        tBsCollegeAreasRelationService.batchInsert(relations);
    }

    @Test
    public void updateName(){
        String fileName = "C:/Users/luoxianming/Desktop/学校数据/2021713/t_bs_college_areas_relation.xlsx";
        TBsCollegeAreasRelationListener tBsCollegeAreasRelationListener = new TBsCollegeAreasRelationListener();
        EasyExcel.read(fileName, TBsCollegeAreasRelationInput.class, tBsCollegeAreasRelationListener).sheet().doRead();
        List<TBsCollegeAreasRelationInput> tBsCollegeAreasRelationInputs = tBsCollegeAreasRelationListener.getList();

        try {

            TxtExport txtExport = new TxtExport();
            TxtExport.creatTxtFile("t_bs_college_areas_relation20210713name"+""+System.currentTimeMillis());
            for (TBsCollegeAreasRelationInput t: tBsCollegeAreasRelationInputs){
                StringBuilder builder = new StringBuilder();
//                        builder.append("update t_bs_college_areas_relation set bs_college_areas_id =")
//                                .append(t.getBsCollegeAreasId()+" , bs_college_areas_name = \\\"").append(t.getBsCollegeAreasName()+"\\\"")
                builder.append("update t_bs_college_areas_relation set bs_college_areas_name =\\\"").append(t.getName()+"\\\"")
                        .append(" where id = ").append("\\").append(t.getId()).append("\\;");
                txtExport.writeTxtFile(builder.toString().replace("\\",""));
            }
        }catch (Exception exception){

        }
    }
}
