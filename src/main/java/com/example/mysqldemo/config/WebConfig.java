package com.example.mysqldemo.config;

import com.example.mysqldemo.config.interceptor.AuthorizationInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * @Author: luoxianming
 * @Date: 2020/11/7 9:42
 */
@Component
public class WebConfig implements WebMvcConfigurer {

    @Resource
    AuthorizationInterceptor authenticationInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authenticationInterceptor).addPathPatterns("/**");
    }
}
