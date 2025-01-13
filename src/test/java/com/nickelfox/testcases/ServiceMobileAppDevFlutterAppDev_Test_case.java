package com.nickelfox.testcases;

import java.awt.AWTException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nickelfox.baseclass.BaseClass;
import com.nickelfox.pages.Contact_with_us_Page;
import com.nickelfox.pages.Service_Page;



public class ServiceMobileAppDevFlutterAppDev_Test_case extends BaseClass{
	
	
	Service_Page spo;
	Contact_with_us_Page cp;
	
	@BeforeMethod
	void beforeMethod() throws InterruptedException, AWTException {
		launcTheBrowser();
		spo = new Service_Page(driver);
		cp = new Contact_with_us_Page(driver);
	} 
	

	@Test(priority = 1, enabled = true)
	public void VerfySvcMobileAppDevFlutterAppDevPartnerWithus() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrvcFlutterApp();
		spo.clickSrvcFlutterAppPartnerWithus();
		cp.fillContactForm(driver);
		cp.checkSuccesfulMsg(driver);
	}
	
	@Test(priority = 2, enabled = true)
	public void VerfySvcMobileAppDevc() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrvcFlutterApp();
		spo.clickSrvcFlutterAppLetsGetStart();
		cp.fillContactForm(driver);
		cp.checkSuccesfulMsg(driver);
	}
	
	@Test(priority = 3, enabled = true)
	public void VerfySvcMobileAppDevFlutterAppInteractWithUs() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrvcFlutterApp();
		spo.clickSrvcFlutterAppInteractWithUs();
		cp.fillContactForm(driver);
		cp.checkSuccesfulMsg(driver);
	}
	
	@Test(priority = 4, enabled = true)
	public void VerfySvcMobileAppDevFlutterAppConnectWithExp() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrvcFlutterApp();
		spo.clickSrvcFlutterAppConnectWithExp();
		cp.fillContactForm(driver);
		cp.checkSuccesfulMsg(driver);
	}
	
}
