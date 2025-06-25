package com.hemanth.kafka_consumer_example.service;


import com.hemanth.kafka_consumer_example.dto.Customer;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class KafkaMessageListener {

    Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = "new-topic",groupId = "group-1")
    public void consumeCustomerObject(Customer customer){

        log.info("Consumer-1 Consumed the message: "+ customer.toString());
    }

//    @KafkaListener(topics = "topic-by-spring",groupId = "group-1")
//    public void consume2(String message){
//
//        log.info("Consumer-2 Consumed the message: "+ message);
//    }
//
//    @KafkaListener(topics = "topic-by-spring",groupId = "group-1")
//    public void consume3(String message){
//
//        log.info("Consumer-3 Consumed the message: "+ message);
//    }
//
//    @KafkaListener(topics = "topic-by-spring",groupId = "group-1")
//    public void consume4(String message){
//
//        log.info("Consumer-4 Consumed the message: "+ message);
//    }


}
