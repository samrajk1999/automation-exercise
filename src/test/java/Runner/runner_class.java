package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\Features\\testng.feature",
				 glue = "stepdefinition",
//				 dryRun = false,
				 publish = true,
				 plugin = {"pretty","html:target/cucumber-reports.html", "json:target/cucumber-reports.json",
						 "rerun:target/rerun.txt" })// Plugin for rerun

public class runner_class {

	
					
}
