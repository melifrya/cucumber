package ira.cuke.steps;

import cucumber.api.java.en.*;
import ira.cuke.TestContext;
import ira.cuke.enums.Context;
import ira.cuke.pages.TestPage;
import org.junit.Assert;

import java.util.List;
import java.util.Random;

public class PopulateTestFormSteps {

    private TestContext testContext;
    private TestPage testPage;

    public PopulateTestFormSteps(TestContext context) {
        this.testContext = context;
        this.testPage = testContext.getPageObjectManager().getTestPage();
    }

    @Given("^I have opened Test page$")
    public void iHaveOpenedTestPage() throws Throwable {
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

    @Then("^Continent control is displayed with selected \"([^\"]*)\" value$")
    public void continentControlIsDisplayedWithSelectedValue(String expValue) throws Throwable {
        Assert.assertEquals("Unexpected Continents value ", expValue, testPage.getSelectContinent());
    }

    @When("^I select one of the continents from a list$")
    public void iSelectOneOfTheContinentsFromAList() throws Throwable {

        Random r = new Random();
        List<String> values = testPage.getContinentValues();
        String valueToSelect = values.get(r.nextInt(values.size() - 1));
        testPage.selectContinent(valueToSelect);

        testContext.getScenarioContext().setContext(Context.selectedValue, valueToSelect);
    }

    @Then("^Continent control is displayed with this value$")
    public void continentControlIsDisplayedWithThisValue() throws Throwable {
        Assert.assertEquals("Unexpected Continents value ", testContext.getScenarioContext().getContext(Context.selectedValue).toString(), testPage.getSelectContinent());
    }
}
