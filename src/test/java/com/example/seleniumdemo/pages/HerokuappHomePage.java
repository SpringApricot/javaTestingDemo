package com.example.seleniumdemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class HerokuappHomePage {

    @FindBy(linkText="Form Authentication")
    WebElement formAuthentication;

    public HerokuappHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickFormAuthentication() {
        formAuthentication.click();
    }
}
