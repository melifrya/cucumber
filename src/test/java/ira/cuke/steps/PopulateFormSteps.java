package ira.cuke.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ira.cuke.pages.BasePage;
import ira.cuke.pages.TestPage;
import org.junit.Assert;

public class PopulateFormSteps {

    private TestPage testPage;


    @Given("^I have opened Test page$")
    public void iHaveOpenedTestPage() throws Throwable {
        testPage = new TestPage();
        testPage.openTestPage();
    }

    @When("^I set First name to \"([^\"]*)\"$")
    public void iSetFirstNameTo(String value) throws Throwable {
        testPage.setFirstName(value);
    }

    @Then("^I see First name with a value \"([^\"]*)\"$")
    public void iSeeFirstNameWithAValue(String expValue) throws Throwable {
        Assert.assertEquals(expValue, testPage.getFirstName());
    }

    @When("^I set Last name to \"([^\"]*)\"$")
    public void iSetLastNameTo(String value) throws Throwable {
        testPage.setLastName(value);
    }

    @Then("^I see Last name with a value \"([^\"]*)\"$")
    public void iSeeLastNameWithAValue(String expValue) throws Throwable {
        Assert.assertEquals(expValue, testPage.getLastName());
    }
}
