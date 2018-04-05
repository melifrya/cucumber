package ira.cuke.steps;

import cucumber.api.java.en.*;
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

        Assert.assertEquals("Unexpected First name ", expValue, testPage.getFirstName());
    }

    @When("^I set Last name to \"([^\"]*)\"$")
    public void iSetLastNameTo(String value) throws Throwable {

        testPage.setLastName(value);
    }

    @Then("^I see Last name with a value \"([^\"]*)\"$")
    public void iSeeLastNameWithAValue(String expValue) throws Throwable {

        Assert.assertEquals("Unexpected Last name ", expValue, testPage.getLastName());
    }

    @When("^I select \"([^\"]*)\" Years of Experience$")
    public void iSelectYearsOfExperience(String value) throws Throwable {

        testPage.selectYearOfExperience(value);
    }

    @Then("^I see Years of Experience with selected \"([^\"]*)\" value$")
    public void iSeeYearsOfExperienceWithSelectedValue(String expValue) throws Throwable {

        Assert.assertEquals("Unexpected Years of Experience value ", expValue, testPage.getSelectedYearOfExperience());
    }

    @When("^I select \"([^\"]*)\" as continent$")
    public void iSelectAsContinent(String value) throws Throwable {

        testPage.selectContinent(value);
    }

    @Then("^I see Continents with selected \"([^\"]*)\" value$")
    public void iSeeContinentsWithSelectedValue(String expValue) throws Throwable {

        Assert.assertEquals("Unexpected Continents value ", expValue, testPage.getSelectContinent());
    }
}
