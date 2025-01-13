package com.nickelfox.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Success_Stories_Page {

	@FindBy(xpath = "//*[@id=\"menu-item-28873\"]/a")
	WebElement SuccessSotry;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div/div/div/div/section[2]")
	WebElement page_Dtls;
	
	
	public Success_Stories_Page(WebDriver driver) {

		PageFactory.initElements(driver, this); 
	}

	public void move_Success_Stories(WebDriver driver) throws InterruptedException {
		
		Thread.sleep(4000);
		SuccessSotry.click();
		System.out.println("click on the Success Stories Page");
		
		String title= driver.getTitle();
		System.out.println("page title:" + title);
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Nickelfox Portfolio | We Deliver Exceptional Digital Services";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		
		Thread.sleep(8000);
		WebElement card_text=page_Dtls;
		System.out.println(card_text.getText());
		page_Dtls.isDisplayed();
		
		
		
		
	}
}
