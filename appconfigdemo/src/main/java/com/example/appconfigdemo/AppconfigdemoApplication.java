package com.example.appconfigdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(MessageProperties.class)
public class AppconfigdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppconfigdemoApplication.class, args);
	}

}
