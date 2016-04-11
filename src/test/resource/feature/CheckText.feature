Feature: Check text

 Scenario Outline: New options are available for user
      Given I am on Symbiote-app site
      When I click on <option>
      Then I see <text> near options

      Examples:
      | option | text |
      | toggleAllTech | Currently Enabled |
      | toggleAllVapo | Currently Enabled |