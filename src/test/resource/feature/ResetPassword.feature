Feature: Reset password

  As user with forgotten password
  I want be able to reset password

  Scenario: Reset password from login page
    Given I open Password Reset page as user with forgotten password
    When I enter valid username
    And I select Delivery method
    And I click Send btn
    Then see input for security code
    And I close browser