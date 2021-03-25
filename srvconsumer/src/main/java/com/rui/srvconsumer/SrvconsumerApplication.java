package com.rui.srvconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients


public class SrvconsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SrvconsumerApplication.class, args);
    }

}
