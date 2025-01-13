

package com.nickelfox.testcases;

import java.awt.AWTException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nickelfox.baseclass.BaseClass;
import com.nickelfox.pages.Contact_with_us_Page;
import com.nickelfox.pages.Service_Page;


public class ServiceProductEngProductManagement_Test_case extends BaseClass{
	
	
	Service_Page spo;
	Contact_with_us_Page cp;
	
	@BeforeMethod
	void beforeMethod() throws InterruptedException, AWTException {
		launcTheBrowser();
		spo = new Service_Page(driver);
		cp = new Contact_with_us_Page(driver);
	} 

	@Test(priority = 1, enabled = true)
	public void VerfySvcPrdEngProductManagementGetinTouch() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrvcPrdEngProductManagement();
		spo.clickSrvcPrdEngProductManagementGetinTouch();
		cp.fillContactForm(driver);
		cp.checkSuccesfulMsg(driver);
	}
	
	@Test(priority = 2, enabled = true)
	public void VerfySvcPrdEngProductManagementLetGetStart() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrvcPrdEngProductManagement();
		spo.clickSrvcPrdEngProductManagementLetGetStart();
		cp.fillContactForm(driver);
		cp.checkSuccesfulMsg(driver);
	}
	
	@Test(priority = 3, enabled = true)
	public void VerfySvcPrdEngProductManagementHireProjectManager() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrvcPrdEngProductManagement();
		spo.clickSrvcPrdEngProductManagementHireProjectManager();
		cp.fillContactForm(driver);
		cp.checkSuccesfulMsg(driver);
	}
	
	@Test(priority = 4, enabled = true)
	public void VerfySvcPrdEngProductManagementScheduleAcall() throws InterruptedException, AWTException {

		spo.mouseHwrOnService(driver);
		spo.clickSrvcPrdEngProductManagement();
		spo.clickSrvcPrdEngProductManagementScheduleAcall();
		cp.fillContactForm(driver);
		cp.checkSuccesfulMsg(driver);
	}	
}
