package com.example.mysqldemo.service.factory.shape;

/**
 * @Author: luoxianming
 * @Date: 2021/3/19 23:22
 */
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
