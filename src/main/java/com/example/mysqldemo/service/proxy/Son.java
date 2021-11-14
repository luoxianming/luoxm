package com.example.mysqldemo.service.proxy;

/**
 * @Author: luoxianming
 * @Date: 2021/3/23 21:26
 */
public class Son implements Person{
    @Override
    public void findLove() {
        System.out.println("儿子要求：肤白貌美大长腿");
    }
}
