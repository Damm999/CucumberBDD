package com.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/java/featureFiles/" },
		glue = {"stepDefinitions" },
		monochrome = true, 
				 tags = "@automationPractice or @travel", 
		plugin = { "pretty",
				"html:test-output/Junit-Cucumber/cucumber.html",
				"json:test-output/Junit-Cucumber/cucumber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				/*"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-extent-report.html"*/})
public class MainRunner{
	
	@AfterClass
	public static void writeExtentReport() throws IOException {
		//E.loadXMLConfig(new File("./src/main/java/utils/extent-config.xml"));
		//SeleniumHelper.copyLatestExtentReport();
	}
	


}
