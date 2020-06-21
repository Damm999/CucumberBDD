package stepDefinitions;

import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import helper.SeleniumHelper;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverFactory;

public class AutomationPracticeSteps extends DriverFactory {
	Scenario sc;

	@Before
	public void beforeStep(Scenario scenario) {
		this.sc = scenario;
	}

	@Given("^I acess website$")
	public void i_acess_website() throws Throwable {
		sc.log("Adding scenario report steps...........");
		SeleniumHelper.captureScreenshot(sc);
		//sc.attach(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png", "FailedScreenshot");
	}

	@When("^I click on reigster link from homepage$")
	public void i_click_on_reigster_link_from_homepage() throws Throwable {
		automationPracPage.navigateToRegistrationPage();
	}

	@When("^I enter a email address as \"([^\"]*)\"$")
	public void i_enter_a_email_address_as(String email) throws Throwable {
		automationPracPage.enterEmailAddress(email);
	}

	@When("^I click on Create Account Button$")
	public void i_click_on_Create_Account_Button() throws Throwable {
		automationPracPage.createAccount();
	}

	@Then("^I validate Registraiton Page$")
	public void i_validate_Registraiton_Page() throws Throwable {
		ap_regPage.validateRegPage();
	}

	@Then("^I enter detials$")
	public void i_enter_detials(DataTable userDetails) throws Throwable {
		List<List<String>> details = userDetails.asLists();
		ap_regPage.registerUser(details);
	}

	@Then("^I validate that I registered successfully$")
	public void i_validate_that_I_registered_successfully() throws Throwable {
		ap_regPage.validateSuccessfulRegistration();
	}

}
