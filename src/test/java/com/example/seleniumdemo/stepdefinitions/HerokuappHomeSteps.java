package com.example.seleniumdemo.stepdefinitions;

import com.example.seleniumdemo.pages.HerokuappHomePage;
import io.cucumber.java.en.*;
import org.springframework.beans.factory.annotation.Autowired;

public class HerokuappHomeSteps {

    @Autowired
    private HerokuappHomePage homePage;

    @Given("^(?:.*) open(?:s|) the \"(.*)\" page$")
    public void openPage(String pageName) {
        switch(pageName){
            case "Login":
                homePage.clickFormAuthentication();
                break;
        }
    }
}
