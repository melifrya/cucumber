package ira.cuke;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResetPassword {

    private final WebDriver driver = new FirefoxDriver();

    @Given("^I open Password Reset page as user with forgotten password$")
    public void IamOnPasswordResetPage() throws Throwable {

        driver.navigate().to("http://test.com");
        System.out.println("Open main page; ");
        driver.findElement(By.className("login-page-forgot")).click();

    }

    @When("^I enter valid username$")
    public void iEnterValidUsername() throws Throwable {

        driver.findElement(By.id("username")).sendKeys("mruser");
        System.out.println("Enter username; ");
    }

    @When("^I select Delivery method$")
    public void iSelectDeliveryMethod() throws Throwable {

        new Select(driver.findElement(By.id("deliveryMethodChoice"))).selectByVisibleText("Email");
        System.out.println("Drop down value is selected; ");
    }

    @When("^I click Send btn$")
    public void iClickSendBtn() throws Throwable {

        driver.findElement(By.id("sendButton")).click();
    }

    @Then("^see input for security code$")
    public void seeInputForSecurityCode() throws Throwable {

        WebElement myDynamicElement = (new WebDriverWait(driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("securityCode")));

        if (driver.findElements(By.id("securityCode")).size() != 0) {
            System.out.println("element exists");
            driver.findElement(By.id("securityCode")).sendKeys("text");
        } else System.out.println("element does nor exists");

    }

    @Then("^I close browser$")
    public void iCloseBrowser() throws Throwable {

        driver.quit();
    }

}
