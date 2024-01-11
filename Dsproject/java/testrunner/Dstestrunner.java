package testrunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
@RunWith(Cucumber.class)
@CucumberOptions(features=".//src/test/resources/features",
		glue={"stepdefinitions"},
		dryRun =false,
		monochrome=true,

		 plugin= {"pretty", "pretty", "html:targetreport/report.html",
					"json:targetreport/report.json",
					"junit:targetreport/report.xml",
					 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
	               "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
                }
		//publish=true
				)
public class Dstestrunner extends AbstractTestNGCucumberTests {
	
	
}


