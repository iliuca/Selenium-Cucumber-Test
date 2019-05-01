$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/cart.feature");
formatter.feature({
  "line": 1,
  "name": "Cart",
  "description": "",
  "id": "cart",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Add products to cart",
  "description": "",
  "id": "cart;add-products-to-cart",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I open the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I select one product",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I select color \"\u003ccolor\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I select size \"\u003csize\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I press Add to cart",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the product is added to cart",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "cart;add-products-to-cart;",
  "rows": [
    {
      "cells": [
        "color",
        "size"
      ],
      "line": 13,
      "id": "cart;add-products-to-cart;;1"
    },
    {
      "cells": [
        "pink",
        "S"
      ],
      "line": 14,
      "id": "cart;add-products-to-cart;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 12841930152,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Add products to cart",
  "description": "",
  "id": "cart;add-products-to-cart;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I open the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I select one product",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I select color \"pink\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I select size \"S\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I press Add to cart",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the product is added to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.iOpenTheHomepage()"
});
formatter.result({
  "duration": 7566981585,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iSelectOneProduct()"
});
formatter.result({
  "duration": 3893397731,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pink",
      "offset": 16
    }
  ],
  "location": "SingleProductSteps.iSelectColor(String)"
});
formatter.result({
  "duration": 504766446,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "S",
      "offset": 15
    }
  ],
  "location": "SingleProductSteps.iSelectSize(String)"
});
formatter.result({
  "duration": 337055261,
  "status": "passed"
});
formatter.match({
  "location": "SingleProductSteps.iPressAddToCart()"
});
formatter.result({
  "duration": 17864691940,
  "status": "passed"
});
formatter.match({
  "location": "CartSteps.theProductIsAddedToCart()"
});
formatter.result({
  "duration": 6147656954,
  "status": "passed"
});
formatter.after({
  "duration": 904683513,
  "status": "passed"
});
formatter.before({
  "duration": 4831879481,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Change number of products in cart",
  "description": "",
  "id": "cart;change-number-of-products-in-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "I open the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I select one product",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I select one color",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I select one size",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I press Add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I press View Cart",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I change the number of items from 1 to 3",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "I click update",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "the number of items in cart is updated",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.iOpenTheHomepage()"
});
formatter.result({
  "duration": 3536855794,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iSelectOneProduct()"
});
formatter.result({
  "duration": 2171043631,
  "status": "passed"
});
formatter.match({
  "location": "SingleProductSteps.iSelectOneColor()"
});
formatter.result({
  "duration": 1493631331,
  "status": "passed"
});
formatter.match({
  "location": "SingleProductSteps.iSelectOneSize()"
});
formatter.result({
  "duration": 787547461,
  "status": "passed"
});
formatter.match({
  "location": "SingleProductSteps.iPressAddToCart()"
});
formatter.result({
  "duration": 15946312421,
  "status": "passed"
});
formatter.match({
  "location": "HeaderSteps.iPressViewCart()"
});
formatter.result({
  "duration": 11049924911,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 34
    },
    {
      "val": "3",
      "offset": 39
    }
  ],
  "location": "CartSteps.iChangeTheNumberOfItemsFromTo(int,int)"
});
formatter.result({
  "duration": 1088595150,
  "status": "passed"
});
formatter.match({
  "location": "CartSteps.iClickUpdate()"
});
formatter.result({
  "duration": 14424433522,
  "status": "passed"
});
formatter.match({
  "location": "CartSteps.theNumberOfItemsInCartIsUpdated()"
});
formatter.result({
  "duration": 144588953,
  "status": "passed"
});
formatter.after({
  "duration": 906941736,
  "status": "passed"
});
formatter.before({
  "duration": 6839744818,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Empty cart",
  "description": "",
  "id": "cart;empty-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 28,
  "name": "I open the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "I select one product",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I select one color",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I select one size",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I press Add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I press View Cart",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I press Empty Cart",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "the cart is emptied",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.iOpenTheHomepage()"
});
formatter.result({
  "duration": 10879971947,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iSelectOneProduct()"
});
formatter.result({
  "duration": 2719766098,
  "status": "passed"
});
formatter.match({
  "location": "SingleProductSteps.iSelectOneColor()"
});
formatter.result({
  "duration": 354255269,
  "status": "passed"
});
formatter.match({
  "location": "SingleProductSteps.iSelectOneSize()"
});
formatter.result({
  "duration": 166495185,
  "status": "passed"
});
formatter.match({
  "location": "SingleProductSteps.iPressAddToCart()"
});
formatter.result({
  "duration": 14532088681,
  "status": "passed"
});
formatter.match({
  "location": "HeaderSteps.iPressViewCart()"
});
formatter.result({
  "duration": 8209148982,
  "status": "passed"
});
formatter.match({
  "location": "CartSteps.iPressEmptyCart()"
});
formatter.result({
  "duration": 7840959485,
  "status": "passed"
});
formatter.match({
  "location": "CartSteps.theCartIsEmptied()"
});
formatter.result({
  "duration": 136011171,
  "status": "passed"
});
formatter.after({
  "duration": 749545666,
  "status": "passed"
});
formatter.before({
  "duration": 3696366531,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "Delete item from cart",
  "description": "",
  "id": "cart;delete-item-from-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 39,
  "name": "I open the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 40,
  "name": "I select one product",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I select one color",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I select one size",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I press Add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "I press VIP",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I select another product",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "I press Add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "I press View Cart",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "I press the Recycle bin simbol for one item",
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "the item I deleted is no longer in cart",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.iOpenTheHomepage()"
});
formatter.result({
  "duration": 4949684422,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iSelectOneProduct()"
});
formatter.result({
  "duration": 2070454253,
  "status": "passed"
});
formatter.match({
  "location": "SingleProductSteps.iSelectOneColor()"
});
formatter.result({
  "duration": 133641393,
  "status": "passed"
});
formatter.match({
  "location": "SingleProductSteps.iSelectOneSize()"
});
formatter.result({
  "duration": 131414725,
  "status": "passed"
});
formatter.match({
  "location": "SingleProductSteps.iPressAddToCart()"
});
formatter.result({
  "duration": 15212143206,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iPressVIP()"
});
formatter.result({
  "duration": 2820299476,
  "status": "passed"
});
formatter.match({
  "location": "ProductsGridSteps.iSelectAnotherProduct()"
});
formatter.result({
  "duration": 2468491319,
  "status": "passed"
});
formatter.match({
  "location": "SingleProductSteps.iPressAddToCart()"
});
formatter.result({
  "duration": 14799488356,
  "status": "passed"
});
formatter.match({
  "location": "HeaderSteps.iPressViewCart()"
});
formatter.result({
  "duration": 6772471454,
  "status": "passed"
});
formatter.match({
  "location": "CartSteps.iPressTheRecycleBinSimbolForOneItem()"
});
formatter.result({
  "duration": 15330287703,
  "status": "passed"
});
formatter.match({
  "location": "CartSteps.theItemIDeletedIsNoLongerInCart()"
});
formatter.result({
  "duration": 533376681,
  "status": "passed"
});
formatter.after({
  "duration": 915050184,
  "status": "passed"
});
});