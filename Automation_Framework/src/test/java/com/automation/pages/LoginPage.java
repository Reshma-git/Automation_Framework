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
	//@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/header[1]/nav[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/a[1]/span[1]")  WebElement accountName;
	//@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/header[1]/nav[1]/div[1]/div[1]/ul[1]/li[2]/ul[1]/li[5]/a[1]") WebElement logoutButton;
	
	@FindBy(xpath="//a[contains(text(),'Products')]") WebElement product;
	//@FindBy(xpath="//header/nav[1]/div[2]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/ul[1]/li[3]/a[1]") WebElement door;
	@FindBy(id="attribute-filters-works-with-varistar-cp-works-with") WebElement check;
	@FindBy(xpath="//body/div[1]/div[1]/main[1]/div[1]/div[1]/div[3]/div[1]/article[1]/div[1]/div[2]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]") WebElement details;
	@FindBy(xpath="//body/div[1]/div[1]/main[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/price-block[1]/div[1]/div[4]/a[1]") WebElement add;
	


	//WebElement door= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//header/nav[1]/div[2]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/ul[1]/li[3]/a[1]")));
	
	
	
	
	//@FindBy(xpath="//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']") WebElement logInButton;
	//@FindBy(name="email") WebElement emailAddress;
	//@FindBy(name="password") WebElement pass;
	//@FindBy(xpath="//div[@class='ui fluid large blue submit button']") WebElement logInButtonNext;
	
//	@FindBy(name="username") WebElement uname;
//	@FindBy(name="password") WebElement pass;
//	@FindBy(xpath="//input[@value='Login']") WebElement loginButton;
	
	/**
	 * @param emailApp
	 * @param passApp
	 * @throws InterruptedException 
	 */
	public void loginToCRM(String emailApp, String passApp) throws InterruptedException
	{
		//Thread.sleep(8000);
		
		logInButton.click();
		emailAddress.sendKeys(emailApp);
		pass.sendKeys(passApp);
		logInButtonNext.click();
		
       
		
		
		
	}

}
