package ira.cuke.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TestPage extends BasePage {

    private String TEST_PAGE_URL = "http://toolsqa.com/automation-practice-form/";

    private final By FIRST_NAME = By.cssSelector("[name=\"firstname\"]");

    private final By LAST_NAME = By.cssSelector("[name=\"lastname\"]");

    private final By MALE_SEX = By.id("sex-0");

    private final By FEMALE_SEX = By.id("sex-1");

    private final By YEAR_OF_EXPERIENCE = By.cssSelector(".control-group [name='exp']");

    private final By CONTINENTS = By.id("continents");


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

    public void selectYearOfExperience(String value) {

        List<WebElement> radioButtons = findElements(YEAR_OF_EXPERIENCE);

        for (WebElement radioButton : radioButtons) {
            if (radioButton.getAttribute("value").equalsIgnoreCase(value)) {
                radioButton.click();
                break;
            }
        }
    }

    public String getSelectedYearOfExperience() {

        String selected = "";
        List<WebElement> radioButtons = findElements(YEAR_OF_EXPERIENCE);

        for (WebElement radioButton : radioButtons) {
            if (radioButton.isSelected()) {
                selected = radioButton.getAttribute("value");
                break;
            }
        }

        return selected;
    }

    public void selectContinent(String value) {

        WebElement dropdown = findElement(CONTINENTS);
        Select select = new Select(dropdown);
        select.selectByVisibleText(value);
    }

    public String getSelectContinent() {

        WebElement dropdown = findElement(CONTINENTS);
        return new Select(dropdown).getFirstSelectedOption().getText();
    }
}