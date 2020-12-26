package com.george.hroauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HroauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(HroauthApplication.class, args);
	}

}
