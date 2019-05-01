Feature: Cart

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

  Scenario: Change number of products in cart
    Given I open the homepage
    And I select one product
    And I select one color
    And I select one size
    And I press Add to cart
    And I press View Cart
    When I change the number of items from 1 to 3
    And I click update
    Then the number of items in cart is updated

  Scenario: Empty cart
    Given I open the homepage
    And I select one product
    And I select one color
    And I select one size
    And I press Add to cart
    And I press View Cart
    When I press Empty Cart
    Then the cart is emptied


  Scenario: Delete item from cart
    Given I open the homepage
    And I select one product
    And I select one color
    And I select one size
    And I press Add to cart
    And I press VIP
    And I select another product
    And I press Add to cart
    And I press View Cart
    When I press the Recycle bin simbol for one item
    Then the item I deleted is no longer in cart

  Scenario: Price is recalculated after changing number of products
    Given I open the homepage
    And I select one product
    And I select one color
    And I select one size
    And I press Add to cart
    And I press View Cart
    When I change the number of items from 1 to 3
    And I click update
    Then the price is recalculated

