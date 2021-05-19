package com.automation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.automation.pages.BaseClass;
import com.automation.pages.CartPage;
import com.automation.pages.LanguagePage;
import com.automation.pages.LoginPage;
import com.automation.pages.LogoutPage;
import com.automation.pages.MegaMenu;
//import com.automation.pages.MegaMenu;
import com.automation.utilities.BrowserFactory;
import com.automation.utilities.ExcelDataProvider;
import com.automation.utilities.Helper;

public class LoginTestCaseOne extends BaseClass {
	
	
	
	
	@Test(priority=1)
	public void loginApp() throws InterruptedException
	
	{
		
		logger=report.createTest("Login to Schroff");
		//System.out.println(driver.getTitle());
		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
		
		logger.info("Starting application");
		
		loginPage.loginToCRM(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		//loginPage.loginToCRM("reshma.bhonde@gmail.com","Vit@l4health");
		logger.pass("Login Success!!!");
		
		//Helper.captureScreenshots(driver);
		
		
	}
	@Test(priority=2)
	public void languageSelect() throws InterruptedException
	{
		logger=report.createTest("Chage Locale");
		LanguagePage langPage=PageFactory.initElements(driver, LanguagePage.class);
		langPage.changeLocale();
		logger.pass("Locale changed");
	}
	
	@Test(priority=5)
	public void configureApp() throws InterruptedException
		
		{
			
			logger=report.createTest("View Cart");
			//System.out.println(driver.getTitle());
			CartPage c1=PageFactory.initElements(driver, CartPage.class);
			
			c1.viewCart();
			
			//Helper.captureScreenshots(driver);
			
			
		}
		
	
	
	@Test(priority=3)
		public void menuVisit() throws InterruptedException
		{
		logger=report.createTest("Menu Visit");
		MegaMenu megaMenu=PageFactory.initElements(driver, MegaMenu.class);
		megaMenu.visitToMegaMenu();
		logger.pass("Visited all MegaMenus");
		
		
	}
	@Test(priority=4)
	public void signout() throws InterruptedException
	{
		logger=report.createTest("Logout");
		LogoutPage logoutPage=PageFactory.initElements(driver, LogoutPage.class);
		logoutPage.doLogout();
		logger.pass("Logout successfully!!!!");
	}


	

}
