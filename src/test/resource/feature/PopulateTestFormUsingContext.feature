@testPage
Feature: Populate test form page using context

  In order to make tests looks lighter user can save and get selected value from Context

  Scenario: Select one of the continent from a list
    Given I have opened Test page
    When I select one of the continents from a list
    Then Continent control is displayed with this value