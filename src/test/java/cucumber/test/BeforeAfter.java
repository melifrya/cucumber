package cucumber.test;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BeforeAfter {

    @Before
    public void beforeScenario() {
        System.out.println("This will run before the Scenario");
        DriverUtils.createDriver();
    }

    @After
    public void afterScenario() {
        System.out.println("This will run after the Scenario");
        //DriverUtils.closeDriver();
    }

    @Before
    public void beforeAll() {

        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                DriverUtils.closeDriver();
            }
        });
    }

}