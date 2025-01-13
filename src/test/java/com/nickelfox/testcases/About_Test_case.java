package com.nickelfox.testcases;

import java.awt.AWTException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.nickelfox.baseclass.BaseClass;
import com.nickelfox.pages.About_Page;
import com.nickelfox.pages.Contact_with_us_Page;

public class About_Test_case extends BaseClass {

	Contact_with_us_Page cp;
	About_Page about;

	@BeforeMethod
	void beforeMethod() throws InterruptedException, AWTException {
		launcTheBrowser();
		cp = new Contact_with_us_Page(driver);
		about = new About_Page(driver);

	}

	@Test(priority = 1, enabled = true)
	public void verifyContactFormSubmissionAboutPage() throws InterruptedException, AWTException {


		about.clickAbout(driver);
		System.out.println("Start form filling");
		cp.fillContactForm(driver);
		cp.subtBTN();
		System.out.println("success submitd");
		cp.checkSuccesfulMsg(driver);

	}

	//@Test(priority = 2, enabled = true)
	public void VerifyGlobelTechWrkPlcTalkToUs() throws InterruptedException, AWTException {


		about.clickGreatPlaceToWork(driver);
		cp.fillContactForm(driver);
		cp.subtBTN();
		System.out.println("success submitd");
		cp.checkSuccesfulMsg(driver);

	}

	//@Test(priority = 3, enabled = true)
	public void VerifyGlobelTechWrkPlcTalkToUsMdtryFldValtion() throws InterruptedException {


		//
		about.clickGreatPlaceToWork(driver);
		cp.verifyMandatoryFieldVald(driver);
		//
	}
	//
	//@Test(priority = 4, enabled = true)
	//
	//public void VerifyGlobelTechWrkPlcTalkToUsInvalidEmlAddrs() throws InterruptedException, AWTException {

	//
	//		about.clickGreatPlaceToWork(driver);
	//		cp.verifyInvalidEmailVld(driver);

}


