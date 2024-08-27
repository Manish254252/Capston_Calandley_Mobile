Feature: Complete Next task functionality
  Scenario: Verify user can complete the next task

    Given user enters email "email"
    When  user enters password "password"
    Then user clicks on login btn
    And verify user logged in
    And user is on home page
    When user clicks on Next button
    Then verify list of next tasks are displayed
    When user clicks on the task name as "nextTask.name"
