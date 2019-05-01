package org.fasttrackit.webviews;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SortMenu {
    @FindBy(css = "option[value*=\"position\"]")
    WebElement positionSorting;

    @FindBy(css = "option[value*=\"name\"]")
    WebElement nameSorting;

    @FindBy(css = "option[value*=\"price\"]")
    WebElement priceSorting;

    @FindBy(css = "div.sort-by > a")
    WebElement directionArrow;
    @FindBy(css = "a[title*=\"Ascending\"]")
    WebElement setAscending;

    @FindBy(css = "a[title*=\"Descending\"]")
    WebElement setDescending;

    @FindBy(css = "a[class*=\"sort-by-switcher\"]")
    WebElement arrowDirection;

    @FindBy(css = "a.list")
    WebElement viewAsLIst;

    @FindBy(css = "div.limiter > select > option:nth-child(1)")
    WebElement nrOfItemsFirstOption;

    public void choosePositionSorting() {
        positionSorting.click();
    }

    public void chooseNameSorting() {
        nameSorting.click();

    }

    public void choosePriceSorting() {
        priceSorting.click();

    }

    public void setAscendingOrder() {
        if (arrowDirection.getAttribute("class").contains("desc")) {
            setAscending.click();
        }
    }

    public void setDescendingOrder() {
        if (arrowDirection.getAttribute("class").contains("asc")) {
            setDescending.click();
        }
    }

    public void clickViewAsLIst() {
        viewAsLIst.click();
    }

    public void clickNrOfItemsOption1() {
        nrOfItemsFirstOption.click();
    }

    public WebElement getNrOfItemsFirstOption() {
        return nrOfItemsFirstOption;
    }
}

