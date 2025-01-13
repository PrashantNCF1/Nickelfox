package com.nickelfox.testcases;


import java.awt.AWTException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nickelfox.baseclass.BaseClass;
import com.nickelfox.pages.Contact_with_us_Page;
import com.nickelfox.pages.Service_Page;

public class ServiceMobileAppDevWearableAppDev_Test_case extends BaseClass{
	
	
	Service_Page spo;
	Contact_with_us_Page cp;
	
	@BeforeMethod
	void beforeMethod() throws InterruptedException, AWTException {
		launcTheBrowser();
		spo = new Service_Page(driver);
		cp = new Contact_with_us_Page(driver);
	} 
	

	@Test(priority = 1, enabled = true)
	public void VerfySvcMobileAppDevWearableAppDevClaimFreeCnsltToday() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrvcclickWearableAppDev();
		spo.clickSrvcWearableAppDevClaimFreeCnsltToday();
		cp.fillContactForm(driver);
		cp.checkSuccesfulMsg(driver);
	}
	
	@Test(priority = 2, enabled = true)
	public void VerfySvcMobileAppDevWearableAppDevContactUs() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrvcclickWearableAppDev();
		spo.clickSrvcWearableAppDevContactUs();
		cp.fillContactForm(driver);
		cp.checkSuccesfulMsg(driver);
	}
	
	@Test(priority = 3, enabled = true)
	public void VerfySvcMobileAppDevWearableAppDevContactWithUs() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrvcclickWearableAppDev();
		spo.clickSrvcWearableAppDevContactWithUs();
		cp.fillContactForm(driver);
		cp.checkSuccesfulMsg(driver);
	}
	
	@Test(priority = 4, enabled = true)
	public void VerfySvcMobileAppDevWearableAppDevContactWithUs1() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrvcclickWearableAppDev();
		spo.clickSrvcWearableAppDevContactWithUs1();
		cp.fillContactForm(driver);
		cp.checkSuccesfulMsg(driver);
	}
	
	
	@Test(priority = 5, enabled = true)
	public void VerfySvcMobileAppDevWearableAppDevGetUsOnBoard() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrvcclickWearableAppDev();
		spo.clickSrvcWearableAppDevGetUsOnBoard();
		cp.fillContactForm(driver);
		cp.checkSuccesfulMsg(driver);
	}
	
	@Test(priority = 6, enabled = true)
	public void VerfySvcMobileAppDevcWearableAppDevPartnerWithUs() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrvcclickWearableAppDev();
		spo.clickSrvcWearableAppDevPartnerWithUs();
		cp.fillContactForm(driver);
		cp.checkSuccesfulMsg(driver);
	}	

}
