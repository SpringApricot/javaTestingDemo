package com.example.seleniumdemo.stepdefinitions;

import com.example.seleniumdemo.pages.HerokuappLoginPage;
import io.cucumber.java.en.*;
import org.springframework.beans.factory.annotation.Autowired;

public class HerokuappLoginSteps {

    @Autowired
    private HerokuappLoginPage loginPage;

    @When("^(?:.*) fill(?:s|) the \"(.*)\" field with \"(.*)\"$")
    public void fillTheFieldWith(String field, String input) {
        //TODO: Create a dictionary or another form of neater association between field name and page action.
        switch (field) {
            case "username" -> loginPage.typeUsername(input);
            case "password" -> loginPage.typePassword(input);
        }
    }

    @When("^(?:.*) click(?:s|) on Login$")
    public void clickOnLoginButton() {
        loginPage.clickLogin();
    }
}
