package com.capgemini.configservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Configservice1Application {

	public static void main(String[] args) {
		SpringApplication.run(Configservice1Application.class, args);
	}
}
