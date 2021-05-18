package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LogoutPage {
	WebDriver driver;
	public  LogoutPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy (css="body.page-node-landing_page.page-node-218926.site-schroff.ecommerce-js:nth-child(2) div.dialog-off-canvas-main-canvas:nth-child(3) div.layout-container header.header nav.mega-menu div.mega-menu__secondary.mega-menu__secondary--ecommerce div.ecommerce-nav.ecommerce-nav--auth ul.ecommerce-nav__items.list-unstyled li.ecommerce-nav__nav-item.ecommerce-nav__nav-item--below div.row a.link.link--alt.ecommerce-nav__toggle.js-link-exists > span:nth-child(1)")
	WebElement logout;
	@FindBy (xpath="//header/nav[1]/div[1]/div[1]/ul[1]/li[2]/ul[1]/li[5]/a[1]") WebElement logoutButton;
	
	public static void hoverAndClick(WebDriver driver, WebElement elementToHover,WebElement elementToClick)
	{
		Actions action=new Actions(driver);
		action.moveToElement(elementToHover).click(elementToClick).build().perform();
	}
	
	public void doLogout() throws InterruptedException {
		Thread.sleep(500); 
		
		hoverAndClick(driver,logout,logoutButton);
		
	}
	
	
}
