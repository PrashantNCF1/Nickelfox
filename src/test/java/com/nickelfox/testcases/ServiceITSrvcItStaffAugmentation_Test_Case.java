package com.nickelfox.testcases;

import java.awt.AWTException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nickelfox.baseclass.BaseClass;
import com.nickelfox.pages.Contact_with_us_Page;
import com.nickelfox.pages.Service_Page;


public class ServiceITSrvcItStaffAugmentation_Test_Case extends BaseClass {
	
	Service_Page spo;
	Contact_with_us_Page cp;
	
	@BeforeMethod
	void beforeMethod() throws InterruptedException, AWTException {
		launcTheBrowser();
		spo = new Service_Page(driver);
		cp = new Contact_with_us_Page(driver);
	} 

	@Test(priority = 1, enabled = true)
	public void VerfySvcItSvcItStaffAugmention() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrcItStaffAugmention();
		spo.clickSrvcLetDiscussYurProject();
		cp.fillContactForm(driver);
		cp.checkSuccesfulMsg(driver);
	}
	
	@Test(priority = 2, enabled = true)
	public void VerfySvcItSvcLetUsYouKnowYrRequirment() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrcItStaffAugmention();
		spo.clickSrvcLetUsYouKnowYrRequirment();
		cp.fillContactForm(driver);
		cp.checkSuccesfulMsg(driver);
	}
	
	@Test(priority = 3, enabled = true)
	public void VerfySvcItSvcLetDiscussYrRequiremnt() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrcItStaffAugmention();
		spo.clickSrvcLetDiscussYrRequiremnt();
		cp.fillContactForm(driver);
		cp.checkSuccesfulMsg(driver);
	}
	

}
