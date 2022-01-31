package com.example.seleniumdemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.*;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "herokuapp")
@EnableConfigurationProperties
public class SeleniumDemoProperties {

    @Value("${host}")
    private String host;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
}
