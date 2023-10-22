Feature: Add Product to Cart
  Scenario: Add Sauce Labs Backpack Product to Cart
    Given login page is ready
    When Input valid username
    And  Input valid password
    And click login button
    Then User redirect to inventory page
    When user click Add to cart button on "Sauce Labs Backpack" Product
    Then Add to cart button change to Remove button on "Sauce Labs Backpack" Product
    And we have 1 product in front of the cart icon
    Then Close browser

  Scenario: Add Two Product to Cart
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
    Then Close browser

  Scenario: Add Two Product to Cart
    Given login page is ready
    When Input valid username
    And  Input valid password
    And click login button
    Then User redirect to inventory page
    When user click Add to cart button on "Sauce Labs Backpack" Product
    Then Add to cart button change to Remove button on "Sauce Labs Backpack" Product
    When user click Add to cart button on "Sauce Labs Bike Light" Product
    Then Add to cart button change to Remove button on "Sauce Labs Bike Light" Product
    When user click Add to cart button on "Sauce Labs Bolt T-Shirt" Product
    Then Add to cart button change to Remove button on "Sauce Labs Bolt T-Shirt" Product
    And we have 3 product in front of the cart icon
    Then Close browser