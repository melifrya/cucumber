@testPage
Feature: Populate test form page

  Scenario: Set and get a first name
    Given I have opened Test page
    When I set First name to "Sam"
    Then I see First name with a value "Sam"

  Scenario: Set and get a first name
    Given I have opened Test page
    When I set Last name to "Smith"
    Then I see Last name with a value "Smith"

  Scenario: Select Years of Experience
    Given I have opened Test page
    When I select "3" Years of Experience
    Then I see Years of Experience with selected "3" value

  Scenario: Select Continent from a list
    Given I have opened Test page
    When I select "Australia" as continent
    Then I see Continents with selected "Australia" value