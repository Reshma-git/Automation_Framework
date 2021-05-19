package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LanguagePage {
	WebDriver driver;
	public  LanguagePage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	@FindBy (xpath="//header/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/*[1]") WebElement arrow;
	@FindBy(css="body.site-schroff.ecommerce-js.js-scroll-lock:nth-child(2) div.dialog-off-canvas-main-canvas:nth-child(3) div.layout-container header.header div.header__wrapper_top div.block div.region-nav.region-nav--open div.region-nav__overlay div.region-nav__container ul.region-nav__regions li.region-nav__region:nth-child(4) div.region-nav__list-group ul.region-nav__list li.region-nav__item:nth-child(1) div.region-link.js-region-link-exists div.region-link__content ul.region-link__list li.region-link__item > a.region-link__link") 
	WebElement eng;
	@FindBy(css="body.page-node-landing_page.page-node-218926.site-schroff.ecommerce-js.js-scroll-lock:nth-child(2) div.dialog-off-canvas-main-canvas:nth-child(3) div.layout-container header.header div.header__wrapper_top div.block div.region-nav.region-nav--open div.region-nav__overlay div.region-nav__container ul.region-nav__regions li.region-nav__region:nth-child(4) div.region-nav__list-group ul.region-nav__list li.region-nav__item:nth-child(5) div.region-link.js-region-link-exists div.region-link__content ul.region-link__list li.region-link__item:nth-child(1) > a.region-link__link")WebElement ChinaLocale;
	@FindBy(css="body.page-node-landing_page.page-node-218926.site-schroff.ecommerce-js.js-scroll-lock:nth-child(2) div.dialog-off-canvas-main-canvas:nth-child(3) div.layout-container header.header div.header__wrapper_top div.block div.region-nav.region-nav--open div.region-nav__overlay div.region-nav__container ul.region-nav__regions li.region-nav__region:nth-child(3) div.region-nav__list-group ul.region-nav__list li.region-nav__item:nth-child(12) div.region-link.js-region-link-exists div.region-link__content ul.region-link__list li.region-link__item:nth-child(1) > a.region-link__link") WebElement franceLocale;
	
	
	
	
	public void changeLocale() throws InterruptedException
	{
		Thread.sleep(500);
		arrow.click();
		eng.click();
		
		
		
		
	}
	
	
}
