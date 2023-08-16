Feature: Test About Functionality

  Scenario: Clicking the About Feature on Web Swag Labs
    Given browser is open for about
    When user open login page for about
    And user enters username and password for about
    When user clicks on login button for about
    And user clicks on burger menu
    And user click About
    Then user is navigated to the SauceLabs page