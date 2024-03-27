package StepDefinitions.HomeWorks.day01;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Hw03 {
WebDriver driver;
    @Given("I am on the input validation page")
    public void iAmOnTheInputValidationPage() {
        driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/validation/input-validation.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Given("I fill the form with valid data")
    public void iFillTheFormWithValidData() {
        driver.findElement(By.id("firstname")).sendKeys("John");
        driver.findElement(By.id("surname")).sendKeys("Doe");
        driver.findElement(By.id("email")).sendKeys("john.doe@example.com");
    }

    @Given("I fill the form with invalid data")
    public void iFillTheFormWithInvalidData() {
        driver.findElement(By.id("firstname")).sendKeys("123");
        driver.findElement(By.id("surname")).sendKeys("456");
        driver.findElement(By.id("email")).sendKeys("invalid_email");
    }

    @When("I submit the form")
    public void iSubmitTheForm() {
        driver.findElement(By.id("submit")).click();
    }

    @Then("I should see the success message")
    public void iShouldSeeTheSuccessMessage() {
        String message = driver.findElement(By.id("valid")).getText();
        Assert.assertEquals("Form is valid", message);
        driver.quit();
    }

    @Then("I should see the error message")
    public void iShouldSeeTheErrorMessage() {
        String message = driver.findElement(By.id("errors1")).getText();
        Assert.assertTrue(message.contains("First Name must contain only letters"));
        Assert.assertTrue(message.contains("Surname must contain only letters"));
        Assert.assertTrue(message.contains("Email is not a valid email address"));
        driver.quit();
    }
}
