package ira.cuke;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by igruzdeva on 04/11/2016.
 */

public class SampleDef {
    @Given("^this is given step$")
    public void thisIsGivenStep() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C://SeleniumDrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://symbiote-app.herokuapp.com/practice");
        Thread.sleep(5000);

        System.out.println("given step");
    }

    @When("^this is when step$")
    public void thisIsWhenStep() throws Throwable {
        System.out.println("when step");
    }

    @Then("^this is then step$")
    public void thisIsThenStep() throws Throwable {
        System.out.println("then step");
    }
}
