package com.example.mysqldemo.response.code;

/**
 * @author Sunny.Zeng
 * @date 2020-09-11
 */
public abstract class AbstractServiceCode implements ServiceCode {

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (ServiceCode.class.isAssignableFrom(obj.getClass())) {
            return this.getStatus() == ((ServiceCode) obj).getStatus();
        } else {
            return false;
        }
    }
}
