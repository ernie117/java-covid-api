package com.practice.covid19api;

import com.practice.covid19api.config.ConfigProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ConfigProperties.class)
public class Covid19ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(Covid19ApiApplication.class, args);
    }

}
