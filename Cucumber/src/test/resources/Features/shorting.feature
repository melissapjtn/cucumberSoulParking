Feature: Test Shorting Functionality

  Scenario: Test Product Shorting Feature
    Given browser is open for sorting
    When user open login page for sorting
    And user enters username and password for sorting
    And user clicks on login button for sorting
    And User click on sort container
    And user click option Name A to Z
    Then user can see displayed order of products after sorting 
    And user click option Price Low to High
    Then user can see the display order of products Price Low to High