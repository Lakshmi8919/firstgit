package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver sdriver;
	
	public  LoginPage(WebDriver rdriver) {
		sdriver=rdriver;
		PageFactory.initElements(rdriver,this);
	
	}
		@FindBy(xpath="//span[@class='login-register']/a")
		@CacheLookup
		WebElement textRegister;
		
		@FindBy(xpath="//*[@id='site-content']/div/div/div/div/div[1]/div/div/div/div[2]/div/p[6]/a")
		@CacheLookup
		WebElement textSignupnow;
		
		@FindBy(xpath ="//input[@id='name']")
		@CacheLookup
		WebElement textFirstname;
		
		@FindBy(xpath="//*[@id='email']")
		@CacheLookup
		WebElement textemail;
		
		@FindBy(xpath="//*[@id='password']")
		@CacheLookup
		WebElement textPassword;
		

		@FindBy(xpath="//input[@type='submit']")
		@CacheLookup
		WebElement textCreateaccount;
	
	
	public void clickRegister() {
	textRegister.click();
	}
	public void clickSignupnow() {
		textSignupnow.click();
	}
	public void setFirstname(String Fname) {
		textFirstname.clear();
		textFirstname.sendKeys(Fname);
	}
	public  void setEmailaddress(String Email) {
		textemail.clear();
		textemail.sendKeys(Email);
	}
	public void setPassword(String pwd) {
		textPassword.clear();
		textPassword.sendKeys(pwd);
	}
	public void clickCreateaccount() {
		textCreateaccount.click();
		}
}