package com.example.mysqldemo;/**
 * @Author: luoxianming
 * @Date: 2021/5/19 20:11
 */

import com.alibaba.excel.EasyExcel;
import com.example.mysqldemo.bean.TBsMajor;
import com.example.mysqldemo.bean.TpoBaseSchool;
import com.example.mysqldemo.service.TBsMajorService;
import com.example.mysqldemo.utils.DateUtil;
import com.example.mysqldemo.utils.Listener.reader.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.List;

/**
 *@author luoxianming
 *@date 2021/5/19
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TBsMajorServiceTest {

    @Resource
    private TBsMajorService tBsMajorService;

    @Test
    public void exportExcel() throws ParseException {
        String fileName = "C:/Users/luoxianming/Desktop/新建文件夹 (3)/xlsl/t_bs_major.xlsx";
        TBsMajorListener tBsMajorListener = new TBsMajorListener();
        EasyExcel.read(fileName, TBsMajorVO.class, tBsMajorListener).sheet().doRead();
        List<TBsMajorVO> inputs = tBsMajorListener.getList();


        for (TBsMajorVO vo : inputs){
            TBsMajor tBsMajor = new TBsMajor();
            BeanUtils.copyProperties(vo, tBsMajor);
            tBsMajor.setCreatedAt(DateUtil.getStringToDateYMD(vo.getCreatedAt()));
            tBsMajor.setUpdatedAt(DateUtil.getStringToDateYMD(vo.getUpdatedAt()));

            tBsMajorService.insert(tBsMajor);
        }

    }

    @Test
    public void update(){
        tBsMajorService.updateCollegeAreaId();
    }

    @Test
    public void save(){
        tBsMajorService.save();
    }
}
