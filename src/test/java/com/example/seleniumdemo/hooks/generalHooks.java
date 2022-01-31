package com.example.seleniumdemo.hooks;

import com.example.seleniumdemo.SpringContextConfiguration;
import com.example.seleniumdemo.config.SeleniumDemoProperties;
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
    private SeleniumDemoProperties properties;

    @Before
    public void openBrowser() { driver.get(properties.getHost()); }

    @After
    public void closeBrowser() {
        driver.quit();
    }
}
