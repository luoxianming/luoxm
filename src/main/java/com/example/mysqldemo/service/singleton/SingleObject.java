package com.example.mysqldemo.service.singleton;

/**
 * @Author: luoxianming
 * @Date: 2021/3/20 9:57
 */
public class SingleObject {

    private static SingleObject instance = new SingleObject();

    public SingleObject() {
    }

    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
