Feature: Check detail item
  Scenario: Access detail product from product name
    Given login page is ready
    When Input valid username
    And  Input valid password
    And click login button
    Then User redirect to inventory page
    When User click on product name
    Then User redirect to detail product
    And Close browser

  Scenario: Access detail product from product image
    Given login page is ready
    When Input valid username
    And  Input valid password
    And click login button
    Then User redirect to inventory page
    When User click on product image
    Then User redirect to detail product
    And Close browser