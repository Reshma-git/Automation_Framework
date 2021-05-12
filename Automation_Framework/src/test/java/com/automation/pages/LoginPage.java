package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
		
	}
	@FindBy(xpath="//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']") WebElement logInButton;
	@FindBy(name="email") WebElement emailAddress;
	@FindBy(name="password") WebElement pass;
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']") WebElement logInButtonNext;
	
//	@FindBy(name="username") WebElement uname;
//	@FindBy(name="password") WebElement pass;
//	@FindBy(xpath="//input[@value='Login']") WebElement loginButton;
	
	/**
	 * @param unameApp
	 * @param passApp
	 * @throws InterruptedException 
	 */
	public void loginToCRM(String emailApp, String passApp) throws InterruptedException
	{
		Thread.sleep(8000);
		
		logInButton.click();
		emailAddress.sendKeys(emailApp);
		pass.sendKeys(passApp);
		logInButtonNext.click();
		
	}

}
