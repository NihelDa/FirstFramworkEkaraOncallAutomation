package StepsDefinitions;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
  
@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/Features",

				glue={"StepsDefinitions"},tags="",
				monochrome= true,
				plugin = { "pretty","html:target/cucumber-reports",
						"junit:target/JUnitReports/report.xml",
						"json:target/JSONReports/report.json",
						"html:target/HtmlReports/reports",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
						}
)  

public class TestRunner {
 
}