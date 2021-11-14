package com.example.mysqldemo.service.factory;

import com.example.mysqldemo.service.factory.color.Color;
import com.example.mysqldemo.service.factory.shape.Shape;

/**
 * @Author: luoxianming
 * @Date: 2021/3/19 23:25
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
