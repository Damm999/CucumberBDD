package PageObjects;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helper.SeleniumHelper;

public class AutomationPracticePageObjects extends SeleniumHelper {

	public @FindBy(css = ".login")
	WebElement signInLink;
	
	public @FindBy(id="email_create")
	WebElement emailAddressTextBox;
	
	public @FindBy(id="SubmitCreate")
	WebElement  submitButton;
	
	
	public void openSite(String url) {
		driver.get(url);
	}
	
	public void navigateToRegistrationPage() {
		clickElement(signInLink);
	}
	
	public void enterEmailAddress(String email) {
		String before = email.split("@")[0] + RandomStringUtils.randomAlphabetic(3);
		email = before +"@" +email.split("@")[1];
		sendKeys(emailAddressTextBox, email);
	}
	
	public void createAccount() {
		clickElement(submitButton);
	}
}
