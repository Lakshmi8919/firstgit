package cucumberOption;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\mindedge217\\eclipse-workspace\\CucumberBdd\\src\\test\\java\\feature\\login.feature",
		glue="stepDefination",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty"})
//"com.aventstack.extentreportes.cucumber.adapter.ExtentCucumberAdapter:"})
		


public class TestRunner {

}
