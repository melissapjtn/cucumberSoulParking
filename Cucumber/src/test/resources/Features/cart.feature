Feature: Test Add Item to Cart Functionality

  Scenario: Adding an item to the shopping cart
    Given browser is open for add to cart
    When user open login page for add to cart
    And user enters username and password for add to cart
    And user clicks on login button for add to cart
    And user get cart detail
    And user click detail product
    And user clicks on Add to cart button
    Then icon cart is update
    And user log out for cart
    Then user can see login page for cart

  Scenario: Remove an item from the shopping cart
    Given browser is open for add to cart
    When user open login page for add to cart
    And user enters username and password for add to cart
    And user clicks on login button for add to cart
    And user get cart detail
    And user click detail product
    And user clicks on Add to cart button
    Then icon cart is update
    And user click remove button
    Then user can see add to cart button

  Scenario: Checkout an item from shopping cart
    Given browser is open for add to cart
    When user open login page for add to cart
    And user enters username and password for add to cart
    And user clicks on login button for add to cart
    And user get cart detail
    And user click detail product
    And user clicks on Add to cart button
    Then icon cart is update
    And user click cart
    And user click checkout button
    And user enters First Name, Last Name, and Zip
    And user click contiue button
    Then user can see Checkout: Overview page
    And user click finish button
    Then user can see Checkout: Complete! page
    
