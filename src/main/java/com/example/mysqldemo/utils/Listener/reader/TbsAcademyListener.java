package com.example.mysqldemo.utils.Listener.reader;/**
 * @Author: luoxianming
 * @Date: 2021/5/19 10:24
 */

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 *@author luoxianming
 *@date 2021/5/19
 *
 */
@Slf4j
public class TbsAcademyListener extends AnalysisEventListener<TbsAcademyVO> {

    List<TbsAcademyVO> inputs = new ArrayList<>();

    @Override
    public void invoke(TbsAcademyVO tbsAcademyVO, AnalysisContext analysisContext) {
        log.info("解析到一条数据:{}", JSON.toJSONString(tbsAcademyVO));
        inputs.add(tbsAcademyVO);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }

    public List<TbsAcademyVO> getList(){
        return inputs;
    }
}
