package org.fasttrackit.webviews;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ProductsGrid {
    @FindBy(css = "h2.product-name a")
    private List<WebElement> productNames;

    public List<WebElement> getProductNames() {
        return productNames;
    }

    @FindBy(xpath = "//select[@title = 'Sort By']")
    private WebElement sortByList;

    public Select getSortByList() {
        return new Select(sortByList);

    }

    @FindBy(className = "sort-by-switcher")
    private WebElement sortDirectionButton;

    public WebElement getSortDirectionButton() {
        return sortDirectionButton;
    }

    @FindBy(className = "price")
    private List<WebElement> productPrices;

    public List<WebElement> getProductPrices() {
        return productPrices;
    }

    @FindBy (linkText= "ADD TO CART")
    WebElement addToCartButton;

    public WebElement getAddToCartButton() {
        return addToCartButton;
    }

    @FindBy (linkText = "GEOMETRIC CANDLE HOLDERS")
    WebElement candleHolder;

    public WebElement getCandleHolder() {
        return candleHolder;
    }
}

