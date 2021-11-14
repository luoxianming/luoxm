package com.example.mysqldemo.service.singleton;

/**
 * @Author: luoxianming
 * @Date: 2021/3/22 22:27
 */
public class ExectorThread implements Runnable{
    @Override
    public void run() {
        ThreadLocalSingleton threadLocalSingleton = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + threadLocalSingleton);
    }
}
