package com.nickelfox.testcases;

import java.awt.AWTException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nickelfox.baseclass.BaseClass;
import com.nickelfox.pages.Blog_Page;

public class Blog_Page_Test extends BaseClass{

	Blog_Page Blog;
	
	@BeforeMethod
	void beforeMethod() throws InterruptedException, AWTException {
		launcTheBrowser();
		Blog = new Blog_Page(driver);
	} 

	@Test
	public void blogTest() throws InterruptedException{
		
		Blog.go_to_blog(driver);
	}
	
}
