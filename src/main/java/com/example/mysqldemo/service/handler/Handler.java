package com.example.mysqldemo.service.handler;

/**
 * @Author: luoxianming
 * @Date: 2021/4/22 21:55
 */
public abstract class Handler {

    public final static int FATHER_LEVEL_REQUEST =1;

    public final static int HUSBAND_LEVEL_REQUEST =2;

    public final static int SON_LEVEL_REQUEST = 3;

    private int level = 0;

    private Handler nextHandler;

    public Handler(int level) {
        this.level = level;
    }

    public final void HandleMessage(IWomen iWomen){
        if(iWomen.getType() == this.level){
            this.response(iWomen);
        }else {
            if (this.nextHandler != null){
                this.nextHandler.HandleMessage(iWomen);
            }else {
                System.out.println("--没地方请示了，按不同意出来--\n");
            }
        }
    }

    public void setNext(Handler handler){
        this.nextHandler = handler;
    }

    protected abstract void response(IWomen iWomen);
}
