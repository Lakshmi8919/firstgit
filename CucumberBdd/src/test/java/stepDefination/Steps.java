package stepDefination;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import screenShots.hook;

public class Steps {
	public WebDriver driver;
	 public LoginPage l;
	
	 ExtentHtmlReporter spark;
	 ExtentReports extent;
	 ExtentTest test1;
	 private static Logger log = LogManager.getLogger(Steps.class.getName());

	 @Before
	 public <ExcelRead> void read() {
	 	//ExcelRead read =new ExcelRead ();
	 	spark =new  ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/reporter/Read.html"));
	 	extent=new ExtentReports();
	 	extent.attachReporter(spark);
	 	spark.config().setDocumentTitle("Data");
	 }


@Given("User Launch Chrome browser")
public void user_launch_chrome_browser() {
	 test1 =extent.createTest("Google search Test one","This is a test to validate Tide products search functionality");
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+".//Drivers/chromedriver.exe");
	 driver=  new ChromeDriver();
	 l = new LoginPage(driver);
    
}
@When("User opens URL {string}")
public void user_opens_url(String url) {
	 driver.get(url);
}
@Then("page Title should be {string}")
public void page_title_should_be(String Register) {
	LoginPage l= new LoginPage(driver);
	l.clickRegister();
}

@Then("Click on sign up now")
public void click_on_sign_up_now() {
    l.clickSignupnow();
}
@When("user enter {string} and {string} and {string}")
public void user_enter_and_and(String Firstname, String Emailaddress, String password) {
	l.setFirstname(Firstname);
	l.setEmailaddress(Emailaddress);
	l.setPassword(password);
}
@When("User click on create account")
public void user_click_on_create_account() {
    l.clickCreateaccount();
}
@When("close browser")
public void close_browser() {
   
}

@After(order=1)
public void tearDown(Scenario scenario) throws IOException {

	if(scenario.isFailed()) {
		test1.fail("", MediaEntityBuilder.createScreenCaptureFromPath(hook.lucky(driver)).build());
	
	}
	else {
		test1.pass("", MediaEntityBuilder.createScreenCaptureFromPath(hook.lucky(driver)).build());
	}



}

@After(order =0)
public void tearDown() {
	extent.flush();
	driver.quit();
	
}



}
