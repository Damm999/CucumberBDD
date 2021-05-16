package helper;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.Scenario;
import utils.DriverFactory;

public class SeleniumHelper extends DriverFactory {

	//private static String screenshotName;

	/**
	 * @param element
	 * @return Method to click By element
	 */
	public boolean clickElement(By element) {
		boolean check = false;

		try {
			waitForElementVisible(element);
			driver.findElement(element).click();
			check = true;
		} catch (Exception e) {
			System.out.println("Element was not clickable due to: " + e.toString());
			Assert.fail("Element was not clickable due to: " + e.toString());
		}
		return check;
	}

	/**
	 * @param element
	 * @return Method to click WebElement
	 */
	public boolean clickElement(WebElement element) {
		boolean check = false;

		try {
			waitForElementVisible(element);
			(element).click();
			check = true;
		} catch (Exception e) {
			System.out.println("Element was not clickable due to: " + e.toString());
			Assert.fail("Element was not clickable due to: " + e.toString());
		}
		return check;
	}

	/**
	 * @param element
	 * @return Method to click WebElement
	 */
	public boolean jsClickElement(WebElement element) {
		boolean check = false;

		try {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", element);
			check = true;
		} catch (Exception e) {
			System.out.println("Element was not clickable due to: " + e.toString());
			Assert.fail("Element was not clickable due to: " + e.toString());
		}
		return check;
	}

	/**
	 * Method to wait for By element to be visible
	 * 
	 * @param element
	 */
	public void waitForElementVisible(By element) {
		try {
			WebElement webEle = driver.findElement(element);
			wait.until(ExpectedConditions.visibilityOf(webEle));
		} catch (Exception e) {
			System.out.println("Unable to waitForElementVisible due to: " + e.toString());
			Assert.fail("Unable to waitForElementVisible due to: " + e.toString());
		}
	}

