package com.example.crud.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class UserEventListener {

    @KafkaListener(topics = "user-events", groupId = "student-group")
    public void consume(String message) {
        System.out.println("🔥 CONSUMED FROM KAFKA: " + message);
    }
}
