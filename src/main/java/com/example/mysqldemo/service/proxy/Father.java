package com.example.mysqldemo.service.proxy;

/**
 * @Author: luoxianming
 * @Date: 2021/3/23 21:27
 */
public class Father {
    private Son son;

    public Father(Son son){
        this.son = son;
    }

    public void findLove(){
        System.out.println("父亲物色对象");
        this.son.findLove();
        System.out.println("双方同意交往，确立关系");
    }
}
