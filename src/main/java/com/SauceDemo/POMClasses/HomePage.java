package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage 
{
	private WebDriver driver;
	 
	 @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
	 private WebElement menubutton;
	 
	 public void clickMenuButton()
	 {
		 menubutton.click();
	 }
		
	 @FindBy(xpath = "//a[@id='logout_sidebar_link']")
	 private WebElement logoutbutton;
	 
	 public void clickLogoutButton()
	 {
		 logoutbutton.click();
	 }	
		
	 public HomePage(WebDriver driver)
	 {
		 this.driver = driver;
		 
		 PageFactory.initElements(driver, this); 
		 
	 }
}
