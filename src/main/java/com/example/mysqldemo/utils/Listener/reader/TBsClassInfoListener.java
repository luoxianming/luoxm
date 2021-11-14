package com.example.mysqldemo.utils.Listener.reader;/**
 * @Author: luoxianming
 * @Date: 2021/5/20 15:11
 */

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.example.mysqldemo.bean.TBsClassInfo;

import java.util.ArrayList;
import java.util.List;

/**
 *@author luoxianming
 *@date 2021/5/20
 *
 */
public class TBsClassInfoListener extends AnalysisEventListener<TBsClassInfoVO> {

    List<TBsClassInfoVO> inpusts = new ArrayList<>();

    @Override
    public void invoke(TBsClassInfoVO tBsClassInfoVO, AnalysisContext analysisContext) {
        inpusts.add(tBsClassInfoVO);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }

    public List<TBsClassInfoVO> getList(){
        return inpusts;
    }
}
