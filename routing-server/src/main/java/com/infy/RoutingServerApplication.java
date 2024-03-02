package com.infy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RoutingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoutingServerApplication.class, args);
	}

}
