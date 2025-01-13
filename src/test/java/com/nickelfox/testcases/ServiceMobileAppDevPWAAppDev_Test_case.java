package com.nickelfox.testcases;

import java.awt.AWTException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nickelfox.baseclass.BaseClass;
import com.nickelfox.pages.Contact_with_us_Page;
import com.nickelfox.pages.Service_Page;


public class ServiceMobileAppDevPWAAppDev_Test_case extends BaseClass{
	
	
	Service_Page spo;
	Contact_with_us_Page cp;
	
	@BeforeMethod
	void beforeMethod() throws InterruptedException, AWTException {
		launcTheBrowser();
		spo = new Service_Page(driver);
		cp = new Contact_with_us_Page(driver);
	} 
	
	

	@Test(priority = 1, enabled = true)
	public void VerfySvcMobileAppDevPWAAppDevContactUsNow() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrvcPWAAppDev();
		spo.clickSrvcPWAAppDevContactUsNow();
		cp.fillContactForm(driver);
		cp.checkSuccesfulMsg(driver);
	}
	
	@Test(priority = 2, enabled = true)
	public void VerfySvcMobileAppDevPWAAppDevGetStrtToday() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrvcPWAAppDev();
		spo.clickSrvcPWAAppDevGetStrtToday();
		cp.fillContactForm(driver);
		cp.checkSuccesfulMsg(driver);
	}

	@Test(priority = 3, enabled = true)
	public void VerfySvcMobileAppDevPWAAppDevReachOutToUs() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrvcPWAAppDev();
		spo.clickSrvcPWAAppDevReachOutToUs();
		cp.fillContactForm(driver);
		cp.checkSuccesfulMsg(driver);
	}
	
	@Test(priority = 4, enabled = true)
	public void VerfySvcMobileAppDevPWAAppDevContactUsForTailoredSolutions() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrvcPWAAppDev();
		spo.clickSrvcPWAAppDevContactUsForTailoredSolutions();
		cp.fillContactForm(driver);
		cp.checkSuccesfulMsg(driver);
	}
	
	
	@Test(priority = 5, enabled = true)
	public void VerfySvcMobileAppDevPWAAppDevGetExpsOnBoard() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrvcPWAAppDev();
		spo.clickSrvcPWAAppDevGetExpsOnBoard();
		cp.fillContactForm(driver);
		cp.checkSuccesfulMsg(driver);
	}

}
