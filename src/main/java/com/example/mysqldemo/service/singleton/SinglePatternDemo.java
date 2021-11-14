package com.example.mysqldemo.service.singleton;

/**
 * @Author: luoxianming
 * @Date: 2021/3/20 10:10
 */
public class SinglePatternDemo {
    public static void main(String[] args) {
        SingleObject object = SingleObject.getInstance();

        object.showMessage();
    }
}
