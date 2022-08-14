package selenium.test.rodrigo.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		tags = "@test",
		features = "src/test/resources/features/AutomobileInsurance.feature",
		glue = "selenium.test.rodrigo.stepdefs",
		plugin = {"summary", "pretty", "html:target/cucumber-reports.html", //Creating Report File .html
				"json:target/cucumber-reports"},
		monochrome = true
		)
public class PageRunner {

}
