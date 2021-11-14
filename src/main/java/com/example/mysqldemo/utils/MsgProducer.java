//package com.example.mysqldemo.utils;
//
//import com.alibaba.fastjson.JSON;
//import com.sun.org.apache.xpath.internal.operations.Or;
//import org.apache.kafka.clients.producer.*;
//import org.apache.kafka.common.serialization.StringSerializer;
//
//import java.util.Properties;
//import java.util.concurrent.CountDownLatch;
//import java.util.concurrent.TimeUnit;
//
///**
// * @Author: luoxianming
// * @Date: 2021/2/18 22:40
// */
//public class MsgProducer {
//    public static void main(String[] args) throws InterruptedException, Exception{
//        Properties properties = new Properties();
//        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
//        properties.put(ProducerConfig.ACKS_CONFIG, "1");
//        properties.put(ProducerConfig.RETRIES_CONFIG, 3);
//        properties.put(ProducerConfig.RETRY_BACKOFF_MS_CONFIG, 300);
//        properties.put(ProducerConfig.BUFFER_MEMORY_CONFIG, 33554432);
//        properties.put(ProducerConfig.BATCH_SIZE_CONFIG, 16384);
//        properties.put(ProducerConfig.LINGER_MS_CONFIG, 100);
//        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
//        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
//        Producer<String, String> producer = new KafkaProducer<String, String>(properties);
//        int msgNum = 5;
//        CountDownLatch countDownLatch = new CountDownLatch(msgNum);
//        for (int i = 1; i < msgNum; i++){
//            Order order = new Order();
//            order.setOrderId(100+i);
//            ProducerRecord<String, String> producerRecord = new ProducerRecord<>("lxm",0,order.getOrderId().toString(), JSON.toJSONString(order));
//            // 等待消息发送成功的同步阻塞方法
//            /*RecordMetadata metadata = producer.send(producerRecord).get();
//            System.out.println("同步方式发送消息结果：" + "topic‐" + metadata.topic() + "|partition‐"
//                    + metadata.partition() + "|offset‐" + metadata.offset());*/
//
//            producer.send(producerRecord, new Callback() {
//                @Override
//                public void onCompletion(RecordMetadata metadata, Exception e) {
//                    if(e != null){
//                        System.err.println("发送消息失败：" + e.getStackTrace());
//                    }
//
//                    if (metadata != null){
//                        System.out.println("异步方式发送消息结果：" + "topic‐" + metadata.topic() + "|partition‐"
//                                + metadata.partition() + "|offset‐" + metadata.offset());
//                    }
//                    countDownLatch.countDown();
//                }
//            });
//
//
//        }
//
//        countDownLatch.await(5, TimeUnit.SECONDS);
//        producer.close();
//    }
//}
