package org.fasttrackit.webviews;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header {
    @FindBy(id = "search")
    private WebElement searchField;

    public WebElement getSearchField() {
        return searchField;
    }

    @FindBy(css = "#search_mini_form > div.input-box > button")
    private WebElement searchButton;

    public WebElement getSearchButton() {
        return searchButton;
    }

    public void search(String keyword) {
        searchField.clear();
        searchField.sendKeys(keyword + Keys.ENTER);
    }

    public void searchWithButton(String keyword) {
        searchField.sendKeys(keyword);
        searchButton.click();

    }

    @FindBy(linkText = "ACCOUNT")
    WebElement accountButton;

    @FindBy(linkText = "My Account")
    WebElement myAccountButton;

    @FindBy(linkText = "CREATE AN ACCOUNT")
    WebElement createAnAccountButton;

    @FindBy(linkText = "Log In")
    WebElement logInButton;

    @FindBy(className = "header-minicart")
    WebElement cartButton;

    @FindBy(linkText = "CHECKOUT")
    WebElement checkoutButton;

    @FindBy(className = "cart-link")
    WebElement viewCartButton;

    @FindBy (className = "nav-6")
    WebElement vipButton;

    @FindBy (linkText = "SALE")
    WebElement saleButton;

    public WebElement getSaleButton() {
        return saleButton;
    }

    public WebElement getVipButton() {
        return vipButton;
    }

    public WebElement getViewCartButton() {
        return viewCartButton;
    }

    public WebElement getCheckoutButton() {
        return checkoutButton;
    }

    public WebElement getCartButton() {
        return cartButton;
    }

    public WebElement getAccountButton() {
        return accountButton;
    }

    public WebElement getMyAccountButton() {
        return myAccountButton;
    }

    public WebElement getCreateAnAccountButton() {
        return createAnAccountButton;
    }

    public WebElement getLogInButton() {
        return logInButton;
    }
}

