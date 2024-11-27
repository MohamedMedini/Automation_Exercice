package Run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		tags= "@Payment_AUTOEX" ,
		features= "src/test/features/Panier",
		glue={"Hooks","StepDefinition"},
		
		
		publish= true,
	    plugin = {
			    "pretty",
			    "html:target/htmlreport.html",
			    "json:target/cucumber-report.json",  // Ensure this is the correct path
			    "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
			}

		
		)





public class Runner {

}
