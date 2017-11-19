package ira.cuke.pages;

import ira.cuke.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    private final WebDriver driver = DriverUtils.getDriver();

    public void openUrl(String url) {
        driver.navigate().to(url);
    }

    public WebElement findElement(By str) {
        return driver.findElement(str);
    }
}
