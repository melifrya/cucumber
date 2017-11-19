package ira.cuke;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resource",
        format = {"pretty", "json:target/json/output.json", "html:target/html/"},
        tags = {"@testPage"},
        glue = "ira.cuke"
)
public class RunnerTest {

    @AfterClass
    public static void tearDown() {
        DriverUtils.getDriver().close();
    }
}
