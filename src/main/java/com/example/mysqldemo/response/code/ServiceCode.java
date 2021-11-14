package com.example.mysqldemo.response.code;

/**
 * @author Sunny.Zeng
 * @date 2020-09-11
 */
public interface ServiceCode {

    int getStatus();

    String getInfo();

    default Object getResult() {
        return null;
    }

    void setStatus(int status);

    void setInfo(String message);

    default String name() {
        return "UnKnown Error";
    }
}

