package com.nickelfox.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Contact_with_us_Page {

	@FindBy(xpath = "/html/body/div[1]/section/div/div[2]/div/div/div/div/div/div[1]/div/ul/li[8]/a")
	WebElement linkContact;

	@FindBy (xpath = "//iframe[@id='hs-form-iframe-0']")
	WebElement iframeContact;

	@FindBy (xpath="//input[@id='firstname-9659454b-817d-413c-9316-41e7a3524681']")
	WebElement txtFullName;

	@FindBy (name="email")
	WebElement txtEmail;

	@FindBy (name="country_code")
	WebElement txtCountrycode;

	@FindBy (xpath="//input[@id='mobilephone-9659454b-817d-413c-9316-41e7a3524681' and @name='mobilephone']")
	WebElement txtMobilenumber;

	@FindBy (name="message")
	WebElement txtMessage;

	@FindBy (xpath="//div[@class='hs_upload_file hs-upload_file hs-fieldtype-file field hs-form-field']")
	WebElement btnUpload;

	@FindBy (xpath = "//input[@value='Submit']")
	WebElement btnSubmit;

	@FindBy (xpath = "//div[@class='elementor-column elementor-col-100 elementor-top-column elementor-element elementor-element-28f8e4b2']//div[@class='elementor-widget-wrap elementor-element-populated']")
	WebElement txtSuccesss;

	@FindBy(xpath="(//*[@class=\"hs-error-msg hs-main-font-element\"])[1]")
	WebElement fullNameErrorMessage;

	@FindBy(xpath="(//*[@class=\"hs-error-msg hs-main-font-element\"])[2]")
	WebElement emailErrorMessage;

	@FindBy(xpath="//*[@class=\"hs-error-msg hs-main-font-element\"]")
	WebElement invalidEmailErrorMessage;


	@FindBy(xpath="(//*[@class=\"hs-error-msg hs-main-font-element\"])[3]")
	WebElement mesageErrorMessage;

	public Contact_with_us_Page(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void ClickOnContact(WebDriver driver) throws InterruptedException {
		
		//((JavascriptExecutor) driver).executeScript(
	         //   "document.evaluate(\"//li[@id='menu-item-28876']//a[normalize-space()='Contact']\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.focus();"
	       // );
		//Thread.sleep(3000);
		//linkContact.click();	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(linkContact));
		element.click();
		
      System.out.println("*********Verify Contact Form Submission*********");
		System.out.println("Navigating to Contact Page");
	}

	public void fillContactForm(WebDriver driver) throws InterruptedException, AWTException {
		Thread.sleep(10000);
		driver.switchTo().frame(iframeContact);
		txtFullName.sendKeys("Automation QA");
		System.out.println("enter the full name");
		txtEmail.sendKeys("automatar@nickelfox.com");
		System.out.println("enter the email id");
		txtCountrycode.sendKeys("91");
		System.out.println("enter the code");
		//Thread.sleep(3000);
		txtMobilenumber.sendKeys("9876543210");
		System.out.println("enter the mobile number");
	//	Thread.sleep(3000);
		txtMessage.sendKeys("This is QA automation please ignore this message.");
	
		Thread.sleep(4000);
//		btnUpload.click();
//		System.out.println("Click on the upload button");
//		// Copy the file path to the clipboard
//		copyToClipboard("D:\\D\\NIckelfox_2024\\Nickelfox\\Resume\\Color block resume.docx");
//
//		// Give a little delay to ensure the clipboard is ready (you can adjust this if necessary)
//		Thread.sleep(8000);
//
//		// Create a Robot instance to simulate key presses
//		Robot robot = new Robot();
//
//		// Press Ctrl+V to paste the file path
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//
//		// Press Enter to confirm
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	// Helper method to copy text to the system clipboard
//	private static void copyToClipboard(String text) {
//		StringSelection stringSelection = new StringSelection(text);
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
//		System.out.println("file selected");

	//}
		public void subtBTN() throws InterruptedException {
		Thread.sleep(8000);
		btnSubmit.click();
		System.out.println("click on the sbumit button");
	}

	public void checkSuccesfulMsg(WebDriver driver) throws InterruptedException {

		Thread.sleep(8000);
		driver.switchTo().defaultContent();
		WebElement succesMsg= txtSuccesss;
		System.out.println(succesMsg.getText());
	}

	public void verifyMandatoryFieldVald(WebDriver driver) throws InterruptedException {

		driver.switchTo().frame(iframeContact);
		btnSubmit.click();
		Thread.sleep(8000);
		String fNameMessage= fullNameErrorMessage.getText();
		Assert.assertEquals("Please complete this required field.", fNameMessage,
				"The expected error message was not displayed.");
		String emailErrMessage = emailErrorMessage.getText();
		Assert.assertEquals("Please complete this required field.", emailErrMessage,
				"The expected error message was not displayed.");
		String msgError= mesageErrorMessage.getText();
		Assert.assertEquals("Please complete this required field.", msgError,
				"The expected error message was not displayed.");

	}

	public void verifyInvalidEmailVld(WebDriver driver) throws InterruptedException, AWTException {

		Thread.sleep(5000);
		driver.switchTo().frame(iframeContact);
		txtFullName.sendKeys("Automation QA");
		txtEmail.sendKeys("kumar@.com");
		txtCountrycode.sendKeys("91");
		//Thread.sleep(3000);
		txtMobilenumber.sendKeys("9876543210");
		//Thread.sleep(3000);
		txtMessage.sendKeys("This is for testing purpose.");
		Thread.sleep(5000);
				btnSubmit.click();
			
		String invldEmailMessage = invalidEmailErrorMessage.getText();
		Assert.assertEquals("Email must be formatted correctly.", invldEmailMessage,
				"The expected error message was not displayed.");
	}

}
