package cucumber.test.pages;

import cucumber.test.DriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import java.util.List;
import java.util.stream.Collectors;

public class StudentRegForm extends BasePage {

    private final String TEST_PAGE_URL = "https://demoqa.com/automation-practice-form";

    private final String LABEL_SEL = "[id$='-label']";

    private final String FIRST_NAME_ID = "firstName";

    private final String LAST_NAME_ID = "lastName";

    private final String MALE_GENDER = "gender-radio-1";

    private final String FEMALE_GENDER = "gender-radio-2";

    private final String OTHER_GENDER = "gender-radio-3";

    private final String GENDER_SEL = "[id^='gender-radio']";

    private final String STATE_ID = "state";

    private final String CITY_ID = "city";

    @FindBys(@FindBy(css = LABEL_SEL))
    private List<WebElement> labels;

    @FindBy(how = How.ID, using = FIRST_NAME_ID)
    private WebElement firstNameElement;

    @FindBy(how = How.ID, using = LAST_NAME_ID)
    private WebElement lastNameElement;

    @FindBy(how = How.ID, using = MALE_GENDER)
    private WebElement maleGenderRadioButton;

    @FindBy(how = How.ID, using = FEMALE_GENDER)
    private WebElement femaleGenderRadioButton;

    @FindBy(how = How.ID, using = OTHER_GENDER)
    private WebElement otherGenderRadioButton;

    @FindBys(@FindBy(css = GENDER_SEL))
    private List<WebElement> genderOptions;

    @FindBy(how = How.ID, using = STATE_ID)
    private WebElement stateDropDown;

    @FindBy(how = How.ID, using = CITY_ID)
    private WebElement cityDropDown;

    public StudentRegForm() {
        PageFactory.initElements(DriverUtils.getFirefoxDriver(), this);
    }

    public StudentRegForm openTestPage() {
        openUrl(TEST_PAGE_URL);
        return this;
    }

    public StudentRegForm setFirstName(String value) {
        firstNameElement.sendKeys(value);
        return this;
    }

    public String getFirstName() {
        return getValueAttribute(firstNameElement);
    }

    public StudentRegForm setLastName(String value) {
        lastNameElement.sendKeys(value);
        return this;
    }

    public String getLastName() {
        return getValueAttribute(lastNameElement);
    }

    public StudentRegForm setMaleGender() {
        maleGenderRadioButton.click();
        return this;
    }

    public StudentRegForm setFemaleGender() {
        femaleGenderRadioButton.click();
        return this;
    }

    public StudentRegForm setOtherGender() {
        otherGenderRadioButton.click();
        return this;
    }

    public String getSelectedGender() {

        return genderOptions.stream().filter(WebElement::isSelected).findFirst().get().getText();
    }

    public List<String> getRegPageLabels() {
        return labels.stream().map(option -> option.getText()).collect(Collectors.toList());
    }

}