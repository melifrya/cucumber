package ira.cuke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtils {

    private static WebDriver driver;

    public static WebDriver getDriver() {

        System.setProperty("webdriver.gecko.driver", "/path_to_the_driver/geckodriver");

        if (driver == null) {
            driver = new FirefoxDriver();
        }
        return driver;
    }

}
