package org.fasttrackit.step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.fasttrackit.TestBase;
import org.fasttrackit.webviews.Header;
import org.fasttrackit.webviews.HomePage;
import org.fasttrackit.webviews.ShoppingCart;
import org.openqa.selenium.support.PageFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.hamcrest.MatcherAssert.assertThat;
public class CartSteps extends TestBase {
    Header header = PageFactory.initElements(driver, Header.class);
    ShoppingCart shoppingCart = PageFactory.initElements(driver, ShoppingCart.class);
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);


    @Then("^the product is added to cart$")
    public void theProductIsAddedToCart() {
        header.getCartButton().click();
        header.getViewCartButton().click();
        assertThat("There were no products added to cart", shoppingCart.getListProductsInCart().size() > 0);



    }

    @When("^I change the number of items from (\\d+) to (\\d+)$")
    public void iChangeTheNumberOfItemsFromTo(int arg1,  int arg2) {
        shoppingCart.getNumberOfProductsInCart().clear();
        shoppingCart.getNumberOfProductsInCart().sendKeys("3");
    }


    @And("^I click update$")
    public void iClickUpdate() {shoppingCart.getUpdateButton().click();
    }

    @Then("^the number of items in cart is updated$")
    public void theNumberOfItemsInCartIsUpdated() {
        assertThat("Number of items in cart was not updated", shoppingCart.getNumberOfProductsInCart().getAttribute("value").equals("3")
        );

    }

    @When("^I press Empty Cart$")
    public void iPressEmptyCart() {shoppingCart.getEmptyCartButton().click();
    }

    @Then("^the cart is emptied$")
    public void theCartIsEmptied() {
        assertThat("The cart was not emptied",shoppingCart.getEmptyCartMessage().getText().equals("You have no items in your shopping cart."));

    }

    @And("^the color of the product is the one selected$")
    public void theColorOfTheProductIsTheOneSelected() {

    }

    @When("^I press the Recycle bin simbol for one item$")
    public void iPressTheRecycleBinSimbolForOneItem() {
        shoppingCart.getDeleteItem().click();

    }

    @Then("^the item I deleted is no longer in cart$")
    public void theItemIDeletedIsNoLongerInCart() {
        assertThat("The item was not deleted", shoppingCart.getListProductsInCart().size()==1);
    }

    @Then("^the price is recalculated$")
    public void thePriceIsRecalculated() {
        String itemPriceText = shoppingCart.getItemPrice().getText();
        String subtotalPriceText = shoppingCart.getSubtotalPrice().getText();
        double itemPrice = Double.parseDouble(itemPriceText.split(" ")[0].replace (",","."));
        double subtotalPrice = Double.parseDouble(subtotalPriceText.split(" ")[0].replace (",","."));
        System.out.println("This is the item price" + itemPrice);
        System.out.println("This is the subtotal price"+ subtotalPrice);
        assertThat("Subtotal price is not correctly calculated", subtotalPrice == itemPrice*3);


    }
}