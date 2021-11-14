package com.example.mysqldemo;

import com.alibaba.excel.EasyExcel;
import com.example.mysqldemo.bean.ObTags;
import com.example.mysqldemo.bean.TBsCollegeAreas;
import com.example.mysqldemo.dao.TBsCollegeAreasMapper;
import com.example.mysqldemo.excel.vo.CollegesWaitInput;
import com.example.mysqldemo.excel.vo.GlobalAreas;
import com.example.mysqldemo.excel.vo.TBsCollegesInput;
import com.example.mysqldemo.service.ObTagsService;
import com.example.mysqldemo.service.TBsCollegeAreasService;
import com.example.mysqldemo.utils.CollegesDataListener;
import com.example.mysqldemo.utils.Listener.CollegeWaitInputListener;
import com.example.mysqldemo.utils.Listener.GlobalAreaLister;
import com.example.mysqldemo.utils.Listener.reader.TBsCollegeAreasListener;
import com.example.mysqldemo.utils.Listener.reader.TBsCollegeAreasRelationVO;
import com.example.mysqldemo.utils.Listener.reader.TBsCollegeAreasVo;
import com.example.mysqldemo.utils.Listener.reader.TBsRelationListener;
import com.example.mysqldemo.utils.TxtExport;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.junit.Test;
import org.junit.platform.commons.util.StringUtils;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: luoxianming
 * @Date: 2021/4/26 22:52
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class TBsCollegesAreaServiceTest {

    @Resource
    private TBsCollegeAreasService tBsCollegeAreasService;

    @Resource
    private TBsCollegeAreasMapper tBsCollegeAreasMapper;

    @Test
    public void saveTest(){
        String fileName = "C:/Users/luoxianming/Desktop/学校数据/2021428/最新版待插入数据0428.xlsx";
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
        CollegeWaitInputListener demoDataListener = new CollegeWaitInputListener();
        EasyExcel.read(fileName, CollegesWaitInput.class, demoDataListener).sheet().doRead();
        System.out.println(demoDataListener.getList().size());
        //String writefileName = TestFileUtil.getPath() + "indexWrite" + System.currentTimeMillis() + ".xlsx";
        List<CollegesWaitInput> bsCollegesWaitInputs = demoDataListener.getList();

        // 读取国家省份数据
        String globalAreaNameTarget = "C:/Users/luoxianming/Desktop/学校数据/global_areas.xlsx";
        GlobalAreaLister globalAreaLister = new GlobalAreaLister();
        EasyExcel.read(globalAreaNameTarget, GlobalAreas.class, globalAreaLister).sheet().doRead();

        Map<String, String> areasMap = new HashMap<>();
        for (GlobalAreas globalAreas: globalAreaLister.getList()){
            areasMap.put(globalAreas.getName(), String.valueOf(globalAreas.getId()));
        }

        List<TBsCollegeAreas> tBsCollegeAreasList = new ArrayList<>();
        for (CollegesWaitInput collegesWaitInput : bsCollegesWaitInputs){
            TBsCollegeAreas tBsCollegeAreas = new TBsCollegeAreas();
            if (areasMap.containsKey(collegesWaitInput.getCountry())){
                tBsCollegeAreas.setCountryId(Integer.parseInt(areasMap.get(collegesWaitInput.getCountry())));
            }

            if (areasMap.containsKey(collegesWaitInput.getState())){
                tBsCollegeAreas.setStateId(Integer.parseInt(areasMap.get(collegesWaitInput.getState())));
            }

            if (areasMap.containsKey(collegesWaitInput.getCity())){
                tBsCollegeAreas.setCityId(Integer.parseInt(areasMap.get(collegesWaitInput.getCity())));
            }

            if (areasMap.containsKey(collegesWaitInput.getAreaId())){
                tBsCollegeAreas.setAreaId(Integer.parseInt(areasMap.get(collegesWaitInput.getAreaId())));
            }

            tBsCollegeAreas.setCollegeName(collegesWaitInput.getCollegeName());
            tBsCollegeAreas.setName(collegesWaitInput.getName());
            if (!StringUtils.isBlank(tBsCollegeAreas.getName())){
                tBsCollegeAreas.setFullName(tBsCollegeAreas.getCollegeName() + "-" + tBsCollegeAreas.getName());
            }else {
                tBsCollegeAreas.setFullName(tBsCollegeAreas.getCollegeName());
            }
            tBsCollegeAreas.setCollegeId(collegesWaitInput.getCollegeId());
            tBsCollegeAreasList.add(tBsCollegeAreas);
        }

        try {
            TxtExport txtExport = new TxtExport();
            TxtExport.creatTxtFile("Tpo_Colleges_School20210428");

            List<TBsCollegeAreas> addTBsCollegeAreas = new ArrayList<>();
            List<Integer> existDeleteIds = new ArrayList<>();
            for (TBsCollegeAreas  tBsCollegeArea: tBsCollegeAreasList){
                List<TBsCollegeAreas> t =  tBsCollegeAreasMapper.selectByCountryIdAndCollegeIdAndName(
                        tBsCollegeArea.getCountryId(), tBsCollegeArea.getCollegeId(), tBsCollegeArea.getName());
                if (t.size() == 0){
                    List<TBsCollegeAreas> exsitCollegeAreasList = tBsCollegeAreasMapper.selectByCountryIdAndCollegeName(tBsCollegeArea.getCountryId(), tBsCollegeArea.getCollegeName());
                    String name = tBsCollegeArea.getName();
                    boolean canInsert = true;
                    if (!exsitCollegeAreasList.isEmpty()){
                        for (TBsCollegeAreas tBsCollegeAreas : exsitCollegeAreasList){
                            if (StringUtils.isBlank(tBsCollegeAreas.getName()) && StringUtils.isBlank(name)){
                                canInsert = false;
                                break;
                            }
                        }
                    }
                    if (canInsert){
                        tBsCollegeAreasMapper.insertSelective(tBsCollegeArea);

                        List<TBsCollegeAreas> exsitCollegeAreasList2 = tBsCollegeAreasMapper.selectByCountryIdAndCollegeName(tBsCollegeArea.getCountryId(), tBsCollegeArea.getCollegeName());
                        if (!exsitCollegeAreasList2.isEmpty() && exsitCollegeAreasList2.size() > 1){
                            for (TBsCollegeAreas tBsCollegeAreas : exsitCollegeAreasList2){

                                if(StringUtils.isBlank(tBsCollegeAreas.getName())){
                                    log.warn("若同时存在多个相同国家+学校的情况，且其中一个校区为空时 的数据  update t_bs_college_areas set is_delete = 0 where id ={}",tBsCollegeAreas.getId());
                                    StringBuilder builder = new StringBuilder();
                                    builder.append("update t_bs_college_areas set is_delete = 1 where id =").append("\\\"").append(tBsCollegeAreas.getId()).append("\\\";");
                                    TBsCollegeAreas delete = new TBsCollegeAreas();
                                    delete.setId(tBsCollegeAreas.getId());
                                    delete.setIsDelete(new Byte("1"));
                                    tBsCollegeAreasMapper.updateByPrimaryKeySelective(delete);

                                    if (!existDeleteIds.contains(delete.getId())){
                                        existDeleteIds.add(delete.getId());
                                        TxtExport.writeTxtFile(builder.toString().replace("\\",""));
                                    }

                                }
                            }
                        }
                    }
                }
            }


        }catch (IOException ioException){
            log.warn("test");
        }

    }

    @Test
    public void exportExcel(){
        String fileName = "C:/Users/luoxianming/Desktop/新建文件夹 (3)/xlsl/t_bs_college_areas.xlsx";
        TBsCollegeAreasListener tBsCollegeAreasListener = new TBsCollegeAreasListener();
        EasyExcel.read(fileName, TBsCollegeAreasVo.class, tBsCollegeAreasListener).sheet().doRead();
        List<TBsCollegeAreasVo> inputs = tBsCollegeAreasListener.getList();

        for (TBsCollegeAreasVo vo : inputs){
            TBsCollegeAreas tBsCollegeAreas = new TBsCollegeAreas();
            BeanUtils.copyProperties(vo, tBsCollegeAreas);
            tBsCollegeAreas.setCreatedAt(new Date());
            tBsCollegeAreas.setUpdatedAt(new Date());
            if (ObjectUtils.isNotEmpty(vo.getCountryId())){
                tBsCollegeAreas.setCountryId(Integer.parseInt(vo.getCountryId()));
            }

            if (!"null".equals(vo.getStateId()) && ObjectUtils.isNotEmpty(vo.getStateId())){
                tBsCollegeAreas.setStateId(Integer.parseInt(vo.getStateId()));
            }
            if (!"null".equals(vo.getCityId()) && ObjectUtils.isNotEmpty(vo.getCityId())){
                tBsCollegeAreas.setCityId(Integer.parseInt(vo.getCityId()));
            }
            if (!"null".equals(vo.getAreaId()) && ObjectUtils.isNotEmpty(vo.getAreaId())){
                tBsCollegeAreas.setAreaId(Integer.parseInt(vo.getAreaId()));
            }
            if (!"null".equals(vo.getCollegeId()) && ObjectUtils.isNotEmpty(vo.getCollegeId())){
                tBsCollegeAreas.setCollegeId(Integer.parseInt(vo.getCollegeId()));
            }
            tBsCollegeAreasMapper.insert(tBsCollegeAreas);
        }
    }
}
