package com.nickelfox.testcases;

import java.awt.AWTException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nickelfox.baseclass.BaseClass;
import com.nickelfox.pages.Contact_with_us_Page;

import com.nickelfox.pages.Service_Page;



public class Service_Test_case extends BaseClass{
	Service_Page spo;
	Contact_with_us_Page cp;
	
	@BeforeMethod
	void beforeMethod() throws InterruptedException, AWTException {
		launcTheBrowser();
		spo = new Service_Page(driver);
		cp = new Contact_with_us_Page(driver);
	} 
	
	
	
	//@Test(priority = 1, enabled = true)
	public void VerifySrvAppDsgnrGetTouchForm() throws InterruptedException, AWTException {
		
		 spo= new Service_Page(driver);
		 cp = new Contact_with_us_Page(driver);
		 
		 spo.mouseHwrOnService(driver);
		 spo.clickSrvAppDsgnr();
		 spo.clickSrvAGetTouch();
		 cp.fillContactForm(driver);
		 cp.checkSuccesfulMsg(driver);		 
		
	}
	@Test(priority=2,enabled =true)
	public void VerifySrvAppDsgnrGetTouchFormTalkToUsMdtryFldValtion() throws InterruptedException {
//		spo= new ServicePageObject(driver);
//		 cp = new oldContactwithusPage(driver);
		 
		 spo.mouseHwrOnService(driver);
		 spo.clickSrvAppDsgnr();
		 spo.clickSrvAGetTouch();
		 cp.verifyMandatoryFieldVald(driver);
		
	}
	@Test(priority=3,enabled =true)
	public void VerifySrvAppDsgnrGetTouchFormTalkToUsInvaledEmail() throws InterruptedException, AWTException {
//		spo= new ServicePageObject(driver);
//		 cp = new oldContactwithusPage(driver);
		 
		 spo.mouseHwrOnService(driver);
		 spo.clickSrvAppDsgnr();
		 spo.clickSrvAGetTouch();
		 
		 cp.verifyInvalidEmailVld(driver);
		
	}
//	@Test(priority=4,enabled =true)
	public void VerifySrvAppDsgnrGetStrtForm() throws InterruptedException, AWTException {
		
//		 spo= new ServicePageObject(driver);
//		 cp = new oldContactwithusPage(driver);
		 
		 spo.mouseHwrOnService(driver);
		 spo.clickSrvAppDsgnr();
		 spo.clickSrvAppDsgnrGetStrt();
		 cp.fillContactForm(driver);
		 cp.checkSuccesfulMsg(driver);		 
		
	}
	//@Test(priority=5,enabled =true)
	public void VerifySrvAppDsgnrGetStrtFormTalkToUsMdtryFldValtion() throws InterruptedException {
//		spo= new ServicePageObject(driver);
//		 cp = new oldContactwithusPage(driver);
		 
		 spo.mouseHwrOnService(driver);
		 spo.clickSrvAppDsgnr();
		 spo.clickSrvAppDsgnrGetStrt();
		 cp.verifyMandatoryFieldVald(driver);
		
	}
	@Test(priority=6,enabled =true)
	public void VerifySrvAppDsgnrGetStrtFormTalkToUsInvaledEmail() throws InterruptedException, AWTException {
//		spo= new ServicePageObject(driver);
//		 cp = new oldContactwithusPage(driver);
//		 
		 spo.mouseHwrOnService(driver);
		 spo.clickSrvAppDsgnr();
		 spo.clickSrvAppDsgnrGetStrt();
		 
		 cp.verifyInvalidEmailVld(driver);
		
	}
	//@Test(priority=7,enabled =true)
	public void VerifySrvAppDsgnrContactWithUstForm() throws InterruptedException, AWTException {
		
//		 spo= new ServicePageObject(driver);
//		 cp = new oldContactwithusPage(driver);
		 
		 spo.mouseHwrOnService(driver);
		 spo.clickSrvAppDsgnr();
		 spo.clickSrvAppDsgnrContWithEx();
		 cp.fillContactForm(driver);
		 cp.checkSuccesfulMsg(driver);		 
		
	}
	//@Test(priority=8,enabled =true)
	public void VerifySrvAppDsgnrContactWithUsFormTalkToUsMdtryFldValtion() throws InterruptedException {
//		spo= new ServicePageObject(driver);
//		 cp = new oldContactwithusPage(driver);
		 
		 spo.mouseHwrOnService(driver);
		 spo.clickSrvAppDsgnr();
		 spo.clickSrvAppDsgnrContWithEx();
		 cp.verifyMandatoryFieldVald(driver);
		
	}
	@Test(priority=9,enabled =true)
	public void VerifySrvAppDsgnrContactWithUsFormTalkToUsInvaledEmail() throws InterruptedException, AWTException {
//		spo= new ServicePage[Object(driver);
//		 cp = new oldContactwithusPage(driver);
//		 
		 spo.mouseHwrOnService(driver);
		 spo.clickSrvAppDsgnr();
		 spo.clickSrvAppDsgnrContWithEx();
		 
		 cp.verifyInvalidEmailVld(driver);
		
	}
//	@Test(priority=10,enabled =true)
	public void VerifySrvAppDsgnrHireNowAppForm() throws InterruptedException, AWTException {
		
//		 spo= new ServicePageObject(driver);
//		 cp = new oldContactwithusPage(driver);
		 
		 spo.mouseHwrOnService(driver);
		 spo.clickSrvAppDsgnr();
		 spo.clickSrvAppDsgnHireNowApp();
		 cp.fillContactForm(driver);
		 cp.checkSuccesfulMsg(driver);		 
		
	}
	//@Test(priority=11,enabled =true)
	public void VerifySrvAppDsgnrHireNowAppsFormTalkToUsMdtryFldValtion() throws InterruptedException {
//		spo= new ServicePageObject(driver);
//		 cp = new oldContactwithusPage(driver);
		 
		 spo.mouseHwrOnService(driver);
		 spo.clickSrvAppDsgnr();
		 spo.clickSrvAppDsgnHireNowApp();
		 cp.verifyMandatoryFieldVald(driver);
		
	}
	@Test(priority=12,enabled =true)
	public void VerifySrvAppDsgnrHireNowAppFormTalkToUsInvaledEmail() throws InterruptedException, AWTException {
//		spo= new ServicePageObject(driver);
//		 cp = new oldContactwithusPage(driver);
		 
		 spo.mouseHwrOnService(driver);
		 spo.clickSrvAppDsgnr();
		 spo.clickSrvAppDsgnHireNowApp();
		 
		 cp.verifyInvalidEmailVld(driver);
		
	}

}
