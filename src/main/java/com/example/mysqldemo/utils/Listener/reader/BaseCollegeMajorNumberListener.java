package com.example.mysqldemo.utils.Listener.reader;/**
 * @Author: luoxianming
 * @Date: 2021/5/20 14:44
 */

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

import java.util.ArrayList;
import java.util.List;

/**
 *@author luoxianming
 *@date 2021/5/20
 *
 */
public class BaseCollegeMajorNumberListener extends AnalysisEventListener<BaseCollegeMajorNumberVO> {

    List<BaseCollegeMajorNumberVO> inputs = new ArrayList<>();

    @Override
    public void invoke(BaseCollegeMajorNumberVO baseCollegeMajorNumberVO, AnalysisContext analysisContext) {
        inputs.add(baseCollegeMajorNumberVO);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }

    public List<BaseCollegeMajorNumberVO> getList(){
        return inputs;
    }
}
