package com.nickelfox.testcases;

import java.awt.AWTException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nickelfox.baseclass.BaseClass;
import com.nickelfox.pages.Contact_with_us_Page;
import com.nickelfox.pages.Service_Page;

public class ServiceMobileAppDevHybridAppDev_Test_case extends BaseClass{
	
	Service_Page spo;
	Contact_with_us_Page cp;
	
	@BeforeMethod
	void beforeMethod() throws InterruptedException, AWTException {
		launcTheBrowser();
		spo = new Service_Page(driver);
		cp = new Contact_with_us_Page(driver);
	}
	
	

	@Test(priority = 1, enabled = true)
	public void VerfySvcMobileAppDevHybridAppDevGoHybrid() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrvcHybridAppDev();
		spo.clickSrvcHybridAppDevGoHybrid();
		cp.fillContactForm(driver);
		cp.checkSuccesfulMsg(driver);
	}
	
	@Test(priority = 2, enabled = true)
	public void VerfySvcMobileAppDevHybridAppDevGetInTouch() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrvcHybridAppDev();
		spo.clickSrvcHybridAppDevGetInTouch();
		cp.fillContactForm(driver);
		cp.checkSuccesfulMsg(driver);
	}
	
	@Test(priority = 3, enabled = true)
	public void VerfySvcMobileAppDevHybridAppDevMakeAMoveWithNFX() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrvcHybridAppDev();
		spo.clickSrvcHybridAppDevMakeAMoveWithNFX();
		cp.fillContactForm(driver);
		cp.checkSuccesfulMsg(driver);
	}
	
	@Test(priority = 4, enabled = true)
	public void VerfySvcMobileAppDevHybridAppDevLtsWrkTogether() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrvcHybridAppDev();
		spo.clickSrvcHybridAppDevLtsWrkTogether();
		cp.fillContactForm(driver);
		cp.checkSuccesfulMsg(driver);
	}
	
	@Test(priority = 5, enabled = true)
	public void VerfySvcMobileAppDevHybridAppDevContactUsNow() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrvcHybridAppDev();
		spo.clickSrvcHybridAppDevContactUsNow();
		cp.fillContactForm(driver);
		cp.checkSuccesfulMsg(driver);
	}
	

}
