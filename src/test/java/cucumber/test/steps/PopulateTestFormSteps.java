package cucumber.test.steps;

import cucumber.test.pages.StudentRegForm;
import io.cucumber.core.gherkin.vintage.internal.gherkin.ast.DataTable;
import io.cucumber.core.gherkin.vintage.internal.gherkin.ast.TableCell;
import io.cucumber.core.gherkin.vintage.internal.gherkin.ast.TableRow;
import io.cucumber.java.en.*;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.*;

public class PopulateTestFormSteps {

    @Given("^I have opened Test page$")
    public void iHaveOpenedTestPage() throws Throwable {
        StudentRegForm studentRegForm = new StudentRegForm();
        studentRegForm.openTestPage();
    }

    @When("^I set First name to \"([^\"]*)\"$")
    public void iSetFirstNameTo(String value) throws Throwable {
        StudentRegForm studentRegForm = new StudentRegForm();
        studentRegForm.setFirstName(value);
    }

    @Then("^I see First name with a value \"([^\"]*)\"$")
    public void iSeeFirstNameWithAValue(String expValue) throws Throwable {
        Assert.assertEquals("Unexpected First name ", expValue, new StudentRegForm().getFirstName());
    }

    @When("^I set Last name to \"([^\"]*)\"$")
    public void iSetLastNameTo(String value) throws Throwable {
        StudentRegForm studentRegForm = new StudentRegForm();
        studentRegForm.setLastName(value);
    }

    @Then("^I see Last name with a value \"([^\"]*)\"$")
    public void iSeeLastNameWithAValue(String expValue) throws Throwable {
        StudentRegForm studentRegForm = new StudentRegForm();
        Assert.assertEquals("Unexpected Last name ", expValue, studentRegForm.getLastName());
    }

    @When("I set registration form values as")
    public void iSetRegistrationValuesAs(Map<String, String> values) {

        StudentRegForm studentRegForm = new StudentRegForm();

        for (String label : values.keySet()) {

            String value = values.get(label);

            switch (label.toLowerCase()) {
                case "first name":
                    studentRegForm.setFirstName(value);
                    break;

                case "last name":
                    studentRegForm.setLastName(value);
                    break;

                default:
                    Assert.fail("Unknown label [ " + label + " ]");
                    break;
            }
        }
    }

    @Then("Student name is displayed as following")
    public void studentNameIsDisplayedAsFollowing(Map<String, String> values) {

        StudentRegForm studentRegForm = new StudentRegForm();

        SoftAssertions softAssertions = new SoftAssertions();

        for (String label : values.keySet()) {

            String value = values.get(label);

            switch (label.toLowerCase()) {
                case "first name":
                    softAssertions.assertThat(studentRegForm.getFirstName()).as("Unexpected 'First Name' value").isEqualTo(value);
                    break;

                case "last name":
                    softAssertions.assertThat(studentRegForm.getLastName()).as("Unexpected 'Last Name' value").isEqualTo(value);
                    break;

                default:
                    Assert.fail("Unknown label [ " + label + " ]");
                    break;
            }
        }

        softAssertions.assertAll();
    }

    @Then("Student registration form contains the following options")
    public void studentRegistrationFormContainsTheFollowingOptions(List<String> expected) {
        List<String> actual = new StudentRegForm().getRegPageLabels();
        assertThat(actual).as("Unexpected registration form label names ").containsAnyElementsOf(expected);
    }
}
