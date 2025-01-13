package com.nickelfox.testcases;

import java.awt.AWTException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.nickelfox.baseclass.BaseClass;
import com.nickelfox.pages.Contact_with_us_Page;

public class Contact_With_Us_Page_Test extends BaseClass {

	Contact_with_us_Page cp;

	@BeforeMethod
	void beforeMethod() throws InterruptedException, AWTException {
		launcTheBrowser();
		cp = new Contact_with_us_Page(driver);

	} 

	@Test(priority = 1, enabled = true)
	public void verifyContactFormSubmission() throws InterruptedException, AWTException {

		cp.ClickOnContact(driver);			
		cp.fillContactForm(driver);
		cp.subtBTN();
		cp.checkSuccesfulMsg(driver);	

	} 


//	@Test(priority = 2, enabled = true)
//	public void verifyMandatoryFieldValidation() throws InterruptedException {
//		
//		cp.ClickOnContact();
//		cp.verifyMandatoryFieldVald(driver);
//
//	}
//
//	@Test(priority = 3, enabled = true)
//	public void verifyInvalidEmailValidation() throws InterruptedException, AWTException {
//
//
//			cp.ClickOnContact();
//			cp.verifyInvalidEmailVld(driver);
//		
//	}

}
