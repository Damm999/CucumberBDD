package stepDefinitions;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class AutomationPracticeSteps extends DriverFactory {
	@Given("^I acess website$")
	public void i_acess_website() throws Throwable {
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
	    List<List<String>> details = userDetails.raw();
	    ap_regPage.registerUser(details);
	}

	@Then("^I validate that I registered successfully$")
	public void i_validate_that_I_registered_successfully() throws Throwable {
	   ap_regPage.validateSuccessfulRegistration();
	}

}
