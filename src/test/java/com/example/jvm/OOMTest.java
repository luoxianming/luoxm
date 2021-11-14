package com.example.jvm;

import cn.hutool.core.lang.UUID;

import java.util.ArrayList;
import java.util.List;

/**
 * @author luoxianming
 * @date 2021/11/13 21:19
 */
public class OOMTest {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (true) {
            list.add(new User(i++, UUID.randomUUID().toString()));
            new User(j--, UUID.randomUUID().toString());
        }
    }

    //User类需要重写finalize方法
    @Override
    protected void finalize() throws Throwable {
        OOMTest.list.add(this);
        System.out.println("关闭资源，userid=" + id + "即将被回收");
    }
}
