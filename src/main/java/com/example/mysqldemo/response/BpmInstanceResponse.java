package com.example.mysqldemo.response;

import lombok.Data;

import java.util.List;

@Data
public class BpmInstanceResponse<T> {

    private String info;
    private List<T> result;
    private String status;
}
