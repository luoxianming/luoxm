package com.example.mysqldemo.service.proxy.Game;

/**
 * @Author: luoxianming
 * @Date: 2021/4/21 21:22
 */
public interface IGamePlayer {

    public void login(String user, String password);

    public void killBoss();

    public void upgrade();

    public IGamePlayer getProxy();
}
