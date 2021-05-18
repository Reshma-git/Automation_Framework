package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddProductPage {
	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver,120);
	
	public AddProductPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(linkText="Products") WebElement product;
	//@FindBy(xpath="//h6[contains(text(),'Systems and Components')]")WebElement components;
	@FindBy(xpath="//header/nav[1]/div[2]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]") WebElement door;
	//@FindBy(id="attribute-filters-rack-height-24-u-rack-height") WebElement check;
	
	
	@FindBy(xpath="//body/div[1]/div[1]/main[1]/div[1]/div[1]/div[3]/div[1]/article[1]/div[1]/div[2]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]") WebElement details;
	@FindBy(xpath="//body/div[1]/div[1]/main[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/price-block[1]/div[1]/div[4]/a[1]") WebElement add;
	


	

	public void productToCart() throws InterruptedException
	{
		product.click();
		//components.click();
		door.click();
		Thread.sleep(1000);
		//check.click();
		
		//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.id("attribute-filters-rack-height-24-u-rack-height"))).click();
		//details.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("attribute-filters-rack-height-24-u-rack-height")));
		driver.findElement(By.id("attribute-filters-rack-height-24-u-rack-height")).click();
		//WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[1]/div[1]/main[1]/div[1]/div[1]/div[3]/div[1]/article[1]/div[1]/div[2]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]/*[1]")));
		driver.findElement(By.xpath("//body/div[1]/div[1]/main[1]/div[1]/div[1]/div[3]/div[1]/article[1]/div[1]/div[2]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]/*[1]")).click();
		add.click();
		
	}
	


}
