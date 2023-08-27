package com.micro.i113_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.reactive.ReactiveUserDetailsServiceAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin
public class I113GatewayApplication{
    public static void main(String[] args) {
        SpringApplication.run(I113GatewayApplication.class, args);
    }
}
