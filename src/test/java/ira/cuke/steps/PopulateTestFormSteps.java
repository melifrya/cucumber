package ira.cuke.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ira.cuke.pages.TestPage;
import org.junit.Assert;

public class PopulateTestFormSteps {

    @Given("^I have opened Test page$")
    public void iHaveOpenedTestPage() throws Throwable {
        TestPage testPage = new TestPage();
        testPage.openTestPage();
    }

    @When("^I set First name to \"([^\"]*)\"$")
    public void iSetFirstNameTo(String value) throws Throwable {
        TestPage testPage = new TestPage();
        testPage.setFirstName(value);
    }

    @Then("^I see First name with a value \"([^\"]*)\"$")
    public void iSeeFirstNameWithAValue(String expValue) throws Throwable {
        TestPage testPage = new TestPage();
        Assert.assertEquals("Unexpected First name ", expValue, testPage.getFirstName());
    }

    @When("^I set Last name to \"([^\"]*)\"$")
    public void iSetLastNameTo(String value) throws Throwable {
        TestPage testPage = new TestPage();
        testPage.setLastName(value);
    }

    @Then("^I see Last name with a value \"([^\"]*)\"$")
    public void iSeeLastNameWithAValue(String expValue) throws Throwable {
        TestPage testPage = new TestPage();
        Assert.assertEquals("Unexpected Last name ", expValue, testPage.getLastName());
    }

    @When("^I select \"([^\"]*)\" Years of Experience$")
    public void iSelectYearsOfExperience(String value) throws Throwable {
        TestPage testPage = new TestPage();
        testPage.selectYearOfExperience(value);
    }

    @Then("^I see Years of Experience with selected \"([^\"]*)\" value$")
    public void iSeeYearsOfExperienceWithSelectedValue(String expValue) throws Throwable {
        TestPage testPage = new TestPage();
        Assert.assertEquals("Unexpected Years of Experience value ", expValue, testPage.getSelectedYearOfExperience());
    }

    @When("^I select \"([^\"]*)\" as continent$")
    public void iSelectAsContinent(String value) throws Throwable {
        TestPage testPage = new TestPage();
        testPage.selectContinent(value);
    }

    @Then("^I see Continents with selected \"([^\"]*)\" value$")
    public void iSeeContinentsWithSelectedValue(String expValue) throws Throwable {
        TestPage testPage = new TestPage();
        Assert.assertEquals("Unexpected Continents value ", expValue, testPage.getSelectContinent());
    }

    @Then("^Continent control is displayed with selected \"([^\"]*)\" value$")
    public void continentControlIsDisplayedWithSelectedValue(String expValue) throws Throwable {
        TestPage testPage = new TestPage();
        Assert.assertEquals("Unexpected Continents value ", expValue, testPage.getSelectContinent());
    }

    @When("^I select one of the continents from a list$")
    public void iSelectOneOfTheContinentsFromAList() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Continent control is displayed with this value$")
    public void continentControlIsDisplayedWithThisValue() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
