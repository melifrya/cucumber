package ira.cuke.steps;

import cucumber.api.java.en.*;
import ira.cuke.TestContext;
import ira.cuke.pages.TestPage;

public class SampleSteps {

    private TestContext testContext;
    private TestPage testPage;

    public SampleSteps(TestContext context) {
        this.testContext = context;
        this.testPage = testContext.getPageObjectManager().getTestPage();
    }

    @Given("^this is given step$")
    public void thisIsGivenStep() throws Throwable {

        System.out.println("given step;");
    }

    @When("^this is when step$")
    public void thisIsWhenStep() throws Throwable {

        System.out.println("when step;");
    }

    @Then("^this is then step$")
    public void thisIsThenStep() throws Throwable {

        System.out.println("then step;");
    }

    @And("^this is and step$")
    public void thisIsAndStep() throws Throwable {
        System.out.println("and step;");
    }

    @But("^this is but step$")
    public void thisIsButStep() throws Throwable {
        System.out.println("but step;");
    }
}
