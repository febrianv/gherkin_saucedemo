Feature: Check Cart
  Scenario: Add One Product to Cart and you can see one product in the cart
    Given login page is ready
    When Input valid username
    And  Input valid password
    And click login button
    Then User redirect to inventory page
    When user click Add to cart button on "Sauce Labs Backpack" Product
    Then Add to cart button change to Remove button on "Sauce Labs Backpack" Product
    When user click Add to cart button on "Sauce Labs Bike Light" Product
    Then Add to cart button change to Remove button on "Sauce Labs Bike Light" Product
    And we have 2 product in front of the cart icon
    When User click icon cart
    Then User redirect to cart page
    And user can see "Sauce Labs Backpack" and "Sauce Labs Bike Light" product in the cart
    Then Close browser