//package com.example.mysqldemo.utils;
//
//import org.apache.kafka.clients.consumer.ConsumerConfig;
//import org.apache.kafka.clients.consumer.ConsumerRecord;
//import org.apache.kafka.clients.consumer.ConsumerRecords;
//import org.apache.kafka.clients.consumer.KafkaConsumer;
//import org.apache.kafka.common.TopicPartition;
//import org.apache.kafka.common.serialization.StringDeserializer;
//import org.apache.tomcat.jni.Poll;
//
//import java.util.Arrays;
//import java.util.Properties;
//
///**
// * @Author: luoxianming
// * @Date: 2021/2/21 17:45
// */
//public class MsgConsumer {
//    public static void main(String[] args) {
//        Properties properties = new Properties();
//        properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
//        properties.put(ConsumerConfig.GROUP_ID_CONFIG, "testGroup");
//        //properties.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG,true);
//        properties.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG,"1000");
//        properties.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG,false);
//        properties.put(ConsumerConfig.HEARTBEAT_INTERVAL_MS_CONFIG,1000);
//        properties.put(ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG,10*1000);
//        properties.put(ConsumerConfig.MAX_POLL_INTERVAL_MS_CONFIG, 30*1000);
//        properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
//        properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
//        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(properties);
//        String topicName = "lxm";
//        consumer.assign(Arrays.asList(new TopicPartition(topicName, 0)));
//
//        consumer.seekToBeginning(Arrays.asList(new TopicPartition(topicName, 0)));
//        while (true){
//            ConsumerRecords<String, String> records = consumer.poll(Integer.MAX_VALUE);
//            for (ConsumerRecord<String, String> record : records) {
//                System.out.printf("收到消息：offset = %d, key = %s, value = %s%n", record.offset(), record.key(),record.value());
//            }
//
//            if (records.count() > 0) {
//                // 提交offset
//                consumer.commitSync();
//            }
//        }
//
//    }
//}
