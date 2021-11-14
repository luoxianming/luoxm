package com.example.mysqldemo;/**
 * @Author: luoxianming
 * @Date: 2021/5/20 14:47
 */

import com.alibaba.excel.EasyExcel;
import com.example.mysqldemo.bean.BaseCollege;
import com.example.mysqldemo.bean.BaseCollegeMajorNumber;
import com.example.mysqldemo.service.BaseCollegeMajorNumberService;
import com.example.mysqldemo.service.BaseMajorService;
import com.example.mysqldemo.utils.DateUtil;
import com.example.mysqldemo.utils.Listener.reader.BaseCollegeListener;
import com.example.mysqldemo.utils.Listener.reader.BaseCollegeMajorNumberListener;
import com.example.mysqldemo.utils.Listener.reader.BaseCollegeMajorNumberVO;
import com.example.mysqldemo.utils.Listener.reader.BaseCollegeVO;
import org.apache.commons.lang3.ObjectUtils;
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
 *@date 2021/5/20
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseCollegeMajorNumberServiceTest {

    @Resource
    private BaseCollegeMajorNumberService baseCollegeMajorNumberService;

    @Test
    public void readExcel() throws ParseException {
        String fileName = "C:/Users/luoxianming/Desktop/学校数据/2021728/Base_CollegeMajorNumber.xlsx";
        BaseCollegeMajorNumberListener baseCollegeMajorNumberListener = new BaseCollegeMajorNumberListener();
        EasyExcel.read(fileName, BaseCollegeMajorNumberVO.class, baseCollegeMajorNumberListener).sheet().doRead();
        List<BaseCollegeMajorNumberVO> baseCollegeList = baseCollegeMajorNumberListener.getList();
        for (BaseCollegeMajorNumberVO vo : baseCollegeList){
            if (ObjectUtils.isEmpty(vo.getClassname())){
                vo.setClassname("");
            }
            BaseCollegeMajorNumber baseCollege = new BaseCollegeMajorNumber();
            BeanUtils.copyProperties(vo, baseCollege);

            baseCollege.setCreatetime(DateUtil.getStringToDateYMD(vo.getCreatetime()));
            baseCollege.setUpdatetime(DateUtil.getStringToDateYMD(vo.getUpdatetime()));
            baseCollegeMajorNumberService.insert(baseCollege);
        }

    }
}
