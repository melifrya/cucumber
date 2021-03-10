@studentRegForm
Feature: Populate Student Registration Form

  Interact with web page elements - set, get and compare

  Scenario: Input element - set and get a first name
    Given I have opened Test page
    When I set First name to "Sam"
    Then I see First name with a value "Sam"

  Scenario: Input elements - Set and get first and last name
    Given I have opened Test page
    When I set registration form values as
      | First Name | Bob   |
      | Last Name  | Brown |
    Then Student name is displayed as following
      | First Name | Bob   |
      | Last Name  | Brown |

  Scenario: Label elements - check available values
    Given I have opened Test page
    Then Student registration form contains the following options
      | Name          |
      | Email         |
      | Subjects      |
      | Date of Birth |
      | Picture       |