package com.example.seleniumdemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.*;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix="host")
@EnableConfigurationProperties
public class HostsProperties {

    @Value("${herokuapp}")
    private String herokuapp;

    @Value("${candymapper}")
    private String candymapper;

    public String getHerokuapp() {
        return herokuapp;
    }

    public void setHerokuapp(String host) {
        this.herokuapp = host;
    }

    public String getCandymapper() {
        return candymapper;
    }

    public void setCandymapper(String host) {
        this.candymapper = host;
    }
}
