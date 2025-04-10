package com.example.kafka.controllers;

import com.example.kafka.services.KafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    private final KafkaProducer kafkaProducer;

    public KafkaController(KafkaProducer kafkaProducer){
        this.kafkaProducer=kafkaProducer;
    }
    public ResponseEntity<String> sendMessage(@RequestParam String Message){
        kafkaProducer.SendMessage("my-topic",Message);
        return ResponseEntity.ok("Message Sent");
    }
}
