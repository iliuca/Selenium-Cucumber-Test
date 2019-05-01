package org.fasttrackit.webviews;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SingleProductPage {

    @FindBy(className = "swatch-label")
    WebElement colorSwitchButton;

    public WebElement getColorSwitchButton() {
        return colorSwitchButton;
    }

    @FindBy(css = "a.product-image")
    WebElement firstProductPicture;

    public WebElement getFirstProductPicture() {
        return firstProductPicture;
    }

    @FindBy(className = "product-name")
    WebElement firstProductTitle;

    public WebElement getFirstProductTitle() {
        return firstProductTitle;
    }

    @FindBy(css = "div.product-name > span")
    WebElement singleProductPicture;

    public WebElement getSingleProductPicture() {
        return singleProductPicture;
    }

    @FindBy(css = "div.actions > a")
    WebElement viewDetailsButton;

    public WebElement getViewDetailsButton() {
        return viewDetailsButton;
    }

    @FindBy(css = "div.product-name > span")
    WebElement singleProductTitle;

    public WebElement getSingleProductTitle() {
        return singleProductTitle;
    }

    @FindBy(linkText = "Add to Wishlist")
    WebElement addToWishlist;

    public WebElement getAddToWishlist() {
        return addToWishlist;
    }

    @FindBy(className = "add-to-cart-buttons")
    WebElement addToCart;

    public WebElement getAddToCart() {
        return addToCart;
    }

    @FindBy(id = "option21")
    public WebElement colorPink;

    @FindBy(id = "option28")
    public WebElement colorRed;

    @FindBy(id = "option80")
    public WebElement sizeS;

    @FindBy(id = "option79")
    public WebElement sizeM;

    @FindBy(id = "option78")
    public WebElement sizeL;

    @FindBy(id = "option77")
    public WebElement sizeXL;

        }

