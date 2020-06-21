package PageObjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helper.SeleniumHelper;

public class AP_RegistrationPage extends SeleniumHelper {

	public @FindBy(id = "id_gender1") WebElement mrRadioButton;

	public @FindBy(id = "id_gender2") WebElement missRadioButton;

	public @FindBy(id = "customer_firstname") WebElement firstNameTextBox;

	public @FindBy(id = "customer_lastname") WebElement lastNameTextBox;

	public @FindBy(id = "passwd") WebElement passwordTextBox;

	public @FindBy(id = "days") WebElement dayDropDown;

	public @FindBy(id = "months") WebElement monthDropDown;

	public @FindBy(id = "years") WebElement yearsDropDown;

	public @FindBy(id = "company") WebElement companyTextBox;

	public @FindBy(id = "address1") WebElement addressLine1TextBox;

	public @FindBy(id = "city") WebElement cityTextBox;

	public @FindBy(id = "id_state") WebElement stateDropDown;

	public @FindBy(id = "postcode") WebElement postCodeTextBox;

	public @FindBy(id = "phone_mobile") WebElement mobilePhoneTextBox;

	public @FindBy(id = "alias") WebElement aliasAddress;

	public @FindBy(id = "submitAccount") WebElement submitButton;

	public @FindBy(css = ".logout") WebElement signOutLink;

	public void validateRegPage() {
		Assert.assertTrue(isElementPresent(firstNameTextBox));
		Assert.assertTrue(isElementPresent(lastNameTextBox));
		Assert.assertTrue(isElementPresent(submitButton));
	}

	public void registerUser(List<List<String>> details) {
		clickElement(mrRadioButton);
		sendKeys(firstNameTextBox, details.get(0).get(1));
		sendKeys(lastNameTextBox, details.get(0).get(2));
		sendKeys(passwordTextBox, details.get(0).get(3));

		selectByValue(dayDropDown, details.get(0).get(4));
		selectByValue(monthDropDown, details.get(0).get(5));
		selectByValue(yearsDropDown, details.get(0).get(6));

		sendKeys(companyTextBox, details.get(0).get(7));
		sendKeys(addressLine1TextBox, details.get(0).get(8));
		sendKeys(cityTextBox, details.get(0).get(9));
		selectByText(stateDropDown, details.get(0).get(10));
		sendKeys(postCodeTextBox, details.get(0).get(11));
		sendKeys(mobilePhoneTextBox, details.get(0).get(12));
		sendKeys(aliasAddress, details.get(0).get(13));

		clickElement(submitButton);

	}

	public void validateSuccessfulRegistration() {
		Assert.assertTrue(isElementPresent(signOutLink));
	}

}
