package cucumber.test.steps;

import io.cucumber.java.en.*;

public class SampleSteps {

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
}
