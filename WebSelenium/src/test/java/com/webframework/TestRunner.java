package com.webframework;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
plugin = {
        "pretty",
        "html:target/cucumber-reports/cucumber.html",
        "json:target/cucumber-report/cucumber.json"
        },
        features ={"src/test/resources/features"},
        glue= { "com.webframework.StepDefination"}
)


public class TestRunner extends AbstractTestNGCucumberTests{

}
