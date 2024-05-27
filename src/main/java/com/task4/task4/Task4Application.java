package com.task4.task4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(RsaKeyProperties.class)
@SpringBootApplication
public class Task4Application {

	public static void main(String[] args) {
		SpringApplication.run(Task4Application.class, args);
	}

}
