package cucumber.test.pages;

import cucumber.test.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasePage {

    private final WebDriver driver = DriverUtils.getFirefoxDriver();

    public void openUrl(String url) {
        driver.navigate().to(url);
    }

    public WebElement findElement(By selector) {
        WebElement element = driver.findElement(selector);
        scrollIntoViewDownVisible(element);
        return element;
    }

    public List<WebElement> findElements(By selector) {
        return driver.findElements(selector);
    }

    public String getElementText(By selector) {
        return findElement(selector).getText();
    }

    public String getValueAttribute(By selector) {
        return getValueAttribute(findElement(selector));
    }

    public String getValueAttribute(WebElement element) {
        return element.getAttribute("value");
    }

    public void clickOnElement(By selector) {
        findElement(selector).click();
    }

    public void scrollIntoView(WebElement element) {

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void scrollIntoViewDownVisible(WebElement element) {

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", element);
    }
}