package com.example.mysqldemo.utils.Listener.reader;/**
 * @Author: luoxianming
 * @Date: 2021/5/8 15:03
 */

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

import java.util.ArrayList;
import java.util.List;

/**
 *@author luoxianming
 *@date 2021/5/8
 *
 */
public class TBsRelationListener extends AnalysisEventListener<TBsCollegeAreasRelationVO> {

    List<TBsCollegeAreasRelationVO> tBsCollegeAreasRelationInputs = new ArrayList<>();

    @Override
    public void invoke(TBsCollegeAreasRelationVO tBsCollegeAreasRelationVO, AnalysisContext analysisContext) {
        tBsCollegeAreasRelationInputs.add(tBsCollegeAreasRelationVO);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }

    public List<TBsCollegeAreasRelationVO> getList(){
        return tBsCollegeAreasRelationInputs;
    }
}
