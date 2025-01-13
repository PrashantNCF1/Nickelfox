package com.nickelfox.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Service_Page {



	@FindBy(xpath = "//li[@id='menu-item-28872']//a[@class='dropdown-toggle'][normalize-space()='Services']")
	WebElement mouseHoweverService;

	@FindBy(xpath = "//span[@class='elementor-icon-list-text'][normalize-space()='App Design']")
	WebElement clickAppDsgn;

	@FindBy(xpath = "//a[normalize-space()='Get in touch']")
	WebElement clickAppDsgnGetInTouch;

	@FindBy(xpath = "//div[contains(@class,'elementor-element elementor-element-aafcd15 elementor-widget elementor-widget-bridge_button')]//a[contains(@class,'default')][normalize-space()='Get started']")
	WebElement clickAppDsgnGetStrt;

	@FindBy(xpath = "//a[normalize-space()='Connect with experts']")
	WebElement clickAppDsgnContectWthExp;

	@FindBy(xpath = "//a[normalize-space()='Hire now']")
	WebElement clickAppDsgnHirNowAppDsgn;

	@FindBy(xpath = "(//span[text()='UI-UX Design'])[1]")
	WebElement clickUiUxDsgn;

	@FindBy(xpath = "//a[@class='qbutton  center default' and text()='Connect for a free consultation ']")
	WebElement clickUiUxCntFrAFreeCnslt;

	@FindBy(xpath = "//a[normalize-space()='Get in touch']")
	WebElement clickUiUxGetToTouch;

	@FindBy(xpath = "//a[normalize-space()='Connect with experts']")
	WebElement clickUiUxCntWithExp;

	@FindBy(xpath = "//a[normalize-space()='Contact us']")
	WebElement clickUiUxCntWithUs;

	@FindBy(xpath = "//a[normalize-space()='Get started']")
	WebElement clickUiUxGetStrt;
	
	// Service>>design service >> WebDesign xapth

		@FindBy(xpath = "(//span[text()='Web Design'])[1]")
		WebElement clickWebDesign;
		@FindBy(xpath = "//a[normalize-space()='Contact us today']")
		WebElement clickContactUsToday;
		@FindBy(xpath = "//div[contains(@class,'elementor-element elementor-element-4d0f0c6 elementor-widget__width-inherit elementor-widget-mobile__width-inherit elementor-widget elementor-widget-bridge_button')]//a[contains(@class,'center default')]")
		WebElement clickLetGetStart;
		@FindBy(xpath = "//a[normalize-space()='Contact us']")
		WebElement clickContatUs;
		@FindBy(xpath = "//a[normalize-space()='Get in touch']")
		WebElement clickGetInTouch;
		@FindBy(xpath = "//a[normalize-space()='Start Today']")
		WebElement clickStartToday;
		// ***********Service>>design service >> IT service>>It staff Augmention
		// xpath*******************

		@FindBy(xpath = "//span[@class='elementor-icon-list-text'][normalize-space()='IT Staff Augmentation']")
		WebElement clickItStaffAugmention;

		@FindBy(xpath = "//div[contains(@class,'elementor-element elementor-element-8cf2b08 elementor-widget elementor-widget-bridge_button')]//a[contains(@class,'default')]")
		WebElement clickLetDiscussYurProject;

		@FindBy(xpath = "//div[contains(@class,'elementor-element elementor-element-28e60c1 elementor-widget elementor-widget-bridge_button')]//a[contains(@class,'default')]")
		WebElement clickLetUsYouKnowYrRequirment;

		@FindBy(xpath = "//div[contains(@class,'elementor-element elementor-element-58effa3 elementor-widget elementor-widget-bridge_button')]//a[contains(@class,'default')]")
		WebElement clickLetDiscussYrRequiremnt;

	//***********Service>>design service >> IT service>>IT Outsourcing xpath*******************
		@FindBy(xpath = "(//*[text()='IT Outsourcing'])[1]")
		WebElement clickItOutsourcing;

		@FindBy(xpath = "//a[normalize-space()='Contact Us']")
		WebElement clickContactUs;

		@FindBy(xpath = "//a[contains(text(),'Let’s help you')]")
		WebElement clickLetsHelpYou;

		@FindBy(xpath = "//a[normalize-space()='Book a consultation']")
		WebElement clickBookAConsultation;

		@FindBy(xpath = "//a[normalize-space()='Partner with us']")
		WebElement clickPartnerWithUs;

		@FindBy(xpath = "//a[contains(text(),'Let’s grow together')]")
		WebElement clickLetsGrowTogether;
	//***********Service>>design service >> IT service>>IT Consulting xpath*******************

		@FindBy(xpath = "(//*[contains(text(),'IT Consulting')])[1]")
		WebElement clickItConsulting;

		@FindBy(xpath = "//*[contains(text(),'Talk to experts')]")
		WebElement clickTalkToExpert;

		@FindBy(xpath = "//*[contains(text(),'Let’s guide you ')]")
		WebElement clickLetGuideYou;

		@FindBy(xpath = "//a[contains(text(),'Let’s collaborate')]")
		WebElement clickLetCollaborate;

		@FindBy(xpath = "//a[normalize-space()='Make a move']")
		WebElement clickMakeAMove;

		@FindBy(xpath = "//a[normalize-space()='Reach out to us']")
		WebElement clickReachOutToUs;
		
		// ***********Service>>design service >> Mobile app development>>Android app development xpath
		
		@FindBy(xpath = "//span[@class='elementor-icon-list-text'][normalize-space()='Android App Development']")
		WebElement clickAndroidAppDev;
		
		@FindBy(xpath = "//a[normalize-space()='Partner with us']")
		WebElement clickAndroidPartnerWithUs;
		
		@FindBy(xpath = "(//*[text()='Contact us'])[1]")
		WebElement clickAndroidContactwithUs;
		
		@FindBy(xpath = "(//*[text()='Contact us'])[2]")
		WebElement clickAndroidContactwithUs2;
		
		@FindBy(xpath = "//a[normalize-space()='Get in touch now']")
		WebElement clickAndroidGetInTouchNow;
		// ***********Service>>design service >> Mobile app development>>Hybrid app development xpath
		
		@FindBy(xpath = "(//*[text()='Hybrid App Development'])[1]")
		WebElement clickHybridAppDev;
		
		@FindBy(xpath = "//a[normalize-space()='Go hybrid']")
		WebElement clickHybridGoHybrid;
		
		@FindBy(xpath = "//a[normalize-space()='Get in touch']")
		WebElement clickHybridGetInTouch;
		
		@FindBy(xpath = "//a[normalize-space()='Make a move with Nickelfox']")
		WebElement clickHybridMakeAMoveWithNFX;
		
		@FindBy(xpath = "//a[contains(text(),'Let’s work together')]")
		WebElement clickHybridLtsWrkTogether;
		
		@FindBy(xpath = "//a[normalize-space()='Contact us now']")
		WebElement clickHybridContactUsNow;
		// ***********Service>>design service >> Mobile app development>>iOS app development xpath
		
		@FindBy(xpath = "//span[contains(@class,'elementor-icon-list-text')][normalize-space()='iOS App Development']")
		WebElement clickIosAppDev;
		
		@FindBy(xpath = "(//a[normalize-space()=\"Let's Discuss Your Project Today\"])[1]")
		WebElement clickIosLtsDscYourPoject;
		
		@FindBy(xpath = "//a[contains(text(),'Let’s Collaborate')]")
		WebElement clickIosLtsCollabrate;
		
		@FindBy(xpath = "//a[normalize-space()='Connect with Experts']")
		WebElement clickIosConectWithExprt;
		
		@FindBy(xpath = "//a[normalize-space()='Contact Us']")
		WebElement clickIosConectUs;
		
		@FindBy(xpath = "//a[normalize-space()='Get us on board']")
		WebElement clickIosGetUsOnBoard;
		
		// ***********Service>>design service >> Mobile app development>>Flutter app development locator object
		@FindBy(xpath = "(//*[text()='Flutter App Development'])[1]")
		WebElement clickFlutterApp;
		
		@FindBy(xpath = "//a[normalize-space()='Partner with us']")
		WebElement clickFlutterAppPartnerWithus;
		
		@FindBy(xpath = "//div[contains(@class,'elementor-element elementor-element-1ff37321 elementor-widget__width-initial elementor-widget-mobile__width-inherit elementor-widget elementor-widget-bridge_button')]//a[contains(@class,'center default')]")
		WebElement clickFlutterAppLetsGetStart;
		
		@FindBy(xpath = "//a[normalize-space()='INTERACT WITH US']")
		WebElement clickFlutterAppInteractWithUs;
		
		@FindBy(xpath = "//a[normalize-space()='Connect with experts']")
		WebElement clickFlutterAppConnectWithExp;
		// ***********Service>>design service >> Mobile app development>>Wearable app development locator object
		
		@FindBy(xpath = "//span[contains(@class,'elementor-icon-list-text')][normalize-space()='Wearable App Development']")
		WebElement clickWearableAppDev;
		
		@FindBy(xpath = "//a[normalize-space()='Claim your free consultation today']")
		WebElement clickWearableAppDevClaimFreeCnsltToday;
		
		@FindBy(xpath = "//a[normalize-space()='Contact us']")
		WebElement clickWearableAppDevContactUs;
		
		@FindBy(xpath = "//div[contains(@class,'elementor-element elementor-element-919b952 elementor-widget__width-inherit elementor-widget-mobile__width-inherit elementor-widget elementor-widget-bridge_button')]//a[contains(@class,'center default')][normalize-space()='Connect with us']")
		WebElement clickWearableAppDevContactWithUs;
		
		@FindBy(xpath = "//div[contains(@class,'elementor-element elementor-element-2bf2704 elementor-widget__width-inherit elementor-widget-mobile__width-inherit elementor-widget elementor-widget-bridge_button')]//a[contains(@class,'center default')][normalize-space()='Connect with us']")
		WebElement clickWearableAppDevContactWithUs1;
		
		@FindBy(xpath = "//a[normalize-space()='Get us on board']")
		WebElement clickWearableAppDevGetUsOnBoard;
		
		@FindBy(xpath = "//a[normalize-space()='Partner with us']")
		WebElement clickWearableAppDevPartnerWithUs;
		
		// ***********Service>>design service >> Mobile app development>>PWA app development locator object
		@FindBy(xpath = "(//*[text()='PWA App Development'])[1]")
		WebElement clickPWAAppDev;
		
		@FindBy(xpath = "//a[normalize-space()='Contact us now']")
		WebElement clickPWAAppDevContactUsNow;
		
		@FindBy(xpath = "//a[normalize-space()='Get started today']")
		WebElement clickPWAAppDevGetStrtToday;
		
		@FindBy(xpath = "//a[normalize-space()='Reach out to us']")
		WebElement clickPWAAppDevReachOutToUs;
		
		@FindBy(xpath = "//a[normalize-space()='Contact us for tailored solutions']")
		WebElement clickPWAAppDevContactUsForTailoredSolutions;
		
		@FindBy(xpath = "//a[normalize-space()='Get experts on Board']")
		WebElement clickPWAAppDevGetExpsOnBoard;
		
		// ***********Service>>Product Engineering>> Product Management page locator***************************************//
		
		@FindBy(xpath = "(//*[text()='Product Management'])[1]")
		WebElement clickPrdEngProductManagement;
		
		@FindBy(xpath = "//a[normalize-space()='GET IN TOUCH']")
		WebElement clickPrdEngProductManagementGetInTouch;
		
		@FindBy(xpath = "//a[contains(text(),'LET’S GET STARTED')]")
		WebElement clickPrdEngProductManagementLetGetStart;
		
		@FindBy(xpath = "//a[normalize-space()='HIRE PROJECT MANAGER']")
		WebElement clickPrdEngProductManagementHireProjectManager;
		
		@FindBy(xpath = "//a[normalize-space()='SCHEDULE A CALL']")
		WebElement clickPrdEngProductManagementScheduleAcall;
	
	
	//a[normalize-space()='Get started']

	public Service_Page(WebDriver driver) {

		PageFactory.initElements(driver, this); 
	}


	public void mouseHwrOnService(WebDriver driver) throws InterruptedException {
		try {

			Thread.sleep(5000);
			Actions actions = new Actions(driver);
			actions.moveToElement(mouseHoweverService).perform();
		} catch (Exception e) {
			System.out.println("An error occurred while performing mouse hover on the service element.");
			e.printStackTrace();

		}

	}

	public void clickSrvAppDsgnr() throws InterruptedException {
		try {
			System.out.println("Start click o  app design");
			clickAppDsgn.click();
		} catch (Exception e) {
			e.printStackTrace();
		}}

	public void clickSrvAGetTouch() throws InterruptedException {
		try {

			clickAppDsgnGetInTouch.click();
		} catch (Exception e) {
			e.printStackTrace();
		}}
	public void clickSrvAppDsgnrGetStrt() throws InterruptedException {
		try {

			clickAppDsgnGetStrt.click();
		} catch (Exception e) {
			e.printStackTrace();
		}}
	public void clickSrvAppDsgnrContWithEx() throws InterruptedException {
		try {

			clickAppDsgnContectWthExp.click();
		} catch (Exception e) {
			e.printStackTrace();
		}}
	public void clickSrvAppDsgnHireNowApp() throws InterruptedException {
		try {

			clickAppDsgnHirNowAppDsgn.click();
		} catch (Exception e) {
			e.printStackTrace();
		}}

	public void clickSrvUiUxDsgn() throws InterruptedException {
		try {

			clickUiUxDsgn.click();
		} catch (Exception e) {
			e.printStackTrace();
		}}
	public void clickSrvUiUxDsgnCntFrAFreeCnlt(WebDriver driver) throws InterruptedException {
		try {
			/*
			 * //actions.moveToElement(clickUiUxCntFrAFreeCnslt).perform();
			 * actions.doubleClick(clickUiUxCntFrAFreeCnslt);
			 * //clickUiUxCntFrAFreeCnslt.click();
			 */	
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", clickUiUxCntFrAFreeCnslt);
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}}
	public void clickSrvUiUxDsgnGetToTouch() throws InterruptedException {
		try {

			clickUiUxGetToTouch.click();
		} catch (Exception e) {
			e.printStackTrace();
		}}
	public void clickSrvUiUxDsgnCntWithExp() throws InterruptedException {
		try {

			clickUiUxCntWithExp.click();
		} catch (Exception e) {
			e.printStackTrace();
		}}
	public void clickSrvUiUxDsgnCntWithUs() throws InterruptedException {
		try {

			clickUiUxCntWithUs.click();
		} catch (Exception e) {
			e.printStackTrace();
		}}
	public void clickSrvUiUxDsgnGetStrt() throws InterruptedException {
		try {

			clickUiUxGetStrt.click();
		} catch (Exception e) {
			e.printStackTrace();
		}}

//***********************************************************************************
	public void clickSrvcPrdEngProductManagement() {

		clickPrdEngProductManagement.click();
		System.out.println("Click on 'Prd Eng Product Management'");
	}
	public void clickSrvcPrdEngProductManagementGetinTouch() {

		clickPrdEngProductManagementGetInTouch.click();
		System.out.println("Click on 'Prd Eng Product Management Get In Touch'");
	}
	public void clickSrvcPrdEngProductManagementLetGetStart() {

		clickPrdEngProductManagementLetGetStart.click();
		System.out.println("Click on 'Prd Eng Product Management Let Get Start'");
	}
	public void clickSrvcPrdEngProductManagementHireProjectManager() {

		clickPrdEngProductManagementHireProjectManager.click();
		System.out.println("Click on 'Prd Eng Product Management Hire Project Manager'");
	}
	public void clickSrvcPrdEngProductManagementScheduleAcall() {

		clickPrdEngProductManagementScheduleAcall.click();
		System.out.println("Click on 'Prd Eng Product Management Schedule A call'");
	}
	
	// ***********Service>>design service >> Mobile app development>>PWA app development page object
	public void clickSrvcPWAAppDev() {

		clickPWAAppDev.click();
		System.out.println("Click on 'PWA App Dev'");
	}
	public void clickSrvcPWAAppDevContactUsNow() {

		clickPWAAppDevContactUsNow.click();
		System.out.println("Click on 'PWA App Dev Contact Us Now'");
	}
	public void clickSrvcPWAAppDevGetStrtToday() {

		clickPWAAppDevGetStrtToday.click();
		System.out.println("Click on 'PWA App Dev Get Strt Today'");
	}
	public void clickSrvcPWAAppDevReachOutToUs() {

		clickPWAAppDevReachOutToUs.click();
		System.out.println("Click on 'PWA App Dev Reach Out To Us'");
	}
	public void clickSrvcPWAAppDevContactUsForTailoredSolutions() {

		clickPWAAppDevContactUsForTailoredSolutions.click();
		System.out.println("Click on 'PWA App Dev Contact Us For Tailored Solutions'");
	}
	public void clickSrvcPWAAppDevGetExpsOnBoard() {

		clickPWAAppDevGetExpsOnBoard.click();
		System.out.println("Click on 'PWA App Dev Get Exps On Board'");
	}
	
	// ***********Service>>design service >> Mobile app development>>Wearable app development page object
	public void clickSrvcclickWearableAppDev() {

		clickWearableAppDev.click();
		System.out.println("Click on 'Wearable App Dev'");
	}
	public void clickSrvcWearableAppDevClaimFreeCnsltToday() {

		clickWearableAppDevClaimFreeCnsltToday.click();
		System.out.println("Click on 'Wearable App Dev Claim Free Cnslt Today'");
	}
	public void clickSrvcWearableAppDevContactUs() {

		clickWearableAppDevContactUs.click();
		System.out.println("Click on 'Wearable App Dev Contact Us'");
	}
	public void clickSrvcWearableAppDevContactWithUs() {

		clickWearableAppDevContactWithUs.click();
		System.out.println("Click on 'Wearable App Dev Contact With Us'");
	}
	public void clickSrvcWearableAppDevContactWithUs1() {

		clickWearableAppDevContactWithUs1.click();
		System.out.println("Click on 'Wearable App Dev Contact With Us1'");
	}
	public void clickSrvcWearableAppDevGetUsOnBoard() {

		clickWearableAppDevGetUsOnBoard.click();
		System.out.println("Click on 'Wearable App Dev Get Us On Board'");
	}
	public void clickSrvcWearableAppDevPartnerWithUs() {

		clickWearableAppDevPartnerWithUs.click();
		System.out.println("Click on 'Wearable AppDev Partner With Us'");
	}
	
	// ***********Service>>design service >> Mobile app development>>Flutter app development page object
	
	public void clickSrvcFlutterApp() {

		clickFlutterApp.click();
		System.out.println("Click on 'Flutter App'");
	}
	public void clickSrvcFlutterAppPartnerWithus() {

		clickFlutterAppPartnerWithus.click();
		System.out.println("Click on 'Flutter App Partner With us'");
	}
	public void clickSrvcFlutterAppLetsGetStart() {

		clickFlutterAppLetsGetStart.click();
		System.out.println("Click on 'Flutter App Lets Get Start'");
	}
	public void clickSrvcFlutterAppInteractWithUs() {

		clickFlutterAppInteractWithUs.click();
		System.out.println("Click on 'Flutter App Interact With Us'");
	}
	public void clickSrvcFlutterAppConnectWithExp() {

		clickFlutterAppConnectWithExp.click();
		System.out.println("Click on 'FlutterAppConnectWithExp'");
	}
	
// ***********Service>>design service >> Mobile app development>>iOS app development page object
	
	public void clickSrvcIosAppDev() {

		clickIosAppDev.click();
		System.out.println("Click on 'Ios App Dev'");
	}
	public void clickSrvcIosAppDevLtsDscYourPoject() {

		clickIosLtsDscYourPoject.click();
		System.out.println("Click on 'Ios Lts Dsc Your Poject'");
	}
	public void clickSrvcIosAppDevLtsCollabrate() {

		clickIosLtsCollabrate.click();
		System.out.println("Click on 'Lets Collabrate '");
	}
	public void clickSrvcIosAppDevConectWithExprt() {

		clickIosConectWithExprt.click();
		System.out.println("Click on 'Conect With Exprt'");
	}
	public void clickSrvcIosAppDevConectUs() {

		clickIosConectUs.click();
		System.out.println("Click on 'Conect Us'");
	}
	public void clickSrvcIosAppDevGetUsOnBoard() {

		clickIosGetUsOnBoard.click();
		System.out.println("Click on 'Get Us On Board'");
	}
	
	// ***********Service>>design service >> Mobile app development>>Hybrid app development page Object
	public void clickSrvcHybridAppDev() {

		clickHybridAppDev.click();
		System.out.println("Click on 'Hybrid App Development'");
	}
	public void clickSrvcHybridAppDevGoHybrid() {

		clickHybridGoHybrid.click();
		System.out.println("Click on 'Go Hybrid'");
	}
	public void clickSrvcHybridAppDevGetInTouch() {

		clickHybridGetInTouch.click();
		System.out.println("Click on 'Get In Touch'");
	}
	public void clickSrvcHybridAppDevMakeAMoveWithNFX() {

		clickHybridMakeAMoveWithNFX.click();
		System.out.println("Click on 'Make A Move With NFX'");
	}
	public void clickSrvcHybridAppDevLtsWrkTogether() {

		clickHybridLtsWrkTogether.click();
		System.out.println("Click on 'Lets work Together'");
	}
	public void clickSrvcHybridAppDevContactUsNow() {

		clickHybridContactUsNow.click();
		System.out.println("Click on 'Contact Us Now'");
	}
	
	
	// ***********Service>>design service >> Mobile app development>>Android app development page object
	
	public void clickSrvcAndroidAppDev() {

		clickAndroidAppDev.click();
		System.out.println("Click on 'Android App Development'");
	}
	public void clickSrvcAndroidAppDevPartnerWithUs() {

		clickAndroidPartnerWithUs.click();
		System.out.println("Click on 'Partner With Us'");
	}
	public void clickSrvcAndroidAppDevContactwithUs() {

		clickAndroidContactwithUs.click();
		System.out.println("Click on 'Contact with Us'");
	}
	public void clickSrvcAndroidAppDevContactwithUs2() {

		clickAndroidContactwithUs2.click();
		System.out.println("Click on 'Contact with Us 2'");
	}
	public void clickSrvcAndroidAppDevGetInTouchNow() {

		clickAndroidGetInTouchNow.click();
		System.out.println("Click on 'Get In Touch Now '");
	}
	
	
	
	// ***********Service>>design service >> IT service>>IT Consulting
	public void clickSrvcItSvcItConsulting() {

		clickItConsulting.click();
		System.out.println("Click on 'It Consulting'");
	}

	public void clickSrvcItSvcItConsultingTalkToExpert() {

		clickTalkToExpert.click();
		System.out.println("Click on 'Talk To Expert'");
	}

	public void clickSrvcItSvcItConsultingLetGuideYou() {

		clickLetGuideYou.click();
		System.out.println("Click on 'Guide You'");
	}
	public void clickSrvcItSvcItConsultingLetCollaborate() {

		clickLetCollaborate.click();
		System.out.println("Click on 'Let Collaborate'");
	}
	public void clickSrvcItSvcItConsultingMakeAMove() {

		clickMakeAMove.click();
		System.out.println("Click on 'Let Collaborate'");
	}
	public void clickSrvcItSvcItConsultingReachOutToUs() {

		clickReachOutToUs.click();
		System.out.println("Click on 'Let Collaborate'");

		
	}
	
	//////////////////////////////////////////////////////
	
	//*************Service>>design service >> WebDesign xapth page class***************************l
		public void clickSrvcWebDesign() {

			clickWebDesign.click();
			System.out.println("Click on web design");
		}

		public void clickSrvcContactUsToday() {

			clickContactUsToday.click();
			System.out.println("Click on Contact us Today");
		}

		public void clickSrvcLetGetStart() {

			clickLetGetStart.click();
			System.out.println("Click on Let's Get Start");
		}

		public void clickSrvcContatUs() {

			clickContatUs.click();
			System.out.println("Click on Let's Get Start");
		}

		public void clickSrvcGetInTouch() {

			clickGetInTouch.click();
			System.out.println("Click on Get In Touch");
		}

		public void clickSrvcStartToday() {

			clickStartToday.click();
			System.out.println("Click on Start Today");
		}

		// ***********Service>>design service >> IT service>>It staff Augmention page
		// Object*******************
		public void clickSrcItStaffAugmention() {

			clickItStaffAugmention.click();
			System.out.println("Click on It Staff Augumention");
		}

		public void clickSrvcLetDiscussYurProject() {

			clickLetDiscussYurProject.click();
			System.out.println("Click on Let's discuss Your Porject");
		}

		public void clickSrvcLetUsYouKnowYrRequirment() {

			clickLetUsYouKnowYrRequirment.click();
			System.out.println("Click on Let us know Your Requirment");
		}

		public void clickSrvcLetDiscussYrRequiremnt() {

			clickLetDiscussYrRequiremnt.click();
			System.out.println("Click on Let Discuss Your Requirment ");
		}
		// ***********Service>>design service >> IT service>>IT Outsourcing
		// pageObject*******************

		public void clickSrvcItSvcItOutsourcing() {

			clickItOutsourcing.click();
			System.out.println("Click on ");
		}

		public void clickSrvcItSvcItOutsourcingContactUs() {

			clickContactUs.click();
			System.out.println("Click on Contact Us");
		}

		public void clickSrvcItSvcItOutsourcingBookAConsultation() {

			clickBookAConsultation.click();
			System.out.println("Click on Book A Consultation");
		}

		public void clickSrvcItSvcItOutsourcingPartnerWithUs() {

			clickPartnerWithUs.click();
			System.out.println("Click on Partner With You");
		}

		public void clickSrvcItSvcItOutsourcingclickLetsGrowTogether() {

			clickLetsGrowTogether.click();
			System.out.println("Click on 'Let Grow Together'");
		}

		public void clickSrvcItSvcItOutsourcingLetsHelpYou() {

			clickLetsHelpYou.click();
			System.out.println("Click on 'Lets Hepl You'");
		}

	}
	


