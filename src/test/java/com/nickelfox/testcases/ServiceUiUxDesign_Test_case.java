package com.nickelfox.testcases;

import java.awt.AWTException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.nickelfox.baseclass.BaseClass;
import com.nickelfox.pages.Contact_with_us_Page;
import com.nickelfox.pages.Service_Page;


public class ServiceUiUxDesign_Test_case extends BaseClass {
	
	Service_Page spo;
	Contact_with_us_Page cp;
	
	@BeforeMethod
	void beforeMethod() throws InterruptedException, AWTException {
		launcTheBrowser();
		cp = new Contact_with_us_Page(driver);
		spo = new Service_Page(driver);

	}
	
	
	@Test(priority=1,enabled =true)
	public void VerifySrvUiUxDsgnCntFrAFreeCnlt() throws InterruptedException, AWTException {
		
		 spo= new Service_Page(driver);
		 cp = new Contact_with_us_Page(driver);
		 
		 spo.mouseHwrOnService(driver);
		 spo.clickSrvUiUxDsgn();
		 spo.clickSrvUiUxDsgnCntFrAFreeCnlt(driver);
		 cp.fillContactForm(driver);
		 cp.checkSuccesfulMsg(driver);		 
		
	}
	@Test(priority=2,enabled =true)
	public void VerifySrvUiUxDsgnCntFrAFreeCnltTalkToUsMdtryFldValtion() throws InterruptedException {
//		spo= new ServicePageObject(driver);
//		 cp = new oldContactwithusPage(driver);
//		 
		 spo.mouseHwrOnService(driver);
		 spo.clickSrvUiUxDsgn();
		 spo.clickSrvUiUxDsgnCntFrAFreeCnlt(driver);
		 cp.verifyMandatoryFieldVald(driver);
		
	}
	@Test(priority=3,enabled =true)
	public void VerifySrvUiUxDsgnCntFrAFreeCnltTalkToUsInvaledEmail() throws InterruptedException, AWTException {
//		spo= new ServicePageObject(driver);
//		 cp = new oldContactwithusPage(driver);
		 
		 spo.mouseHwrOnService(driver);
		 spo.clickSrvUiUxDsgn();
		 spo.clickSrvUiUxDsgnGetToTouch();
		 
		 cp.verifyInvalidEmailVld(driver);
		
	}	
	@Test(priority=4,enabled =true)
	public void VerifySrvUiUxDsgnGetToTouch() throws InterruptedException, AWTException {
		
//		 spo= new ServicePageObject(driver);
//		 cp = new oldContactwithusPage(driver);
//		 
		 spo.mouseHwrOnService(driver);
		 spo.clickSrvUiUxDsgn();
		 spo.clickSrvUiUxDsgnGetToTouch();
		 cp.fillContactForm(driver);
		 cp.checkSuccesfulMsg(driver);		 
		
	}
	@Test(priority=5,enabled =true)
	public void VerifySrvUiUxDsgnGetToTouchFormTalkToUsMdtryFldValtion() throws InterruptedException {
//		spo= new ServicePageObject(driver);
//		 cp = new oldContactwithusPage(driver);
		 
		 spo.mouseHwrOnService(driver);
		 spo.clickSrvUiUxDsgn();
		 spo.clickSrvUiUxDsgnGetToTouch();
		 cp.verifyMandatoryFieldVald(driver);
		
	}
	@Test(priority=6,enabled =true)
	public void VerifySrvUiUxDsgnGetToTouchTalkToUsInvaledEmail() throws InterruptedException, AWTException {
//		spo= new ServicePageObject(driver);
//		 cp = new oldContactwithusPage(driver);
		 
		 spo.mouseHwrOnService(driver);
		 spo.clickSrvUiUxDsgn();
		 spo.clickSrvUiUxDsgnGetToTouch();
		 
		 cp.verifyInvalidEmailVld(driver);
		
	}
	@Test(priority=7,enabled =true)
	public void VerifySrvUiUxDsgnCntWithExp() throws InterruptedException, AWTException {
		
//		 spo= new ServicePageObject(driver);
//		 cp = new oldContactwithusPage(driver);
		 
		 spo.mouseHwrOnService(driver);
		 spo.clickSrvUiUxDsgn();
		 spo.clickSrvUiUxDsgnCntWithExp();
		 cp.fillContactForm(driver);
		 cp.checkSuccesfulMsg(driver);		 
		
	}
	@Test(priority=8,enabled =true)
	public void VerifySrvUiUxDsgnCntWithExpFormTalkToUsMdtryFldValtion() throws InterruptedException {
//		spo= new ServicePageObject(driver);
//		 cp = new oldContactwithusPage(driver);
		 
		 spo.mouseHwrOnService(driver);
		 spo.clickSrvUiUxDsgn();
		 spo.clickSrvUiUxDsgnCntWithExp();
		 cp.verifyMandatoryFieldVald(driver);
		
	}
	@Test(priority=9,enabled =true)
	public void VerifySrvUiUxDsgnCntWithExpTalkToUsInvaledEmail() throws InterruptedException, AWTException {
//		spo= new ServicePageObject(driver);
//		 cp = new oldContactwithusPage(driver);
		 
		 spo.mouseHwrOnService(driver);
		 spo.clickSrvUiUxDsgn();
		 spo.clickSrvUiUxDsgnCntWithExp();
		 
		 cp.verifyInvalidEmailVld(driver);
		
	}
	@Test(priority=10,enabled =true)
	public void VerifySrvUiUxDsgnCntWithUs() throws InterruptedException, AWTException {
		
//		 spo= new ServicePageObject(driver);
//		 cp = new oldContactwithusPage(driver);
		 
		 spo.mouseHwrOnService(driver);
		 spo.clickSrvUiUxDsgn();
		 spo.clickSrvUiUxDsgnCntWithUs();
		 cp.fillContactForm(driver);
		 cp.checkSuccesfulMsg(driver);		 
		
	}
	@Test(priority=11,enabled =true)
	public void VerifySrvUiUxDsgnCntWithUsFormTalkToUsMdtryFldValtion() throws InterruptedException {
//		spo= new ServicePageObject(driver);
//		 cp = new oldContactwithusPage(driver);
//		 
		 spo.mouseHwrOnService(driver);
		 spo.clickSrvUiUxDsgn();
		 spo.clickSrvUiUxDsgnCntWithUs();
		 cp.verifyMandatoryFieldVald(driver);
		
	}
	@Test(priority=12,enabled =true)
	public void VerifySrvUiUxDsgnCntWithUsTalkToUsInvaledEmail() throws InterruptedException, AWTException {
//		spo= new ServicePageObject(driver);
//		 cp = new oldContactwithusPage(driver);
		 
		 spo.mouseHwrOnService(driver);
		 spo.clickSrvUiUxDsgn();
		 spo.clickSrvUiUxDsgnCntWithUs();
		 
		 cp.verifyInvalidEmailVld(driver);
		
	}
	
