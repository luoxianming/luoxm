package com.example.mysqldemo;/**
 * @Author: luoxianming
 * @Date: 2021/5/19 10:15
 */

import com.alibaba.excel.EasyExcel;
import com.example.mysqldemo.bean.BaseCollege;
import com.example.mysqldemo.bean.TBsAcademy;
import com.example.mysqldemo.feign.SolonClient;
import com.example.mysqldemo.service.TBsAcademyService;
import com.example.mysqldemo.utils.DateUtil;
import com.example.mysqldemo.utils.Listener.reader.BaseCollegeListener;
import com.example.mysqldemo.utils.Listener.reader.BaseCollegeVO;
import com.example.mysqldemo.utils.Listener.reader.TbsAcademyListener;
import com.example.mysqldemo.utils.Listener.reader.TbsAcademyVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 *@author luoxianming
 *@date 2021/5/19
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TbsAcademyServiceTest {

    @Resource
    private TBsAcademyService tBsAcademyService;

    @Test
    public void readExcel() throws ParseException {
        String fileName = "C:/Users/luoxianming/Desktop/学校数据/2021713/t_bs_academy.xlsx";
        TbsAcademyListener tbsAcademyListener = new TbsAcademyListener();
        EasyExcel.read(fileName, TbsAcademyVO.class, tbsAcademyListener).sheet().doRead();
        List<TbsAcademyVO> baseCollegeList = tbsAcademyListener.getList();
        for (TbsAcademyVO tbsAcademyVO : baseCollegeList){
            TBsAcademy tBsAcademy = new TBsAcademy();
            BeanUtils.copyProperties(tbsAcademyVO, tBsAcademy);

            tBsAcademy.setCreatedAt(DateUtil.getStringToDateYMD(tbsAcademyVO.getCreatedAt()));
            tBsAcademy.setUpdatedAt(DateUtil.getStringToDateYMD(tbsAcademyVO.getUpdatedAt()));
            tBsAcademyService.insert(tBsAcademy);
        }
    }

    @Test
    public void updateOrInsert(){
        tBsAcademyService.updateOrInsert();
    }

    @Test
    public void save(){
        tBsAcademyService.save();
    }

    @Test
    public void saveByIdentityGuid(){
        List<String> stringList = new ArrayList<>();
        //"f49de3fd-9eb0-4d13-82cd-42ece4b45474";
        //stringList.add("a9a1806f-fda4-4651-a0fa-f49c7148a98d");
        //stringList.add("0c1658ec-95a7-4637-91a0-e623b9d82104");
        //stringList.add("bacaf7be-b970-46c8-a236-acc0754589f0");
        stringList.add("63E7E1B9-E534-4784-8456-483A2DACEBA0");
        stringList.forEach(s -> tBsAcademyService.saveByIdentityguid(s));
    }

}
