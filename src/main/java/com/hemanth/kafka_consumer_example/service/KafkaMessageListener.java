package com.hemanth.kafka_consumer_example.service;


import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class KafkaMessageListener {

    Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = "topic-by-spring",groupId = "group-1")
    public void consume(String message){

        log.info("Consumed the message: "+ message);
    }
}
