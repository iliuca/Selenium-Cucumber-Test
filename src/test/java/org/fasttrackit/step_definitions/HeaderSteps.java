package org.fasttrackit.step_definitions;

import cucumber.api.java.en.And;
import org.fasttrackit.TestBase;
import org.fasttrackit.webviews.Header;
import org.openqa.selenium.support.PageFactory;

public class HeaderSteps extends TestBase {

    private Header header = PageFactory.initElements(driver, Header.class);

    @And("^I search products by \"([^\"]*)\"$")
    public void iSearchProductsBy(String searchKeyword) {
        header.search(searchKeyword);
    }

    @And("^I press View Cart$")
    public void iPressViewCart() {
        header.getCartButton().click();
        header.getViewCartButton().click();

    }
}
