Feature: Complete Next task functionality

  Background:
    Given user enters email "email"
    When  user enters password "password"
    Then user clicks on login btn
    And verify user logged in
    And user is on home page
    When user clicks on see all of my work
    Then verify my work page is displayed

  Scenario: Verify user can complete the next task
    When user clicks on Next button
    Then verify tasks of name "nextTask.name" displayed
    When user clicks on the task name as "nextTask.name"
    Then verify user is on task description page
    When user clicks on task status type
    Then verify status types is displayed
    When user clicks on complete task option
    Then verify task is marked as complete

  Scenario: Verify user can complete the overDue task
    When user clicks on overdue task button
    Then verify tasks of name "overdueTask.name" displayed
    When user clicks on the task name as "overdueTask.name"
    Then verify user is on task description page
    When user clicks on task status type
    Then verify status types is displayed
    When user clicks on complete task option
    Then verify task is marked as complete