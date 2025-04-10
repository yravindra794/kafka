package com.example.kafka.services;

import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service

@AllArgsConstructor
public class KafkaProducer {

    private final KafkaTemplate<String,String> kafkaTemplate;

    public void SendMessage(String topic, String Message){
        kafkaTemplate.send(topic,Message);
    }

}
