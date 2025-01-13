package com.nickelfox.pages;

import java.awt.AWTException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Open_Live_Chat {

	@FindBy(xpath = "//iframe[@id='hubspot-conversations-iframe']")
	private WebElement Live_chat_Icon;

	@FindBy(xpath= "//div[normalize-space()='Design & Development Services']")
	private WebElement Design_Development_Services;
	
	@FindBy(xpath= "//div[normalize-space()='UI/UX Design']")
	private WebElement UI_UX_Design;
	
	@FindBy(xpath = "//div[@aria-label='Write a message']")
	private WebElement write_message;
	
	@FindBy(xpath= "//button[@data-test-id='chat-send-button']")
	private WebElement send_Btn;


	


	public Open_Live_Chat(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void Move_To_Open_Live_Chat(WebDriver driver) throws InterruptedException, AWTException {

		try {
			
			Thread.sleep(15000);
			Live_chat_Icon.click();
			System.out.println("Click on the live chat icon");

		} catch (Exception e) {
			System.out.println("the live chat icon not visible");
		}
		Thread.sleep(8000);
		driver.switchTo().frame("hubspot-conversations-iframe");
		Actions act=new Actions (driver);

		act.moveToElement(Design_Development_Services).perform();
		Design_Development_Services.click();
		System.out.println("Select the Design & Development Services option from the chat");
		
		Thread.sleep(4000);
		UI_UX_Design.click();
		System.out.println("select the UI/UX Design from the Chat");
		
		Thread.sleep(8000);
		write_message.sendKeys("Sure! My name is QA automation. Looking forward to hearing from your team soon!");
		System.out.println("enter the message");
		
		Thread.sleep(8000);
		send_Btn.click();
		System.out.println("Click on the send button");
		
		Thread.sleep(8000);
		write_message.sendKeys("2156238965");
		System.out.println("enter the number");
		Thread.sleep(4000);
		send_Btn.click();
		System.out.println("Click on the send button");

		Thread.sleep(8000);
		write_message.sendKeys("NFXautomation@yopmail.com");
		System.out.println("enter the number");
		Thread.sleep(4000);
		send_Btn.click();
		System.out.println("Click on the send button");


	}

}
