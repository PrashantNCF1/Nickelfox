package com.nickelfox.baseclass;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
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
               options.addArguments("--headless");
		options.addArguments("--disable-gpu");
		options.addArguments("--window-size=1920,1080");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--start-maximized");
		//options.addArguments("--remote-allow-origins=*");
		options.addArguments("--user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.114 Safari/537.36\r\n");
		options.addArguments("--allow-insecure-localhost");
        //specifically this line here :)
		options.setAcceptInsecureCerts(true);
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














