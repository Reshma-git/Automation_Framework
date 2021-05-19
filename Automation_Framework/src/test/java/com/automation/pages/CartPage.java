package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
	WebDriver driver;
	
	public CartPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	@FindBy(xpath="//header/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/commerce-icon[1]/div[1]/*[1]") WebElement cardImage;
	@FindBy(xpath="//body/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/article[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/a[1]")
	WebElement configurator;
	@FindBy(xpath ="//body/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/article[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/p[2]/a[1]") WebElement configNow;
	@FindBy (xpath="//a[contains(text(),'All configurators')]") WebElement allConfig;
	
	

	
	public void viewCart() throws InterruptedException
	
	{	
		cardImage.click();
		//configurator.click();
		Thread.sleep(400);
	
	
	
	}

}
