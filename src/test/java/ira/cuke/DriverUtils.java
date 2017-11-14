package ira.cuke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtils {

    private static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {
            driver = new FirefoxDriver();
        }
        return driver;
    }

}
