package com.nickelfox.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contact_Page {

	
	
	@FindBy(xpath = "//*[@id=\"menu-item-28876\"]/a")
	WebElement contact;

public Contact_Page(WebDriver driver) {

	PageFactory.initElements(driver, this); 
}

public void move_contact_Page() throws InterruptedException {
	
	Thread.sleep(10000);
	contact.click();
	System.out.println("click on the contact page");
	
}



}
