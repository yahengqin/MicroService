package com.spring.cloud.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@RestController
public class CustomerApplication {

	@Autowired
	private CustomerClient customerClient;

	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}


	@RequestMapping(value = "/add")
	public Integer add() {
		return customerClient.add(50, 50);
	}
}
