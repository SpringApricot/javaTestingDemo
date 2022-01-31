package com.example.seleniumdemo.hooks;

import com.example.seleniumdemo.SpringContextConfiguration;
import com.example.seleniumdemo.config.HostsProperties;
import io.cucumber.java.*;
import io.cucumber.spring.CucumberContextConfiguration;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = {SpringContextConfiguration.class})
public class generalHooks {

    @Autowired
    private WebDriver driver;

    @Autowired
    private HostsProperties hosts;

    private String host;

    @Before(value="@herokuapp", order=0)
    public void getHerokuappHost() {
        host = hosts.getHerokuapp();
    }

    @Before(value="@candymapper", order=0)
    public void getCandymapperHost() {
        host = hosts.getCandymapper();
    }

    @Before(order=1)
    public void openBrowser() {
        driver.get(host);
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }
}
