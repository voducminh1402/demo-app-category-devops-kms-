package com.example.categorymanagement.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SqsMessageConsumer {

    @SqsListener("test-queue-sqs-1")
    public void receiveMessage(String message) {
        log.info("Received message: {}", message);
    }
}