package com.example.mysqldemo;/**
 * @Author: luoxianming
 * @Date: 2021/5/20 15:38
 */

import com.example.mysqldemo.service.TBsClassInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 *@author luoxianming
 *@date 2021/5/20
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TBsClassInfoServiceTest {

    @Resource
    private TBsClassInfoService tBsClassInfoService;

    @Test
    public void save(){
        tBsClassInfoService.save();
    }
}