	@Test(priority=13,enabled =true)
	public void VerifySrvUiUxDsgnGetStrt() throws InterruptedException, AWTException {
		
//		 spo= new ServicePageObject(driver);
//		 cp = new oldContactwithusPage(driver);
		 
		 spo.mouseHwrOnService(driver);
		 spo.clickSrvUiUxDsgn();
		 spo.clickSrvUiUxDsgnGetStrt();
		 cp.fillContactForm(driver);
		 cp.checkSuccesfulMsg(driver);		 
		
	}
	@Test(priority=14,enabled =true)
	public void VerifySrvUiUxDsgnGetStrtFormTalkToUsMdtryFldValtion() throws InterruptedException {
//		spo= new ServicePageObject(driver);
//		 cp = new oldContactwithusPage(driver);
		 
		 spo.mouseHwrOnService(driver);
		 spo.clickSrvUiUxDsgn();
		 spo.clickSrvUiUxDsgnGetStrt();
		 cp.verifyMandatoryFieldVald(driver);
		
	}
	@Test(priority=15,enabled =true)
	public void VerifySrvUiUxDsgnGetStrtTalkToUsInvaledEmail() throws InterruptedException, AWTException {
//		spo= new ServicePageObject(driver);
//		 cp = new oldContactwithusPage(driver);
		 
		 spo.mouseHwrOnService(driver);
		 spo.clickSrvUiUxDsgn();
		 spo.clickSrvUiUxDsgnGetStrt();
		 
		 cp.verifyInvalidEmailVld(driver);
		
	}

}
