package com.example.mysqldemo.service.proxy.jdk;

import com.example.mysqldemo.service.proxy.Person;
import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileOutputStream;

/**
 * @Author: luoxianming
 * @Date: 2021/3/23 21:52
 */
public class Customer implements Person {
    @Override
    public void findLove() {
        System.out.println("白富美");
    }

    public static void main(String[] args) {
        try {
            Person obj = (Person) new JDKMeipo().getInstance(new Customer());
            obj.findLove();

            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
            FileOutputStream os = new FileOutputStream("E://$Proxy0.class");
            os.write(bytes);
            os.close();
        }catch (Exception e){

        }
    }
}
