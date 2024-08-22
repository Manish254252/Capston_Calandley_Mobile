Feature: login
  Scenario: logging in app
    Given user enters email
    When  user enters password
    Then user clicks on login btn
    And verify use logged in