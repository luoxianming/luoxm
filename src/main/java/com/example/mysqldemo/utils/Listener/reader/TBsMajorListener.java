package com.example.mysqldemo.utils.Listener.reader;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

import java.util.ArrayList;
import java.util.List;

/**
 *@author luoxianming
 *@date 2021/5/19
 *
 */
public class TBsMajorListener extends AnalysisEventListener<TBsMajorVO> {

    List<TBsMajorVO> tBsMajors = new ArrayList<>();

    @Override
    public void invoke(TBsMajorVO tBsMajorVO, AnalysisContext analysisContext) {
        tBsMajors.add(tBsMajorVO);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }

    public List<TBsMajorVO> getList(){
        return tBsMajors;
    }
}
