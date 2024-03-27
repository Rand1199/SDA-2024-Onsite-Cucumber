package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    @Before
    public void setUp(Scenario scenario){
        System.out.println("Before the scenario : setting up the enviroment....");
        System.out.println("scenario id: "+ scenario.getId());
        System.out.println("scenario name: "+scenario.getName());
    }

    @After
    public void tearDown(Scenario scenario){
        System.out.println("After the scenario , cleaning up the test");

    }
}
