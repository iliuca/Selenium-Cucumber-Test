package org.fasttrackit.webviews;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilterMenu {
    @FindBy(css = "#narrow-by-list a:first-child")
    private WebElement categoryFilter;

    public void clickCategoryFilter() {
        categoryFilter.click();
    }

    @FindBy(css = "div.actions>a")
    private WebElement clearFilters;

    public void clickClearFilters() {
        clearFilters.click();
    }
}
