package com.nickelfox.testcases;

import java.awt.AWTException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nickelfox.baseclass.BaseClass;
import com.nickelfox.pages.Contact_with_us_Page;
import com.nickelfox.pages.Service_Page;


public class ServiceITSrvcItConsulting_Test_case extends BaseClass{
	
	Service_Page spo;
	Contact_with_us_Page cp;
	
	@BeforeMethod
	void beforeMethod() throws InterruptedException, AWTException {
		launcTheBrowser();
		spo = new Service_Page(driver);
		cp = new Contact_with_us_Page(driver);
	} 


	@Test(priority = 1, enabled = true)
	public void VerfySvcItSvcItConsultingTalkToExpert() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrvcItSvcItConsulting();
		spo.clickSrvcItSvcItConsultingTalkToExpert();
		cp.fillContactForm(driver);
		cp.subtBTN();
		cp.checkSuccesfulMsg(driver);
	}	
	@Test(priority = 2, enabled = true)
	public void VerfySvcItSvcItConsultingLetGuideYou() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrvcItSvcItConsulting();
		spo.clickSrvcItSvcItConsultingLetGuideYou();
		cp.fillContactForm(driver);
		cp.subtBTN();
		cp.checkSuccesfulMsg(driver);
	}
	
	@Test(priority = 3, enabled = true)
	public void VerfySvcItSvcItConsultingLetCollaborate() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrvcItSvcItConsulting();
		spo.clickSrvcItSvcItConsultingLetCollaborate();
		cp.fillContactForm(driver);
		cp.subtBTN();
		cp.checkSuccesfulMsg(driver);
	}
	
	@Test(priority = 4, enabled = true)
	public void VerfySvcItSvcItConsultingMakeAMove() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrvcItSvcItConsulting();
		spo.clickSrvcItSvcItConsultingMakeAMove();
		cp.fillContactForm(driver);
		cp.subtBTN();
		cp.checkSuccesfulMsg(driver);
	}

	@Test(priority = 5, enabled = true)
	public void VerfySvcItSvcItConsultingReachOutToUs() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrvcItSvcItConsulting();
		spo.clickSrvcItSvcItConsultingReachOutToUs();
		cp.fillContactForm(driver);
		cp.subtBTN();
		cp.checkSuccesfulMsg(driver);
	}
	


}
