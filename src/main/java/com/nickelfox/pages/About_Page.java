package com.nickelfox.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class About_Page {

	@FindBy(xpath = "(//span[text()='About'])[1]")
	WebElement clickAbout;

	@FindBy (xpath = "//span[@class='elementor-icon-list-text'][normalize-space()='Contact']")
	WebElement clickContact;

	@FindBy (xpath = "//li[@id='menu-item-28870']//a[@class='dropdown-toggle'][normalize-space()='About']")
	WebElement mouseHowever;

	@FindBy (xpath = "//li[@id='menu-item-28888']//a[normalize-space()='Great Place To Work']")
	WebElement clickGreatePlcWrk;

	@FindBy (xpath = "//a[normalize-space()='get quote']")
	WebElement clickDevHireQuote;
	
	@FindBy (xpath = "/html/body/div[2]")
	WebElement Image;


	
	public About_Page(WebDriver driver) {

		PageFactory.initElements(driver, this); 
	}

	public void clickAbout(WebDriver driver) throws InterruptedException
	{
	
		
		Thread.sleep(4000);
		clickAbout.click();
		System.out.println("click about");
		Thread.sleep(5000);
		clickContact.click();
		System.out.println("click contact");

	}

	public void clickGreatPlaceToWork(WebDriver driver) throws InterruptedException {

		Thread.sleep(3000);
		Actions actions = new Actions(driver);
		actions.moveToElement(mouseHowever).perform();         
		clickGreatePlcWrk.click();
		Thread.sleep(3000);
		clickDevHireQuote.click();
	}


}









