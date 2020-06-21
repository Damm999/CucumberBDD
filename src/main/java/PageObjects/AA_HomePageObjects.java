package PageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.SeleniumHelper;

public class AA_HomePageObjects extends SeleniumHelper {

	public @FindBy(id = "product-tile-flight") WebElement flighTitleLink;

	public @FindBy(id = "product-tile-ourshop") WebElement ourshopTitleLink;

	public @FindBy(xpath = "//input[contains(@aria-label,'From  ')]") WebElement fromStationTextBox;

	public @FindBy(xpath = "//input[contains(@aria-label,'To  ')]") WebElement toStationTextBox;

	public @FindBy(xpath = "//input[contains(@aria-label,'Depart date')]") WebElement depDateTextBox;

	public @FindBy(xpath = "//input[contains(@aria-label,'Return date')]") WebElement retDateTextBox;

	public @FindBy(css = "div[aria-label='Clickable Search']") WebElement searchButton;

	public @FindBy(css = "#aaCalendar-header > div:nth-child(1) > div > div:nth-child(2) > div > div.css-1dbjc4n.r-1awozwy.r-s7fg5p.r-1q9bdsx.r-d045u9.r-1472mwg.r-1777fci.r-5f2r5o.r-lrsllp") WebElement oneWayButton;

	public @FindBy(id = "loginModal") WebElement signInLink;

	public @FindBy(id = "sso-login-email-input") WebElement emailTextBox;

	public @FindBy(id = "sso-login-password-input") WebElement passwordTextBox;

	public @FindBy(xpath = "//button[contains(text(),'Log in')]") WebElement loginButton;

	public @FindBy(xpath = "//div[@class='sso-error-message ng-star-inserted']/div") WebElement errorLabel;

	public AA_HomePageObjects() {
		super();
		PageFactory.initElements(driver, this);
	}

	public void openSite(String url) {
		driver.get(url);
	}

	public void VerifyTitleClick(String title) {
		String check = "";
		switch (title) {
		case "flights":
			check = getAttribute(flighTitleLink, "aria-selected");
			Assert.assertEquals("true", check);
			break;
		case "ourshop":
			check = getAttribute(ourshopTitleLink, "aria-selected");
			Assert.assertEquals("true", check);
			break;
		}

	}

	public void enterFromStation(String fromStation) throws AWTException, InterruptedException {
		Robot r = new Robot();
		sendKeys(fromStationTextBox, fromStation);
		Thread.sleep(6000);
		r.keyPress(KeyEvent.VK_ENTER);
	}

	public void enterToStation(String toStation) throws AWTException, InterruptedException {
		Robot r = new Robot();
		sendKeys(toStationTextBox, toStation);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
	}

	public void searchFlights() {
		jsClickElement(searchButton);
		clickElement(searchButton);
	}

	public void selectDate(String depDate, String retType) throws InterruptedException {
		Thread.sleep(3000);
		clickElement(depDateTextBox);
		switch (retType) {
		case "One Way":
			clickElement(oneWayButton);
			break;

		default:
			break;
		}
		Thread.sleep(3000);
		sendKeys(depDateTextBox, depDate);
		Thread.sleep(3000);
	}

	public void signInPopUp() {
		clickElement(signInLink);
	}

	public void enterEmailAddress(String emailAddress) {
		sendKeys(emailTextBox, emailAddress);
	}

	public void enterPassword(String password) {
		sendKeys(passwordTextBox, password);
	}

	public void login() {
		clickElement(loginButton);
	}

	public void validateErrorMessage(String message) {
		String text = getText(errorLabel);
		Assert.assertTrue(text.contains(message));
	}

}
