package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/java/featureFiles/" },
glue = {"stepDefinitions" },
monochrome = true, 
		 tags = "@automationPractice or @travel", 
plugin = { "pretty",
		"html:test-output/TestNG-Cucumber/cucumber.html",
		"json:test-output/TestNG-Cucumber/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class MainTestRunner extends AbstractTestNGCucumberTests {
	
}
