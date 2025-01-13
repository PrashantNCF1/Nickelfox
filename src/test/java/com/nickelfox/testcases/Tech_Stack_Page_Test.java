package com.nickelfox.testcases;

import java.awt.AWTException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nickelfox.baseclass.BaseClass;
import com.nickelfox.pages.Tech_Stack_Page;

public class Tech_Stack_Page_Test extends BaseClass{

	Tech_Stack_Page TechStack ;

	@BeforeMethod
	void beforeMethod() throws InterruptedException, AWTException {
		launcTheBrowser();
		TechStack = new Tech_Stack_Page(driver);
	} 

	@Test(priority = 1, enabled = true)
	public void TechStack_MEAN_STACK() throws InterruptedException{

		TechStack.go_to_mean_Stack(driver);
		TechStack.verify_meanstack_data(driver);

	}

	@Test(priority = 2, enabled = true)
	public void TechStack_Mern_Stack () throws InterruptedException{


		TechStack.go_to_MERN_STACK(driver);
		TechStack.verify_mern_stack(driver);
	}







}
