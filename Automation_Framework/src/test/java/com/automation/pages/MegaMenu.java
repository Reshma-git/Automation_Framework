package com.automation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MegaMenu {
	
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	//WebDriverWait wait = new WebDriverWait(driver,20);
	public MegaMenu(WebDriver ldriver)
	{
		this.driver=ldriver;
		
	}

	//@FindBy(xpath="//header/nav[1]/div[2]/div[2]/div[1]/ul[1]/li[1]/a[1]") WebElement productsMenu;
	@FindBy(linkText="Industries") WebElement industriesMenu;
	@FindBy(linkText="Services") WebElement servicesMenu;
	@FindBy(linkText="Resources") WebElement resourcesMenu;
	@FindBy(css=":nth-child(1) > .site-nav__link") WebElement productsMenu;
	@FindBy(linkText="Brochures") WebElement brochursMenu;
	@FindBy(linkText="Collaborative Design")WebElement serviceSubmenu;
	//@FindBy(xpath="//a[contains(text(),'Railway Technology Overview')]") WebElement pdfOne;
	@FindBy (css=":nth-child(2) > .resource-link > .resource-link__link > .external") WebElement pdfOne;
	@FindBy(linkText="Commercial Aircraft") WebElement industriesSubmenu;
	@FindBy(xpath="//h3[contains(text(),'We Connect and Protect')]") WebElement scrollElement;
	//@FindBy (xpath="//header/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/*[1]") WebElement arrow;
	//@FindBy(css="body.site-schroff.ecommerce-js.js-scroll-lock:nth-child(2) div.dialog-off-canvas-main-canvas:nth-child(3) div.layout-container header.header div.header__wrapper_top div.block div.region-nav.region-nav--open div.region-nav__overlay div.region-nav__container ul.region-nav__regions li.region-nav__region:nth-child(4) div.region-nav__list-group ul.region-nav__list li.region-nav__item:nth-child(1) div.region-link.js-region-link-exists div.region-link__content ul.region-link__list li.region-link__item > a.region-link__link") 
	WebElement eng;
	
	@FindBy(xpath="//header/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/commerce-icon[1]/div[1]/*[1]") WebElement cardImage;
	@FindBy(xpath="//header/nav[1]/div[2]/div[3]/div[1]/div[1]/div[5]/div[2]/div[1]/input[1]") WebElement coveoSearch;
	@FindBy(xpath="//header/nav[1]/div[2]/div[3]/div[1]/div[1]/div[5]/a[1]") WebElement searchButton;
	

	
	


	
	public void visitToMegaMenu() throws InterruptedException
	{
		
		productsMenu.click();
		Thread.sleep(500); 
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollElement);
 

		Thread.sleep(500);		
		industriesMenu.click();
		Thread.sleep(1000);
		
		
		servicesMenu.click();
		//serviceSubmenu.click();
		Thread.sleep(500);
		
		resourcesMenu.click();
		//brochursMenu.click();
		Thread.sleep(1000);
	
		
	}
}
