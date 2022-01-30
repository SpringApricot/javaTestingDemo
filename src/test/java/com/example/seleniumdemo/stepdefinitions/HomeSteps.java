package com.example.seleniumdemo.stepdefinitions;

import com.example.seleniumdemo.pages.HomePage;
import io.cucumber.java.en.*;
import org.springframework.beans.factory.annotation.Autowired;

public class HomeSteps {

    @Autowired
    private HomePage homePage;

    @Given("^(?:.*) open(?:s|) the \"(.*)\" page$")
    public void openPage(String pageName) {
        switch(pageName){
            case "Login":
                homePage.clickFormAuthentication();
                break;
        }
    }
}
