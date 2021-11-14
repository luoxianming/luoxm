package com.example.mysqldemo.service.factory;

import com.example.mysqldemo.service.factory.color.Blue;
import com.example.mysqldemo.service.factory.color.Color;
import com.example.mysqldemo.service.factory.color.Green;
import com.example.mysqldemo.service.factory.color.Red;
import com.example.mysqldemo.service.factory.shape.Shape;

/**
 * @Author: luoxianming
 * @Date: 2021/3/19 23:28
 */
public class ColorFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
