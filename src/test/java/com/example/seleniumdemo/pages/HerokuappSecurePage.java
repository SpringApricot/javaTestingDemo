package com.example.seleniumdemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class HerokuappSecurePage {

    @FindBy(id = "flash")
    WebElement messageDiv;

    public HerokuappSecurePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String getMessage() {
        return this.messageDiv.getText().split("\n")[0];
    }
}
