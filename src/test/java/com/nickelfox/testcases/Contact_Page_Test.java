package com.nickelfox.testcases;

import java.awt.AWTException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.nickelfox.baseclass.BaseClass;
import com.nickelfox.pages.Contact_Page;
import com.nickelfox.pages.Contact_with_us_Page;

public class Contact_Page_Test extends BaseClass{

	Contact_Page contact;
	Contact_with_us_Page cp;

	@BeforeMethod
	void beforeMethod() throws InterruptedException, AWTException {
		launcTheBrowser();
		contact= new Contact_Page(driver);
		cp = new Contact_with_us_Page(driver);
	} 
	@Test(priority = 1, enabled = true)

	public void go_contact_page() throws InterruptedException, AWTException {
		contact.move_contact_Page();
		cp.fillContactForm(driver);
		cp.subtBTN();
		cp.checkSuccesfulMsg(driver);
	}

}
