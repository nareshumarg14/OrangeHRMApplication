package com.OrangeHRM.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.LoginPage;
import com.OrangeHRM.testBase.BaseClass;

public class TC002_CheckForgotYourPasswordText extends BaseClass{
	
	@Test
	public void forgotYourPasswordTest() {
		LoginPage lp = new LoginPage(driver);
		String val = lp.getForgotPasswordText();
		Assert.assertEquals(val, "Forgot your password?","Forgot your password? element is missing");
		logger.info("Forgot your password? element is existing");
	}

}
