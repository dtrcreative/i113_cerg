package com.micro.i113_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class I113ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(I113ConfigApplication.class, args);
    }

}
