package ira.cuke.pages;

import ira.cuke.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasePage {

    private final WebDriver driver = DriverUtils.getDriver();

    public void openUrl(String url) {
        driver.navigate().to(url);
    }

    public WebElement findElement(By str) {
        WebElement element = driver.findElement(str);
        scrollIntoView(element);
        return element;
    }

    public List<WebElement> findElements(By str) {
        return driver.findElements(str);
    }

    public void scrollIntoView(WebElement element) {

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

}
