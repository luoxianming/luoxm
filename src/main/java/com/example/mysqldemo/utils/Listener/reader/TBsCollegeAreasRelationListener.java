package com.example.mysqldemo.utils.Listener.reader;/**
 * @Author: luoxianming
 * @Date: 2021/4/30 15:28
 */

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.fastjson.JSON;
import com.example.mysqldemo.excel.vo.write.ColllegesTargetOutput;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 *@author luoxianming
 *@date 2021/4/30
 *
 */
@Slf4j
public class TBsCollegeAreasRelationListener extends AnalysisEventListener<TBsCollegeAreasRelationInput> {

    List<TBsCollegeAreasRelationInput> tBsCollegeAreasRelationInputs = new ArrayList<>();

    @Override
    public void invoke(TBsCollegeAreasRelationInput tBsCollegeAreasRelationInput, AnalysisContext analysisContext) {
        log.info("解析到一条数据:{}", JSON.toJSONString(tBsCollegeAreasRelationInput));
        tBsCollegeAreasRelationInputs.add(tBsCollegeAreasRelationInput);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }

    public List<TBsCollegeAreasRelationInput> getList(){
        return tBsCollegeAreasRelationInputs;
    }
}
