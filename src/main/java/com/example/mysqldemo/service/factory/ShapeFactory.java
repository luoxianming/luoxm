package com.example.mysqldemo.service.factory;

import com.example.mysqldemo.service.factory.color.Color;
import com.example.mysqldemo.service.factory.shape.Circle;
import com.example.mysqldemo.service.factory.shape.Rectangle;
import com.example.mysqldemo.service.factory.shape.Shape;
import com.example.mysqldemo.service.factory.shape.Square;

/**
 * @Author: luoxianming
 * @Date: 2021/3/19 23:27
 */
public class ShapeFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
