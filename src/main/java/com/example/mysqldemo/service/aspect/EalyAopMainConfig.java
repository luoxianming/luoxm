package com.example.mysqldemo.service.aspect;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author luoxianming
 * @date 2021/9/5 11:26
 */
public class EalyAopMainConfig {

    // 被代理对象
    @Bean
    public Calculate calculate() {
        return new CalculateImpl();
    }

    // Advice 方式
    @Bean
    public LogAdvice logAdvice(){
        return new LogAdvice();
    }

    // Interceptor方式 ， 类似环绕通知
    @Bean
    public LogInterceptor logInterceptor() {
        return new LogInterceptor();
    }

    /**
     * FactoryBean方式单个： ProxyFactoryBean
     * @return
     */
    @Bean
    public ProxyFactoryBean calculateProxy(){
        ProxyFactoryBean userService=new ProxyFactoryBean();
        userService.setInterceptorNames("logAdvice","logInterceptor");  // 根据指定的顺序执行
        userService.setTarget(calculate());
        return userService;
    }
}
