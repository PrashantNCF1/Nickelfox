package com.nickelfox.testcases;

import java.awt.AWTException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.nickelfox.baseclass.BaseClass;
import com.nickelfox.pages.Success_Stories_Page;

public class Success_Stories_Page_Test extends BaseClass{

	Success_Stories_Page SuccessStories;
	
	@BeforeMethod
	void beforeMethod() throws InterruptedException, AWTException {
		launcTheBrowser();
		SuccessStories = new Success_Stories_Page(driver);
	} 

	@Test(priority = 1, enabled = true)
	public void Stories() throws InterruptedException{
		
		SuccessStories.move_Success_Stories(driver);
	}
	
	
}
