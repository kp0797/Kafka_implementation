package com.kafka.implementation.end_user;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {
    // test
    
    // test 123
    @KafkaListener(topics = "location-update-topic", groupId = "group")
    public void updatedLocation (String value) {

        System.out.println("Updated location: " + value);

    }
}
