package com.example.seleniumdemo;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        glue = { "com.example.seleniumdemo.stepdefinitions",  "com.example.seleniumdemo.hooks"},
        features = "src/test/resources/features")
public class CucumberRunner extends AbstractTestNGCucumberTests {
}
