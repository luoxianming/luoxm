package com.example.mysqldemo.controller;

import com.example.mysqldemo.bean.SchoolAchievementTarget;
import com.example.mysqldemo.bean.TBsColleges;
import com.example.mysqldemo.service.TBsCollegesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: luoxianming
 * @Date: 2021/4/27 22:29
 */
@Slf4j
@RequestMapping("/tBsColleges")
@RestController
public class TBsCollegesController {

    @Resource
    private TBsCollegesService tBsCollegesService;

    @GetMapping(value= "/byId")
    public int gotoDetail(Integer id){
        log.info("test{}"+id);
        if(id!=null){
            int target = tBsCollegesService.readExcel();
            return target;
        }

        return 0;

    }
}