	/**
	 * Method to wait for Web-Element to be visible
	 * 
	 * @param element
	 */
	public void waitForElementVisible(WebElement element) {
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			System.out.println("Unable to waitForElementVisible due to: " + e.toString());
			Assert.fail("Unable to waitForElementVisible due to: " + e.toString());
		}
	}

	/**
	 * Method to send Keys to an By element
	 * 
	 * @param element
	 * @param text
	 * @return
	 */
	public boolean sendKeys(By element, String text) {
		boolean check = false;

		try {
			waitForElementVisible(element);
			driver.findElement(element).sendKeys(text);
			check = true;
		} catch (Exception e) {
			System.out.println("Unable to send keys to element due to: " + e.toString());
			Assert.fail("Unable to send keys to element due to: " + e.toString());
		}
		return check;
	}

	/**
	 * Method to send keys to Web-Element
	 * 
	 * @param element
	 * @param text
	 * @return
	 */
	public boolean sendKeys(WebElement element, String text) {
		boolean check = false;

		try {
			waitForElementVisible(element);
			(element).sendKeys(text);
			check = true;
		} catch (Exception e) {
			System.out.println("Unable to send keys to element due to: " + e.toString());
			Assert.fail("Unable to send keys to element due to: " + e.toString());
		}
		return check;
	}

	/**
	 * @return Method to accept Alert
	 */
	public boolean acceptAlert() {
		boolean check = false;

		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
			check = true;
		} catch (Exception e) {
			System.out.println("Unable to accept alert due to: " + e.toString());
			Assert.fail("Unable to accept alert due to: " + e.toString());
		}
		return check;
	}

	/**
	 * @return Method to get Text from Alert
	 */
	public String getTextFromAlert() {
		String text = "";

		try {
			Alert alert = driver.switchTo().alert();
			text = alert.getText();
		} catch (Exception e) {
			System.out.println("Unable to get Text from alert due to: " + e.toString());
			Assert.fail("Unable to get Text from alert due to: " + e.toString());
		}
		return text;
	}

	/**
	 * Method to get Text from an element
	 * 
	 * @param ele
	 * @return
	 */
	public String getText(By ele) {
		String text = "";
		try {
			text = driver.findElement(ele).getText();
		} catch (Exception e) {
			System.out.println("Unable to get Text from element due to: " + e.toString());
			Assert.fail("Unable to get Text from element due to: " + e.toString());
		}
		return text;
	}

	/**
	 * Method to get Text from Web element
	 * 
	 * @param ele
	 * @return
	 */
	public String getText(WebElement ele) {
		String text = "";
		try {
			text = (ele).getText();
		} catch (Exception e) {
			System.out.println("Unable to get Text from element due to: " + e.toString());
			Assert.fail("Unable to get Text from element due to: " + e.toString());
		}
		return text;
	}

	/**
	 * Method to get text form Model.
	 * 
	 * @param ele
	 * @return
	 */
	public String getTextFromModel(WebElement ele) {
		driver.switchTo().activeElement();
		waitForElementVisible(ele);
		return ele.getText();
	}

	/**
	 * Method to get text form Model.
	 * 
	 * @param ele
	 * @return
	 */
	public String getTextFromModel(By ele) {
		driver.switchTo().activeElement();
		waitForElementVisible(ele);
		return driver.findElement(ele).getText();
	}

	/**
	 * Method to get Attribute from an element
	 * 
	 * @param ele
	 * @return
	 */
	public String getAttribute(By ele, String attribute) {
		String text = "";
		try {
			text = driver.findElement(ele).getAttribute(attribute);
		} catch (Exception e) {
			System.out.println("Unable to get Attribute from element due to: " + e.toString());
			Assert.fail("Unable to get Attribute from element due to: " + e.toString());
		}
		return text;
	}

	/**
	 * Method to get Attribute from Web-element
	 * 
	 * @param ele
	 * @return
	 */
	public String getAttribute(WebElement ele, String attribute) {
		String text = "";
		try {
			text = ele.getAttribute(attribute);
		} catch (Exception e) {
			System.out.println("Unable to get Attribute from element due to: " + e.toString());
			Assert.fail("Unable to get Attribute from element due to: " + e.toString());
		}
		return text;
	}

	/**
	 * Method to check if element is present in the page.
	 * 
	 * @param ele
	 * @return
	 */
	public boolean isElementPresent(By ele) {
		boolean check = false;
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(ele));
			check = true;
		} catch (NoSuchElementException e) {
			System.out.println("Element is not present in the page due to: " + e.toString());
			Assert.fail("Element is not present in the page due to: " + e.toString());
		}
		return check;
	}

	/**
	 * Method to check if element is present.
	 * 
	 * @param ele
	 * @return
	 */
	public boolean isElementPresent(WebElement ele) {
		boolean check = false;
		try {
			ele.isDisplayed();
			check = true;
		} catch (NoSuchElementException e) {
			System.out.println("Element is not present in the page due to: " + e.toString());
			Assert.fail("Element is not present in the page due to: " + e.toString());
		}
		return check;
	}
	
	/**
	 * Method to select dropdown by By-element Visible Text
	 * 
	 * @param ele
	 * @param text
	 */
	public void selectByValue(By ele, String value) {
		Select sel = new Select(driver.findElement(ele));
		sel.selectByValue(value);
	}
	
	/**
	 * Method to select dropdown by Web-Element Visible Text
	 * 
	 * @param ele
	 * @param text
	 */
	public void selectByValue(WebElement ele, String value) {
		Select sel = new Select(ele);
		sel.selectByValue(value);
	}


	/**
	 * Method to select dropdown by By-element Visible Text
	 * 
	 * @param ele
	 * @param text
	 */
	public void selectByText(By ele, String text) {
		Select sel = new Select(driver.findElement(ele));
		sel.selectByVisibleText(text);
	}

	/**
	 * Method to select dropdown by Web-Element Visible Text
	 * 
	 * @param ele
	 * @param text
	 */
	public void selectByText(WebElement ele, String text) {
		Select sel = new Select(ele);
		sel.selectByVisibleText(text);
	}

	public void enableRadioButton(By ele) {
		try {
			WebElement element = driver.findElement(ele);
			if (!element.isEnabled()) {
				element.click();
			}
		} catch (Exception e) {
			System.out.println("Unable to select radio button due to: " + e.toString());
			Assert.fail("Unable to select radio button due to: " + e.toString());
		}
	}

	public void enableRadioButton(WebElement ele) {
		try {
			if (!ele.isEnabled()) {
				ele.click();
			}
		} catch (Exception e) {
			System.out.println("Unable to select radio button due to: " + e.toString());
			Assert.fail("Unable to select radio button due to: " + e.toString());
		}
	}

	// ........................... Extent Report......................

	// .................Using infocakes with vimal...........................
	
	/*public static String returnDateStamp(String fileExtension) {
		Date date = new Date();
		Timestamp ts = new Timestamp(date.getTime());
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH_mm_ss");
		System.out.println(formatter.format(ts));

		return formatter.format(ts) + fileExtension;
	}

	public static void captureScreenshot() throws IOException {
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		screenshotName = returnDateStamp(".jpg");
		FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir") + "\\output\\images\\" + screenshotName));

		Reporter.addStepLog("Taking a screenshot");
		Reporter.addStepLog("<br>");
		Reporter.addStepLog("<a target=\"_blank\" href=" + returnScreenShotName() + "><img src="
				+ returnScreenShotName() + "  height=200 width=300 /></a>");
	}
*/
	/*private static String returnScreenShotName() {
		return System.getProperty("user.dir") + "\\output\\images\\" + screenshotName;
	}*/

	/**
	 * @param src
	 * @param des
	 * @throws IOException
	 */
	/*private static void copyFileUSingStream(File src, File des) throws IOException {
		InputStream input = null;
		OutputStream output = null;

		try {
			input = new FileInputStream(src);
			output = new FileOutputStream(des);
			byte[] buffer = new byte[1024];
			int lenght;

			while ((lenght = input.read(buffer)) > 0) {
				output.write(buffer, 0, lenght);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Copying action failed in copyFileUSingStream() due to: " + e.toString());
		} finally {
			input.close();
			output.close();
		}
	}

	public static void copyLatestExtentReport() throws IOException {
		Date d = new Date();
		String date = d.toString().replace(":", "_").replace(" ", "_");
		File src = new File("./target/cucumber-extent-report.html");
		System.out.println(src.getAbsolutePath());
		File des = new File("./output/" + date + ".html");
		copyFileUSingStream(src, des);
	}*/
	
	
	
	// ............Using cucumber.io along with cucumber-extent-report-adapter//
	
	public static void captureScreenshot(Scenario sc) throws IOException {
		String methodStatus = sc.isFailed()?"Failed":"Passed";
		byte[] imageBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		sc.attach(imageBytes, "image/png", methodStatus);

	}
}
