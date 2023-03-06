package com.aexlate.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AexlateSpringGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(AexlateSpringGatewayApplication.class, args);
	}

}
