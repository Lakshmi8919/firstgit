package com.TestCases;

import java.io.File;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import com.PaageObjects.LoginPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


import screenshot.hook;
public class TClogin  extends BaseClass  {

public WebDriver driver;

public LoginPage lp;
ExtentHtmlReporter spark;
ExtentReports extent;
ExtentTest test1;
private static Logger log = LogManager.getLogger(BaseClass.class.getName());
	
@BeforeClass
public <ExcelRead> void read() {
	//ExcelRead read =new ExcelRead ();
	spark =new  ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/reporter/Read.html"));
	extent=new ExtentReports();
	extent.attachReporter(spark);
	spark.config().setDocumentTitle("Data");
}

	@Test
	public void loginTest() throws IOException {
		ExcelRead read=new ExcelRead();
		log.info("Driver is initialize");
		log.info("Navigate to LoginPage");
		BaseClass baseobject =new BaseClass();
		WebDriver driver =baseobject.initializeDriver();
 driver.get("https://tide.com/en-us");
 LoginPage lp= new LoginPage(driver);
 LoginPage.navigateToExcelRead(driver,read.getStringData(0,0,0));
	lp.getRegister().click();
	 lp.getSignupnow().click();
 lp.getFirstname().sendKeys("Lakshmi");
 lp.getEmailaddres().sendKeys("luck8919@gmail.com");
 lp.getPassword().sendKeys("luckyNaren@123");
 lp.getCreateaccount().click();
	}
	@AfterTest
	
 

 @After
 public void tearDown() {
 	extent.flush();
 	driver.quit();
 	
 }
	
}
	






	


