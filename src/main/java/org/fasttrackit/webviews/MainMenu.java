package org.fasttrackit.webviews;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainMenu {
    @FindBy(css = "\ta[href*=\"sale\"]")
    WebElement saleButton;

    public void clickSaleButton() {
        saleButton.click();
    }
}
