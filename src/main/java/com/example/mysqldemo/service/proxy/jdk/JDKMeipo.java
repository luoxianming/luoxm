package com.example.mysqldemo.service.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: luoxianming
 * @Date: 2021/3/23 21:47
 */
public class JDKMeipo implements InvocationHandler {
    private Object target;

    public Object getInstance(Object target) throws Exception{
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object object = method.invoke(this.target, args);
        after();
        return object;
    }

    private void before(){
        System.out.println("我是媒婆: 我要给你找对象");
        System.out.println("开始物色");
    }

    private void after(){
        System.out.println("如果合适的话，就准备办事吧");
    }
}
