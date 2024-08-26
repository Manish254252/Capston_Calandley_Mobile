Feature: Create Notepad Functionality

  Scenario: verify note is created
    Given user enters email "email"
    When  user enters password "password"
    Then user clicks on login btn
    And verify user logged in
    And user is on home page
    When user clicks on more button
    And user clicks on notepad option
    Then verify notepad page is displayed
    When user clicks on create new note button
    And user enters new note name as "note.name"
    And user clicks on create new note button of notePad
#    Then verify note is created of name "note.name"
    When user clicks on edit note button
    And user enters the note message as "note.msg"
    And user clicks on back button
    Then verify note is present of name "note.name"
    When user clicks on the note name from the list "note.name"
    Then verify note is present with noteName "note.name" and noteMsg "note.msg"





