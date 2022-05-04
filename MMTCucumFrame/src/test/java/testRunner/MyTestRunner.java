package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="src/test/java/featureFile/login.feature",
		//features="src/test/java/featureFile/defence.feature",
		//features="src/test/java/featureFile/searchFlightDefence.feature",
		glue= {"stepDef","AppHooks"},
		plugin= {"pretty"},
		monochrome=true,
		dryRun=false
		
		)
public class MyTestRunner 
{

	
}
