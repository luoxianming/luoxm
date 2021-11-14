package com.example.mysqldemo.utils.Listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.fastjson.JSON;
import com.example.mysqldemo.excel.vo.TBsCollegesInput;
import com.example.mysqldemo.excel.vo.write.ColllegesTargetOutput;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: luoxianming
 * @Date: 2021/4/28 9:18
 */
@Slf4j
public class CollegesTargetListener extends AnalysisEventListener<ColllegesTargetOutput> {

    List<ColllegesTargetOutput> list = new ArrayList<>();

    @Override
    public void invoke(ColllegesTargetOutput colllegesTargetOutput, AnalysisContext analysisContext) {
        log.info("解析到一条数据:{}", JSON.toJSONString(colllegesTargetOutput));
        list.add(colllegesTargetOutput);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }

    public List<ColllegesTargetOutput> getList(){
        return list;
    }
}
