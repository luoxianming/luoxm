package com.example.mysqldemo.service.proxy.Game;

import sun.net.www.protocol.http.HttpURLConnection;

/**
 * @Author: luoxianming
 * @Date: 2021/4/21 21:25
 */
public class GamePlayer implements IGamePlayer{

    private String name ="";

    private IGamePlayer proxy = null;

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String user, String password) {
        if (this.isProxy()){
            System.out.println("登入");
        }else {
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public void killBoss() {
        if(this.isProxy()){
            System.out.println(this.name + "在打怪！");
        }else {
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public void upgrade() {
        if (this.isProxy()){
            System.out.println("升级");
        }else {
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public IGamePlayer getProxy() {
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }

    private boolean isProxy(){
        if (this.proxy == null){
            return false;
        }else {
            return true;
        }
    }

    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");
        IGamePlayer playerProxy = player.getProxy();
        System.out.println("开始");
        playerProxy.login("张三", "pow");
        playerProxy.killBoss();
        playerProxy.upgrade();
        System.out.println("结束");
    }
}
