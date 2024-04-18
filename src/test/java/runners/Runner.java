package runners;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "StepDefinitions",
        features = "src/test/resources/Features/dataTables.feature",
      //  tags = "@samsung and @cucumber",
        plugin = {
                "html:cucumber-reports/html/report.html",
                "json:cucumber-reports/json/report.json",
                "pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        monochrome = false,
        dryRun = false
)
public class Runner {


}
