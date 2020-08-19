Feature: User can buy sale products
  Scenario:
    Given User is on homepage
    When User going on sale page
    And User find the necessary items
    Then User should put that item in basket
    And User can goback to mainpage to add some more items