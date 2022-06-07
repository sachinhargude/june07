package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	private WebDriver driver;
	private Actions act;
	 
		@FindBy(xpath = "//input[@id='user-name']")
		private WebElement username;
		
		public void sendUsername()
		{
			username.sendKeys("standard_user");
		}
		
		@FindBy(xpath = "//input[@id='password']")
		private WebElement password;
		
		public void sendPassword()
		{
			password.sendKeys("secret_sauce");
		}
		
		@FindBy(xpath = "//input[@id='login-button']")
		private WebElement loginbutton;
		
		public void clickLoginButton()
		{
			act.click(loginbutton).perform();
		}
		
		//constructor declare
		
		public Login(WebDriver driver)
		{
			this.driver = driver;
			
			//selenium class
			PageFactory.initElements(driver, this);
			
			act = new Actions(driver);
		}
		
		
	}
