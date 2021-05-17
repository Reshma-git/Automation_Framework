package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MegaMenu {
	
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	//WebDriverWait wait = new WebDriverWait(driver,20);
	public MegaMenu(WebDriver ldriver)
	{
		this.driver=ldriver;
		
	}

	@FindBy(xpath="//header/nav[1]/div[2]/div[2]/div[1]/ul[1]/li[1]/a[1]") WebElement productsMenu;
	@FindBy(linkText="Industries") WebElement industriesMenu;
	@FindBy(linkText="Services") WebElement servicesMenu;
	@FindBy(linkText="Resources") WebElement resourcesMenu;
	@FindBy(linkText="Brochures") WebElement brochursMenu;
	@FindBy(linkText="Collaborative Design")WebElement serviceSubmenu;
	@FindBy(linkText="IP-Pro - Flexible IP 65 enclosure solution for harsh environments") WebElement pdfOne;
	@FindBy(linkText="Commercial Aircraft") WebElement industriesSubmenu;
	@FindBy(xpath="//h3[contains(text(),'We Connect and Protect')]") WebElement scrollElement;
	
	
	public void visitToMegaMenu() throws InterruptedException
	{
	
		
		productsMenu.click();
		Thread.sleep(500); 
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollElement);
 

		Thread.sleep(500);		
		industriesMenu.click();
		Thread.sleep(1000);
		//industriesSubmenu.click();
		//Thread.sleep(2000);
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollElement);
		
		servicesMenu.click();
		//serviceSubmenu.click();
		Thread.sleep(500);
		
		resourcesMenu.click();
		brochursMenu.click();
		pdfOne.click();
		Thread.sleep(2000);
		
		 //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		//Thread.sleep(8000);
		
		
       
		
		
		
	}
}
