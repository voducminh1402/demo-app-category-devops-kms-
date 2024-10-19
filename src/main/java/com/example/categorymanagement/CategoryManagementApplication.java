package com.example.categorymanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.aws.messaging.config.annotation.EnableSqs;

@SpringBootApplication
@EnableSqs
public class CategoryManagementApplication {
    public static void main(String[] args) {
        SpringApplication.run(CategoryManagementApplication.class, args);
    }
}
