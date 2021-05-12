package com.automation.pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.automation.utilities.BrowserFactory;
import com.automation.utilities.ConfigDataProvider;
import com.automation.utilities.ExcelDataProvider;
import com.automation.utilities.Helper;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class BaseClass {
	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;
	public ExtentReports report;
	public ExtentTest logger;
	
	
	
	@BeforeSuite
	public void setUpSuite()
	{
		excel=new ExcelDataProvider();
		config=new ConfigDataProvider();
		ExtentHtmlReporter extent= new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Report/FrerCRM_"+Helper.getCurrentDateTime()+".html"));
		report=new ExtentReports();
		report.attachReporter(extent);
		

		
	}
	@BeforeClass
	public void setUp()
	{
		driver= BrowserFactory.startApplication(driver,config.getBrowser(), config.getURL());
	}
	
	@AfterMethod
	public void tearDownMethod(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			//Helper.captureScreenshots(driver);
			
				logger.fail("Test Failed",MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshots(driver)).build());
			
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
		
				logger.pass("Test Passed",MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshots(driver)).build());
		}
		
		report.flush();
	}
	
	
	@AfterClass
	public void tearDown()
	{
		BrowserFactory.quitBrowser(driver);
	}
	

}
