package com.practice.covid19api;

import com.practice.covid19api.config.ConfigProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableConfigurationProperties(ConfigProperties.class)
@EnableMongoAuditing
public class Covid19ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(Covid19ApiApplication.class, args);
	}

}
