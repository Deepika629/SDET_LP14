package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/java/features",
		glue = {"stepDefinitions","utilities"}, 
		//tags={"@Regression","@Smoke","@Sanity"} 			// scenarios under multiple tags (And condition)
		//tags={"@Regression,@Sanity"}      			//OR condition
		
		tags= {"@Regression"},
		monochrome = true,
		dryRun = false,
		//plugin = {"pretty", "html:report/htmlreport","json:report/report.json","junit:reports/xmlreport.xml" }
		plugin = {"pretty"}
		)

public class TestRunnerGoogle {
		
}
