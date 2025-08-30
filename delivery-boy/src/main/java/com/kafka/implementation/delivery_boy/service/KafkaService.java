package com.kafka.implementation.delivery_boy.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public boolean updateLocation(String location) {

        this.kafkaTemplate.send("location-update-topic", location);
        log.info("Location update success.");
        return true;

    }
}
