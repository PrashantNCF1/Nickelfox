package com.nickelfox.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Blog_Page {

	@FindBy (xpath= "//*[@id=\"menu-item-28875\"]/a")
	private WebElement blog;
	
	@FindBy (xpath= "//div[1]/div/div[2]/div/div/div/div/span[3]")
	private WebElement headertext;
	
	@FindBy (xpath= "//div[2]/div/div/section/div/div/div/div/div/div/div[1]")
	private WebElement card_Text;
	
	public Blog_Page(WebDriver driver) {

	PageFactory.initElements(driver, this);
}

	public void go_to_blog(WebDriver driver) throws InterruptedException{
		
		Thread.sleep(12000);
		blog.click();
		System.out.println("Go to the blog screen");
		
		String title= driver.getTitle();
		System.out.println("page title:" + title);
		
		WebElement header_text=headertext;
		System.out.println(header_text.getText());
		

		WebElement card_text=card_Text;
		System.out.println(card_text.getText());
		
	}
	
}



