package com.example.mysqldemo.service.factory.color;

/**
 * @Author: luoxianming
 * @Date: 2021/3/19 23:25
 */
public class Blue implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
