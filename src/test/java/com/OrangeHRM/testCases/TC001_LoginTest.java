package com.OrangeHRM.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.LoginPage;
import com.OrangeHRM.pageObjects.PIMPage;
import com.OrangeHRM.testBase.BaseClass;

public class TC001_LoginTest extends BaseClass {	
	@Test
	public void loginTest() {
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(prop.getProperty("username"));
		lp.setPassword(prop.getProperty("password"));
		lp.clickLoginButton();
		
		PIMPage pim = new PIMPage(driver);
		boolean status = pim.pimElementExists();
		Assert.assertEquals(status, true, "User did not logged in successfully");
		//System.out.println("User has logged in successfully");
		
		logger.info("User has logged in successfully");
	}
	
	

}
