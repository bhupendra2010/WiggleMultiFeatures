Feature: As a user i want to buy multiple products from wiggle

  Scenario Outline:
    Given user is on website
    When user search for the "<products>"
    Then user should select the required product and put it in basket.

    Examples:
              |products|
              |Bike    |
              |Shoes   |