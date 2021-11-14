package com.example.mysqldemo.controller;

//import org.apache.kafka.clients.consumer.ConsumerRecord;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Component;
//
///**
// * @Author: luoxianming
// * @Date: 2021/2/21 20:27
// */
//@Component
//public class MyConsumer {
//
//    @KafkaListener(topics = "lxm", groupId = "mygroup")
//    public void listen(ConsumerRecord<String, String> record){
//        String value = record.value();
//        System.out.println("接受到的数据： "+value);
//        System.out.println(record);
//        String s = "s";
//        s.intern();
//    }
//
//}
