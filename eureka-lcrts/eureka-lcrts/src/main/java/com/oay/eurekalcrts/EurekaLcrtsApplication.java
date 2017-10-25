package com.oay.eurekalcrts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaLcrtsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaLcrtsApplication.class, args);
	}

	@RequestMapping("/")
	String home() {
		return "Hello World!";
    }

    @RequestMapping("/info")
    String info() {
        return "MSA DDD, Redis, MQ, ELK samples";
    }
}
