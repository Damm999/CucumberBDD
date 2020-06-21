package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import helper.SeleniumHelper;

public class AA_SearchResultsPage extends SeleniumHelper{

	public @FindBy(css = "#flight-0 div #wcaMainContent")
	WebElement depLabel;
	
	public @FindBy(id = "airasia-breadcrumb-span-select-link-heatmap")
	WebElement searchFilghtsIcon;
	
	public void verifySearchPage() {
		Assert.assertTrue(isElementPresent(depLabel));
		Assert.assertTrue(isElementPresent(searchFilghtsIcon));
	}
	
	
}
