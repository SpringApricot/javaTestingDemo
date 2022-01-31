package com.example.seleniumdemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class CandymapperHomePage {

    @FindBy(id="popup-widget5132-cta")
    WebElement popupFindMyCandyButton;

    @FindBy(id="popup-widget5132")
    WebElement popup;

    public CandymapperHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickPopupFindMyCandy() {
        popupFindMyCandyButton.click();
    }

    public boolean isWelcomePopupDisplayed(){
        return popup.isDisplayed();
    }
}
