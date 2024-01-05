package com.micro.i113_resources;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Resources"))
public class I113ResourcesApplication {

    public static void main(String[] args) {
        SpringApplication.run(I113ResourcesApplication.class, args);
    }

}
