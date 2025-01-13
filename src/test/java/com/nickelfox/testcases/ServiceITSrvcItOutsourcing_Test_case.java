package com.nickelfox.testcases;

import java.awt.AWTException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nickelfox.baseclass.BaseClass;
import com.nickelfox.pages.Contact_with_us_Page;
import com.nickelfox.pages.Service_Page;


public class ServiceITSrvcItOutsourcing_Test_case extends BaseClass{
	
	Service_Page spo;
	Contact_with_us_Page cp;
	
	@BeforeMethod
	void beforeMethod() throws InterruptedException, AWTException {
		launcTheBrowser();
		spo = new Service_Page(driver);
		cp = new Contact_with_us_Page(driver);
	} 

	@Test(priority = 1, enabled = true)
	public void VerfySvcItSvcItOutsourcingContactUs() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrvcItSvcItOutsourcing();
		spo.clickSrvcItSvcItOutsourcingContactUs();
		cp.fillContactForm(driver);
		cp.checkSuccesfulMsg(driver);
	}
	
	
	@Test(priority = 2, enabled = true)
	public void VerfySvcItSvcItOutsourcingBookAConsultation() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrvcItSvcItOutsourcing();
		spo.clickSrvcItSvcItOutsourcingBookAConsultation();
		cp.fillContactForm(driver);
		cp.checkSuccesfulMsg(driver);
	}

	@Test(priority = 3, enabled = true)
	public void VerfySvcItSvcItOutsourcingPartnerWithUs() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrvcItSvcItOutsourcing();
		spo.clickSrvcItSvcItOutsourcingPartnerWithUs();
		cp.fillContactForm(driver);
		cp.checkSuccesfulMsg(driver);
	}
	
	@Test(priority = 4, enabled = true)
	public void VerfySvcItSvctOutsourcingclickLetsGrowTogether() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrvcItSvcItOutsourcing();
		spo.clickSrvcItSvcItOutsourcingclickLetsGrowTogether();
		cp.fillContactForm(driver);
		cp.checkSuccesfulMsg(driver);
	}
	
	@Test(priority = 5, enabled = true)
	public void VerfySvcItSvcItOutsourcingLetsHelpYou() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrvcItSvcItOutsourcing();
		spo.clickSrvcItSvcItOutsourcingLetsHelpYou();
		cp.fillContactForm(driver);
		cp.checkSuccesfulMsg(driver);
	}
	
}
