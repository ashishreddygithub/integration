package com.htc.paitentmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PaitentmanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaitentmanagementApplication.class, args);
	}

}
