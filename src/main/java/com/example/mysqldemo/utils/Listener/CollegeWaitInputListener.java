package com.example.mysqldemo.utils.Listener;/**
 * @Author: luoxianming
 * @Date: 2021/4/28 15:55
 */

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.fastjson.JSON;
import com.example.mysqldemo.excel.vo.CollegesWaitInput;
import com.example.mysqldemo.excel.vo.GlobalAreas;
import com.example.mysqldemo.excel.vo.write.ColllegesTargetOutput;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 *@author luoxianming
 *@date 2021/4/28
 *
 */
@Slf4j
public class CollegeWaitInputListener extends AnalysisEventListener<CollegesWaitInput> {
    List<CollegesWaitInput> list = new ArrayList<>();

    @Override
    public void invoke(CollegesWaitInput collegesWaitInput, AnalysisContext analysisContext) {
        log.info("解析到一条数据:{}", JSON.toJSONString(collegesWaitInput));
        list.add(collegesWaitInput);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }

    public List<CollegesWaitInput> getList(){
        return list;
    }
}
