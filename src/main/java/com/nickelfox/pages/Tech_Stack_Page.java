package com.nickelfox.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tech_Stack_Page {

	@FindBy(xpath = "//*[@id=\"menu-item-28887\"]/a")
	WebElement Tech_Stack;

	@FindBy(xpath = "//*[@id=\"menu-item-28885\"]/div/div/section/div/div[1]/div/div[2]/div/ul/li[1]/a/span")
	WebElement mean_stack;

	@FindBy(xpath = "//span[contains(text(),'Hire Offshore MEAN Stack Developers')]")
	WebElement header_text;

	@FindBy(xpath = "//div[1]/div/div/div/div[2]/div/div/section[4]")
	WebElement  Expertise;

	@FindBy(xpath = "//div[1]/div/div/div/div[2]/div/div/section[7]/div/div/div/div/div/img")
	WebElement stand_apart_Image;

	@FindBy(xpath = "//div[1]/div/div/div/div[2]/div/div/section[8]/div")
	WebElement stand_apart;

	@FindBy(xpath = "//div[1]/div/div/div/div[2]/div/div/section[10]/div/div/div")
	WebElement engagement_section;

	@FindBy(xpath = "//div[1]/div/div/div/div[2]/div/div/section[11]/div/div[1]/div/div[1]/div/img")
	WebElement engagement_section_image;

	@FindBy(xpath = "//div/div/section[12]/div/div[2]/div/div/div/a")
	WebElement let_Discuss_Btn;

	@FindBy(xpath = "//div[2]/div/div/section[13]/div/div/div")
	WebElement seamleess_Process;

	@FindBy(xpath = "//div[1]/div/div/div/div[2]/div/div/section[14]")
	WebElement seamleess_Process_text;


	@FindBy(xpath = "//div/div/div[2]/div/div/section[16]/div/div/div")
	WebElement business_Benefits;

	@FindBy(xpath = "//div/div/div[2]/div/div/section[17]/div/div[1]/div")
	WebElement business_Benefits_text;

	//**********************************************

	@FindBy(xpath = "//header[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]/span[1]")
	WebElement Mern_Stack ;

	@FindBy(xpath = "//div[1]/div/div[2]/div/div/div/div/span[1]")
	WebElement header_text1;

	@FindBy(xpath = "//div/div[2]/div/div/section[3]/div/div/div")
	WebElement MERN_HeaderText;

	@FindBy(xpath = "//div[1]/div/div/div/div[2]/div/div/section[4]/div/div[1]/div")
	WebElement MersStack_Card;

	@FindBy(xpath = "//div[1]/div/div/div/div[2]/div/div/section[6]/div/div")
	WebElement affordable_Section;

	@FindBy(xpath = "//div[1]/div/div/div/div[2]/div/div/section[7]/div/div[1]/div")
	WebElement affordable_card;

	@FindBy(xpath = "//a[contains(text(),'CONTACT US')]")
	WebElement contact_us_btn;

	@FindBy(xpath = "//div[2]/div/div/section[9]/div/div/div")
	WebElement MernStack_Developer;

	@FindBy(xpath = "//div[1]/div/div/div/div[2]/div/div/section[10]")
	WebElement MernStack_develoeprSection;

	@FindBy(xpath = "//div[2]/div/div/section[12]/div/div/div")
	WebElement Developer_EngagementProcess;

	@FindBy(xpath = "//div[2]/div/div/section[13]/div/div[1]/div")
	WebElement Engagement_Process;

	@FindBy(xpath = "//section[15]/div/div/div")
	WebElement Prefect_Choice;

	@FindBy(xpath = "//div/div[2]/div/div/section[16]")
	WebElement Perfect_Choice_IMG;

	@FindBy(xpath = "//div/div/section[17]")
	WebElement Prefect_Choice_Card;


	@FindBy(xpath = "//section[19]/div/div[2]/div/div/div/a")
	WebElement StartedBtn;


	//		@FindBy(xpath = "")
	//	WebElement ;

	//		@FindBy(xpath = "")
	//	WebElement ;

	//		@FindBy(xpath = "")
	//	WebElement ;

	//		@FindBy(xpath = "")
	//	WebElement ;

	//		@FindBy(xpath = "")
	//	WebElement ;

	//		@FindBy(xpath = "")
	//	WebElement ;

	//		@FindBy(xpath = "")
	//	WebElement ;

	//		@FindBy(xpath = "")
	//	WebElement ;

	//		@FindBy(xpath = "")
	//	WebElement ;

	//		@FindBy(xpath = "")
	//	WebElement ;

	//		@FindBy(xpath = "")
	//	WebElement ;

	//		@FindBy(xpath = "")
	//	WebElement ;

	//		@FindBy(xpath = "")
	//	WebElement ;

	//		@FindBy(xpath = "")
	//	WebElement ;

	//		@FindBy(xpath = "")
	//	WebElement ;

	//		@FindBy(xpath = "")
	//	WebElement ;

	public Tech_Stack_Page(WebDriver driver) {

		PageFactory.initElements(driver, this); 
	}

	public void go_to_mean_Stack(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		Actions action = new Actions(driver);

		action.moveToElement(Tech_Stack).perform();
		System.out.println("click on the tech stack");

		Thread.sleep(2000);
		mean_stack.click();
		System.out.println("goes to the mean stach");
		Thread.sleep(4000);

	}

	public void verify_meanstack_data(WebDriver driver) throws InterruptedException {

		Thread.sleep(4000);
		WebElement text=header_text;
		System.out.println(text.getText());

		Thread.sleep(4000);
		WebElement text2=Expertise;
		System.out.println(text2.getText());

		stand_apart_Image.isDisplayed();
		System.out.println("stand apart image is showing");

		Thread.sleep(4000);
		WebElement text3=stand_apart;
		System.out.println(text3.getText());

		Thread.sleep(4000);
		WebElement text4=engagement_section;
		System.out.println(text4.getText());

		engagement_section_image.isDisplayed();
		System.out.println("Engafement section image showing");

		Thread.sleep(4000);
		WebElement text5=let_Discuss_Btn;
		System.out.println(text5.getText());

		Thread.sleep(4000);
		WebElement text6=seamleess_Process;
		System.out.println(text6.getText());

		Thread.sleep(4000);
		WebElement text7=seamleess_Process_text;
		System.out.println(text7.getText());

		Thread.sleep(4000);
		WebElement text8=business_Benefits;
		System.out.println(text8.getText());

		Thread.sleep(4000);
		WebElement text9=business_Benefits_text;
		System.out.println(text9.getText());
	}



	public void go_to_MERN_STACK(WebDriver driver) throws InterruptedException {

		Actions action = new Actions(driver);
		action.moveToElement(Tech_Stack).perform();
		System.out.println("click on the tech stack");

		Thread.sleep(4000);
		Mern_Stack.click();
		System.out.println("goes to the Mern stach");
		Thread.sleep(4000);

	}


	public void verify_mern_stack (WebDriver driver) throws InterruptedException{
		Thread.sleep(4000);
		WebElement text1=header_text;
		System.out.println(text1.getText());

		Thread.sleep(4000);
		WebElement text2=MERN_HeaderText;
		System.out.println(text2.getText());
		
		Thread.sleep(4000);
		WebElement text3=MersStack_Card;
		System.out.println(text3.getText());
		
		Thread.sleep(4000);
		WebElement text4=affordable_Section;
		System.out.println(text4.getText());
		
		Thread.sleep(4000);
		WebElement text5=affordable_card;
		System.out.println(text5.getText());
		
		contact_us_btn.isDisplayed();
		System.out.println("the let's get started button is showing");
		
		Thread.sleep(4000);
		WebElement text6=contact_us_btn;
		System.out.println(text6.getText());
		
		Thread.sleep(4000);
		WebElement text7=MernStack_Developer;
		System.out.println(text7.getText());
		
		Thread.sleep(4000);
		WebElement text8=MernStack_develoeprSection;
		System.out.println(text8.getText());
		
		Thread.sleep(4000);
		WebElement text9=Developer_EngagementProcess;
		System.out.println(text9.getText());
		
		Thread.sleep(4000);
		WebElement text10=Engagement_Process;
		System.out.println(text10.getText());
		
		Thread.sleep(4000);
		WebElement text11=Prefect_Choice;
		System.out.println(text11.getText());
		
		
		Perfect_Choice_IMG.isDisplayed();
		System.err.println("the image is displayed");
		
		Thread.sleep(4000);
		WebElement text12=Perfect_Choice_IMG;
		System.out.println(text12.getText());
		
		Thread.sleep(4000);
		WebElement text13=Prefect_Choice_Card;
		System.out.println(text13.getText());
		
		StartedBtn.isDisplayed();
		System.out.println("button is displayed");
		
		Thread.sleep(4000);
		WebElement text14=StartedBtn;
		System.out.println(text14.getText());
		
		
		
	}
}














