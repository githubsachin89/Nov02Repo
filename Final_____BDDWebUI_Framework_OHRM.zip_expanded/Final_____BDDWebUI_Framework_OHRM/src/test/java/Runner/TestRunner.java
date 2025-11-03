package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestRunner {

	@CucumberOptions(
			features= "src/test/java/Features",
			glue= {"Steps"},
			monochrome=true,
			dryRun = false
//			plugin = {
//					"rerun:FailedOrangeHRMScenario/cucumberFailedScrenario.txt",
//					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//					}
			
			)
	public class OrangeHrm extends AbstractTestNGCucumberTests{

		
		
	}
}
