package com.example.mysqldemo;/**
 * @Author: luoxianming
 * @Date: 2021/5/19 13:12
 */

import com.alibaba.excel.EasyExcel;
import com.example.mysqldemo.bean.TBsCollegeAreas;
import com.example.mysqldemo.bean.TpoBaseSchool;
import com.example.mysqldemo.service.TpoBaseSchoolService;
import com.example.mysqldemo.utils.DateUtil;
import com.example.mysqldemo.utils.Listener.reader.TBsCollegeAreasListener;
import com.example.mysqldemo.utils.Listener.reader.TBsCollegeAreasVo;
import com.example.mysqldemo.utils.Listener.reader.TpoBaseSchoolListener;
import com.example.mysqldemo.utils.Listener.reader.TpoBaseSchoolVO;
import org.apache.commons.lang3.ObjectUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *@author luoxianming
 *@date 2021/5/19
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TpoBaseSchoolTest {

    @Resource
    private TpoBaseSchoolService tpoBaseSchoolService;

    @Test
    public void exportExcel() throws ParseException {
        String fileName = "C:/Users/luoxianming/Desktop/学校数据/2021713/Tpo_Base_School.xlsx";
        TpoBaseSchoolListener tpoBaseSchoolListener = new TpoBaseSchoolListener();
        EasyExcel.read(fileName, TpoBaseSchoolVO.class, tpoBaseSchoolListener).sheet().doRead();
        List<TpoBaseSchoolVO> inputs = tpoBaseSchoolListener.getList();

//        List<TpoBaseSchool> tpoBaseSchools = new ArrayList<>();
        for (TpoBaseSchoolVO vo : inputs){
            TpoBaseSchool tpoBaseSchool = new TpoBaseSchool();
            BeanUtils.copyProperties(vo, tpoBaseSchool);
            tpoBaseSchool.setCreatetime(DateUtil.getStringToDateYMD(vo.getCreatetime()));
            tpoBaseSchool.setUpdatetime(DateUtil.getStringToDateYMD(vo.getUpdatetime()));
//            if (ObjectUtils.isNotEmpty(vo.getCountryId())){
//                tBsCollegeAreas.setCountryId(Integer.parseInt(vo.getCountryId()));
//            }
//
//            if (!"null".equals(vo.getStateId()) && ObjectUtils.isNotEmpty(vo.getStateId())){
//                tBsCollegeAreas.setStateId(Integer.parseInt(vo.getStateId()));
//            }
//            if (!"null".equals(vo.getCityId()) && ObjectUtils.isNotEmpty(vo.getCityId())){
//                tBsCollegeAreas.setCityId(Integer.parseInt(vo.getCityId()));
//            }
//            if (!"null".equals(vo.getAreaId()) && ObjectUtils.isNotEmpty(vo.getAreaId())){
//                tBsCollegeAreas.setAreaId(Integer.parseInt(vo.getAreaId()));
//            }
//            if (!"null".equals(vo.getCollegeId()) && ObjectUtils.isNotEmpty(vo.getCollegeId())){
//                tBsCollegeAreas.setCollegeId(Integer.parseInt(vo.getCollegeId()));
//            }
//            tpoBaseSchools.add(tpoBaseSchool);
            tpoBaseSchoolService.insert(tpoBaseSchool);
        }
//        tpoBaseSchoolService.batchInsert(tpoBaseSchools);
    }

    public static int binarySearch(int[] arr, int date){
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < date) {
                low = mid + 1;
            }else if (arr[mid] == date) {
                return mid;
            }else {
                high = mid -1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int [100];
        for (int i= 0; i <100; i++){
            arr[i] = i;
        }

        System.out.println(binarySearch(arr, 6));
    }
}
