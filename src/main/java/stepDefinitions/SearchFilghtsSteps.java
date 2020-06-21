package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverFactory;

public class SearchFilghtsSteps extends DriverFactory {

	@Given("^I access the website$")
	public void i_access_website() throws Throwable {
	}

	@Given("^I Verify its TitleClick on \"([^\"]*)\" Icon$")
	public void i_Verify_its_TitleClick_on_Icon(String title) throws Throwable {
	    aa_HomePage.VerifyTitleClick(title);
	}

	@When("^Enter Origin as \"([^\"]*)\"$")
	public void enter_Origin_as(String fromStation) throws Throwable {
	   aa_HomePage.enterFromStation(fromStation);
	}

	@When("^Enter Destination as \"([^\"]*)\"$")
	public void enter_Destination_as(String toStation) throws Throwable {
	    aa_HomePage.enterToStation(toStation);
	}


	@When("^Select depart date as \"([^\"]*)\" also Select Return date as \"([^\"]*)\"$")
	public void select_depart_date_as_also_Select_Return_date_as(String depDate, String retType) throws Throwable {
	    aa_HomePage.selectDate(depDate,retType);
	}

	@When("^I Click on Search Button$")
	public void i_Click_on_Search_Button() throws Throwable {
	   aa_HomePage.searchFlights();
	}

	@Then("^Verify that you are navigated successfully to search flight page$")
	public void verify_that_you_are_navigated_successfully_to_search_flight_page() throws Throwable {
	    aa_SearchPage.verifySearchPage();
	}
	
	@When("^I click on login button$")
	public void i_click_on_login_button() throws Throwable {
	   aa_HomePage.signInPopUp();
	}

	@When("^I enter usernme as \"([^\"]*)\"$")
	public void i_enter_usernme_as(String emailAddress) throws Throwable {
	   aa_HomePage.enterEmailAddress(emailAddress);
	}

	@When("^I enter password as \"([^\"]*)\"$")
	public void i_enter_password_as(String password) throws Throwable {
	    aa_HomePage.enterPassword(password);
	}

	@When("^I click on Sign In button$")
	public void i_click_on_Sign_In_button() throws Throwable {
	    aa_HomePage.login();
	}

	@Then("^I verify that error messgae contains \"([^\"]*)\"$")
	public void i_verify_that_error_messgae_contains(String message) throws Throwable {
	    aa_HomePage.validateErrorMessage(message);
	}

}
