package com.example.mysqldemo;

import com.alibaba.excel.EasyExcel;
import com.alibaba.fastjson.JSON;
import com.example.mysqldemo.excel.vo.GlobalAreas;
import com.example.mysqldemo.excel.vo.TBsCollegesInput;
import com.example.mysqldemo.excel.vo.write.ColllegesTargetOutput;
import com.example.mysqldemo.service.TBsCollegesService;
import com.example.mysqldemo.utils.CollegesDataListener;
import com.example.mysqldemo.utils.Listener.CollegesTargetListener;
import com.example.mysqldemo.utils.Listener.GlobalAreaLister;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @Author: luoxianming
 * @Date: 2021/4/27 22:35
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class TBsCollegesServiceTest {

    @Resource
    private TBsCollegesService tBsCollegesService;

    @Test
    public void TestReadExcel(){
        tBsCollegesService.readExcel();
    }

    @Test
    public void simpleRead() {
        String fileName = "C:/Users/luoxianming/Desktop/学校数据/123123.xlsx";
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
        CollegesDataListener demoDataListener = new CollegesDataListener();
        EasyExcel.read(fileName, TBsCollegesInput.class, demoDataListener).sheet().doRead();
        System.out.println(demoDataListener.getList().size());
        //String writefileName = TestFileUtil.getPath() + "indexWrite" + System.currentTimeMillis() + ".xlsx";
        List<TBsCollegesInput> bsCollegesInputs = demoDataListener.getList();
        Map<Integer, TBsCollegesInput> map = bsCollegesInputs.stream().collect(Collectors.toMap(TBsCollegesInput::getId, Function.identity()));

        String fileNameTarget = "C:/Users/luoxianming/Desktop/学校数据/待新增院校.xlsx";
        CollegesTargetListener collegesTargetListener = new CollegesTargetListener();
        EasyExcel.read(fileNameTarget, ColllegesTargetOutput.class, collegesTargetListener).sheet().doRead();
        List<ColllegesTargetOutput> colllegesTargetList = collegesTargetListener.getList();

        // 读取国家省份数据
        String globalAreaNameTarget = "C:/Users/luoxianming/Desktop/学校数据/global_areas.xlsx";
        GlobalAreaLister globalAreaLister = new GlobalAreaLister();
        EasyExcel.read(globalAreaNameTarget, GlobalAreas.class, globalAreaLister).sheet().doRead();
        Map<String, String> areasMap = globalAreaLister.getList().stream().collect(Collectors.toMap(globalAreas -> String.valueOf(globalAreas.getId()), GlobalAreas::getName));



        for (ColllegesTargetOutput colllegesTargetOutput : colllegesTargetList){
            if (null != colllegesTargetOutput.getCollege_id()){
                if (map.containsKey(colllegesTargetOutput.getCollege_id())){
                    TBsCollegesInput tBsCollegesInput = map.get(colllegesTargetOutput.getCollege_id());
                    colllegesTargetOutput.setCollege_name(tBsCollegesInput.getName());
                    colllegesTargetOutput.setCollege_en_name(tBsCollegesInput.getEnName());
                    colllegesTargetOutput.setCountry_id(areasMap.getOrDefault(tBsCollegesInput.getCountryId(),""));
                    colllegesTargetOutput.setState_id(areasMap.getOrDefault(tBsCollegesInput.getStateId(),""));
                    colllegesTargetOutput.setCity_id(areasMap.getOrDefault(tBsCollegesInput.getCityId(),""));
                    colllegesTargetOutput.setArea_id(areasMap.getOrDefault(tBsCollegesInput.getAreaId(),""));
                }else{
                    log.info("解析到一条数据 college_id 为null :{}", JSON.toJSONString(colllegesTargetOutput));
                }
            }

        }


        String writefileName =  "C:/Users/luoxianming/Desktop/学校数据/待新增院校(补全数据).xlsx";
        EasyExcel.write(writefileName, ColllegesTargetOutput.class).sheet("待新增院校数据").doWrite(colllegesTargetList);
    }

    @Test
    public void getByCollegeName(){
        for (int i=0; i< 3; i++){
            tBsCollegesService.getByCollegeName("上海对外经贸大学");
        }
    }
}
