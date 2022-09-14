package com.OrangeHRM.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMPage {
	
	public WebDriver driver;
	
	//Constructor
	public PIMPage(WebDriver driver) {
		this.driver = driver; //Assigning the driver passed from test cases to the local driver.
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//span[contains(text(),'')])[2]")
	WebElement elePIMLeftSide;
	
	public boolean pimElementExists() {
		boolean status = elePIMLeftSide.isDisplayed();
		return status;
	}
}
