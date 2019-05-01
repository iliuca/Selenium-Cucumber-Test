Feature: Add products to cart

  Scenario Outline: Add products to cart
    Given I open the homepage
    And I select one product
    And I select color "<color>"
    And I select size "<size>"
    When I press Add to cart
    Then the product is added to cart


    Examples:
      | color | size|
      | pink | S    |




