package com.example.mysqldemo.service.handler;

import com.example.mysqldemo.excel.vo.RankManageBatchInput;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Author: luoxianming
 * @Date: 2021/4/22 22:43
 */
public class Client {
    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<>();
        for (int i=0; i<5; i++){
            arrayList.add(new Women(random.nextInt(4),"我要出去逛街"));
        }

        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();

        father.setNext(husband);
        husband.setNext(son);
        for (IWomen women : arrayList){
            father.HandleMessage(women);
        }
    }
}
