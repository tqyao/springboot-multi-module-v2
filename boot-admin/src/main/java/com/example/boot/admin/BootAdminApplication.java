package com.example.boot.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.boot")
@MapperScan(basePackages = "com.example.boot.dao")
public class BootAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run (BootAdminApplication.class, args);
    }

}
