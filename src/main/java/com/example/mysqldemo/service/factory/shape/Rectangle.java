package com.example.mysqldemo.service.factory.shape;


/**
 * @Author: luoxianming
 * @Date: 2021/3/19 23:21
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
