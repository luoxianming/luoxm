package com.example.mysqldemo.service.aspect;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author luoxianming
 * @date 2021/9/5 11:21
 */
public interface Calculate {

    /**
     * 加法
     * @param numA
     * @param numB
     * @return
     */
    int add(int numA, int numB);

    /**
     * 减法
     * @param numA
     * @param numB
     * @return
     */
    int sub(int numA, int numB);

    /**
     * 除法
     * @param numA
     * @param numB
     * @return
     */
    int div(int numA, int numB);

    /**
     * 乘法
     * @param numA
     * @param numB
     * @return
     */
    int multi(int numA, int numB);

    int mod(int numA, int numB);

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EalyAopMainConfig.class);
        Calculate calculateProxy = ctx.getBean("calculateProxy", Calculate.class);
        calculateProxy.div(1,1);

    }
}
