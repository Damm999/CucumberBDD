package com.runner;

import java.io.IOException;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/java/featureFiles/" },
		glue = {"stepDefinitions" },
		monochrome = true, 
		tags = "@automationPractice",
		plugin = { "pretty",
				"html:target/cucumber",
				"json:target/cucumber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				/*"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-extent-report.html"*/})
public class MainRunner{
	
	@AfterClass
	public static void writeExtentReport() throws IOException {
		
		
		//E.loadXMLConfig(new File("./src/main/java/utils/extent-config.xml"));
		//SeleniumHelper.copyLatestExtentReport();
	}
	


}
