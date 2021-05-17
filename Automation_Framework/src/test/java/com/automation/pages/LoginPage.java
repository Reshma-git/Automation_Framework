package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver;
	//WebDriverWait wait = new WebDriverWait(driver,20);
	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
		
	}
	
	@FindBy(xpath="//header/nav[1]/div[1]/div[1]/ul[1]/li[3]") WebElement logInButton;
	@FindBy(id= "sfid-username") WebElement emailAddress;
	@FindBy(id="sfid-password") WebElement pass;
	@FindBy(id="sfid-submit") WebElement logInButtonNext;
	@FindBy(linkText="Services") WebElement services;


	
	
	/**
	 * @param emailApp
	 * @param passApp
	 * @throws InterruptedException 
	 */
	public void loginToCRM(String emailApp, String passApp) throws InterruptedException
	{
		
		Thread.sleep(3000); 
		logInButton.click();
		emailAddress.sendKeys(emailApp);
		pass.sendKeys(passApp);
		logInButtonNext.click();
		Thread.sleep(1000); 
		
		
       
		
		
		
	}

}
