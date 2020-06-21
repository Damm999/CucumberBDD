package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverFactory;

public class NewToursSteps extends DriverFactory {
	@Given("^I navigate to new tours$")
	public void i_navigate_to() throws Throwable {
	}

	@When("^I check on registration button$")
	public void i_check_on_registration_button() throws Throwable {
		newToursPage.navigateToRegistrationPage();
	}

	@When("^I enter first name as \"([^\"]*)\"$")
	public void i_enter_first_name_as(String fName ) throws Throwable {
		newToursPage.enterFirstName(fName);
	}

	@When("^I enter last name as \"([^\"]*)\"$")
	public void i_enter_last_name_as(String lName) throws Throwable {
		newToursPage.enterlasttName(lName);
	}

	@When("^I enter Phone number as \"([^\"]*)\"$")
	public void i_enter_Phone_number_as(String pNo) throws Throwable {
		newToursPage.enterPhoneNumber(pNo);
	}

	@When("^I enter email address as \"([^\"]*)\"$")
	public void i_enter_email_address_as(String email) throws Throwable {
		newToursPage.enterEmailAddress(email);
	}

	@When("^I enter Address as \"([^\"]*)\"$")
	public void i_enter_Address_as(String address) throws Throwable {
		newToursPage.enterAddressLine(address);
	}

	@When("^I enter city as \"([^\"]*)\"$")
	public void i_enter_city_as(String city) throws Throwable {
		newToursPage.enterCityName(city);
	}

	@When("^I enter state name as \"([^\"]*)\"$")
	public void i_enter_state_name_as(String state) throws Throwable {
		newToursPage.enterState(state);
	}

	@When("^I enter postal code name as \"([^\"]*)\"$")
	public void i_enter_postal_code_name_as(String pCode) throws Throwable {
		newToursPage.enterPostalCode(pCode);
	}

	@When("^I select country as \"([^\"]*)\"$")
	public void i_select_country_as(String country) throws Throwable {
		newToursPage.selectCountry(country);
	}

	@When("^I enter user name as \"([^\"]*)\"$")
	public void i_enter_user_name_as(String userName) throws Throwable {
		newToursPage.enterUserName(userName);
	}

	@When("^I give password for user as \"([^\"]*)\"$")
	public void i_give_password_for_user_as(String password) throws Throwable {
		newToursPage.enterPassword(password);
	}

	@When("^I enter retype password as \"([^\"]*)\"$")
	public void i_enter_retype_password_as(String cPass) throws Throwable {
		newToursPage.enterConfromPassword(cPass);
	}

	@When("^I click on Submit$")
	public void i_click_on_Submit() throws Throwable {
		newToursPage.register();
	}

	@Then("^user should be registered$")
	public void user_should_be_registered() throws Throwable {
		newToursPage.validateRegistration();
	}

}
