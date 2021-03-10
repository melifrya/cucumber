package cucumber.test.runners;

import cucumber.test.DriverUtils;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resource",
        glue = {"cucumber.test"},
        tags = {"@studentRegForm"}
)

public class RunnerTest {

    @AfterClass
    public static void tearDown() {
        DriverUtils.getFirefoxDriver().close();
    }

}
