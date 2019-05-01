package org.fasttrackit.webviews;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ShoppingCart {

    public List<WebElement> getListProductsInCart() {
        return productsInCart;
    }

    @FindBy(css = "h2.product-name a")
    private List<WebElement> productsInCart;

    @FindBy(css = "td.product-cart-info > dl > dd:nth-child(2)")
    private WebElement colorOfProductInCart;

    @FindBy(css = "td.product-cart-info > dl > dd:nth-child(4)")
    private WebElement sizeOfProductInCart;

    public List<WebElement> getProductsInCart() {
        return productsInCart;
    }

    public WebElement getColorOfProductInCart() {
        return colorOfProductInCart;
    }

    public WebElement getSizeOfProductInCart() {
        return sizeOfProductInCart;
    }

    @FindBy(css = "[title~=Qty]")
    private WebElement numberOfProductsInCart;

    public WebElement getNumberOfProductsInCart() {
        return numberOfProductsInCart;
    }

    @FindBy(css = "#shopping-cart-table > tfoot > tr > td > button:nth-child(3) > span > span")
    private WebElement updateButton;

    public WebElement getUpdateButton() {
        return updateButton;
    }

    @FindBy (css="#empty_cart_button > span > span")
    private WebElement emptyCartButton;

    public WebElement getEmptyCartButton() {
        return emptyCartButton;
    }

    @FindBy (css = "div.cart-empty > p:nth-child(1)")
    private WebElement emptyCartMessage;

    public WebElement getEmptyCartMessage() {
        return emptyCartMessage;
    }

    @FindBy (css = "td.a-center.product-cart-remove.last > a")
    private WebElement deleteItem;

    public WebElement getDeleteItem() {
        return deleteItem;
    }

    @FindBy (css = ".product-cart-price>span>span")
    private WebElement itemPrice;

    public WebElement getItemPrice() {
        return itemPrice;
    }

    @FindBy (css = ".product-cart-total>span>span")
    private WebElement subtotalPrice;

    public WebElement getSubtotalPrice() {
        return subtotalPrice;
    }
}



