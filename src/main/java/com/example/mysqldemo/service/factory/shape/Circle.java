package com.example.mysqldemo.service.factory.shape;

/**
 * @Author: luoxianming
 * @Date: 2021/3/19 23:23
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
