Feature: Populate the form

  As a user
  I want to populate the 'Sign Up Form For' on symbiote-app. site

  Scenario: Populate the form
    Given I am on Symbiote-app site
    When I enter username
    And I enter email
    And I enter date of birth
    And I enter password and confirm password
    And I enter description
    And I select technology
    And I select vaporize
    And I select power
    And I select villain
    And I select headache
    And I click Submit
    Then I see not found page