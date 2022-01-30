package com.example.seleniumdemo.hooks;

import com.example.seleniumdemo.SpringContextConfiguration;
import io.cucumber.java.*;
import io.cucumber.spring.CucumberContextConfiguration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = {SpringContextConfiguration.class})
public class generalHooks {

    @Autowired
    private WebDriver driver;

    @Before
    public void openBrowser() {
        driver.get("https://soraia.herokuapp.com");
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }
}
