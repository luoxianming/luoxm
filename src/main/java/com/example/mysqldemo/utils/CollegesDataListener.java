package com.example.mysqldemo.utils;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.fastjson.JSON;
import com.example.mysqldemo.excel.vo.TBsCollegesInput;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: luoxianming
 * @Date: 2021/4/27 23:29
 */
@Slf4j
public class CollegesDataListener extends AnalysisEventListener<TBsCollegesInput> {

    /**
     * 每隔5条存储数据库，实际使用中可以3000条，然后清理list ，方便内存回收
     */
    private static final int BATCH_COUNT = 5000;
    List<TBsCollegesInput> list = new ArrayList<TBsCollegesInput>();

    @Override
    public void invoke(TBsCollegesInput tBsCollegesInput, AnalysisContext analysisContext) {
        log.info("解析到一条数据:{}", JSON.toJSONString(tBsCollegesInput));
        list.add(tBsCollegesInput);
//        if (list.size() >= BATCH_COUNT) {
//            saveData();
//            list.clear();
//        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }

    /**
     * 加上存储数据库
     */
    private void saveData() {
        log.info("{}条数据，开始存储数据库！", list.size());
        log.info("存储数据库成功！");
    }

    public List<TBsCollegesInput> getList(){
        return list;
    }
}
