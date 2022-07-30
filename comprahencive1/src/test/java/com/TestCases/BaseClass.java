package com.TestCases;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;




public class BaseClass {
	public static WebDriver driver;
	//private Object FileUtils;
	
	public WebDriver initializeDriver() throws IOException {
		Properties prop=new Properties();
		FileInputStream fis =new FileInputStream("C:\\Users\\mindedge217\\eclipse-workspace\\comprahencive1\\src\\test\\java\\com\\utilities\\frame2.property");
	prop.load(fis);	
	String browserName=prop.getProperty("browser");
	if(browserName.equals("chrome")) 
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+".//Drivers/chromedriver.exe");
		 driver =  new ChromeDriver();
	}
	else if(browserName.equals("firefox"))
	{
		driver = new FirefoxDriver();
	
	}	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	return driver;
	
}

}