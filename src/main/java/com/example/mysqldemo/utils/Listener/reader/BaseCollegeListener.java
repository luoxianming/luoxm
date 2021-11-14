package com.example.mysqldemo.utils.Listener.reader;/**
 * @Author: luoxianming
 * @Date: 2021/5/19 9:38
 */

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

import java.util.ArrayList;
import java.util.List;

/**
 *@author luoxianming
 *@date 2021/5/19
 *
 */
public class BaseCollegeListener extends AnalysisEventListener<BaseCollegeVO> {

    List<BaseCollegeVO> inputs = new ArrayList<>();

    @Override
    public void invoke(BaseCollegeVO baseCollegeVO, AnalysisContext analysisContext) {
        inputs.add(baseCollegeVO);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }

    public List<BaseCollegeVO> getList(){
        return inputs;
    }
}
