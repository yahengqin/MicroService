package com.yahengqin.microservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceBackApplication.class, args);
    }

    @Value("${welcomeWord}")
    private String welcomeWord;

    @RequestMapping("hello")
    public String helloWorld() {
        return welcomeWord;
    }

    @RequestMapping("index")
    public String index() {
        return "index page";
    }

    @RequestMapping("add")
    public int add(int a, int b) {
        return a + b;
    }
}
