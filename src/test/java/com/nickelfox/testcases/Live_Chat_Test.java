package com.nickelfox.testcases;

import java.awt.AWTException;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import com.nickelfox.baseclass.BaseClass;
import com.nickelfox.pages.Open_Live_Chat;

public class Live_Chat_Test extends BaseClass{

	Open_Live_Chat chat;

	@BeforeMethod
	void beforeMethod() throws InterruptedException, AWTException {
		launcTheBrowser();
		chat = new Open_Live_Chat(driver);

	} 

	@Test(priority = 1, enabled = true)

public void test() throws InterruptedException, AWTException{

	chat.Move_To_Open_Live_Chat(driver);
	
	
}




}