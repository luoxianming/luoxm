package com.example.mysqldemo.utils.Listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.fastjson.JSON;
import com.example.mysqldemo.excel.vo.GlobalAreas;
import com.example.mysqldemo.excel.vo.write.ColllegesTargetOutput;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: luoxianming
 * @Date: 2021/4/28 13:19
 */
@Slf4j
public class GlobalAreaLister extends AnalysisEventListener<GlobalAreas> {

    List<GlobalAreas> list = new ArrayList<>();
    @Override
    public void invoke(GlobalAreas globalAreas, AnalysisContext analysisContext) {
//        log.info("解析到一条数据:{}", JSON.toJSONString(globalAreas));
        list.add(globalAreas);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }

    public List<GlobalAreas> getList(){
        return list;
    }
}
