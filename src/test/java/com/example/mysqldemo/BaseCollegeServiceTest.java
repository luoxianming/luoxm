package com.example.mysqldemo;/**
 * @Author: luoxianming
 * @Date: 2021/5/19 9:42
 */

import com.alibaba.excel.EasyExcel;
import com.example.mysqldemo.bean.BaseCollege;
import com.example.mysqldemo.service.BaseCollegeService;
import com.example.mysqldemo.utils.DateUtil;
import com.example.mysqldemo.utils.Listener.reader.BaseCollegeListener;
import com.example.mysqldemo.utils.Listener.reader.BaseCollegeVO;

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
public class BaseCollegeServiceTest {

    @Resource
    private BaseCollegeService baseCollegeService;

    @Test
    public void readExcel() throws ParseException {
        //String fileName = "C:/Users/luoxianming/Desktop/新建文件夹 (3)/xlsl/Base_College.xlsx";
        String fileName = "C:/Users/luoxianming/Desktop/学校数据/2021728/Base_College.xlsx";
        BaseCollegeListener baseCollegeListener = new BaseCollegeListener();
        EasyExcel.read(fileName, BaseCollegeVO.class, baseCollegeListener).sheet().doRead();
        List<BaseCollegeVO> baseCollegeList = baseCollegeListener.getList();
        for (BaseCollegeVO baseCollegeVO : baseCollegeList){
            BaseCollege baseCollege = new BaseCollege();
            BeanUtils.copyProperties(baseCollegeVO, baseCollege);

            baseCollege.setCreatetime(DateUtil.getStringToDateYMD(baseCollegeVO.getCreatetime()));
            baseCollege.setUpdatetime(DateUtil.getStringToDateYMD(baseCollegeVO.getUpdatetime()));
            baseCollegeService.insert(baseCollege);
        }

    }
}
