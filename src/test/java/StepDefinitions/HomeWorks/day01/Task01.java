package StepDefinitions.HomeWorks.day01;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Task01 {

    WebDriver driver;
    @Given("user goes to google page")
    public void user_goes_to_google_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com");
    }
    @When("user searches for {string}")
    public void user_searches_for(String searchString) {
        driver.findElement(By.name("q")).sendKeys(searchString + Keys.ENTER);
    }
    @Then("tests that the page title contains the word {string}")
    public void tests_that_the_page_title_contains_the_word(String searchedString) {
        Assert.assertFalse(driver.findElements(By.xpath("//*[contains(text(),'"+searchedString+"')]")).isEmpty());
    }
    @Then("close the page")
    public void close_the_page() {
        driver.close();
    }

}










