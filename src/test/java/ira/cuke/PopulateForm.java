package ira.cuke;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

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
        driver.findElement(By.id("confirm_password")).sendKeys("password123!!");
    }

    @And("^I enter description$")
    public void iEnterDescription() throws Throwable {
        driver.findElement(By.id("conspiracy")).sendKeys("test here bla bla");
    }

    @And("^I select technology$")
    public void iSelectTechnology() throws Throwable {
        driver.findElement(By.id("neuralShunt")).click();
    }

    @And("^I select vaporize$")
    public void iSelectVaporize() throws Throwable {
        driver.findElement(By.id("toggleAllVapo")).click();
        driver.findElement(By.id("cme")).click();
    }


    @And("^I select power$")
    public void iSelectPower() throws Throwable {
        /*Select selectPW = new Select(driver.findElement(By.id("sith")));
        System.out.println("text here bla bla - "+selectPW);
        //selectPW.deselectAll();
        selectPW.selectByVisibleText("Vicious Slash");
        WebElement selectedOption = selectPW.getFirstSelectedOption();
        System.out.println("Selected option! - " + selectedOption);
        */

        driver.findElement(By.id("toggleSith")).click();
        //Thread.sleep(5000);  // time for page to load
        new Select(driver.findElement(By.id("sith"))).selectByIndex(2);

    }

    @And("^I select villain$")
    public void iSelectVillain() throws Throwable {
        new Select(driver.findElement(By.id("villain"))).selectByIndex(2);
    }

    @And("^I select headache$")
    public void iSelectHeadache() throws Throwable {
        new Select(driver.findElement(By.id("physics"))).selectByIndex(2);
    }

    @And("^I click Submit$")
    public void iClickSubmit() throws Throwable {
        driver.findElement(By.id("submit")).click();
    }

    @Then("^I see not found page$")
    public void iSeeNotFoundPage() throws Throwable {
        Thread.sleep(5000);  // time for page to load
        Assert.assertEquals("Not Found", driver.findElement(By.tagName("h1")).getText());
        driver.quit();
    }

}
