package StepDefinitions.HomeWorks.day02;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.Driver;

public class task01 {


    @Given("the user navigates to the {string} page")
    public void the_user_navigates_to_the_page(String string) {
        Driver.getDriver().get(string);
    }

    @Then("the user waits for {int} seconds")
    public void the_user_waits_for_seconds(Integer int1) throws InterruptedException {
        Thread.sleep(int1);
    }

    @Then("the user verifies that the page title contains {string}")
    public void the_user_verifies_that_the_page_title_contains(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }

    @Then("the user close the page")
    public void the_user_close_the_page() {
        Driver.getDriver().close();
    }
}
