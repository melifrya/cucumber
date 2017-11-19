package ira.cuke.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestPage extends BasePage {

    String TEST_PAGE_URL = "http://toolsqa.com/automation-practice-form/";

    private final By FIRST_NAME = By.cssSelector("[name=\"firstname\"]");
    private final By LAST_NAME = By.cssSelector("[name=\"lastname\"]");
    private final By MALE_SEX = By.id("sex-0");
    private final By FEMALE_SEX = By.id("sex-1");

    public void openTestPage() {
        openUrl(TEST_PAGE_URL);
    }

    private WebElement findFirstElement() {
        return findElement(FIRST_NAME);
    }

    public void setFirstName(String value) {
        findFirstElement().sendKeys(value);
    }

    public String getFirstName() {
        return findFirstElement().getAttribute("value");
    }

    public void setLastName(String value) {
        findElement(LAST_NAME).sendKeys(value);
    }

    public String getLastName() {
        return findElement(LAST_NAME).getAttribute("value");
    }

    public void setMaleSex() {
        findElement(MALE_SEX).click();
    }

    public void setFemaleSex() {
        findElement(FEMALE_SEX).click();
    }
}
