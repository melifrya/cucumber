@testPage
Feature: Populate test form page

  Set, select and get elements info from a page

  Scenario: Set and get a first name
    Given I have opened Test page
    When I set First name to "Sam"
    Then I see First name with a value "Sam"

  Scenario: Set and get a last name
    Given I have opened Test page
    When I set Last name to "Smith"
    Then I see Last name with a value "Smith"

  Scenario Outline: Select years of experience
    Given I have opened Test page
    When I select "<year>" Years of Experience
    Then I see Years of Experience with selected "<year>" value

    Examples:
      | year |
      | 1    |
      | 7    |

  Scenario: Select specific continent from a list
    Given I have opened Test page
    When I select "Australia" as continent
    Then Continent control is displayed with selected "Australia" value