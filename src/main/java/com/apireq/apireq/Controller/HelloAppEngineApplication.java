package com.apireq.apireq.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@RestController
public class HelloAppEngineApplication {

    @GetMapping("/")
    public String hello() {
        return "Hello Spring Boot! 2";
    }
}