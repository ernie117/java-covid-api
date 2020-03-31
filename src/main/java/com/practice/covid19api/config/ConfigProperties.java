package com.practice.covid19api.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
@ConfigurationProperties("covid")
@Getter
@Setter
public class ConfigProperties {

    private String covid19RepoURL;
    private String githubRawURL;

}
