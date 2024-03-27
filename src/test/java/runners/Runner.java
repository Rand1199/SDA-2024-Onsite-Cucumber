package runners;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "StepDefinitions",
        features = "src/test/resources/Features/ScenarioOutlineTask",
      //  tags = "@samsung and @cucumber",
        dryRun = false
)
public class Runner {


}
