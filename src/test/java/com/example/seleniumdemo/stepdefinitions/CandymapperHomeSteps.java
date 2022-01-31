package com.example.seleniumdemo.stepdefinitions;

import com.example.seleniumdemo.pages.CandymapperHomePage;
import io.cucumber.java.en.*;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.*;

public class CandymapperHomeSteps {

    @Autowired
    CandymapperHomePage homePage;

    @Given("^the Welcome popup is displayed$")
    public void popupIsDisplayed() {
        assertThat(homePage.isWelcomePopupDisplayed()).isEqualTo(true);
    }

    @When("^(?:.*) click(?:s|) the Find My Candy button on the Welcome popup$")
    public void pressButtonOnPopup(){
        homePage.clickPopupFindMyCandy();
    }

    @Then("^the popup is closed$")
    public void popupIsClosed() {
        assertThat(homePage.isWelcomePopupDisplayed()).isEqualTo(false);
    }
}
