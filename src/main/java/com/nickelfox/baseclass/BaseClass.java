package com.nickelfox.baseclass;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.ITestResult;

import org.testng.annotations.AfterMethod;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	//@BeforeMethod()
	public void launcTheBrowser() throws InterruptedException {

		//WebDriverManager.firefoxdriver().setup();
		WebDriverManager.chromedriver().setup();


		//FirefoxOptions c = new FirefoxOptions();
		//ChromeOptions c = new ChromeOptions();
		//c.addArguments("--incognito");
		//c.addArguments("--disable-notifications");
		//c.addArguments("--remote-allow-origins=*");
		//c.addArguments("start-maximized"); // open Browser in maximized mode
		//	c.addArguments("--disable-infobars"); // disabling infobars
		//c.addArguments("--headless");
		//driver = new ChromeDriver(c);
		//driver = new FirefoxDriver(c);
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
	    driver = new ChromeDriver(options);
		//driver = new ChromeDriver();
		//driver = new FirefoxDriver(c);
		driver.navigate().to("https://www.nickelfox.com/");
		driver.manage().window().maximize();
		
		//driver.navigate().to("https://www.nickelfox.com/");
		//Thread.sleep(8000);

		System.out.println("user navigate to the website");




	}

	@AfterMethod 
	public void tearDown(ITestResult result) throws InterruptedException {
		if(ITestResult.FAILURE==result.getStatus()){
			try{

				TakesScreenshot screenshot=(TakesScreenshot)driver;
				File src=screenshot.getScreenshotAs(OutputType.FILE);
				String timestamp = new SimpleDateFormat("yyyy-MM-dd--hh-mm").format(new Date());
				FileUtils.copyFile(src, new File (".\\Screenshots\\"  +" "+ timestamp +".png"));
				System.out.println("Successfully captured a screenshot");
			}catch (Exception e){
				System.out.println("Exception while taking screenshot "+e.getMessage());
			} 
		}
		Thread.sleep(5000);
		//driver.quit();
	}
}	














