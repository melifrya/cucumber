package ira.cuke.pages;

import ira.cuke.DriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class TestPage extends BasePage {

    private String TEST_PAGE_URL = "http://toolsqa.com/automation-practice-form/";

    private final String FIRST_NAME = "[name=\"firstname\"]";

    private final String LAST_NAME = "[name=\"lastname\"]";

    private final String MALE_SEX = "sex-0";

    private final String FEMALE_SEX = "sex-1";

    private final String YEAR_OF_EXPERIENCE = ".control-group [name='exp']";

    private final String CONTINENTS = "continents";

    @FindBy(how = How.CSS, using = FIRST_NAME)
    private WebElement firstNameElement;

    @FindBy(how = How.CSS, using = LAST_NAME)
    private WebElement lastNameElement;

    @FindBy(how = How.ID, using = MALE_SEX)
    private WebElement maleSexRadioButton;

    @FindBy(how = How.ID, using = FEMALE_SEX)
    private WebElement femaleSexRadioButton;

    @FindAll(@FindBy(how = How.CSS, using = YEAR_OF_EXPERIENCE))
    private List<WebElement> yearOfExperienseOptions;

    @FindBy(how = How.ID, using = CONTINENTS)
    private WebElement continentsDropDown;

    public TestPage() {
        PageFactory.initElements(DriverUtils.getFirefoxDriver(), this);
    }

    public TestPage openTestPage() {
        openUrl(TEST_PAGE_URL);
        return this;
    }

    public TestPage setFirstName(String value) {
        firstNameElement.sendKeys(value);
        return this;
    }

    public String getFirstName() {
        return getValueAttribute(firstNameElement);
    }

    public TestPage setLastName(String value) {
        lastNameElement.sendKeys(value);
        return this;
    }

    public String getLastName() {
        return getValueAttribute(lastNameElement);
    }

    public TestPage setMaleSex() {
        maleSexRadioButton.click();
        return this;
    }

    public TestPage setFemaleSex() {
        femaleSexRadioButton.click();
        return this;
    }

    public TestPage selectYearOfExperience(String value) {

        //get year of experience as list<WebElements> and filter them by value - if present - click on it
        yearOfExperienseOptions.stream().filter(element -> getValueAttribute(element).equalsIgnoreCase(value)).findFirst().ifPresent(WebElement::click);

        return this;
    }

    public String getSelectedYearOfExperience() {

        return yearOfExperienseOptions.stream().filter(WebElement::isSelected).findFirst().map(this::getValueAttribute).orElse("");
    }

    public TestPage selectContinent(String value) {

        Select select = new Select(continentsDropDown);
        select.selectByVisibleText(value);

        return this;
    }

    public List<String> getContinentValues(){
        return new Select(continentsDropDown).getOptions().stream().map(WebElement::getText).collect(Collectors.toList());
    }

    public String getSelectContinent() {
        return new Select(continentsDropDown).getFirstSelectedOption().getText();
    }
}