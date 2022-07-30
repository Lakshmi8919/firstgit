package com.PaageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {
	public WebDriver driver;
	By Register =(By.xpath("//span[@class='login-register']/a"));
	By Signupnow =(By.xpath("//*[@id='site-content']/div/div/div/div/div[1]/div/div/div/div[2]/div/p[6]/a"));
	By Firstname =(By.xpath("//input[@id='name']"));
	By Emailaddres =(By.xpath("//*[@id='email']"));
	By Password =(By.xpath("//*[@id='password']"));
	By Createaccount=(By.xpath("//input[@type='submit']"));
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		

}

	public WebElement getRegister() {
		return driver.findElement(Register);
	}

	
	

	public WebElement getSignupnow() {
		// TODO Auto-generated method stub
		return driver.findElement(Signupnow);
	}

	
	public WebElement getFirstname() {
		// TODO Auto-generated method stub
		return driver.findElement(Firstname);
	}
	public WebElement getEmailaddres() {
		// TODO Auto-generated method stub
		return driver.findElement(Emailaddres);
	}
	public WebElement getPassword() {
		// TODO Auto-generated method stub
		return driver.findElement(Password);
	}

	public WebElement getCreateaccount() {
		// TODO Auto-generated method stub
		return driver.findElement(Createaccount);
	}

	public static void navigateToExcelRead(WebDriver driver2, Object stringData) {
		// TODO Auto-generated method stub
		
	}
}
