package com.nickelfox.testcases;

import java.awt.AWTException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.nickelfox.baseclass.BaseClass;
import com.nickelfox.pages.Contact_with_us_Page;
import com.nickelfox.pages.Industries_Page;

public class Industries_Page_Test extends BaseClass{

	Industries_Page Industries;
	Contact_with_us_Page cp;

	@BeforeMethod
	void beforeMethod() throws InterruptedException, AWTException {
		launcTheBrowser();
		Industries= new Industries_Page(driver);
		cp = new Contact_with_us_Page(driver);
	} 

	@Test(priority = 1, enabled = true)

	public void go_contact_page() throws InterruptedException, AWTException {
		Industries.Go_HealthCatre(driver);
		cp.fillContactForm(driver);
		cp.subtBTN();
		cp.checkSuccesfulMsg(driver);	
	}	

} 




