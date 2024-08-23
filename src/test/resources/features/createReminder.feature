Feature: create a reminder

  Background:
    Given user enters email "email"
    When  user enters password "password"
    Then user clicks on login btn
    And verify user logged in

  Scenario: create a reminder
    Given user is on home page
    When  user clicks on add reminder
    And user enters reminder name as "user.reminder"
    And user clicks on create reminder button
    Then verify reminder is visible