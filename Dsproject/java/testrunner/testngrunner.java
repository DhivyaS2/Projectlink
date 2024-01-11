package testrunner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//src/test/resources/features/register.feature",
		glue={"stepdefinitions"},
		dryRun =false,
		monochrome=true,

		 plugin= {"pretty", "html:target/edge.html",
				 //"json:target/edge.json",
				 //com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
}
		
				)
public class testngrunner extends AbstractTestNGCucumberTests {
	
    
}
