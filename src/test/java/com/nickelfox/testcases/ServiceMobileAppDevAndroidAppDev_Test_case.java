package com.nickelfox.testcases;

import java.awt.AWTException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.nickelfox.baseclass.BaseClass;
import com.nickelfox.pages.Contact_with_us_Page;
import com.nickelfox.pages.Service_Page;


public class ServiceMobileAppDevAndroidAppDev_Test_case extends BaseClass{
	
	Service_Page spo;
	Contact_with_us_Page cp;
	
	@BeforeMethod
	void beforeMethod() throws InterruptedException, AWTException {
		launcTheBrowser();
		spo = new Service_Page(driver);
		cp = new Contact_with_us_Page(driver);
	}

	@Test(priority = 1, enabled = true)
	public void VerfySvcMobileAppDevAndroidAppDevPartnerWithUs() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrvcAndroidAppDev();
		spo.clickSrvcAndroidAppDevPartnerWithUs();
		try {
			cp.fillContactForm(driver);
		} catch (InterruptedException | AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cp.checkSuccesfulMsg(driver);
	}
	
	@Test(priority = 2, enabled = true)
	public void VerfySvcMobileAppDevAndroidAppDevContactwithUs() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrvcAndroidAppDev();
		spo.clickSrvcAndroidAppDevContactwithUs();
		cp.fillContactForm(driver);
		cp.checkSuccesfulMsg(driver);
	}
	
	@Test(priority = 3, enabled = true)
	public void VerfySvcMobileAppDevAndroidAppDevContactwithUs2() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrvcAndroidAppDev();
		spo.clickSrvcAndroidAppDevContactwithUs2();
		cp.fillContactForm(driver);
		cp.checkSuccesfulMsg(driver);
	}
	
	@Test(priority = 4, enabled = true)
	public void VerfySvcMobileAppDevAndroidAppDevGetInTouchNow() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrvcAndroidAppDev();
		spo.clickSrvcAndroidAppDevGetInTouchNow();
		cp.fillContactForm(driver);
		cp.checkSuccesfulMsg(driver);
	}
	

}
