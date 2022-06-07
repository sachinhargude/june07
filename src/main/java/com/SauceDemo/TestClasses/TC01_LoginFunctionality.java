package com.SauceDemo.TestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePage;


public class TC01_LoginFunctionality extends BaseClass
{

	@Test
	public void loginFunctionalityTest() throws IOException
	{
		
	String expectedTitle = "Swag Labs";
	String actualTitle = driver.getTitle(); 
	//log.info("Verify the Test Case");
	                                               //Test  change test cases
	                                              
	// Hard Assert
	Assert.assertEquals(actualTitle, expectedTitle);
	
		
		HomePage hp = new HomePage(driver);
		hp.clickMenuButton();
		//log.info("Click on MenuButton");
		
		hp.clickLogoutButton();
		//log.info("Click on LogoutButton");
		
	}
	
	
}


