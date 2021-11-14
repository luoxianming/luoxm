package com.example.mysqldemo.utils.Listener.reader;/**
 * @Author: luoxianming
 * @Date: 2021/5/18 22:52
 */

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

import java.util.ArrayList;
import java.util.List;

/**
 *@author luoxianming
 *@date 2021/5/18
 *
 */
public class TBsCollegeAreasListener extends AnalysisEventListener<TBsCollegeAreasVo> {
    List<TBsCollegeAreasVo> inputs = new ArrayList<>();

    @Override
    public void invoke(TBsCollegeAreasVo tBsCollegeAreasVo, AnalysisContext analysisContext) {
        inputs.add(tBsCollegeAreasVo);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }

    public List<TBsCollegeAreasVo> getList(){
        return inputs;
    }
}
