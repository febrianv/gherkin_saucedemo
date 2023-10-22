Feature: Filter in inventory page
  Scenario: Filter from A-Z
    Given User access inventory page
    When User click filter button
    And User click filter A-Z
    Then User see product ordered from A-Z