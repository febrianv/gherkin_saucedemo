Feature: Login in to the application

  Scenario: Login to application as valid user
    Given login page is ready
    When Input valid username
    And  Input valid password
    And click login button
    Then User redirect to inventory page
    And Close browser


  Scenario: Login to application as invalid password
    Given login page is ready
    When Input valid username
    And  Input invalid password
    And click login button
    Then User get error message
    And Close browser

  Scenario: Login to application as invalid user
    Given login page is ready
    When Input invalid username
    And  Input valid password
    And click login button
    Then User get error message
    And Close browser

  Scenario: Login to application as invalid user and invalid password
    Given login page is ready
    When Input invalid username
    And  Input invalid password
    And click login button
    Then User get error message
    And Close browser