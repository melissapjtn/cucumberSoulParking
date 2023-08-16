Feature: Test Login Functionality

  Scenario: Test Login with Valid Credentials
    Given browser is open
    When user open login page
    And user enters username and password
    And user clicks on login button
    Then user is navigated to the home page
    When user log out
    Then user can see login page
    
 Scenario: Test Login with valid username and invalid Password
    Given browser is open
    When user open login page
    And user enters valid username and invalid password
    And user clicks on login button
    Then user is can see error message
    
  Scenario: Test Login with invalid username and valid Password
    Given browser is open
    When user open login page
    And user enters invalid username and valid password
    And user clicks on login button
    Then user is can see error message

  Scenario: Test Login with blank field
    Given browser is open
    When user open login page
    And user both the username and password fields blank
    And user clicks on login button
    Then user is can see error message
 
    
  
    
    
