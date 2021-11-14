package com.example.jvm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author luoxianming
 * @date 2021/11/14 22:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String name;

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
