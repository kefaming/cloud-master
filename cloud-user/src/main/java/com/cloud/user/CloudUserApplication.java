package com.cloud.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(basePackages = "com.cloud.user.client")
@MapperScan("com.cloud.user.mapper")
public class CloudUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudUserApplication.class, args);
    }

}

