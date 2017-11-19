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