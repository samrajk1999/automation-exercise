package Runner;

import java.sql.Driver;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@target/rerun.txt",
				 glue = {"stepdefinition", "org.hooks"},
//				 dryRun = false,
				 publish = true,
				 plugin = {"pretty","html:target/rerun_cucumber-reports.html", "json:target/rerun_cucumber-reports.json"})

public class rerun_runner {

	public WebDriver driver;
	@AfterClass
	
	public void quit() {
		
		driver.quit();
	}
	
}
