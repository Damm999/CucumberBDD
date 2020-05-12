package com.runner;

import java.io.File;
import java.io.IOException;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import helper.SeleniumHelper;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/java/featureFiles/" },
		glue = {"stepDefinitions" },
		monochrome = true, 
		tags = {},
		plugin = { "pretty",
				"html:target/cucumber",
				"json:target/cucumber.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-extent-report.html"})
public class MainRunner extends AbstractTestNGCucumberTests{
	
	@AfterClass
	public static void writeExtentReport() throws IOException {
		
		
		Reporter.loadXMLConfig(new File("./src/main/java/utils/extent-config.xml"));
		SeleniumHelper.copyLatestExtentReport();
	}
	


}
