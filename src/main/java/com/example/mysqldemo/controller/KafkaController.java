package com.example.mysqldemo.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

///**
// * @Author: luoxianming
// * @Date: 2021/2/21 20:17
// */
//@RestController
//public class KafkaController {
//
//    @Autowired
//    private KafkaTemplate<String, String> kafkaTemplate;
//
//    @RequestMapping("/send")
//    public void send(){
//        kafkaTemplate.send("lxm",0,"key", "this is a msg");
//    }
//}
