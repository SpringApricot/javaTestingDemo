package com.example.seleniumdemo.stepdefinitions;

import com.example.seleniumdemo.pages.HerokuappSecurePage;
import io.cucumber.java.en.*;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.*;

public class HerokuappSecureSteps {

    @Autowired
    private HerokuappSecurePage securePage;

    @Then("^(?:.*) see(?:s|) the \"(.*)\" message$")
    public void SeeMessage(String message) {
        assertThat(this.securePage.getMessage()).isEqualTo(message);
    }
}
