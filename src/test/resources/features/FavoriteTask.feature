Feature: Favorite Task Validation

  Scenario: Verify user can add a task to favorite

    Given user enters email "email"
    When  user enters password "password"
    Then user clicks on login btn
    And verify user logged in
    And user is on home page
    When user clicks on see all of my work
    Then verify my work page is displayed
    When user clicks on done button
    Then verify tasks of name "favoriteTask.name" displayed
    When user clicks on the task name as "favoriteTask.name"
    Then verify user is on task description page
    When user clicks on options button
    Then verify options popup is displayed
    When user clicks on favorite option
    Then verify the option is changed to unFavorite
    When user clicks on done button of options popup
    And user clicks on back button
    And clicks on back button of myWork page
    And user clicks on see all of favorite
    Then verify favorite page is displayed
