package com.example.boot.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.boot")
@MapperScan(basePackages = "com.example.boot.dao")
public class BootWebApplication {

    public static void main(String[] args) {
        SpringApplication.run (BootWebApplication.class, args);
    }

}
