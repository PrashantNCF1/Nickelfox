package com.nickelfox.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Industries_Page {

	@FindBy(xpath = "//*[@id=\"menu-item-28871\"]/a")
	WebElement Industries;

	@FindBy(xpath = "//*[@id=\"menu-item-29692\"]/a")
	WebElement HealthTech;

	@FindBy(xpath = "//*[@id=\"menu-item-29688\"]/a")
	WebElement healthCare;

	@FindBy(xpath = "//span[contains(text(),'Custom Healthcare Software Development...')]")
	WebElement TextVerify;

	@FindBy(xpath = "//section[11]/div/div[2]/div/div/div/a")
	WebElement Lets_connect_Btn;

	public Industries_Page(WebDriver driver) {

		PageFactory.initElements(driver, this); 
	}

	public void Go_HealthCatre(WebDriver driver) throws InterruptedException {

		Thread.sleep(4000);

		Actions action = new Actions(driver);
		//WebElement industry = Industries;
		action.moveToElement(Industries).perform();
		System.out.println("click on the industries");

		Thread.sleep(2000);
		action.moveToElement(HealthTech).perform();
		System.out.println("goes to the Health tech");
		Thread.sleep(4000);
		healthCare.click();
		System.out.println("Click on the health Care");

		String ActualTitle = TextVerify.getText();
		String ExpectedTitle = "Custom Healthcare Software Development...";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		System.out.println("Page verified");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		//get the height of the webpage and scroll to the end
		js.executeScript("window.scrollTo(0, 700)");

		Thread.sleep(4000);
		Lets_connect_Btn.click();
		System.out.println("click on the lets connect button");


	}
}
