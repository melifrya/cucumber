package ira.cuke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtils {

    private static WebDriver driver;

    public DriverUtils() {
        driver = new FirefoxDriver();
    }

    public static void createDriver() {
        getFirefoxDriver();
    }

    public static WebDriver getFirefoxDriver() {

        System.setProperty("webdriver.gecko.driver", "/Users/melifrya/Tools/geckodriver");

        if (driver == null) {
            driver = new FirefoxDriver();
            return driver;
        } else return driver;
    }

    public static void closeDriver() {

        if (driver != null) {
            driver.close();
        }
    }
}