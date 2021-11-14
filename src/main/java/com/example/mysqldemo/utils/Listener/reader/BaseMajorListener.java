package com.example.mysqldemo.utils.Listener.reader;/**
 * @Author: luoxianming
 * @Date: 2021/5/19 15:12
 */

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.example.mysqldemo.bean.BaseMajor;

import java.util.ArrayList;
import java.util.List;

/**
 *@author luoxianming
 *@date 2021/5/19
 *
 */
public class BaseMajorListener extends AnalysisEventListener<BaseMajorVO> {

    List<BaseMajorVO> inputs = new ArrayList<>();

    @Override
    public void invoke(BaseMajorVO baseMajorVO, AnalysisContext analysisContext) {
        inputs.add(baseMajorVO);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }

    public List<BaseMajorVO> getList(){
        return inputs;
    }
}
