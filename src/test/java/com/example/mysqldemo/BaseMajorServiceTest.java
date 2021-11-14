package com.example.mysqldemo;/**
 * @Author: luoxianming
 * @Date: 2021/5/19 15:20
 */

import com.alibaba.excel.EasyExcel;
import com.example.mysqldemo.bean.BaseMajor;
import com.example.mysqldemo.bean.TBsAcademy;
import com.example.mysqldemo.feign.SolonClient;
import com.example.mysqldemo.service.BaseMajorService;
import com.example.mysqldemo.utils.DateUtil;
import com.example.mysqldemo.utils.Listener.reader.BaseMajorListener;
import com.example.mysqldemo.utils.Listener.reader.BaseMajorVO;
import com.example.mysqldemo.utils.Listener.reader.TbsAcademyListener;
import com.example.mysqldemo.utils.Listener.reader.TbsAcademyVO;
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
public class BaseMajorServiceTest {

    @Resource
    private BaseMajorService baseMajorService;

    @Test
    public void readExcel() throws ParseException {
        String fileName = "C:/Users/luoxianming/Desktop/学校数据/2021728/Base_Major.xlsx";
        BaseMajorListener baseMajorListener = new BaseMajorListener();
        EasyExcel.read(fileName, BaseMajorVO.class, baseMajorListener).sheet().doRead();
        List<BaseMajorVO> baseMajorVOList = baseMajorListener.getList();
        for (BaseMajorVO baseMajorVO : baseMajorVOList){
            BaseMajor baseMajor = new BaseMajor();
            BeanUtils.copyProperties(baseMajorVO, baseMajor);

            baseMajor.setCreatetime(DateUtil.getStringToDateYMD(baseMajorVO.getCreatetime()));
            baseMajor.setUpdatetime(DateUtil.getStringToDateYMD(baseMajorVO.getUpdatetime()));
            baseMajorService.insert(baseMajor);
        }

    }
}
