package com.example.mysqldemo.controller;

import com.example.mysqldemo.dao.BehaviorDao;
import com.example.mysqldemo.service.BehaviorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: luoxianming
 * @Date: 2020/8/27 21:16
 */
@RequestMapping("/behavior")
@RestController
public class BehaviorCotroller {

    @Resource
    private BehaviorService behaviorService;

    @GetMapping(value= "/inport")
    public void inprot(){
        behaviorService.insert();
    }
}
