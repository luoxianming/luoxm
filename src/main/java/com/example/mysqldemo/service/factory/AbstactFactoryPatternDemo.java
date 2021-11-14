package com.example.mysqldemo.service.factory;

import com.example.mysqldemo.service.factory.shape.Shape;

/**
 * @Author: luoxianming
 * @Date: 2021/3/19 23:31
 */
public class AbstactFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape shape = shapeFactory.getShape("CIRCLE");
        shape.draw();
    }
}
