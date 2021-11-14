package com.example.mysqldemo.service.factory.color;

/**
 * @Author: luoxianming
 * @Date: 2021/3/19 23:24
 */
public class Red implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
