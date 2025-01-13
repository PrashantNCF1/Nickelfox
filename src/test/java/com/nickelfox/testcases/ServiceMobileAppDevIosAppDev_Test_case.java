package com.nickelfox.testcases;

import java.awt.AWTException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nickelfox.baseclass.BaseClass;
import com.nickelfox.pages.Contact_with_us_Page;
import com.nickelfox.pages.Service_Page;



public class ServiceMobileAppDevIosAppDev_Test_case extends BaseClass{
	
	Service_Page spo;
	Contact_with_us_Page cp;
	
	@BeforeMethod
	void beforeMethod() throws InterruptedException, AWTException {
		launcTheBrowser();
		spo = new Service_Page(driver);
		cp = new Contact_with_us_Page(driver);
	} 

	@Test(priority = 1, enabled = true)
	public void VerfySvcMobileAppDevIosAppDevLtsDscYourPoject() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrvcIosAppDev();
		spo.clickSrvcIosAppDevLtsDscYourPoject();
		cp.fillContactForm(driver);
		cp.checkSuccesfulMsg(driver);
	}
	
	@Test(priority = 2, enabled = true)
	public void VerfySvcMobileAppDevIosAppDevLtsCollabrate() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrvcIosAppDev();
		spo.clickSrvcIosAppDevLtsCollabrate();
		cp.fillContactForm(driver);
		cp.checkSuccesfulMsg(driver);
	}
	
	@Test(priority = 3, enabled = true)
	public void VerfySvcMobileAppDevIosAppDevConectWithExprt() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrvcIosAppDev();
		spo.clickSrvcIosAppDevConectWithExprt();
		cp.fillContactForm(driver);
		cp.checkSuccesfulMsg(driver);
	}
	
	@Test(priority = 4, enabled = true)
	public void VerfySvcMobileAppDevIosAppDevConectUs() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrvcIosAppDev();
		spo.clickSrvcIosAppDevConectUs();
		cp.fillContactForm(driver);
		cp.checkSuccesfulMsg(driver);
	}
	
	@Test(priority = 5, enabled = true)
	public void VerfySvcMobileAppDevIosAppDevGetUsOnBoard() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrvcIosAppDev();
		spo.clickSrvcIosAppDevGetUsOnBoard();
		cp.fillContactForm(driver);
		cp.checkSuccesfulMsg(driver);
	}
	
}
