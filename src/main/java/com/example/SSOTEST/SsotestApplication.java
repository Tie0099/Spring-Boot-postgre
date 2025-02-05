package com.example.SSOTEST;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "SSO API", version = "1.0", description = "API for SSO Token generation"))
public class SsotestApplication {
    public static void main(String[] args) {
        SpringApplication.run(SsotestApplication.class, args);
    }
}
