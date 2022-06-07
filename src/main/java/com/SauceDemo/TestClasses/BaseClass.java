package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauceDemo.POMClasses.Login;

public class BaseClass 
{
	WebDriver driver;
	
	   @Parameters("browserName")
		@BeforeMethod
		public void setUp(String browserName)
		{
		
			if (browserName.equals("chrome"))
			{
		       System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		       driver = new ChromeDriver();
			}
			else
			{
			   System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			   driver = new FirefoxDriver();
		    }	
		
		//log.info("Browser Open");
		//PropertyConfigurator.configure("log4j.properties");
		
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		//log.info("URL is Open");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Login lp = new Login(driver);
		lp.sendUsername();
		//log.info("Enter the Username");
		
		lp.sendPassword();
		//log.info("Enter the Password");
		
		lp.clickLoginButton();
		//log.info("Click on LoginButton");
		
		}
	   
	   @AfterMethod
		public void tearDown() throws IOException
		{
		
		driver.quit();
		//log.info("End of Program");
   
}
}
