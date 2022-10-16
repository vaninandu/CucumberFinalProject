package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		// to run all the scenarios
		// features = "classpath:features",

		// to run one scenario
		features = "src\\test\\java\\features\\BackgroundColor.feature", glue = "steps",
		// tags = "@Scenario1",
		monochrome = true,

		// dryRun = true will just check if there is any issue in the code and will not
		// run any code
		// dryRun = false,

		plugin = { "pretty",
				"html:target/cucumber", 
				"json:target/cucumber.json" })

public class RunnerClass {

	
}
