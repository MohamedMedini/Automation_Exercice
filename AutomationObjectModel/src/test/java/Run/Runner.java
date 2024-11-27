@RunWith(Cucumber.class)
@CucumberOptions(
    tags = "@Payment_AUTOEX",
    features = "src/test/resources/features/Panier", // Make sure the path is correct
    glue = {"Hooks", "StepDefinition"},
    publish = true,
    plugin = {
        "pretty",
        "html:target/cucumber-htmlreport.html",   // Adjust path if necessary
        "json:target/cucumber-report.json",       // Ensure this path is correct
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"  // Correct adapter usage
    }
)
public class Runner {
}
