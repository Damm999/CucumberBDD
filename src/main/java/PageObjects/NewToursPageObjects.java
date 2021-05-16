package PageObjects;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import helper.SeleniumHelper;

public class NewToursPageObjects extends SeleniumHelper {

	public @FindBy(xpath = "//a[contains(text(),'REGISTER')]") WebElement registerLink;

	public @FindBy(name = "firstName") WebElement firstNameTextBox;

	public @FindBy(name = "lastName") WebElement lastNameTextBox;

	public @FindBy(name = "phone") WebElement phoneNumberTextBox;

	public @FindBy(name = "userName") WebElement emailTextBox;

	public @FindBy(name = "address1") WebElement addressLine1;

	public @FindBy(name = "city") WebElement cityTextBox;

	public @FindBy(name = "state") WebElement stateTextBox;

	public @FindBy(name = "postalCode") WebElement postalCodeTextBox;

	public @FindBy(name = "country") WebElement countryDropDown;

	public @FindBy(css = "#email") WebElement userNameTextBox;

	public @FindBy(name = "password") WebElement passwordTextBox;

	public @FindBy(name = "confirmPassword") WebElement conformPassTextBox;

	public @FindBy(name = "submit") WebElement submitButton;
	
	public @FindBy(xpath = "(//font)[5]") WebElement thankYouLabel;
	
	public void getWebsite(String url) {
		driver.get(url);
	}

	public void navigateToRegistrationPage() {
		clickElement(registerLink);
	}

	public void enterFirstName(String fName) {
		sendKeys(firstNameTextBox, fName);
	}

	public void enterlasttName(String lName) {
		sendKeys(lastNameTextBox, lName);
	}

	public void enterPhoneNumber(String pNo) {
		sendKeys(phoneNumberTextBox, pNo);
	}

	public void enterEmailAddress(String email) {
		sendKeys(emailTextBox, email);
	}

	public void enterAddressLine(String address) {
		sendKeys(addressLine1, address);
	}

	public void enterCityName(String city) {
		sendKeys(cityTextBox, city);
	}

	public void enterState(String state) {
		sendKeys(stateTextBox, state);
	}

	public void enterPostalCode(String pCode) {
		sendKeys(postalCodeTextBox, pCode);
	}

	public void selectCountry(String country) {
		selectByText(countryDropDown, country.toUpperCase());
	}

	public void enterUserName(String userName) {
		String gen = RandomStringUtils.randomAlphabetic(3);
		sendKeys(userNameTextBox, userName + gen);
	}

	public void enterPassword(String password) {
		sendKeys(passwordTextBox, password);
	}

	public void enterConfromPassword(String cPass) {
		sendKeys(conformPassTextBox, cPass);
	}

	public void register() {
		clickElement(submitButton);
	}

	public void validateRegistration() {
		Assert.assertTrue(isElementPresent(thankYouLabel));
	}
}
