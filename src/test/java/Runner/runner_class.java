package Runner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import base_pack.base;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\Features\\testng.feature",
				 glue = {"stepdefinition","org.hooks"},
				 dryRun = false,
				 publish = true,
				 plugin = {"pretty","html:target/cucumber-reports.html", "json:target/cucumber-reports.json",
						 "rerun:target/rerun.txt" })// Plugin for rerun

public class runner_class extends base{

	@AfterClass
	public void end() throws InterruptedException {
		quit();
		
	}
					
}
