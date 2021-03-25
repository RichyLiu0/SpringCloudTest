package com.rui.srvprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

public class SrvproviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SrvproviderApplication.class, args);
    }

}