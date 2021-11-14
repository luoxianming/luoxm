package com.example.mysqldemo.controller;

import com.example.mysqldemo.service.redis.RedisService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.TimeUnit;

/**
 * @Author: luoxianming
 * @Date: 2020/11/7 9:55
 */
@RequestMapping("/login")
@RestController
public class RedisSessionController {

    @Resource
    private RedisService redisService;

    @PostMapping(value= "/session")
    public boolean setSession(HttpServletRequest request){
        String userId = request.getHeader("X-GATEWAY-UID");
        try {
            redisService.setStringValueWithPrefix(userId,userId,2, TimeUnit.MINUTES);
        }catch (Exception e){
            e.printStackTrace();
        }
        return true;
    }
}
