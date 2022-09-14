package com.OrangeHRM.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.testBase.BaseClass;

public class LoginPage extends BaseClass{
	
	public WebDriver driver;
	
	//Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver; //Assigning the driver passed from test cases to the local driver.
		PageFactory.initElements(driver, this);
	}
	
	//Username Field
	@FindBy(name="username")
	WebElement txtUsername;
	
	//Password Field
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement btnLogin;
	
	@FindBy(xpath="//p[contains(@class,'orangehrm-login-forgot-header')]")
	WebElement lnkForgotYourPassword;
	
		
	public void setUsername(String uname) {
		txtUsername.clear();
		txtUsername.sendKeys(uname);
		String val = txtUsername.getAttribute("value");
		//System.out.println("Value entered in the Username field is - " + val);
		logger.info("Value entered in the Username field is - " + val);
	}
	
	public void setPassword(String pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
		String val = txtPassword.getAttribute("value");
		//System.out.println("Value entered in the Password field is - " + val);
		logger.info("Value entered in the Password field is - " + val);
	}
	
	public void clickLoginButton() {
		btnLogin.click();
		//System.out.println("Clicked on Login button");
		logger.info("Clicked on Login button");
	}
	
	public String getForgotPasswordText() {
		String val = lnkForgotYourPassword.getText();
		return val;
	}
	
	

}
