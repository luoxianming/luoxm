package com.example.mysqldemo.utils.Listener.reader;/**
 * @Author: luoxianming
 * @Date: 2021/5/19 13:09
 */

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.example.mysqldemo.bean.TpoBaseSchool;

import java.util.ArrayList;
import java.util.List;

/**
 *@author luoxianming
 *@date 2021/5/19
 *
 */
public class TpoBaseSchoolListener extends AnalysisEventListener<TpoBaseSchoolVO> {

    List<TpoBaseSchoolVO> inputs = new ArrayList<>();
    @Override
    public void invoke(TpoBaseSchoolVO tpoBaseSchoolVO, AnalysisContext analysisContext) {
        inputs.add(tpoBaseSchoolVO);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }

    public List<TpoBaseSchoolVO> getList(){
        return inputs;
    }

}
