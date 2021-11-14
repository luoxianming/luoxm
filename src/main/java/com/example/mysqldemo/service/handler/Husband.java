package com.example.mysqldemo.service.handler;

/**
 * @Author: luoxianming
 * @Date: 2021/4/22 22:24
 */
public class Husband extends Handler{

    public Husband() {
        super(Handler.HUSBAND_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen iWomen) {
        System.out.println("----妻子的请示 -----");
        System.out.println(iWomen.getRequest());
        System.out.println("丈夫的答复: 同意\n");
    }
}
