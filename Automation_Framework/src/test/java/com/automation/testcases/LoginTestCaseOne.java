package com.automation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.automation.pages.BaseClass;
import com.automation.pages.LoginPage;
import com.automation.pages.MegaMenu;
import com.automation.utilities.BrowserFactory;
import com.automation.utilities.ExcelDataProvider;
import com.automation.utilities.Helper;

public class LoginTestCaseOne extends BaseClass {
	
	@Test(priority=1)
	public void loginApp() throws InterruptedException
	
	{
		
		logger=report.createTest("Login to CRM");
		//System.out.println(driver.getTitle());
		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
		
		logger.info("Starting application");
		
		loginPage.loginToCRM(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		//loginPage.loginToCRM("reshma.bhonde@gmail.com","Vit@l4health");
		logger.pass("Login Success!!!");
		
		//Helper.captureScreenshots(driver);
		
		
	}
	
	@Test(priority=2)
		public void menuVisit() throws InterruptedException
		{
		logger.info("visit megamenu to CRM");
		MegaMenu megaMenu=PageFactory.initElements(driver, MegaMenu.class);
		megaMenu.visitToMegaMenu();
		
		
		//Helper.captureScreenshots(driver);
		
		
	}
	/*@Test(priority=3)
	public void addcart() throws InterruptedException
	{
		AddProductPage p1=PageFactory.initElements(driver, AddProductPage.class);
		p1.productToCart();
		
	}*/


	

}
