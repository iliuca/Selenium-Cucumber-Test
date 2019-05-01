package org.fasttrackit.webviews;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    public WebElement getFirstProductTitle() {
        return firstProductTitle;
    }

    @FindBy(className = "product-name")
    WebElement firstProductTitle;


    @FindBy(linkText = "ELIZABETH KNIT TOP")
    WebElement elizabethTop;

    public WebElement getElizabethTop() {
        return elizabethTop;
    }
}