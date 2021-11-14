package com.example.mysqldemo.service.handler;

/**
 * @Author: luoxianming
 * @Date: 2021/4/22 22:26
 */
public class Son extends Handler{
    public Son() {
        super(Handler.SON_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen iWomen) {
        System.out.println("----女儿的请示 -----");
        System.out.println(iWomen.getRequest());
        System.out.println("父亲的答复: 同意\n");
    }
}
