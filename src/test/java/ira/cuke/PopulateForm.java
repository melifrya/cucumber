package ira.cuke;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopulateForm {

    WebDriver driver = new FirefoxDriver();

    @Given("^I am on Symbiote-app site$")
    public void iAmOnSymbioteAppSite() throws Throwable {
        driver.navigate().to("https://symbiote-app.herokuapp.com/practice");
    }

    @When("^I enter username$")
    public void iEnterUsername() throws Throwable {
        driver.findElement(By.id("name")).sendKeys("Test name");
    }

    @And("^I enter email$")
    public void iEnterEmail() throws Throwable {
        driver.findElement(By.id("email")).sendKeys("Email@test.qa");
    }

    @And("^I enter date of birh$")
    public void iEnterDateOfBirh() throws Throwable {
        driver.findElement(By.id("dob")).sendKeys("04/11/2016");
    }

    @And("^I enter password and confirm password$")
    public void iEnterPasswordAndConfirmPassword() throws Throwable {
        driver.findElement(By.id("password")).sendKeys("password123!!");
    }

    @And("^I enter description$")
    public void iEnterDescription() throws Throwable {
        driver.findElement(By.id("confirm_password")).sendKeys("password123!!");
    }

    @And("^I select technology$")
    public void iSelectTechnology() throws Throwable {
        driver.findElement(By.id("conspiracy")).sendKeys("test here bla bla");
    }

    @And("^I select vaporize$")
    public void iSelectVaporize() throws Throwable {
        driver.findElement(By.id("neuralShunt")).click();
    }

    @And("^I click enable sith$")
    public void iClickEnableSith() throws Throwable {
        driver.findElement(By.id("toggleSith")).click();
    }

    @And("^I select power$")
    public void iSelectPower() throws Throwable {

    }

    @And("^I select villain$")
    public void iSelectVillain() throws Throwable {

    }

    @And("^I select headache$")
    public void iSelectHeadache() throws Throwable {

    }

    @And("^I click Submit$")
    public void iClickSubmit() throws Throwable {

    }

    @Then("^I see not found page$")
    public void iSeeNotFoundPage() throws Throwable {

    }

}
