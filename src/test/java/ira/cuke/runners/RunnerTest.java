package ira.cuke.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import ira.cuke.DriverUtils;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resource",
        format = {"pretty", "json:target/json/output.json", "html:target/html/"},
        glue = "ira.cuke",
        tags = {"@testPage"}
)
public class RunnerTest {

    /*@AfterClass
    public static void tearDown() {
        DriverUtils.getFirefoxDriver().close();
    }*/
}
